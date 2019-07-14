package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	private WebDriver driver;
	By byCSSLogin = By.cssSelector("a[href*='sign_in']");
	public By byClassClose = By.className("sumome-react-svg-image-container");

	public LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getByCSSLogin() {
		return driver.findElement(byCSSLogin);
	}
	public WebElement getByClassClose() {
		return driver.findElement(byClassClose);
	}
	
	public By getNoThanks(){
		return By.xpath("//button[contains(text(),'NO THANKS')]"); 
	}

}
