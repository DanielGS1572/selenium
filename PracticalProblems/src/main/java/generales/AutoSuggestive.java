package generales;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestive {

	public static void main(String[] args) {
		/*
		 * Para poder acceder a elementos de autocompletar no se pueden ver en
		 * el HTML ni si quiera haciendo una funcion en javascript y ejecutarla
		 * x segundos despues
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://ksrtc.in/oprs-web/guest/home.do");
		WebElement elemento = driver.findElement(By.name("fromPlaceName"));
		elemento.sendKeys("beng");
		elemento.sendKeys(Keys.ARROW_DOWN);
		elemento.sendKeys(Keys.ARROW_DOWN);
		System.out.println(elemento.getText()); 			//No muestra ningun texto... esta hidde
		//por lo que se tiene que usar javascript executor para leer el DOM
		
		JavascriptExecutor executor = (JavascriptExecutor)driver; 
		String from = "return document.getElementById('fromPlaceName').value;";		//ES IMPORTANTE QUE LLEVE LA PALABRA RETURN Y EL .VALUE
		System.out.println(executor.executeScript(from));
	}

}
