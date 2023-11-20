package com.ait.phonebook.tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CreateAccountTests extends TestBase{

    //precondition: user should be logged out
    @BeforeMethod
    public void ensurePrecondition() {
        if (!isLoginLinkPresent()) {
            clickOnSignOutButton();
        }
    }

    @Test
    public void existedUserRegistrationNegativeTest() {

        clickOnLoginLink();
        fillLoginRegisterForm("manuel@gm.com", "Manuel1234$");
        clickOnRegistrationButton();

        Assert.assertTrue(isAlertPresent());
    }

}
