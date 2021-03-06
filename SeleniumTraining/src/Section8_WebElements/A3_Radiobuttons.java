package Section8_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Radiobuttons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		
		//Si tengo varios radiobuttons y quiero seleccionar el primero
		driver.findElements(By.xpath("//input[@name='group2']")).get(0).click();
		//Si se quiere ver el valor de un atributo...
		System.out.println(driver.findElements(By.xpath("//input[@name='group2']")).get(0).getAttribute("value"));
	}

}
