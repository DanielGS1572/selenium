package Page;

import org.openqa.selenium.WebDriver;

import Utilerias.Selectores;

public class Shop {
	private WebDriver webDriver;
	private final String strFiltroDevice = ".grid-device-type-filter > .grid-checkbox:nth-child(2)";
	private String strFiltroMarca = ""; 
	private final String strBotonSeleccion = ".select-button > a";
	public Shop(WebDriver webDriver, String modelo) {
		this.webDriver = webDriver;
		//TODO logica de los diferentes modelos
		if("LG".equals(modelo)){			
			strFiltroMarca = ".grid-device-condition-filter > .grid-checkbox:nth-child(1) > .small";
		}
		ejecutarAcciones();
	}
	public void ejecutarAcciones(){
		Selectores.getElementBySelector(this.webDriver, strFiltroDevice).click();
		Selectores.getElementBySelector(this.webDriver, strFiltroMarca).click();
		Selectores.getElementBySelector(this.webDriver, strBotonSeleccion).click();
	}
}
