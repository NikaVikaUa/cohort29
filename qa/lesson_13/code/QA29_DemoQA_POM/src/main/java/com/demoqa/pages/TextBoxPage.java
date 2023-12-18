package com.demoqa.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class TextBoxPage extends BasePage{
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "userName")
    WebElement userName;

    @FindBy(id = "userEmail")
    WebElement userEmail;

    public TextBoxPage enterPersonalData(String name, String email) {
        type(userName,name);
        type(userEmail,email);
        return this;
    }

    @FindBy(id = "currentAddress")
    WebElement currentAddress;

    @FindBy(id = "permanentAddress")
    WebElement permanentAddress;

    public TextBoxPage keyBoardEvent(String address) {
        Actions actions = new Actions(driver);
        type(currentAddress,address);
        //select current address
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
        //copy current address
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
        //press TAB key to switch focus to Permanent address field
        actions.sendKeys(Keys.TAB).perform();
        //past current address in Permanent address field
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
        return this;
    }

    @FindBy(id = "submit")
    WebElement submit;

    public TextBoxPage submit() {
        clickWithJSExecutor(submit,0,300);
        return this;
    }

    @FindBy(xpath = "//p[@id='currentAddress']")
    WebElement provedCurrentAddress;

    @FindBy(xpath = "//p[@id='permanentAddress']")
    WebElement provedPermanentAddress;

    public TextBoxPage assertCopyPastAddress() {
        String text1 = provedCurrentAddress.getText().replace("Current Address :", "");
        String text2 = provedPermanentAddress.getText().replace("Permananet Address :", "");
        Assert.assertEquals(text2,text1);
        return this;
    }
}
