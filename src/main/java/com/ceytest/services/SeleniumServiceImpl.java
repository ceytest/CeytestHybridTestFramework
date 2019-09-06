package com.ceytest.services;

import com.ceytest.interfaces.SeleniumService;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class SeleniumServiceImpl implements SeleniumService {

    Capabilities capabilities = DesiredCapabilities.chrome();

    @PostConstruct

    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
    }
    public DesiredCapabilities getCapabilities(){
        return (DesiredCapabilities) capabilities;
    }
}
