package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.concurrent.TimeUnit;

public class HomePage {

    WebDriver driver;

    By searchBox = By.id("twotabsearchtextbox");
    By searchButton = By.id("nav-search-submit-button");
    By todaysDealsLink = By.linkText("Today's Deals");
    By toaster = By.xpath("//*[@id=\"nav-main\"]/div[1]/div");
    By dismissButton = By.xpath("//*[@id=\"nav-main\"]/div[1]/div/div/div[3]/span[1]/span/input");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void searchFor(String item) {
        driver.findElement(searchBox).sendKeys(item);
        driver.findElement(searchButton).click();
    }

    public void goToTodaysDeals() {
        //driver.manage().timeouts().implicitlyWait(190, TimeUnit.SECONDS);
        driver.findElement(todaysDealsLink).click();
    }
    public void dismisstoast(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        if (!(toaster ==null)) {
            driver.findElement(dismissButton).click();
        }
    }
}
