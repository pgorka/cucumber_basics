/*
package testSteps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Register {
    WebDriver driver;

    @Before
    public void driverSetup() {
        System.setProperty("webdriver.chrome.driver", "src\\test\\java\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
        this.driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
    }

    @After
    public void teardown() {
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
    }













    @And("Provides a username {string}")
    public void providesAUsername(String name) {
        System.out.println(name);
    }
}*/
