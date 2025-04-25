package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class BrowserFactory {
    private static final ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();

    // Private constructor to prevent instantiation
    private BrowserFactory() {
    }

    public static WebDriver getDriver() {
        if (threadLocalDriver.get() == null) {
            initializeDriver();
        }
        return threadLocalDriver.get();
    }

    private static void initializeDriver() {
        threadLocalDriver.set(new ChromeDriver());
        threadLocalDriver.get().manage().window().maximize();
        threadLocalDriver.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static void quitDriver() {
        if (threadLocalDriver.get() != null) {
            threadLocalDriver.get().quit();
            threadLocalDriver.remove();
        }
    }
}
