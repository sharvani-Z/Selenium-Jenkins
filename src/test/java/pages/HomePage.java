package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigReader;

public class HomePage {

    WebDriver driver;
    WebDriverWait wait;

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public void openAmazon() {

        driver.get(
                ConfigReader.getProperty("url"));

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(searchBox)
        );
    }

    public void searchProduct(String product) {
        WebElement box
                = wait.until(ExpectedConditions.visibilityOfElementLocated(searchBox));

        box.clear();
        box.sendKeys(product);

        driver.findElement(searchButton).click();
    }
}
