package Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_ParentChild {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.evernote.com/Login.action");
		
		/*Cuando se quiera acceder algun elemento que supongamos no tiene ningun tagName, se 
		hace a traves de xpath
		*/
		driver.findElement(By.xpath("//div[@id='email-wrapper']/input")).sendKeys("asdf");
	}

}
