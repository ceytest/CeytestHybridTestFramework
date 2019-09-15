package com.ceytest.pom.mobile;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BaseMobilePage {
    protected AppiumDriver driver;

    public BaseMobilePage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickElement(WebElement element){
        element.click();
    }

}
