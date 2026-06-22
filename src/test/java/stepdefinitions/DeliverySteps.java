package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeliveryPage;
import utils.DriverFactory;

public class DeliverySteps {

    DeliveryPage deliveryPage
            = new DeliveryPage(
                    DriverFactory.getDriver());

    @When("User updates delivery location")
    public void updateLocation() {

        deliveryPage.changeLocation();
    }

    @Then("Delivery location popup should be displayed")
    public void verifyPopup() {

        Assert.assertTrue(
                deliveryPage.locationPopupDisplayed());
    }
}
