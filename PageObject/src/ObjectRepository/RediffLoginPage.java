package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;
	By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("passwd");
	By go = By.name("proceed");
	
	public RediffLoginPage(WebDriver driver){
		this.driver = driver;
	}
	public WebElement getUsernameBox(){
		return driver.findElement(username);
	}
}
