/*
package com.ceytest.tests.mobile;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

//@PropertySource("com.ceytest.properties/mobile-app.properties")
public class AppiumBaseTest {
  public static AppiumDriver<MobileElement> driver;
  public static DesiredCapabilities caps = new DesiredCapabilities();

    //get application.properties
//    @Value("${device.name}")
//    private String deviceName;
//    @Value("${device.version}")
//    private String deviceVersion;
//    @Value("${device.platform}")
//    private String devicePlatform;
//    @Value("${application.package}")
//    private String applicationPackage;
//    @Value("${app.path}")
//    private String appPath;
//    @Value("${application.activity}")
//    private String applicationActivity;
//    @Value("${device.udid}")
//    private String deviceUdid;


    @BeforeTest

    public void setUp() {
        String platform="ANDROID";


        try {
            if (platform.equalsIgnoreCase("android")) {
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9.0");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_2_XL_API_28");
                caps.setCapability(MobileCapabilityType.APP, "C:\\Users\\USER\\IdeaProjects\\CeytestHybridTestFramework\\src\\test\\resources\\com.ceytest.mobile.apps\\Booking com Hotels Apartments Accommodation_v19.1.1_apkpure.com.apk");
                caps.setCapability(MobileCapabilityType.APPLICATION_NAME, "com.Booking");
                caps.setCapability(MobileCapabilityType.UDID, "emulator-5554");
                //caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
//                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, devicePlatform);
//                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, deviceVersion);
//                caps.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
//                caps.setCapability(MobileCapabilityType.APP, appPath);
//                caps.setCapability(MobileCapabilityType.APPLICATION_NAME, applicationPackage);
//                caps.setCapability(MobileCapabilityType.UDID, deviceUdid);
                //caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
            }
            else if (platform.equalsIgnoreCase("ios")){
                caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "IOS");
                caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "12.3.1");
                caps.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 5s");
                caps.setCapability(MobileCapabilityType.UDID, "24799971aca1f9ed75f943cca29e4f7bb4afe2d7");
                caps.setCapability(MobileCapabilityType.BROWSER_NAME,"Safari");
            }
            URL url =new URL("http://127.0.0.1:4723/wd/hub");

            driver=new AndroidDriver<MobileElement>(url,caps);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        }catch (Exception ex){
            ex.getLocalizedMessage();
            ex.printStackTrace();
        }

    }

    @Test
    private void dummyTest(){
        System.out.println("Startup test...");
    }

    @AfterTest
    public void cleenUp () {

//        driver.close();
       // driver.quit();


    }
}
*/
