package com.web.components.phpTravels.navigation;

import com.web.components.Component;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Navigation extends Component {

    public Navigation(WebDriver driver) {
        super(driver);
    }

    private void clickTab(String tabLocator) {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(tabLocator)));
        WebElement tab = findElementByXpath(tabLocator);
        if (!tab.isDisplayed()) {
            mouseOver(findElementByXpath(tabLocator + "/ancestor::li"));
        }
        Actions act = new Actions(getDriver());
        act.moveToElement(tab).click().perform();
    }

    public void goToNavigationLink(String tabName) {
        String tabLocator =
            "//a[@class='marketing-nav__item marketing-nav__item--user'][contains(text(),'"
            + tabName + "')]";
        clickTab(tabLocator);
    }


//    public void goToSubHeader(String header, String subHeader) {
//        WebElement headerElement;
//        String childHeaderLocator =
//            "a[@class='marketing-nav__item marketing-nav__item--child popover-content__separated-item'][contains(text(),"
//            + subHeader + ")]";
//        switch (header) {
//            case "Features":
//                headerElement = findElementById("Popover1");
//                mouseOver(headerElement);
//                clickTab(childHeaderLocator);
//                break;
//        }
//    }
}
