package steps;

import actions.EditProfileActions;
import actions.MainViewActions;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class EditProfileSteps {
    EditProfileActions editProfile = new EditProfileActions();
    MainViewActions mainViewActions = new MainViewActions();


    @And("Opens his profile page")
    public void opens_his_profile_page() {
        Assert.assertTrue(mainViewActions.openUserProfile().isDisplayed());
    }

    @And("Enters a new password and clicks on Save changes button")
    public void enters_a_new_password_and_clicks_on_Save_changes_button() {
        editProfile.enterCredentialsAndSave();
    }
    @When("User uploads a new profile picture")
    public void user_uploads_a_new_profile_picture() {
        editProfile.uploadPicture();
    }

    @Then("A new picture appears in user profile")
    public boolean a_new_picture_appears_in_user_profile() {
        Assert.assertNotEquals(editProfile.checkPictureChange(), editProfile.firstAvatar);
        return true;
    }
}
