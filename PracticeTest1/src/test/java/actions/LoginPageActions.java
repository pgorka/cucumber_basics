package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import setup.TestBase;
import steps.LoginPageSteps;

public class LoginPageActions extends TestBase {

    public void loadPage() {
        driver.get("https://practice.skillstestbooking.com/");
    }
    public void enterCredentials() {
        driver.findElement(By.id("display1")).sendKeys("test.bdd.auto");
        driver.findElement(By.id("display2")).sendKeys("Test123!");
    }

    public void clickLogin() {
        driver.findElement((By.xpath("//a[text()='Login']"))).click();
    }

    public void logout() {
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }

    public WebElement initialRegistration() {
        driver.findElement(By.xpath("//a[@href='https://practice.skillstestbooking.com/phoenix/s/login/selfreg.do?language=English&theme=sta&vsid=68&hostname=']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        WebElement captcha = driver.findElement(By.xpath("//p[text()='Enter the activation key jhULiqgX']"));
        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Enter the activation key jhULiqgX']"))));
        return captcha;
    }

    public void enterNewCredentials() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement((By.xpath("//a[text()='Login']")))));
        driver.findElement(By.id("display1")).sendKeys("test.bdd.auto");
        driver.findElement(By.id("display2")).sendKeys("Test321#");
//        driver.findElement((By.xpath("//a[text()='Login']"))).click();
    }
}
