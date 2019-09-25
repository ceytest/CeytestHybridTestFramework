package com.ceytest.pom.web;

import com.ceytest.utility.CeyDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WebHomePage extends CeyDriver {
    private final static Logger logger = Logger.getLogger(WebHomePage.class);
//    WebDriver driver;
    private static ChromeOptions options;

    @FindBy(className = "#logo_no_globe_new_logo") //#logo_no_globe_new_logo
    private WebElement pageLogo;

    @FindBy(id = "ss")
    private WebElement txtDestination;

    @FindBy(className = "sb-searchbox__button")
    private WebElement btnSearch;

    public WebHomePage(WebDriver driver) {
        super(driver);
    }

    public void gotoHome() {
        driver.get("https://www.booking.com/");
    }

    public boolean isInitialized() {
        return pageLogo.isDisplayed();
    }

    public void enterDestination(String dest) {
        txtDestination.sendKeys(dest);
    }

    public void clickOnSearch(){btnSearch.click();}



}
