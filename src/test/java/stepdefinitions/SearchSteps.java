package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.*;

import pages.HomePage;
import pages.SearchPage;
import utils.DriverFactory;

public class SearchSteps {

    HomePage home =
            new HomePage(DriverFactory.getDriver());

    SearchPage search =
            new SearchPage(DriverFactory.getDriver());

    @Given("User opens Amazon")
    public void openAmazon() {

        home.openAmazon();
    }

    @When("User searches for {string}")
    public void searchProduct(String product) {

        home.searchProduct(product);
    }

    @Then("Search results should be displayed")
    public void verifyResults() {

        Assert.assertTrue(search.resultsDisplayed());
    }
}