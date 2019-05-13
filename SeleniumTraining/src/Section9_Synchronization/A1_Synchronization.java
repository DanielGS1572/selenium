package Section9_Synchronization;

import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A1_Synchronization {
	/*
	 * Hay 4 tipos de sincronización: - Implicita: -
	 * "esperate n segundos antes de que tires alguna excepción" - Se define de
	 * forma global - No se espera por los n segundos configurados, si no es un
	 * tiempo limite - Lo ideal es que n sea 5 segundos (cuando se hacen pruebas
	 * en batch regularmente los tiempos aumentan) - Explicita: - Se usa cuando
	 * son condiciones especificas - y todo lo demás aplicaría los escenarios
	 * implicitos - Thread.sleep: - Si se definen n segundos el tiempo de espera
	 * en realidad es de n segundos (aunque ya - haya terminado la ejecución).
	 * Casi no se usa - Fluent
	 * 
	 * 
	 * LECTURA: http://makeseleniumeasy.com/2017/07/02/part-6-waits-in-selenium-what-happens-when-we-mix-implicit-wait-and-explicit-wait/
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
//Aqui se supone que debería mandar error pues esta haciendo consulta a base de datos
//pero no truena, si lo hace bien... en caso de que tronara la sincronización explicita es
		
//ExpectedConditions tiene varios metodos, aparte de que sea cliqueable, se le puede decir que hasta que este visible
		WebDriverWait d = new WebDriverWait(driver, 20);
		d.until(ExpectedConditions.elementToBeClickable(By.id("flightAction_1_1_details")));
		driver.findElement(By.id("flightAction_1_1_details")).click();

	}

}
