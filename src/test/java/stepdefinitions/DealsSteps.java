package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DealsPage;
import utils.DriverFactory;

public class DealsSteps {

    DealsPage dealsPage
            = new DealsPage(
                    DriverFactory.getDriver());

    @When("User clicks Today's Deals")
    public void clickDeals() {

        dealsPage.openDeals();
    }

    @Then("Deals page should be displayed")
    public void verifyDeals() {

        Assert.assertTrue(
                dealsPage.dealsDisplayed());
    }
}
