/*
package testSteps;

import actions.EditProfileActions;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import driverSetup.Hooks;
import driverSetup.TestBase;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.concurrent.TimeUnit;

public class PictureChange {
    TestBase page = new TestBase();

    @After
    public void teardown() {
        driver.findElement(By.id("file")).sendKeys("C:\\Users\\pega\\IdeaProjects\\PracticeTest\\src\\test\\java\\resources\\avatar.jpg");
        driver.navigate().refresh();
        String hsAvatar = driver.findElement(By.id("avatar")).getScreenshotAs(OutputType.BASE64);
        Assert.assertEquals(hsAvatar, firstAvatar);
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
    }


     {
        driver.get("https://practice.skillstestbooking.com/");




    }





}
*/
