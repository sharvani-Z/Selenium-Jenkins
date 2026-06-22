package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeliveryPage {

    WebDriver driver;
    WebDriverWait wait;

    public DeliveryPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver,
                Duration.ofSeconds(20));
    }

    public void changeLocation() {

        wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("glow-ingress-block")))
                .click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("GLUXZipUpdateInput")))
                .sendKeys("500007");
    }

    public boolean locationPopupDisplayed() {

        return wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.id("GLUXZipUpdateInput")))
                .isDisplayed();
    }
}
