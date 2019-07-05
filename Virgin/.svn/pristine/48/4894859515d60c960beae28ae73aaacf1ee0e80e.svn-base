package Page;

import org.openqa.selenium.WebDriver;

import Utilerias.Selectores;

public class Phone {
	private WebDriver webDriver;
	private final String strTitulo =  ".phone-details-page-structure h2.phone-name";
	private final String strPrecio = ".phone-details-page-structure h2.special-price";
	private final String strAddToCart = "#stickyInMobileOnly button";
	private float fltPrecio;
	
	public Phone(WebDriver webDriver) {
		this.webDriver = webDriver;
		ejecutarAcciones();
	}
	public void ejecutarAcciones(){
		fltPrecio = Float.parseFloat(Selectores.getElementBySelector(this.webDriver, strPrecio ).getText().replace("$", ""));
		Selectores.getElementBySelector(this.webDriver, strAddToCart ).click();
	}
	
	public float getFltPrecio(){
		return fltPrecio;
	}
	
}
