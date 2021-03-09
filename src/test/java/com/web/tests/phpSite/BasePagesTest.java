package com.web.tests.phpSite;

import com.web.tests.BaseTest;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;

public class BasePagesTest extends BaseTest{

    @BeforeClass(alwaysRun = true)
    public void before() throws MalformedURLException {
        super.initialize();
        loadUrlToTest(url);
    }

}
