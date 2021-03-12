package com.web.tests.phpSite.phpTravels.homeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AsdTest {
    WebDriver driver;

    public void before() {
        WebDriverManager.chromedriver().setup();
        DesiredCapabilities desiredCapabilities =  new DesiredCapabilities().chrome();

        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
                                         (Capabilities) desiredCapabilities);
        }catch (MalformedURLException e){
            e.printStackTrace();
        }
    }

    @Test
    public void test() throws InterruptedException {
        before();
        driver.get("https://www.google.com/");
        System.out.print("I got google");

        driver.quit();
    }
}
