package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Cart {
    WebDriver driver;

    By cartItem = By.cssSelector(".sc-product-title");

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

}
