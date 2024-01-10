package com.ilCarro.pages;

import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Map;

public class LoginPage extends com.ilCarro.pages.BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "email")
    WebElement emailField;

    @FindBy(id = "password")
    WebElement passwordField;
    public LoginPage enterValidData(String email, String password) {
        type(emailField,email);
        type(passwordField,password);
        return this;
    }

    @FindBy(css = "[type='submit']")
    WebElement yallaButton;

    public com.ilCarro.pages.HomePage clickOnYallaButton() {
        click(yallaButton);
        return new com.ilCarro.pages.HomePage(driver);
    }

    public LoginPage enterWrongPassword(DataTable table) {
        List<Map<String,String>> dataTable = table.asMaps();

        String email = dataTable.get(0).get("email");
        String password = dataTable.get(0).get("password");

        enterValidData(email,password);
        return this;
    }
}
