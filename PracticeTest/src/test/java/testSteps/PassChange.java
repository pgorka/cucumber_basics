/**package testSteps;

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

import java.util.concurrent.TimeUnit;

public class PassChange {
    WebDriver driver;

    @Before public void setup() {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pega\\IdeaProjects\\PracticeTest\\src\\test\\java\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().setScriptTimeout(5000, TimeUnit.MILLISECONDS);
        driver.manage().timeouts().pageLoadTimeout(5000, TimeUnit.MILLISECONDS);
    }

    @After public void teardown() {
        driver.manage().deleteAllCookies();
        //driver.quit();
    }

    @Given("User opens Department of Education website")
    public void user_opens_Department_of_Education_website() {
        driver.get("https://practice.skillstestbooking.com");

    }

    @And("Enters a valid username and password")
    public void enters_a_valid_username_and_password() {
        driver.findElement(By.id("display1")).sendKeys("test.bdd.auto");
        driver.findElement(By.id("display2")).sendKeys("Test123!");
    }

    @And("Clicks on Login button")
    public void clicks_on_Login_button() {
        driver.findElement((By.xpath("//a[text()='Login']"))).click();
    }

    @And("Opens his profile page")
    public void opens_his_profile_page() {
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement((By.xpath("//li/a[text()='Profile']"))).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        WebElement editProfile = driver.findElement(By.xpath("//div/h1[text()='Edit profile']"));
        wait1.until(ExpectedConditions.visibilityOf(editProfile));
        Assert.assertTrue(editProfile.isDisplayed());
    }
    @And("Enters a new password and clicks on Save changes button")
    public void enters_a_new_password_and_clicks_on_Save_changes_button() {
        driver.findElement(By.id("newPassword")).sendKeys("Test321#");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test321#");
        driver.findElement(By.xpath("//a[contains(text(), 'Save changes')]")).click();
    }

    @And("user logs out")
    public void user_logs_out() {
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();

    }

    @When("User enters his username and new password and clicks Login button")
    public void user_enters_his_username_and_new_password() {
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement((By.xpath("//a[text()='Login']")))));
        driver.findElement(By.id("display1")).sendKeys("test.bdd.auto");
        driver.findElement(By.id("display2")).sendKeys("Test321#");
        driver.findElement((By.xpath("//a[text()='Login']"))).click();
    }

    @Then("User successfully logs in")
    public void user_successfully_logs_in() {
        Assert.assertTrue(driver.findElement(By.xpath("//span[contains(text(), 'test.bdd.auto')]")).isDisplayed());
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement((By.xpath("//li/a[text()='Profile']"))).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        WebElement editProfile = driver.findElement(By.xpath("//div/h1[text()='Edit profile']"));
        wait1.until(ExpectedConditions.visibilityOf(editProfile));
        driver.findElement(By.id("newPassword")).sendKeys("Test123!");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test123!");
        driver.findElement(By.xpath("//a[contains(text(), 'Save changes')]")).click();
        driver.findElement(By.xpath("//a[@href='#']")).click();
        driver.findElement(By.xpath("//a[text()='Logout']")).click();
    }
}
**/