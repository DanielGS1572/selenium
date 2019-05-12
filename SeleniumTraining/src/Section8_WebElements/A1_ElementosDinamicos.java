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
		
		Select s = new Select(driver.findElement(By.id("ddl_Adult_MST")));			//adentro debe tener <option ...> el cual no se toma en cuenta
		//Porque esto no funciona?
		//Select s = new Select(driver.findElement(By.cssSelector(".wMed1s.required.valid")));
		
		s.selectByValue("2"); 		
		s.selectByIndex(4); 		
		s.selectByVisibleText("6"); 		
		driver.findElement(By.linkText("Flights")).click();
		
	driver.manage().window().maximize();
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000L);
		int i =0;
		while(i<5){			
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
/*Hay veces en las que los dropdowns se cargan nada más cuando se abre un combobox, por ejemplo
 * entrar a https://www.spicejet.com/ y en From esta chennai, al igual que en el To... por lo que 
 * con xpath para encontrar al segundo chennai sería (//a[@value='MAA'])[2] 	
 */
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		/*PARENT-CHILD
		/*PARENT-CHILD.- en ocasiones es posible que a la gente no le guste el uso
		de los indices, por ejemplo "(//a[@value='MAA'])[2]", para eso se puede usar
		parent-child location
		//[Se selecciona el padre] //[Se selecciona el hijo]		--> esto ya no tiene el problema que existan dos en toda la pagina
		//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='MAA']
		*/
		
	}

}
