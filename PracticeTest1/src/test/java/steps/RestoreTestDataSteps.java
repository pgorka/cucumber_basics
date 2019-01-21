package steps;

import actions.RestoreTestDataActions;
import cucumber.api.java.en.Given;

public class RestoreTestDataSteps {
    RestoreTestDataActions actions = new RestoreTestDataActions();

    @Given("Default profile picture is restored")
    public void defaultProfilePictureIsRestored() {
        actions.restoreProfilePicture();
    }

    @Given("Default password is restored")
    public void previousUserPasswordIsRestored() {
        actions.restorePassword();
    }
}
