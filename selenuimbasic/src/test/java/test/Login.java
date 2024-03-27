package test;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class Login extends BaseTest {
    @Test
    public void validLogin(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        loginPage.login ("standard_user","secret_sauce");
        boolean isHeaderDisplayed = driver.findElement(homePage.getHeaderArea()).isDisplayed();
        Assert.assertTrue(isHeaderDisplayed);
    }

    @Test
    public void invalidLogin(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("wdawdwadaw","secret_sauce");
        boolean isErrorDisplayed = driver.findElement(loginPage.getErrorButton()).isDisplayed();
        Assert.assertTrue(isErrorDisplayed);

    }

}
