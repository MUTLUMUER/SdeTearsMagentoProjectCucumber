package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;
import org.openqa.selenium.support.ui.Select;

public class AddressAdditionSteps {
    DialogContent dc=new DialogContent();
    @And("select the dropdown credential details")
    public void selectTheDropdownCredentialDetails() {
        Select city=new Select(dc.selectState);
        city.selectByIndex(23);
        Select country=new Select(dc.selectCountry);
        country.selectByValue("US");
        dc.myClick(dc.inputBilling);
        dc.myClick(dc.inputShipping);
    }
}
