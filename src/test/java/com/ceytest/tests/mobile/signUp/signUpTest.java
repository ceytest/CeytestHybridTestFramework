package com.ceytest.tests.mobile.signUp;

import com.ceytest.pom.mobile.signUp.SignUpPage;
import com.ceytest.tests.web.BaseTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class signUpTest extends BaseTest {
    @Test
    public void signUp() {
        driver.get("http://www.kimschiller.com/page-object-pattern-tutorial/index.html");

        SignUpPage signUpPage = new SignUpPage(driver);
        assertTrue(signUpPage.isInitialized());

        signUpPage.enterName("First", "Last");
        signUpPage.enterAddress("123 Street", "12345");

    }
}
