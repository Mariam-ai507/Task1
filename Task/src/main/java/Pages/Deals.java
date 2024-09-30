package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class Deals {
    WebDriver driver;

    By groceryFilter = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/div/span[14]/div/label/span/span");
    By discountFilter = By.xpath("/html/body/div[1]/div[1]/div[41]/div/div[1]/div/div[2]/div[2]/div[5]/div/span[2]/div/label/span/span");
    By selectItem = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div[1]/div/div/div[3]");
    By seeMore = By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[2]/div[1]/button/a");
    By addToCart = By.xpath("//*[@id=\"dealsx_atc_btn\"]");
    public Deals(WebDriver driver) {
        this.driver = driver;
    }
    public void selectFilters() {
       driver.findElement(seeMore).click();
        driver.findElement(groceryFilter).click();
        //driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
        WebElement element = driver.findElement(discountFilter);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        driver.findElement(discountFilter).click();
    }


    public void addItemToCart() {
        driver.findElement(selectItem).click();
        driver.manage().timeouts().implicitlyWait(130, TimeUnit.SECONDS);
        driver.findElement(addToCart).click();

    }

}
