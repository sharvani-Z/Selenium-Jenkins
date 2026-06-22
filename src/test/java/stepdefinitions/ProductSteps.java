package stepdefinitions;

import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.ProductPage;
import utils.DriverFactory;

public class ProductSteps {

    ProductPage product
            = new ProductPage(
                    DriverFactory.getDriver());

    @And("User opens first product")
    public void openProduct() {

        product.openFirstProduct();
    }

    @Then("Product title should be visible")
    public void verifyTitle() {

        Assert.assertTrue(
                product.titleDisplayed());
    }
}
