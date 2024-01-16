package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ReminderHelper extends BaseHelper {
    public ReminderHelper(AppiumDriver driver) {
        super(driver);
    }

    public void enterTitle(String title) {
        pause(500);
        type(By.id("reminder_title"), title);
    }

    public void tapOnDateField() {
        tap(By.id("date"));
    }

    public void swipeToMonth(String period, String month, int number) {
        if (!getSelectedMonth().equals(month)) {
            for (int i = 0; i < number; i++) {
                if (period.equals("future")) {
                    swipe(0.8, 0.4);
                } else if (period.equals("past")) {
                    swipe(0.5, 0.8);
                }
            }
        }
    }

    public void swipe(double start, double stop) {

        TouchAction action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();

        int x = size.width / 2;

        int startY = (int) (size.height * start);
        int stopY = (int) (size.height * stop);

        action.longPress(PointOption.point(x, startY))
                .moveTo(PointOption.point(x, stopY))
                .release().perform();

    }

    public String getSelectedMonth() {
        return driver.findElement(By.id("date_picker_month")).getText();
    }

    public void selectDate(int day) {
        List<WebElement> days = driver.findElements(By.className("android.view.View"));
        days.get(day).click();
    }

    public void tapOnYear() {
        tap(By.id("date_picker_year"));
    }

    public void swipeToYear(String period2, String year) {
        if (!getYear().equals(year)) {
            if (period2.equals("future")) {
                swipeUntilNeededYear(year, 0.6, 0.5);
            } else if (period2.equals("past")) {
                swipeUntilNeededYear(year, 0.5, 0.6);
            }
        }
        tap(By.id("month_text_view"));
    }

    private void swipeUntilNeededYear(String year, double startPoint, double stopPoint) {
        while (!getSelectedYear().equals(year)) {
            moveToElement(By.className("android.widget.ListView"), startPoint, stopPoint);
            getSelectedYear();
        }
    }

    public void moveToElement(By locator, double startPoint, double stopPoint) {

        TouchAction action = new TouchAction(driver);

        Dimension size = driver.manage().window().getSize();

        //get activity point
        int y = (int) (size.height * startPoint);
        int y2 = (int) (size.height * stopPoint);

        //get locator's point
        WebElement element = driver.findElement(locator);
        int leftX = element.getLocation().getX();
        int rightX = leftX + element.getSize().getWidth();
        int middleX = (leftX + rightX) / 2;

        action.longPress(PointOption.point(middleX,y))
                .moveTo(PointOption.point(middleX,y2))
                .release().perform();

    }

    public String getSelectedYear() {
        return driver.findElement(By.id("month_text_view")).getText();
    }

    public String getYear() {
        return driver.findElement(By.id("date_picker_year")).getText();
    }

    public void tapOnOk() {
        tap(By.id("ok"));
    }

    public void tapOnTimeField() {
        tap(By.id("time"));
    }

    public void selectTime(String timeOfDay, int xHour, int yHour, int xMin, int yMin) {

        pause(500);
        if (timeOfDay.equals("am")) {
            tapWithCoordinates(279,1318);
        } else if (timeOfDay.equals("pm")) {
            tapWithCoordinates(789,1318);
        }
        tapWithCoordinates(xHour,yHour);
        tapWithCoordinates(xMin,yMin);
    }

    public void tapWithCoordinates(int x, int y) {
        new TouchAction(driver).tap(PointOption.point(x,y))
                .release().perform();
    }

    public void tapOnRepetitionIntervalField() {
        tap(By.id("RepeatNo"));
    }

    public void enterNumber(String repeat) {
        pause(500);
        type(By.className("android.widget.EditText"),repeat);
        tap(By.xpath("//*[@text='OK']"));
    }

    public void selectTypeOfRepetition(String typeRep) {
        tap(By.xpath("//*[@text='" + typeRep + "']"));
    }

    public void tapOnRepetitionField() {
        tap(By.id("RepeatType"));
    }

    public void saveReminder() {
        tap(By.id("save_reminder"));
    }
}
