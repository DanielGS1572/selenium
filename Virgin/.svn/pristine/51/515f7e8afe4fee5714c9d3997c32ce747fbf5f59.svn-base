package driverconfig;

import java.util.concurrent.TimeUnit;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestBase {
	private WebDriver driver;
	private ChromeOptions options = new ChromeOptions();

	private void setupCapabilities() {
		options.addArguments("--incognito");
		options.addArguments("start-maximized");
		//options.addArguments("--headless");
	}

	private void setupDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void initDriver() {
		setupCapabilities();
		setupDriver();
	}
	
	protected WebDriver getWebDriver(){
		return driver;
	}
}
