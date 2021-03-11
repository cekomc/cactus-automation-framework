package com.web.tests.phpSite.phpTravels.homeTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AsdTest {
    WebDriver driver;

    public void before(){
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setBrowserName(DesiredCapabilities.chrome().getBrowserName());
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), desiredCapabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test
    public void test(){
        before();
        driver.get("https://www.google.com/");
        System.out.print("I got google");
    }
}
