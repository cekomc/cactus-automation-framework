package com.web.tests.phpSite.phpTravels.homeTests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class AsdTest {

    WebDriver driver;

    public void before() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--no-proxy-server");
        System.setProperty("webdriver.chrome.driver", "/var/jenkins_home/.cache/selenium/chromedriver/linux64/89.0.4389.23/chromedriver");
        driver = new ChromeDriver(options);

    }

    @Test
    public void test() throws InterruptedException {
        before();
        driver.get("https://www.google.com/");
        System.out.print("I got google");

        driver.quit();
    }
}
