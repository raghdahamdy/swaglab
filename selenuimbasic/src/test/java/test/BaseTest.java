package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    WebDriver driver;
    @BeforeSuite
    public void setUp(){
        driver = new ChromeDriver();
        driver.navigate().to("https://www.saucedemo.com/v1/");
    }
   // @AfterMethod
    //public void teardown(){
       // driver.quit();
    }

