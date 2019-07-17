package Academy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LogingPage;
import resources.Base;

public class HomePage extends Base {
	public static Logger log = LogManager.getLogger(Base.class.getName());
	@BeforeTest
	public void beforeTest(){
		log.info("Inicializando driver");
		initializaDriver();
	}
	
	@AfterTest
	public void afterTest(){
		log.info("cerrando driver");
		driver.close();
		driver = null; //se asegura que no se creen nuevos drivers
	}
	
	@Test(dataProvider = "provider")
	public void homePageNavigation(String mail, String password) {
		driver.get(url);		//Si se pone en BeforeTest por el data provider la segunda vez lo ejecutara
		//en la pagina de login
		log.info("Creando Landing page");
		LandingPage landingPage = new LandingPage(driver);
		WebDriverWait wdw = new WebDriverWait(driver, 30);
		//wdw.until(ExpectedConditions.visibilityOfElementLocated(landingPage.getNoThanks())).click();
		getScreenShot();
		landingPage.getByCSSLogin().click();
		log.info("Creando Login page");
		LogingPage loginPage = new LogingPage(driver);
		loginPage.getByEmail().sendKeys(mail);
		getScreenShot();
		loginPage.getByPassword().sendKeys(password);
		getScreenShot();
		loginPage.getByLogin().click();
		getScreenShot();
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
