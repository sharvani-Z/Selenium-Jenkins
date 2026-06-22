package pages;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {

    WebDriver driver;
    WebDriverWait wait;

    public ProductPage(WebDriver driver) {

        this.driver = driver;
        this.wait = new WebDriverWait(driver,
                Duration.ofSeconds(20));
    }

    public void openFirstProduct() {

        wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//div[@data-component-type='s-search-result']")));

        List<WebElement> products =
                driver.findElements(
                        By.xpath("//div[@data-component-type='s-search-result']"));

        System.out.println(
                "Products Found = " + products.size());

        if(products.size() == 0) {

            throw new RuntimeException(
                    "No Products Found");
        }

        WebElement firstProduct =
                products.get(0)
                        .findElement(By.tagName("h2"));

        String productName =
                firstProduct.getText();

        System.out.println(
                "Opening Product = "
                        + productName);

        firstProduct.click();

        String parentWindow =
                driver.getWindowHandle();

        for(String window :
                driver.getWindowHandles()) {

            if(!window.equals(parentWindow)) {

                driver.switchTo().window(window);
                break;
            }
        }
    }

    public boolean titleDisplayed() {

        System.out.println(
                "Product Title = "
                + driver.getTitle());

        return driver.getTitle() != null
                && !driver.getTitle().trim().isEmpty();
    }
}
