package Section17_Parameters;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class A1_Parameters {
	WebDriver driver;

	// Como agregar a classpath en selenium?
	@Test
	public void Login() throws IOException {
		Properties prop = new Properties();
		// windows
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\TestNG\\src\\Section17_Parameters\\datadriven.properties");
		// linux
		// FileInputStream fis = new
		// FileInputStream("/home/daniel/Documentos/repo/selenium/TestNG/src/Section17_Parameters/datadriven.properties");
		prop.load(fis);

		// Para ir probando con diferentes browsers y que sea configurable en un
		// archivo .properties
		if (prop.getProperty("browser").contains("chrome")) {
			// windows
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");

			// linux
			/*
			 * System.setProperty("webdriver.chrome.driver",
			 * "./Artefactos/driverForLinux/chromedriver72");
			 */
			driver = new ChromeDriver();

		}
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("url"));
		driver.get(prop.get("url").toString());
	}

}
