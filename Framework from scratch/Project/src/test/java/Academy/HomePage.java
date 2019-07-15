package Academy;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogingPage;
import resources.Base;

public class HomePage extends Base {

	@BeforeTest
	public void beforeTest(){
		initializaDriver();
	}
	
	@AfterTest
	public void afterTest(){
		driver.close();
	}
	
	@Test(dataProvider = "provider")
	public void homePageNavigation(String mail, String password) {
		driver.get(url);		//Si se pone en BeforeTest por el data provider la segunda vez lo ejecutara
		//en la pagina de login
		LandingPage landingPage = new LandingPage(driver);
		WebDriverWait wdw = new WebDriverWait(driver, 30);
		//wdw.until(ExpectedConditions.visibilityOfElementLocated(landingPage.getNoThanks())).click();
		landingPage.getByCSSLogin().click();

		LogingPage loginPage = new LogingPage(driver);
		loginPage.getByEmail().sendKeys(mail);
		loginPage.getByPassword().sendKeys(password);
		loginPage.getByLogin().click();
	}

	@DataProvider
	private Object[][] provider() {
		Object[][] datos = new Object[2][2];
		datos[0][0] = "unrestricted@abc.com";
		datos[0][1] = "1234";

		datos[1][0] = "restricted@abc.com";
		datos[1][1] = "5678";

		return datos;
	}
}
