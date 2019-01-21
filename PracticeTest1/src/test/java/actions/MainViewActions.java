package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.TestBase;

public class MainViewActions extends TestBase {

    public WebElement openUserProfile() {
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement((By.xpath("//li/a[text()='Profile']"))).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        WebElement editProfile = driver.findElement(By.xpath("//div/h1[text()='Edit profile']"));
        wait1.until(ExpectedConditions.visibilityOf(editProfile));
        return editProfile;
    }

    public WebElement checkUserCreation() {
        WebElement assignedContent = driver.findElement(By.xpath("//h2[contains(text(), 'Here is your assigned content.')]"));
        WebDriverWait wait2 = new WebDriverWait(driver, 2);
        wait2.until(ExpectedConditions.visibilityOf(assignedContent));
        return assignedContent;
    }

    public WebElement successfulLogin() {
        WebElement username = driver.findElement(By.xpath("//span[contains(text(), 'test.bdd.auto')]"));
        return username;
    }
}
