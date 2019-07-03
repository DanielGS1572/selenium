package TestCases;

import ObjectRepository.RediffLoginPage;
import ObjectRepository.RediffLoginPageFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginApplicationFactory {
	// public static void main(String args[]){
	@Test
	public void Login() {

		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		System.setProperty("webdriver.chrome.driver", "./Artefactos/driverForLinux/chromedriver72");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		RediffLoginPageFactory rediffLoginPage = new RediffLoginPageFactory(driver);
		rediffLoginPage.getUsernameBox().sendKeys("keys");
	}
	// }
}
