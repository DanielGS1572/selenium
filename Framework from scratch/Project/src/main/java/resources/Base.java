package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Base {
	// public static void main(String args[]) throws IOException {
	protected WebDriver driver;
	protected String url;

	public void initializaDriver() {

		Properties prop = new Properties();

		try {
			FileInputStream fis = new FileInputStream(".\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
		} catch (IOException e) {
			e.getMessage();
		}

		String browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		if ("chrome".equals(browser)) {
			System.out.println("browser selected: " + browser);
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.chrome();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			driver = new ChromeDriver(options);

		} else {
			// inicializar con otro driver
		}
		// Setear un tiempo de espera para que aplique en todo el framework
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(prop.getProperty("timeout")), TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}
}