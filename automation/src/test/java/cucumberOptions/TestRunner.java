package cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = "stepDefinitions"
)
public class TestRunner {
    //en la anotacion de CucumberOptions en features tomaría todos los .feature existentes, si se quiere que se ejecute uno en particular se debe de indicar
    //glue es el paquete
}
