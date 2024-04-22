package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class SearchSteps {
    DialogContent dc=new DialogContent();
    @When("User enters product valid id number in the search box")
    public void userEntersProductValidIdNumberInTheSearchBox() {
        dc.mySendKeys(dc.searchBox,"MT07");
        new Actions(GWD.getDriver()).sendKeys(Keys.ENTER).build().perform();
    }

    @And("User should be able to verify product id number")
    public void userShouldBeAbleToVerifyProductIdNumber() {
        dc.verifyContainsText(dc.confirmingId,"MT07");
    }

    @When("User enters invalid product id number in the search box")
    public void userEntersInvalidProductIdNumberInTheSearchBox() {
        dc.mySendKeys(dc.searchBox,"MT071");
        new Actions(GWD.getDriver()).sendKeys(Keys.ENTER).build().perform();
    }

    @And("A warning messagge must occur on the screen")
    public void aWarningMessaggeMustOccurOnTheScreen() {
        dc.verifyContainsText(dc.invalidTextMessage,"Your search returned no results.");

    }
}
