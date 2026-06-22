package pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartPage {

    WebDriver driver;
    WebDriverWait wait;

    public CartPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver,
                Duration.ofSeconds(20));
    }

    public void addItem() {

        List<WebElement> buttons
                = driver.findElements(
                        By.id("add-to-cart-button"));

        System.out.println(
                "Add To Cart Buttons = "
                + buttons.size());

        for (WebElement button : buttons) {
            try {
                if (button.isDisplayed()
                        && button.isEnabled()) {

                    ((JavascriptExecutor) driver)
                            .executeScript(
                                    "arguments[0].scrollIntoView({block:'center'});",
                                    button);

                    Thread.sleep(2000);

                    ((JavascriptExecutor) driver)
                            .executeScript(
                                    "arguments[0].click();",
                                    button);

                    System.out.println(
                            "Clicked Add To Cart");

                    Thread.sleep(5000);

                    break;
                }

            } catch (Exception e) {

                System.out.println(
                        "Skipping Hidden Button");
            }
        }
    }
}
