package com.ceytest.stepDefs.home;

import io.cucumber.java.en.Given;
import com.ceytest.pom.mobile.home.HomePage;

import static com.ceytest.tests.mobile.AppiumBaseTest.driver;

public class HomeSteps {

    public HomePage homePage=new HomePage(driver);

    @Given("user in the home page")
    public void userInTheHomePage() {

    }
}
