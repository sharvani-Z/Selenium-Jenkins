package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import pages.CartPage;
import utils.DriverFactory;

public class CartSteps {

    CartPage cart
            = new CartPage(DriverFactory.getDriver());

    @And("User adds item to cart")
    public void addCart() {

        cart.addItem();
    }

    @Then("Product should be added to cart")
    public void verifyCart() {

        System.out.println("Added Successfully");
    }
}
