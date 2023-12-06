package com.demoqa.tests.alertsWindows;

import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import com.demoqa.pages.alertsWindows.AlertsPage;
import com.demoqa.tests.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase {
    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getAlertsFrameWindows();
        new SidePanel(driver).selectAlerts();
    }

    @Test
    public void alertWaitTest() {
        new AlertsPage(driver).clickOnAlertWithTimer();
    }

    @Test
    public void alertConfirmTest() {
        new AlertsPage(driver).confirmAlert("Cancel").verifyConfirm("Cancel");
    }

    @Test
    public void sendMessageToAlertTest() {
        new AlertsPage(driver).sendMessageToAlert("Hello World!")
                .verifyMessage("Hello World!");
    }
}
