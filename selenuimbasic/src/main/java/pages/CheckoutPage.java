package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
   private WebDriver driver;

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By FisrtName = By.id("first-name");
    private By LastName = By.id("last-name");
    private By PostalCode = By.id("postal-code");
    private By ContiueButton = By.xpath("//input[@class='btn_primary cart_button']");
    private By FinishButton = By.xpath("//a[@class='btn_action cart_button']");
    private By FinalHeader = By.className("complete-header");

    public By getFinalHeader(){
        return FinalHeader;
    }


public void checkoutInformation(String Name, String lastName ,String Postal) {

    driver.findElement(FisrtName).sendKeys(Name);
    driver.findElement(LastName).sendKeys(lastName);
    driver.findElement(PostalCode).sendKeys(Postal);
   
}
    public void contiue (){
        driver.findElement(ContiueButton).click();
    }
    public void finish (){
        driver.findElement(FinishButton).click();
    }

    }