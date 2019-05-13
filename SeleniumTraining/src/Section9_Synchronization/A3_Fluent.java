package Section9_Synchronization;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class A3_Fluent {

	public static void main(String[] args) {
		//Explicit puede ser usado de dos formas:
		//- WebDriverWait.- Queda en espera en determinado tiempo para ver si encuentra el elemento en el DOM
		//- FluentWait.- tiene un tiempo de poleo y un tiempo de espera
		
		//Ambas clases implementan la interfaz Wait
		
		
		/*La desventaja de fluent es que se deben especificar metodos propios para indicar 
		 * que es lo que se estará esperando, a diferencia de webDriverWait que tiene
		 * metodos cómo elementToBeClickable (ver A1_Synchronization)*/
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("[id='start'] button")).click();		//obtiene el elemento
		//con id start y obtiene el siguiente elemento que es button
		
		//Hara el intento cada 3 segundo por 30 segundos, es decir un total de 10 intentos
		Wait fluent = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement foo = (WebElement) fluent.until(new Function<WebDriver,WebElement>(){		//Function recibe un objeto de tipo WebDriver y regresa un WebElement

			@Override
			public WebElement apply(WebDriver t) {
				if( t.findElement(By.cssSelector("[id='finish'] h4")).isDisplayed()){
					return t.findElement(By.cssSelector("[id='finish'] h4"));	/*Regresará
					un webElement en cuanto aparezca en la página*/	
				}else{
					return null;
				}
				
			}
			
		});
		
		//Esta linea no se ejecuta si no hasta que se termine la seección del codigo de foo 
		
		System.out.println(foo.getText());
	}
	

}
