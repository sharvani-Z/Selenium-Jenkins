package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SearchPage {

    static WebDriver driver;
    WebDriverWait wait;

    public SearchPage(WebDriver driver) {

        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    public boolean resultsDisplayed() {

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//div[@data-component-type='s-search-result']")));

        return true;
    }

    public static void sortLowToHigh() {

        WebDriverWait wait
                = new WebDriverWait(driver, Duration.ofSeconds(20));

        WebElement sortDropdown
                = wait.until(ExpectedConditions.elementToBeClickable(
                        By.id("s-result-sort-select")));

        Select select = new Select(sortDropdown);

        select.selectByVisibleText("Price: Low to High");
    }
}
