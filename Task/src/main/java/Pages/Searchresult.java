package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Searchresult {
    WebDriver driver;

    By firstItem = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div");
    By addToCartButton = By.id("add-to-cart-button");

    public Searchresult (WebDriver driver) {
        this.driver = driver;
    }

    public void selectFirstItem() {

        driver.findElement(firstItem).click();
    }

    public void addItemToCart() {
        driver.findElement(addToCartButton).click();
    }

}
