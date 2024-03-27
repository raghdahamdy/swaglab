package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class CheckOut extends BaseTest{
    String expectedResult = "THANK YOU FOR YOUR ORDER";
    @Test
    public void Cart (){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        CartPage cartPage=new CartPage(driver);
        CheckoutPage checkoutPage=new CheckoutPage(driver);


        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        productPage.addToCart();
        productPage.moveToCartPage();
       cartPage.checkOut();
        checkoutPage.checkoutInformation("hat","mat","123");
        checkoutPage.contiue();
        checkoutPage.finish();
        checkoutPage.getFinalHeader();
        boolean isElementDisplayed = driver.findElement(checkoutPage.getFinalHeader ()).isDisplayed();
        Assert.assertTrue(isElementDisplayed);

}}
