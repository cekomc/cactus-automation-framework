package com.web.pages.phpHomePage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePhpPage {

    public HomePage(WebDriver driver) {
        super(driver);
    }


    public void verifyThatQuickNewsAppear() {
       waitForElementToAppear(By.id("quick-news"));
       findElementByXpath("//div[@id='quick-news']//div[@class='carousel-controls']");
    }

    public String getElementName() {
        WebElement newsElement =
        findElementByXpath("//div[@id='quick-news']//div[@class='carousel-controls']//span");
        return newsElement.getText();
    }

    public void verifyThatGlobalIconAppears() {
        findElementById("GlobalIconSymbols");
    }

    public void verifyThatSiteNavContainerAppears() {
        findElementById("SiteNavContainer");
    }

    public void verifyThatPageContainerAppears() {
        findElementById("PageContainer");
    }

    public void verifyThatChatWidgetContainerAppears() {
        findElementById("chat-widget-container");
    }


}
