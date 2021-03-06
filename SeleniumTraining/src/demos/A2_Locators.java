package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_Locators {
/*Existen varias formas de encontrar un elemento:
 * - ID - Si se tienen IDs alfanumericos es muy probable que cambien cuando se refresque la pantalla (por ejemplo el boton de facebook
 * 		puede ser u_o_2 y despues cambia a u_o_6
 * - ClassName - Si se tiene un classname con diferentes identificadores separados por espacio es recomendable usar xpath, selenium no acepta compound classes
 * 		Si existen varios elementos con el mismo classname regresa el primero que encuentra, (no regresa un arreglo)
 * - Name
 * - linkText - Es para cuando se quiere acceder a un tag anchor <a> (es un elemento clickeable) y lo que se pasa como parametro es lo que se encuentra como el nombre del anchor
 * Si no se tienen la forma de acceder con los datos anteriores puede ser a traves de Xpath � CSS (Son los m�s comunes y preferidos)
 * - Xpath - Chrome y firefox generan los xpaths de los elementos deseados pero no son 100% confiables, simplemente se da click derecho en el elemento y en copy (hay diferentes
 * 		formas de obtener el xpath y entre browsers esto puede cambiar (si empieza por /html ignorarlo)
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
		
		driver.get("https://www.evernote.com/Registration.action");
		
		//*****************************************************************************
//En el browser para validar si existe el xpath o el css se puede probar desde consola
//Suponiendo el escenario en el que se automaticen 50 diferentes p�ginas y que de repente en la numero 48 marca un error
//de que no encontro el elemento
//- para xpath seria $x("")
//- para css seria $("")
		//XPATH
		// La sintaxis de xpath es : //tagName[@attribute='value']		el tagName viene siendo input por ejemplo
		// Si un elemento cambia se puede usar la expresion contains (que por ejemplo un selector class cambie de username123 a username456)
			//				-   //input[contains(@attribute,'value']		--> input[contains(@class,'username')] 
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("hello");
		
		//CSS
		//La sintaxis es		   : tagName[attribute = 'value']	(tambien se puede quitar el tagName � tagName#valorId � tagName.valorClass
		// Si un elemento cambia se puede usar la expresion contains (que por ejemplo un selector class cambie de username123 a username456)
		//					- tagName[attribute*='value']					--> input[class*='username']
		driver.findElement(By.cssSelector("#passwordInput")).sendKeys("test");
		//se puede obtener el texto de si la contrase�a ha sido incorrecta y desplegar en consola
		//simplemente se obtiene el elemento en el que se esta desplegando el mensaje para obtener el texto
		System.out.println(driver.findElement(By.cssSelector("#passwordInput")).getText());
		
	}

}
