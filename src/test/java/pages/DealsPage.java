package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DealsPage {

    WebDriver driver;

    public DealsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openDeals() {

        driver.findElement(
                By.linkText("Today's Deals"))
                .click();
    }

    public boolean dealsDisplayed() {

        return driver.getTitle()
                .contains("Deals");
    }
}
