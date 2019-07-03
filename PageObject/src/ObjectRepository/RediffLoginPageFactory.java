package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPageFactory {
	WebDriver driver;

	public RediffLoginPageFactory(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(this.driver,this);

	}
	/*By username = By.xpath("//input[@id='login1']");
	By password = By.xpath("passwd");
	By go = By.name("proceed");*/

	@FindBy(xpath = ".//*[@id='login1']")			//ya no se usa el findElement con el driver, pero se debe inicializar en el constructor
	WebElement username;

	@FindBy(name="passwd")			//Tambien puede ser @FindBy(linkText="passwd")
	WebElement password;



	public WebElement getUsernameBox(){
		return username;
	}
}
