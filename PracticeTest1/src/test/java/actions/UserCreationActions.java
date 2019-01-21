package actions;

import org.openqa.selenium.By;
import setup.TestBase;

import java.util.Random;

public class UserCreationActions extends TestBase {
    public void activationKey() {
        driver.findElement(By.id("activationKey")).sendKeys("jhULiqgX");
    }

    public void username() {
        Random randomNumber = new Random();
        String username = "TestUser" + randomNumber.nextInt(100);
        driver.findElement(By.id("username")).sendKeys(username);
    }

    public void provideNewPassword() {
        driver.findElement(By.id("password")).sendKeys("Test123!");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test123!");
    }

    public void createAccount() {
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
    }
}
