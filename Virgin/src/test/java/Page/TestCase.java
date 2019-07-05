package Page;

import java.io.IOException;
import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utilerias.DataDriven;
import driverconfig.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase extends TestBase {

	private WebDriver driver;
	private final String URL = "https://www.virginmobileusa.com";
	private HomePage homePage;
	private Shop shopPage;
	private Phone phonePage;
	private Billing billingPage;
	private Cart cartPage;

	@BeforeTest
	public void initialization() {
		WebDriverManager.chromedriver().setup(); // aqui ya no se hace la
													// configuracion de
													// variables del system
		driver = new ChromeDriver();
	}

	@Test(dataProvider = "DataProvider")
	public void f(String modelo, String promoCode,String cardNumber, String cVV, String cardHolder, String firstName, String lastName,
			String address, String city, String zipCode, String email, String emailConfirmation) {

		homePage = new HomePage(driver);
		shopPage = new Shop(driver, modelo);
		phonePage = new Phone(driver);
		cartPage = new Cart(driver, promoCode);
		billingPage = new Billing(driver, cardNumber, cVV, cardHolder, firstName, lastName, address, city, zipCode,
				email, emailConfirmation);
	}

	@BeforeClass
	public void beforeClass() {
		initDriver();
		driver = getWebDriver();
		driver.get(URL);
	}

	@DataProvider(name = "DataProvider")
	public Object[][] getDataFromDataprovider() {
		DataDriven dd = new DataDriven();
		ArrayList<String> data;
		try {
			data = dd.getData("Login");
			System.out.println(data.get(0));
			System.out.println(data.get(1));
			System.out.println(data.get(2));
			System.out.println(data.get(3));

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new Object[][] { { "LG"/*data.get(1) Modelo */, "ABCDE"/* Promo code */,"1234567890"/*Card number*/, 
				"123"/* CVV */,
				"DANIEL GONZALI"/* Card holder */
				, "First name"/* billing and shipping First name */,
				"Last Name"/* last name */, "Address"/* Address */, "City"/* City */,
				"89510"/* zip code */, "correo@correo.com"/* email */,
				"correo@correo.com"/* email confirmation */
				}
				// TODO poner los demás casos ,{}
		};

	}

}
