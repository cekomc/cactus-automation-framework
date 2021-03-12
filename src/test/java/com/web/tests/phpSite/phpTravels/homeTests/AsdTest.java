package com.web.tests.phpSite.phpTravels.homeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AsdTest {
    WebDriver driver;

    public void before() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("/var/jenkins_home/.m2/repository/webdriver/chromedriver/linux64/89.0.4389.23/chromedriver");
        try {
            driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), chromeOptions);
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
