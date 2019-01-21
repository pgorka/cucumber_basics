package steps;

import actions.LoginPageActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class LoginPageSteps {
    LoginPageActions login = new LoginPageActions();
    Hooks setup = new Hooks();

    @Given("User opens Department of Education website")
    public void user_opens_Department_of_Education_website() {
        login.loadPage();
    }

    @And("Enters a valid username and password")
    public void enters_a_valid_username_and_password() {
        login.enterCredentials();
    }

    @And("Clicks on Login button")
    public void clicks_on_Login_button() {
        login.clickLogin();
    }

    @And("user logs out")
    public void user_logs_out() {
        login.logout();
    }

    @And("Clicks on the Initial registration button")
    public void clicks_on_the_Initial_registration_button() {
        Assert.assertTrue(login.initialRegistration().isDisplayed());
    }

    @When("User enters his username and new password")
    public void user_enters_his_username_and_new_password() {
        login.enterNewCredentials();
    }

    @And("User enters his (.*) and (.*)$")
    public void userEntersHisUsernameAndNewPassword(String user, String password) {
        setup.driver.findElement(By.id("display1")).sendKeys(user);
        setup.driver.findElement(By.id("display2")).sendKeys(password);

    }
}
