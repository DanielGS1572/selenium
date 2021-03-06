package Section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_CSSSelector {
//Los selectores por css son 10 veces m�s rapidos que los de xpath
//Con CSS no es necesario incluir el tagName... --> es valido --> [class='identify first'] al contrario con 
//				xpath ser�a //*[@class='identify first']
	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com");
			driver.findElement(By.cssSelector("[class='input r4 wide mb16 mt8 username']")).sendKeys("testing");
			//Lo anterior tambi�n se puede hacer con el id By.cssSelector("#Login"), si se 
			//tiene una clase con varios identificadores por ejemplo class="iden1 iden2" se pondr�a .iden1.iden2
	}

}
