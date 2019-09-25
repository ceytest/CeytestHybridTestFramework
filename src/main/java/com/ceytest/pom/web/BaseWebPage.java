//package com.ceytest.pom.web;
//
//import io.cucumber.java.After;
//import io.cucumber.java.AfterStep;
//import io.cucumber.java.Before;
//import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.CapabilityType;
//import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.PageFactory;
//
//import java.util.concurrent.TimeUnit;
//
//
//public class BaseWebPage {
//    private final static Logger logger = Logger.getLogger(BaseWebPage.class);
//    public static WebDriver driver;
//    private static ChromeOptions options;
//
//    public BaseWebPage(WebDriver driver) {
//        this.driver = driver;
//        PageFactory.initElements(driver, BaseWebPage.class);
//
//    }
//
//    @After
//    public void cleanUp() {
//        driver.manage().deleteAllCookies();
//    }
//
//    @AfterStep
//    public static void tearDown() {
//        driver.close();
//    }
//}
