package steps;

import actions.MainViewActions;
import actions.UserCreationActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class UserCreationSteps {
    UserCreationActions actions = new UserCreationActions();
    MainViewActions mainViewActions = new MainViewActions();

    @And("Provides the Activation key")
    public void provides_the_Activation_key() {
        actions.activationKey();
    }

    @And("Provides a new username")
    public void provides_a_new_username() {
       actions.username();
    }

    @And("Provides and confirms password")
    public void provides_and_confirms_password() {
        actions.provideNewPassword();
    }

    @When("User clicks on Create account button")
    public void user_clicks_on_Create_account_button() {
        actions.createAccount();
    }
    @Then("A new account with provided credentials is successfully created")
    public void a_new_account_with_provided_credentials_is_successfully_created() {
        Assert.assertEquals(true, mainViewActions.checkUserCreation().isDisplayed());
    }
}
