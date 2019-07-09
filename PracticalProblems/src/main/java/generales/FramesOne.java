package generales;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesOne {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		try {
			driver.get("http://qaclickacademy.com/practice.php");
			switchToFrame(driver);
			// Para regresar a la pagina principal
			driver.switchTo().defaultContent();
			driver.findElement(By.id("opentab")).click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void switchToFrame(WebDriver driver) throws InterruptedException {
		// la propiedad de isDisplayed verifica si se encuentra en el html, si
		// no se encuentra
		// truena

		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("framecount " + framecount);
		for (int i = 0; i < framecount; i++) {
			driver.switchTo().frame(i);

			Thread.sleep(7000);

			/*
			 * La mejor manera para ver si se está en el frame correcto es
			 * buscar la etiqueta que se quiere manipular y ver si es diferente
			 * de cero haciendo un conteo ya que si se selecciona un frame que
			 * no tenga dicha etiqueta y se hace un isDisplayed va a tronar
			 */
			List<WebElement> listaEmail = driver.findElements(By.name("email"));
			System.out.println("listaEmail.size() " + listaEmail.size());
			if (listaEmail.size() != 0) {
				listaEmail.get(0).sendKeys("xxx@xxx.com");
				break;
			}
		}

	}
}
