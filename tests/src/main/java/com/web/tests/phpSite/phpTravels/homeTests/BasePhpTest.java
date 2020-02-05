package com.web.tests.phpSite.phpTravels.homeTests;

import com.web.pages.phpHomePage.BasePhpPage;
import com.web.tests.BaseTest;
import com.web.tests.phpSite.BasePagesTest;

public class BasePhpTest extends BasePagesTest {
    private BasePhpPage phpPage;

    public BasePhpPage getPhpPage() {
        if (phpPage == null) {
            phpPage = new BasePhpPage(getDriver());
        }
        return phpPage;
    }
}
