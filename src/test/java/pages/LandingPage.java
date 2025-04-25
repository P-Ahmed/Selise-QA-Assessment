package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

import java.util.List;

public class LandingPage extends BasePage {
    @FindBy(className = "a-button-input")
    List<WebElement> changeDeliveryAddressToast;
    @FindBy(id = "searchDropdownBox")
    WebElement searchDropdown;
    @FindBy(id = "twotabsearchtextbox")
    WebElement searchField;
    @FindBy(id = "nav-search-submit-button")
    WebElement searchButton;

    public LandingPage() {
        PageFactory.initElements(BrowserFactory.getDriver(), this);
    }

    public void searchingInSoftwareCategory(String searchTerm) {
        waitAndClick(changeDeliveryAddressToast.getFirst());

        byVisibleText(searchDropdown, "Software");
        typingInSearchBox(searchField, searchTerm);
        waitAndClick(searchButton);
    }
}
