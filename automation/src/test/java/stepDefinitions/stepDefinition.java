package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {
/*Presionando ctrl + click en la definición del feature te redirige al metodo definido*/
    //Usar la app de chrome que se llama Tidy Gherkin para generar los metodos pasandole el contenido del archivo de Feature
    //Igual tambien se puede generar ejecutando la prueba y la consola arrojará los metodos
    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("user_is_on_netbanking_landing_page()");
    }

    @When("^User login into application with \"([^\"]*)\" and \"([^\"]*)\"$")       //Acepta texto a traves de expresiones regulares
    public void user_login_into_application_with_something_and_something(String strArg1, String strArg2) throws Throwable {
        System.out.println(strArg1);
        System.out.println(strArg2);
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {
        System.out.println("home_page_is_populated()");

    }

    @And("^Cards are displayed$")
    public void cards_are_displayed() throws Throwable {
        System.out.println("cards_are_displayed()");

    }

}
