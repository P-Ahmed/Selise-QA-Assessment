package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BrowserFactory;

import java.time.Duration;

public class BasePage {
    public WebDriverWait wait = new WebDriverWait(BrowserFactory.getDriver(), Duration.ofSeconds(10));

    public void waitAndClick(WebElement element) {
        wait.until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void clickAndType(WebElement element, String text) {
        waitAndClick(element);
        element.sendKeys(text);
    }

    public void byVisibleText(WebElement element, String value) {
        Select selectDropdown = new Select(element);
        selectDropdown.selectByVisibleText(value);
    }

    public void typingInSearchBox(WebElement element, String searchTerm) {
        clickAndType(element, searchTerm);
    }
}
