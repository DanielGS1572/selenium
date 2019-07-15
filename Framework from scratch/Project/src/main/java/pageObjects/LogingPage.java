package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LogingPage {
	private WebDriver driver;
	By byEmail = By.id("user_email");
	By byPassword = By.id("user_password");
	By byLogin = By.cssSelector("[value='Log In']");

	public LogingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getByEmail() {
		return driver.findElement(byEmail);
	}
	public WebElement getByPassword() {
		return driver.findElement(byPassword);
	}
	public WebElement getByLogin() {
		return driver.findElement(byLogin);
	}

}
