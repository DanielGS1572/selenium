package generales;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LimitDriverScope {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://qaclickacademy.com/practice.php");
		System.out.println("links que estan en toda la página");
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		// para hacer una subsección y contar las ligas del footer por ejemplo
		// se
		// puede hacer desde un webelement
		// Con esto se limita el alcance
		System.out.println("links que estan en el footer");
		System.out.println(footer.findElements(By.tagName("a")).size());

		// Para contar las ligas de la primer columna del footer
		System.out.println("links de la primer columna del footer");
		List<WebElement> primerColumnaElementos = footer.findElements(By.xpath("//tbody/tr/td[1]/ul/li"));
		System.out.println(primerColumnaElementos.size());

		// Para enviar una combinación de teclas por ejemplo ctrl + clic
		for (int i = 1; i < primerColumnaElementos.size(); i++) {
			String combinacion = Keys.chord(Keys.CONTROL, Keys.ENTER);
			System.out.println("combinación " + combinacion);
			primerColumnaElementos.get(i).findElement(By.tagName("a")).sendKeys(combinacion);

		}
		Set<String> listHandles = driver.getWindowHandles();
		Iterator<String> it = listHandles.iterator();
		while (it.hasNext()) {
			Thread.sleep(2500);
			driver.switchTo().window(it.next());
		}
	}

}
