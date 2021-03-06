package Section8_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A5_TestNG_Assertions {

	public static void main(String[] args) throws InterruptedException {
		//Para poner testng siplemente se busca en google testng jar download y se 
		//descarga de la pagina de maven y se da de alta en los plugins dando clic en 
		//properties --> java build path --> libraries --> add external jar
		/*Los assertions mas importantes son:
		 * - assertFalse
		 * - assertTrue
		 * - assertEquals		... Si no pasan los asserts simplemente lanza una excepci�n
		 * */
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).isSelected());
		
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		for(int i = 1; i < 5; i++ ){
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "5 Adult");
		

	}

}
