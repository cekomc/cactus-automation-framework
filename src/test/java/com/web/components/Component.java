package com.web.components;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Component {
   private static final Logger LOGGER = LoggerFactory.getLogger(Component.class);
   private WebDriver driver;

   public Component (WebDriver driver){
       this.driver = driver;
   }

   public WebDriver getDriver (){
       return this.driver;
   }

    public void executeScript(String javascript, WebElement element) {
        ((JavascriptExecutor)this.getDriver()).executeScript(javascript, new Object[]{element});
    }

    public boolean isElementDisplayed(By locatorKey, int nTry) {
        try {
            for(int i = 0; i < nTry; ++i) {
                if (this.getDriver().findElement(locatorKey).isDisplayed()) {
                    return true;
                }

                Thread.sleep(1000L);
            }

            return false;
        } catch (Exception var4) {
            return false;
        }
    }

    public void sleep(long waitTimeInMS, String reason) {
        if (reason == null) {
            throw new IllegalArgumentException("a reason for sleeping must be specified");
        } else {
            LOGGER.info("Sleeping for " + waitTimeInMS + "ms because: " + reason);

            try {
                Thread.sleep(waitTimeInMS);
            } catch (InterruptedException var5) {
                LOGGER.error("Caught InterruptedException while sleeping: " + var5.getMessage(), var5);
            }

        }
    }

    public void mouseOver(WebElement element) {
        Actions builder = new Actions(this.getDriver());
        builder.moveToElement(element).build().perform();
        this.sleep(2000L, "waiting for mouse over event to happen");
        LOGGER.info("moused-over: " + element);
    }

    public WebElement findElementById(String id) {
        return this.getDriver().findElement(By.id(id));
    }

    public WebElement findElementByXpath(String xpathExpression){
        return this.getDriver().findElement(By.xpath(xpathExpression));
    }

    protected List<WebElement> findElementsByXpath(String xpathExpression) {
        return this.getDriver().findElements(By.xpath(xpathExpression));
    }

    public WebElement findElementByClassName(String className) {
        return this.getDriver().findElement(By.className(className));
    }

    protected WebElement findElementByClassName(String className, int nTry) {
        this.isElementDisplayed(By.className(className), nTry);
        return this.findElementByClassName(className);
    }

    protected WebElement findElementByName(String name) {
        return this.getDriver().findElement(By.name(name));
    }

    public WebElement findElementByLinkText(String linkText) {
        return this.getDriver().findElement(By.linkText(linkText));
    }

    protected WebElement findElementByLinkText(String linkText, int nTry) {
        this.isElementDisplayed(By.linkText(linkText), nTry);
        return this.findElementByLinkText(linkText);
    }

    protected WebElement findElementByCssSelector(String cssSelector) {
        return this.getDriver().findElement(By.cssSelector(cssSelector));
    }
}
