package Academy;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class HomePage extends Base {
	@Test
	public void homePageNavigation() {
		initializaDriver();
		driver.get("https://qaclickacademy.com");
		LandingPage landingPage = new LandingPage(driver);
		WebDriverWait wdw = new WebDriverWait(driver, 30);
		wdw.until(ExpectedConditions.visibilityOfElementLocated(landingPage.getNoThanks())).click();
		landingPage.getByCSSLogin().click();
	}
}
