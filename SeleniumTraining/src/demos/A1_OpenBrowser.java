package demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_OpenBrowser {

	public static void main(String[] args) {
		//1.- Open the web browser
	//Se setean las propiedades para decirle el .exe que har� que se habr� un explorer
		//google chrome --> webdriver.chrome.driver
		//firefox 		--> webdriver.gecko.driver
		//IE			--> webdriver.ie.driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\chromedriver74.exe");
		//System.setProperty("webdriver.chrome.driver", "./Artefactos/driverForLinux/chromedriver72");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		System.out.println("URL " + driver.getCurrentUrl());		//para revisar si se accedio correctamente a la url (para revisar que no haya alguna redirecci�n)
		//System.out.println("Page source " + driver.getPageSource());		//page source. En algunos casos (como bancos por ejemplo) no se puede dar clic derecho y no se puede ver el codigo fuente
		System.out.println(driver.getTitle());			//Para obtener el titulo del tab
		
		driver.get("http://yahoo.com");
		driver.navigate().back(); 						//para regresar una pagina
		
		driver.close(); 								//para cerrar el browser abierto
	//	driver.quit(); 									//para cerrar todos los browsers abiertos por selenium

	}

}
