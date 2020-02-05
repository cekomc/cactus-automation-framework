package com.web.tests.phpSite.phpTravels.homeTests;

import com.web.pages.phpHomePage.BasePhpPage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateAccountTest extends BasePhpTest {

    @Test
    public void verifyHomePage() throws InterruptedException {
        BasePhpPage phpPage = getPhpPage();
        Thread.sleep(1000);
        WebElement homeText = phpPage.findElementById("PageContainer");
        Assert.assertTrue(homeText.isDisplayed());
    }
}
