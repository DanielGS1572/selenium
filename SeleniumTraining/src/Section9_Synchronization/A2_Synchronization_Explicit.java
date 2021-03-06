package Section9_Synchronization;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_Synchronization_Explicit {
	/*
	 * Hay 4 tipos de sincronizaci�n: - Implicita: -
	 * "esperate n segundos antes de que tires alguna excepci�n" - Se define de
	 * forma global - No se espera por los n segundos configurados, si no es un
	 * tiempo limite - Lo ideal es que n sea 5 segundos (cuando se hacen pruebas
	 * en batch regularmente los tiempos aumentan) - Explicita: - Se usa cuando
	 * son condiciones especificas - y todo lo dem�s aplicar�a los escenarios
	 * implicitos - Thread.sleep: - Si se definen n segundos el tiempo de espera
	 * en realidad es de n segundos (aunque ya - haya terminado la ejecuci�n).
	 * Casi no se usa - Fluent
	 * 
	 * 
	 * INVESTIGAR MAS DE EXPLICIT: https://dzone.com/articles/waits-in-selenium-how-to-use-implicit-amp-explicit
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.manage().window().maximize();
		driver.findElement(By.className("flight_status")).click();
		driver.findElement(By.className("wMed5s")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.className("wMed5s")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.name("destinationStation")).sendKeys(Keys.ARROW_DOWN);
		driver.findElement(By.name("destinationStation")).sendKeys(Keys.ENTER);
		for (int i = 0; i <= 4; i++) {
			driver.findElement(By.name("FlifoSearchInputSearchView$DropDownListFlightDate")).sendKeys(Keys.ARROW_DOWN);
		}
		driver.findElement(By.name("FlifoSearchInputSearchView$DropDownListFlightDate")).sendKeys(Keys.ENTER);

		driver.findElement(By.id("FlifoSearchInputSearchView_ButtonSubmit")).click();
//Aqui se supone que deber�a mandar error pues esta haciendo consulta a base de datos
//pero no truena, si lo hace bien... en caso de que tronara la sincronizaci�n implicita es
//		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("flightAction_1_1_details")).click();

	}

}
