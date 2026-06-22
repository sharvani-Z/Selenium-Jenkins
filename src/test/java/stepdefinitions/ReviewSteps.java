package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ReviewPage;
import utils.DriverFactory;

public class ReviewSteps {

    ReviewPage reviewPage
            = new ReviewPage(
                    DriverFactory.getDriver());

    @And("User opens customer reviews")
    public void openReviews() {

        reviewPage.openReviews();
    }

    @Then("Customer reviews should be displayed")
    public void verifyReviews() {

        Assert.assertTrue(
                reviewPage.reviewsDisplayed());
    }
}
