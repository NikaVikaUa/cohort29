package com.demoqa.tests;

import com.demoqa.pages.DragAndDropPage;
import com.demoqa.pages.HomePage;
import com.demoqa.pages.SidePanel;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DragAndDropTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getInteractions();
        new SidePanel(driver).selectDroppable().hideIframes();
    }

    @Test
    public void actionDragMeTest() {
        new DragAndDropPage(driver).actionDragMe();
    }

    @Test
    public void dragAndDropByTest() {
        new DragAndDropPage(driver).dragAndDropBy(20,35);
    }
}
