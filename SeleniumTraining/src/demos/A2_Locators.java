package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_Locators {
/*Existen varias formas de encontrar un elemento:
 * - ID - Si se tienen IDs alfanumericos es muy probable que cambien cuando se refresque la pantalla (por ejemplo el boton de facebook
 * 		puede ser u_o_2 y despues cambia a u_o_6
 * - ClassName
 * - Name
 * - linkText - Es para cuando se quiere acceder a un tag anchor <a> (es un elemento clickeable)
 * Si no se tienen la forma de acceder con los datos anteriores puede ser a traves de Xpath � CSS (Son los m�s comunes y preferidos)
 * - Xpath
 * - Css
 * 
 * Tener cuidados con los locators ya que con el viewport de css puede que no existan si la pantalla no esta maximizada
	*/
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://yahoo.com");
		driver.findElement(By.id("uh-search-box")).sendKeys("prueba");
		driver.findElement(By.id("mega-bottombar-mail")).click();
	}

}
