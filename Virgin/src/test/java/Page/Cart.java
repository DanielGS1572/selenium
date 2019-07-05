package Page;

import org.openqa.selenium.WebDriver;

import Utilerias.Selectores;

public class Cart {
	private WebDriver webDriver;

	private final String strNextDay = "label[for='nextDay']";
	private final String strApplyPromo = "button.add-promo";
	private final String strCodigoNoValido = ".validation_message ";
	private final String strTotal = "div.before-due h4";
	private final String strPromo = "#promo_Code";
	private final String strContinuarBilling = " a.cta-button";
	private float fltTotal;

	private String promoCode;

	public Cart(WebDriver webDriver,String promoCode) {
		this.webDriver = webDriver;
		this.promoCode = promoCode;
		ejecutarAcciones();
	}

	public void ejecutarAcciones() {
		fltTotal =  Float.parseFloat(Selectores
				.getElementBySelector(webDriver, strTotal).getText()
				.replace("$", ""));
		Selectores.getElementBySelector(webDriver, strNextDay).click();
		Selectores.getElementBySelector(webDriver, strPromo).sendKeys(
				promoCode);
		Selectores.getElementBySelector(webDriver, strApplyPromo).sendKeys(
				strApplyPromo);
		Selectores.getElementBySelector(webDriver, strContinuarBilling)
				.click();
	}

	public float getFltTotal() {
		return fltTotal;
	}
}
