package test;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;

public class ProductTest extends BaseTest{
    String expectedPrice = "$15.99";


    @Test
    public void validateProductPrice(){
     LoginPage loginPage= new LoginPage(driver);
       HomePage homePage = new HomePage(driver);
        ProductPage productPage=new ProductPage(driver);

        loginPage.login("standard_user","secret_sauce");
        homePage.openProduct();
        String actualValue = driver.findElement(productPage.getProductPrice()).getText();
        Assert.assertEquals(actualValue, expectedPrice);
    }

    @Test
    public void addProductToCart(){
        LoginPage loginPage;
        HomePage homePage ;
        ProductPage productPage;
        CartPage cartpage ;
        loginPage= new LoginPage(driver);
        loginPage.login("standard_user","secret_sauce");
        homePage = new HomePage(driver);

        homePage.openProduct();
        productPage=new ProductPage(driver);
        productPage.addToCart();
        productPage.moveToCartPage();
        cartpage = new CartPage(driver);
        boolean isElementDisplayed = driver.findElement(cartpage.getProductName()).isDisplayed();
      Assert.assertTrue(isElementDisplayed);

    }

}
