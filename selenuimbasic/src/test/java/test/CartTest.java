package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CartTest extends BaseTest{
    @Test
    public void Cart (){
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);
    ProductPage productPage = new ProductPage(driver);
    CartPage cartPage=new CartPage(driver);



        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        productPage.addToCart();
        productPage.moveToCartPage();
       cartPage.checkOut();
        boolean isElementDisplayed = driver.findElement(cartPage.getCheckoutHeader ()).isDisplayed();
        Assert.assertTrue(isElementDisplayed);

    }
}
