package com.web.tests.phpSite.phpTravels.homeTests;

import com.web.pages.phpHomePage.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageElementsVerification extends BasePhpTest {

    //@Test
    public void verifyNewsDivAppears() {
        HomePage homePage = getHomePage();
        String nameOfTheElement;

        homePage.verifyThatQuickNewsAppear();
        nameOfTheElement = homePage.getElementName();

        Assert.assertTrue(nameOfTheElement.equalsIgnoreCase("News"));
    }

   // @Test
    public void verifyGlobalIconSymbols() {
        HomePage homePage = getHomePage();

        homePage.verifyThatGlobalIconAppears();
    }

   // @Test
    public void verifySiteNavigationContainer() {
        HomePage homePage = getHomePage();

        homePage.verifyThatSiteNavContainerAppears();
    }

    @Test
    public void verifyThatPageContainerAppears() {
        HomePage homePage = getHomePage();

        homePage.verifyThatPageContainerAppears();
    }

    @Test
    public void verifyThatChatWidgetContainerAppears() {
        HomePage homePage = getHomePage();

        homePage.verifyThatChatWidgetContainerAppears();
    }
}
