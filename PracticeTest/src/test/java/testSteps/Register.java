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

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Register {
    WebDriver driver;

    @Before
    public void setup() {
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

    @Given("User opens Department of Education website")
    public void user_opens_Department_of_Education_website() {
        driver.get("https://practice.skillstestbooking.com/");
    }

    @And("Clicks on the Initial registration button")
    public void clicks_on_the_Initial_registration_button() {
        driver.findElement(By.xpath("//a[@href='https://practice.skillstestbooking.com/phoenix/s/login/selfreg.do?language=English&theme=sta&vsid=68&hostname=']")).click();
        WebDriverWait wait1 = new WebDriverWait(driver, 2);
        WebElement captcha = driver.findElement(By.xpath("//p[text()='Enter the activation key jhULiqgX']"));
        wait1.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Enter the activation key jhULiqgX']"))));
        Assert.assertEquals(true, captcha.isDisplayed());
    }

    @And("Provides the Activation key")
    public void provides_the_Activation_key() {
        driver.findElement(By.id("activationKey")).sendKeys("jhULiqgX");
    }

    @And("Provides a username")
    public String provides_a_username() {
        Random randomNumber = new Random();
        String username = "TestUser" + randomNumber.nextInt(100);
        driver.findElement(By.id("username")).sendKeys(username);
        return username;
    }

    @And("Provides and confirms password")
    public void provides_and_confirms_password() {
        driver.findElement(By.id("password")).sendKeys("Test123!");
        driver.findElement(By.id("confirmPassword")).sendKeys("Test123!");
    }

    @When("User clicks on Create account button")
    public void user_clicks_on_Create_account_button() {
        driver.findElement(By.xpath("//button[text()='Create account']")).click();
    }

    @Then("A new account with provided credentials is successfully created")
    public void a_new_account_with_provided_credentials_is_successfully_created() {
        WebElement assignedContent = driver.findElement(By.xpath("//h2[contains(text(), 'Here is your assigned content.')]"));
        WebDriverWait wait2 = new WebDriverWait(driver, 2);
        wait2.until(ExpectedConditions.visibilityOf(assignedContent));
        Assert.assertEquals(true, assignedContent.isDisplayed());
    }
}
**/