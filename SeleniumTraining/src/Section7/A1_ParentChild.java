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
		
		//Para escribir paths absolutos en xpath seria algo así:
		//		//body//section/div/div/div/li[2]
		
		//Para obtener el siguiente elemento hermano
		//	http://qaclickacademy.com/interview -->	//li[@id='tablist1-tab1']/following-sibling::li[1]
		driver.get("http://qaclickacademy.com/interview");
		driver.findElement(By.xpath("//li[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		//Una de las ventajas de usar xpath (a diferencia de css) es que se puede hacer traverse back
		//		http://qaclickacademy.com/interview -->		//li[@id='tablist1-tab2']/parent::ul	
		
		/*Una parte super importante es que es posible que se quiera automatizar pruebas sin tener todavia
		el html listo, por lo que se puede acceder a traves de text(), pero no es lo recomendable 
		(ya que puede traer dos resultados, e igual el texto puede tener espacios antes y despues)
		//		http://qaclickacademy.com/interview -->	//*[text()=' Selenium ']
		 */
	}

}
