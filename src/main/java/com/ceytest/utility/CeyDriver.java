package com.ceytest.utility;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;


public class CeyDriver  {

    protected WebDriver driver;

    public CeyDriver(WebDriver driver){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }



}
