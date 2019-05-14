package Section10_AJAX;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A2_HandlingWindows {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		//la siguiente instrucción falla porque se encuentra dentro de un frame
		//driver.findElement(By.id("draggable")).click();
		//se debe tener la forma de poder acceder al elemento de una forma particular
		//con los frames esta vinculado el tema de draggable
		//Un frame despliega contenido de forma independiente del contenedor y dicho contenido
		//puede provenir de otro website
		
		
		//Hay tres formas de encontrar el frame
		//la primer forma
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		Actions a = new Actions(driver);
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		a.dragAndDrop(drag, drop).build().perform();
		
		
		//la segunda forma es decir que iframe seleccionar (se va de acuerdo a como se van presentando en el DOM)
		driver.switchTo().defaultContent();										//de esta forma se regresa al frame principal
		System.out.println(driver.findElements(By.tagName("iframe")).size());	//solamente hay un frame
		
		
		//la ultima es por el id, pero en este caso no tiene
		
		
		
		
		
	}

}
