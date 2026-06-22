package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pages.SearchPage;
import utils.DriverFactory;

public class SortSteps {

    @And("User sorts by Low To High")
    public void sortProducts() {

        SearchPage.sortLowToHigh();
    }

    @Then("Products should be sorted")
    public void verifySortResults() {

        WebDriverWait wait =
                new WebDriverWait(
                        DriverFactory.getDriver(),
                        Duration.ofSeconds(10));

        WebElement sortDropdown =
                wait.until(ExpectedConditions
                        .visibilityOfElementLocated(
                                By.id("s-result-sort-select")));

        Select select = new Select(sortDropdown);

        String selectedOption =
                select.getFirstSelectedOption().getText();

        if (!selectedOption.contains("Low to High")) {

            throw new AssertionError(
                    "Sorting not applied correctly");
        }

        System.out.println(
                "Sorting Applied Successfully");
    }
}
