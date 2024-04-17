package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class LoginSteps {
    DialogContent dc = new DialogContent();

    @And("User should login successfully")
    public void userShouldLoginSuccessfully() {
        dc.verifyContainsText(dc.welcomeText, "Welcome");
    }

    @And("User should not login successfully")
    public void userShouldNotLoginSuccessfully() {
        if (dc.loginEmail.getText().equals(null)) {
            dc.verifyContainsText(dc.requiredContent, "This is a required field.");
        } else if (dc.loginEmail.getText().equals("alikemal1@gmail.com")) {
            dc.verifyContainsText(dc.invalidEmail, "Please wait and try again later.");
        } else if (dc.loginPass.getText().equals(null)) {
            dc.verifyContainsText(dc.requiredContent, "This is a required field.");
        } else if (dc.loginPass.getText().equals("Ali_1234566789")) {
            dc.verifyContainsText(dc.loginPass, "Please wait and try again later.");

        }
    }

    @When("User enter valid credentials")
    public void userEnterValidCredentials() {
        dc.myClick(dc.signIn);
        dc.mySendKeys(dc.loginEmail, "alikemal6161@gmail.com");
        dc.mySendKeys(dc.loginPass, "Ali_123456");
        dc.myClick(dc.signInButton);

    }
}
