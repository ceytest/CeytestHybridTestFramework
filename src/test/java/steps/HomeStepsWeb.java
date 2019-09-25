package steps;

import com.ceytest.pom.web.WebHomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import org.openqa.selenium.WebDriver;



public class HomeStepsWeb {

    private WebHomePage webHomePage;
    public WebDriver driver;


    @Given("user landed to the home page")
    public void userLandedToTheHomePage() {
        webHomePage = new WebHomePage(driver);
        //webHomePage.isInitialized();
        webHomePage.gotoHome();

    }

    @When("user enters destination as (.*)")
    public void userEntersDestinationAsElla(String arg0) {
        webHomePage.enterDestination(arg0);
    }

    @And("user clicks on Search button")
    public void userClicksOnSearchButton() {
        webHomePage.clickOnSearch();
    }


}
