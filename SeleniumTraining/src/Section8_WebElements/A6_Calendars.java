package Section8_WebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class A6_Calendars {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("ui-datepicker-trigger")).click();
		Thread.sleep(1000L);
		// cuando se quieres seleccionar un elemento que tiene una clase
		// separada por comas
		// se deben de ir uniendo con los puntos y se debe acceder a traves de
		// cssSelector
		driver.findElement(By.cssSelector(".ui-datepicker-week-end.ui-datepicker-current-day")).click();

		// hay ocasiones en los que isEnabled no funciona (siempre es true, a
		// pesar que
		// se vea desactivado en front, pues cuando se da click "se activa" lo
		// que pasa realmente
		// es que le cambian el estilo de opacity de 0.5 a 1
		// ver que cuando se da clic se activa "round trip"
		System.out.println("return date " + driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1")) {
			System.out.println("it's enabled");
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false);
		}
	}

}
