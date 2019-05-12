package Section8_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_Alerts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://tizag.com/javascriptT/javascriptalert.php");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Confirmation Alert']")).click();
		
		
		System.out.println(driver.switchTo().alert().getText());
		//Si se quiere mandar algo a la caja de texto del alert se usa sendKeys
		//driver.switchTo().alert().sendKeys("Texto");
		//Para poder manipular los alert el driver debe ser cambiado
		driver.switchTo().alert().accept();	//dismiss ... para cancelr
		
		
		
		//CHECKBOXES
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isEnabled());
		//Para contar el numero de checkboxes
		driver.findElements(By.cssSelector("input[type='checkbox']")).size();
	}

}
