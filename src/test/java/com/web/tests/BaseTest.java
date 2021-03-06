package com.web.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseTest.class);
    private WebDriver driver;
    protected String userName;
    protected String password;
    protected String url;
    private Properties appProperties = new Properties();

    @BeforeTest
    public void initialize() throws MalformedURLException {
        try (InputStream inputStream = getClass().getResourceAsStream("/config.properties")) {
            appProperties.load(inputStream);
        } catch (IOException e) {
            LOGGER.info("Unable to find config.properties");
            e.printStackTrace();
        }
        WebDriverManager.chromedriver().setup();
        ChromeOptions opt = new ChromeOptions();

        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability(ChromeOptions.CAPABILITY, opt);
        try {
            driver = new RemoteWebDriver(new URL(
                "https://VvGwpafo1BFkpmRfOfJOdXXxMrTxpvKa:Qhx6iCla4Qkk32pI8YmbMazoriMGEnHl@fifv6i5w-hub.gridlastic.com/wd/hub"),
                                         capabilities);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        applyProperties();
    }


    private String readFromInputStream(InputStream inputStream)
        throws IOException {
        StringBuilder resultStringBuilder = new StringBuilder();
        try (BufferedReader br
                 = new BufferedReader(new InputStreamReader(inputStream))) {
            String line;
            while ((line = br.readLine()) != null) {
                resultStringBuilder.append(line).append("\n");
            }
        }
        return resultStringBuilder.toString();
    }

    public WebDriver getDriver() {
        return driver;
    }

    @AfterTest
    public void close() {
        if (null != driver) {
            driver.close();
            driver.quit();
        }
    }

    protected void applyProperties() {
        userName = appProperties.getProperty("userName.signIn");
        password = appProperties.getProperty("password.signIn");
        url = appProperties.getProperty("app.server.hostname.site");
    }

    protected void loadUrlToTest(String projectURL) {
        getDriver().get(projectURL);
    }
}
