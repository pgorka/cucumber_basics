package steps;

import actions.MainViewActions;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class MainViewSteps {
    MainViewActions actions = new MainViewActions();

    @Then("User successfully logs in")
    public boolean user_successfully_logs_in() {
        Assert.assertTrue(actions.successfulLogin().isDisplayed());
        return true;
    }
}
