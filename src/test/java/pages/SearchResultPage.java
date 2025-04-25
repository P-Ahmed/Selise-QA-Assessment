package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.BrowserFactory;

import java.util.List;

public class SearchResultPage {
    @FindBy(className = "a-size-base-plus")
    List<WebElement> productsName;

    public SearchResultPage() {
        PageFactory.initElements(BrowserFactory.getDriver(), this);
    }

    public void searchValidation(String searchTerm) {
        for (WebElement element : productsName) {
            String getProductsName = element.getText().toLowerCase();
            if (getProductsName.contains(searchTerm.toLowerCase())) {
                break;
            }
        }
    }
}
