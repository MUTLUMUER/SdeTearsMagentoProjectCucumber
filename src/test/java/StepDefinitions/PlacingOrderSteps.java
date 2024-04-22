package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PlacingOrderSteps {
    DialogContent dc=new DialogContent();
    @When("user selects an item")
    public void userSelectsAnItem() {
        dc.myClick(dc.sizeMedium);
        dc.myClick(dc.itemColor);

    }

    @And("User should be able to verify Success Messagge")
    public void userShouldBeAbleToVerifySuccessMessagge() {
        dc.verifyContainsText(dc.SuccessMessagge,"Thank you");
        dc.verifyContainsText(dc.shippingNumber,"000");
    }
}
