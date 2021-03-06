package Section10_AJAX;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_Frames {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//ul[@class='Bgzgmd']/li[2]/a")).click();	//abre una nueva ventana
		System.out.println(driver.getTitle());		//Obtiene el titulo de la ventana principal
		
		
		Set<String> ids= driver.getWindowHandles();
		Iterator<String> it = ids.iterator();
		it.next();
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());		//Obtiene el titulo de la 2 ventana 
		
		
	}

}
