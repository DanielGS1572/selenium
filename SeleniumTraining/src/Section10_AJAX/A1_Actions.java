package Section10_AJAX;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1_Actions {
	/*
	 * A veces es necesario capturar algunas de las acciones, por ejemplo en
	 * amazon si se coloca el cursos en el login, no es necesario dar clic,
	 * simplemente se abre Esto se hace a trav�s de la clase Actions
	 */
	public static void main(String[] args) throws InterruptedException {
		/*System.setProperty("webdriver.chrome.driver",
				"~/Documentos/repo/selenium/Artefactos/driverForLinux/chromedriver");*/
		System.setProperty("webdriver.chrome.driver",
				"./Artefactos/driverForLinux/chromedriver72");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

		Actions a = new Actions(driver);
		// Para poner texto en mayusculas...
		// El metodo click pertenece al tipo actions y no a un webdriver, para
		// que no genere confusi�n
		// driver.findElement(By.id("twotabsearchtextbox")).click();
		
		// Antes del build y el perform se pueden realizar acciones compuestas
		a.moveToElement(driver.findElement(By.id("twotabsearchtextbox")))
				.click().keyDown(Keys.SHIFT).sendKeys("hello")
				.doubleClick().build().perform();
		
		WebElement element = driver.findElement(By.cssSelector("a[id='nav-link-accountList']"));
		a.moveToElement(element).build().perform();
		
		Thread.sleep(2000L);
		//Para hacer click con el bot�n derecho:
		a.moveToElement(element).contextClick().build().perform();
		
	}

}
