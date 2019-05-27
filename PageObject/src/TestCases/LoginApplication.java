package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ObjectRepository.RediffLoginPage;

public class LoginApplication {
	// public static void main(String args[]){
	@Test
	public void Login() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Danielgonzali\\Documents\\Selenium\\repo\\selenium\\Artefactos\\chromedriver74.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		RediffLoginPage rediffLoginPage = new RediffLoginPage(driver);
		rediffLoginPage.getUsernameBox().sendKeys("keys");
	}
	// }
}
