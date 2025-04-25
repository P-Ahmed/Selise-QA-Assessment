package test.runner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.BrowserFactory;

public class BaseTestRunner {
    @BeforeTest
    public void setupBrowser() {
        BrowserFactory.getDriver().get("https://www.amazon.com/");
    }

    @AfterTest
    public void tearDown() {
        BrowserFactory.quitDriver();
    }
}
