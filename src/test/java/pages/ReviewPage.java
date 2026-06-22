package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReviewPage {

    WebDriver driver;

    public ReviewPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openReviews() {

        WebElement reviewSection
                = driver.findElement(
                        By.xpath("//*[contains(text(),'Customer reviews')]"));

        ((JavascriptExecutor) driver)
                .executeScript(
                        "arguments[0].scrollIntoView({block:'center'});",
                        reviewSection);

        try {
            Thread.sleep(3000);
        } catch (Exception e) {
        }

        System.out.println("Reached Customer Reviews Section");
    }

    public boolean reviewsDisplayed() {

        return driver.findElements(
                By.xpath("//*[contains(text(),'Customer reviews')]")).size() > 0 || driver.findElements(
                        By.xpath("//*[contains(text(),'customer reviews')]")).size() > 0;
    }
}
