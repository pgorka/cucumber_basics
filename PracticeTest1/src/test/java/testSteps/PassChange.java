/**package testSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class PassChange {





        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement((By.xpath("//li/a[text()='Profile']"))).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        WebElement editProfile = driver.findElement(By.xpath("//div/h1[text()='Edit profile']"));
        wait1.until(ExpectedConditions.visibilityOf(editProfile));

    }
}
**/