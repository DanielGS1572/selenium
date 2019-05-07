package Section8_WebElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A1_ElementosDinamicos {

	public static void main(String[] args) throws InterruptedException {
/*En esta clase se automatizarán elementos como:
 * 			- static/dynamic dropdowns		los static son <select>
 * 			- checkboxes
 * 			- radio buttons
 * 			- text buttons
 * 			- alerts
 */
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.linkText("Hotels")).click();
		
		Select s = new Select(driver.findElement(By.id("ddl_Adult_MST")));			//adentro debe tener <option ...>
		//Porque esto no funciona?
		//Select s = new Select(driver.findElement(By.cssSelector(".wMed1s.required.valid")));
		
		s.selectByValue("2"); 		
		s.selectByIndex(4); 		
		s.selectByVisibleText("6"); 		
		
		
	}

}
