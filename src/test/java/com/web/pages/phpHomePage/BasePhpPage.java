package com.web.pages.phpHomePage;

import com.web.components.Component;
import com.web.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasePhpPage extends BasePage {
    protected final Logger LOGGER = LoggerFactory.getLogger(getClass());

    Component component = new Component(this.driver);
    Actions actions = new Actions(getDriver());

    public BasePhpPage(WebDriver driver) {
        super(driver);
    }

    public void scrollIntoView(WebElement element) {
        component.executeScript("arguments[0].scrollIntoView(true);", element);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
