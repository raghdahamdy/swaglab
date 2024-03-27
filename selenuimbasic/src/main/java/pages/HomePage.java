package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver)
    {
        this.driver=driver;
    }
    String productName ="Sauce Labs Bolt T-Shirt";
    //element
    private By headerArea = By.className("app_logo");
    private By productLink =By.xpath("//div[text()=\""+productName+"\"]");
    // getter
    public By getHeaderArea (){
        return headerArea;
    }
    public void openProduct (){
        driver.findElement(productLink).click();

    }
}
