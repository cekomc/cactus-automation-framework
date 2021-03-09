package com.web.tests.phpSite.phpTravels.homeTests;

import com.web.pages.phpHomePage.BasePhpPage;
import com.web.pages.phpHomePage.HomePage;
import com.web.tests.phpSite.BasePagesTest;

public class BasePhpTest extends BasePagesTest {
    private BasePhpPage phpPage;

    private HomePage homePage;

    public BasePhpPage getPhpPage() {
        if (phpPage == null) {
            phpPage = new BasePhpPage(getDriver());
        }
        return phpPage;
    }

    public HomePage getHomePage() {
        if (homePage == null) {
            homePage = new HomePage(getDriver());
        }
        return homePage;
    }
}
