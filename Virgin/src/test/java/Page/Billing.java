package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Utilerias.Selectores;

public class Billing {

	private WebDriver webDriver;

	private final String strCardNumber = "#ecc-card-number";
	private final String strExpirationMonth = "[name='expirationMonth']";
	private final String strExpirationYear = "[name='expirationYear']";
	private final String strCvv = "[name='cvv']";
	private final String strHolderName = "[name='cardholder-name']";

	private final String strFname = "[name='fname']";
	private final String strLName = "[name='lName']";
	private final String strAddress = "[name='address']";
	private final String strCity = "[name='City']";
	private final String strState = "[name='state']";

	private final String strZipCode = "[name='zipCode']";
	private final String strEmailAddress = "[name='emailAddress']";
	private final String strConfirmEmail = "[name='confirmEmail']";
	private final String strServiceTerms = "[class='control-indicator']";
	private final String strBtnConfirmation = "[class='btn standard btn-primary cta-button']";

	private String cardNumber;
	private String cVV;
	private String cardHolder;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String zipCode;
	private String email;
	private String emailConfirmation;

	public Billing(WebDriver webDriver, String cardNumber, String cVV, String cardHolder, String firstName,
			String lastName, String address, String city, String zipCode, String email, String emailConfirmation) {
		this.webDriver = webDriver;
		this.cardNumber=cardNumber;
		this.cVV=cVV;
		this.cardHolder=cardHolder;
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.zipCode=zipCode;
		this.email=email;
		this.emailConfirmation=emailConfirmation;
		ejecutarAcciones();
	}

	public void ejecutarAcciones() {

		Selectores.getElementBySelector(webDriver, strCardNumber).sendKeys(cardNumber);
		new Select(Selectores.getElementBySelector(webDriver, strExpirationMonth)).selectByIndex(4);
		new Select(Selectores.getElementBySelector(webDriver, strExpirationYear)).selectByIndex(4);
		Selectores.getElementBySelector(webDriver, strCvv).sendKeys(cVV);
		Selectores.getElementBySelector(webDriver, strHolderName).sendKeys(cardHolder);
		Selectores.getElementBySelector(webDriver, strFname).sendKeys(firstName);
		Selectores.getElementBySelector(webDriver, strLName).sendKeys(lastName);
		Selectores.getElementBySelector(webDriver, strAddress).sendKeys(address);
		Selectores.getElementBySelector(webDriver, strCity).sendKeys(city);

		new Select(Selectores.getElementBySelector(webDriver, strState)).selectByIndex(2);

		Selectores.getElementBySelector(webDriver, strZipCode).sendKeys(zipCode);
		Selectores.getElementBySelector(webDriver, strEmailAddress).sendKeys(email);
		Selectores.getElementBySelector(webDriver, strConfirmEmail).sendKeys(emailConfirmation);
		Selectores.getElementBySelector(webDriver, strServiceTerms).click();
		Selectores.getElementBySelector(webDriver, strBtnConfirmation).click();

		WebDriverWait wait = new WebDriverWait(webDriver, 40);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".QSIPopOver div")));
		element.click();
		/*
		 * try {
		 * webDriver.findElement(By.cssSelector(".QSIPopOver")).isDisplayed();
		 * webDriver.findElement(
		 * By.cssSelector(".QSIPopOver div div:nth-child(1)")).click(); } catch
		 * (Exception e) {
		 * 
		 * } Thread.sleep(10000); webDriver.close();
		 */

	}
}
