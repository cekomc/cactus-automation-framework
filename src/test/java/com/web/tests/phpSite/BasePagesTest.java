package com.web.tests.phpSite;

import com.web.tests.BaseTest;
import org.testng.annotations.BeforeClass;

public class BasePagesTest extends BaseTest{

    @BeforeClass(alwaysRun = true)
    public void before(){
        super.initialize();
        loadUrlToTest(url);
    }

}
