package stepFiles;

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
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Login {
    WebDriver driver;

   /**@Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pega\\IdeaProjects\\CucumberFramework1\\src\\test\\java\\resources\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
   }**/
    @Before
    public void firefoxSetup() {
       System.setProperty("webdriver.gecko.driver", "C:\\Users\\pega\\IdeaProjects\\CucumberFramework1\\src\\test\\java\\resources\\geckodriver.exe");
       FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setCapability("marionette", true);
        this.driver = new FirefoxDriver(firefoxOptions);
       this.driver.manage().window().maximize();
       this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
       this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
    }

    @After
    public void teardown() {
        this.driver.manage().deleteAllCookies();
        this.driver.quit();
        this.driver = null;
    }

    @Given("^User navigates to stackoverflow website$")
    public void user_navigates_to_stackoverflow_website() throws Throwable {
        driver.get("https://stackoverflow.com");
     }

    @And("^User clicks on the login button on homepage$")
    public void user_clicks_on_the_login_button_on_homepage() throws Throwable {
        driver.findElement(By.xpath("//a[text()='Log In']")).click();
    }

    @And("^User enters a valid username$")
    public void user_enters_a_valid_username() throws Throwable {
        driver.findElement(By.id("email")).sendKeys("pawel.automation.test@gmail.com");
    }

    @And("^User enters a valid password$")
    public void user_enters_a_valid_password() throws Throwable {
        driver.findElement(By.id("password")).sendKeys("Test123!");
    }

    @When("^User clicks on the login buttons$")
    public void user_clicks_on_the_login_buttons() throws Throwable {
        driver.findElement(By.id("submit-button")).click();
    }

    @Then("^User should be taken to the successful login page$")
    public void user_should_be_taken_to_the_successful_login_page() throws Throwable {
//        driver.findElement(By.xpath(".//a[@href='/questions/ask']")).isDisplayed();
        WebDriverWait wait1 = new WebDriverWait(driver, 500);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//a[@href='/questions/ask']")));
        WebElement askQuestionButton = driver.findElement(By.xpath(".//a[@href='/questions/ask']"));
        Assert.assertEquals(true, askQuestionButton.isDisplayed());
    }
}
