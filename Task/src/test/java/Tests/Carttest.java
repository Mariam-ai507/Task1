package Tests;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.*;

public class Carttest {
    static WebDriver driver;
    static HomePage homePage;
    static Searchresult searchResultsPage;
    static Cart cartPage;

    @BeforeClass
    public static void setup() {
        driver = new EdgeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        searchResultsPage = new Searchresult(driver);
        cartPage = new Cart(driver);
    }

    @Test
    public void addItemToCart() {
        homePage.searchFor("car accessories");
        searchResultsPage.selectFirstItem();
        searchResultsPage.addItemToCart();
        driver.findElement(By.id("nav-cart")).click();
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
