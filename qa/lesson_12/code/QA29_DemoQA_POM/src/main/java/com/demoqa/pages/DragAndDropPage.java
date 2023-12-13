package com.demoqa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class DragAndDropPage extends BasePage {

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "draggable")
    WebElement dragMe;

    @FindBy(id = "droppable")
    WebElement dropHere;

    public DragAndDropPage actionDragMe() {
        Actions actions = new Actions(driver);
        actions.dragAndDrop(dragMe, dropHere).perform();
        return this;
    }

    public DragAndDropPage dragAndDropBy(int x, int y) {

        Actions actions = new Actions(driver);

        int xOffset1 = dragMe.getLocation().getX();
        int yOffset1 = dragMe.getLocation().getY();
        System.out.println("xOffset1 ->" + xOffset1 + " yOffset1 ->" + yOffset1);

        int xOffset = dropHere.getLocation().getX();
        int yOffset = dropHere.getLocation().getY();
        System.out.println("xOffset ->" + xOffset + " yOffset ->" + yOffset);

        xOffset = (xOffset - xOffset1) + x;
        yOffset = (yOffset - yOffset1) + y;
        pause(1000);

        actions.dragAndDropBy(dragMe,xOffset,yOffset).perform();
        return this;
    }
}

