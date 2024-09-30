package Tests;

import Pages.*;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DealsTest {
   static WebDriver driver;
    static HomePage homePage;
    static Deals dealsPage;


    @BeforeClass
    public static void setup() {
        driver = new EdgeDriver();
        driver.manage().window().setSize(new Dimension(1024, 768));
        driver.get("https://www.amazon.com/");
        homePage = new HomePage(driver);
        dealsPage = new Deals(driver);
    }

    @Test
    public void addDealsItemToCart() {
        homePage.dismisstoast();
        homePage.goToTodaysDeals();
        dealsPage.selectFilters();
        dealsPage.addItemToCart();
    }

    @AfterClass
    public static void teardown() {
        driver.quit();
    }
}
