package Section8_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_DropDown {
/*Al ejecutar esta clase no funciona pues muestra un pop up al inicio que 
	aun no se como cerrarlo (INVESTIGAR). Lo unico importante es el ENUM Keys*/
	
/*Es el caso en el que se va introduciendo texto y va filtrando las diferentes opciones del
 * dropdown*/
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com");
		driver.manage().window().maximize();
		//Thread.sleep(10000L);
		//driver.findElement(By.id("webklipper-publisher-widget-container-notification-close-div")).click();
		
		WebElement source = driver.findElement(By.className("react-autosuggest__input react-autosuggest__input--open"));
		source.clear();
		source.sendKeys("mum");
		Thread.sleep(2000L);
		source.sendKeys(Keys.ENTER);
		
		//Si se quisiera ver que al desplegar el combo se haga clic con las flechas del
		//teclado hacia abajo, se usaría Keys.ARROW_DOWN
		
	}

}
