package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {
    private WebDriver driver;

    public CartPage(WebDriver driver)
    {
        this.driver = driver;
    }
    //elements

    private By productName = By.xpath("//div[@class=\"inventory_item_name\"]");
    private By checkOutButton = By.xpath("//a[text()='CHECKOUT']");
    private By checkOutInfomation = By.xpath("//div[@class='subheader']");
    public By getProductName() {
        return productName;
    }
    public By getCheckoutHeader() {
        return checkOutInfomation;
    }
    public void checkOut(){
        driver.findElement(checkOutButton).click();
    }

    }



