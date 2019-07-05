package Page;

import org.openqa.selenium.WebDriver;

import Utilerias.Selectores;

public class HomePage {
	private WebDriver webDriver;
	private final String strShop = "a[href='/shop']";
	public HomePage(WebDriver webDriver) {
		this.webDriver = webDriver;
		ejecutarAcciones();
	}

	public void ejecutarAcciones() {
		Selectores.getElementBySelector(this.webDriver, strShop).click();
	}
}
