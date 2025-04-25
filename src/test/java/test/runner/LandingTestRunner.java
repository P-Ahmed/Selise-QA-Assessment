package test.runner;

import org.testng.annotations.Test;
import pages.LandingPage;
import pages.SearchResultPage;

public class LandingTestRunner extends BaseTestRunner{
    LandingPage landingPage = new LandingPage();
    SearchResultPage searchResultPage = new SearchResultPage();

    @Test(priority = 1, testName = "Searching for games in Software Category")
    public void searchingForGamesInSoftware(){
        landingPage.searchingInSoftwareCategory("games");
    }
    @Test(priority = 2, testName = "Validating search results with the search term")
    public void validatingSearchResult(){
        searchResultPage.searchValidation("games");
    }
}
