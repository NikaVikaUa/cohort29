package com.remindly.tests;

import com.remindly.fw.ApplicationManager;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;

public class TestBase {

    protected static ApplicationManager app = new ApplicationManager();

    @BeforeMethod
    public void setUp() throws MalformedURLException {
        app.init();
    }

}

/*{
        "platformName": "Android",
        "appium:platformVersion": "8.0",
        "appium:deviceName": "mob",
        "appium:appPackage": "com.blanyal.remindly",
        "appium:appActivity": "com.blanyal.remindme.MainActivity"
        }*/
