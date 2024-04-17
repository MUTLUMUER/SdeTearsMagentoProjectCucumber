package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegisterSteps {
    DialogContent dc=new DialogContent();
    @Given("Navigate to Magento Commerce")
    public void navigateToMagentoCommerce() {
        GWD.getDriver().get("https://magento.softwaretestingboard.com/");
       List<WebElement> cookies=GWD.getDriver().findElements(By.xpath("//p[text()='Consent']"));
        if (cookies.size()>0)
            cookies.get(0).click();

    }

    @When("Enter user credentials details")
    public void enterUserCredentialsDetails(DataTable dataTable) {
        List<List<String>>linkText=dataTable.asLists(String.class);
        for (int i = 0; i < linkText.size(); i++) {
            WebElement txtBoxWebElement= dc.getWebElement(linkText.get(i).get(0));
            dc.mySendKeys(txtBoxWebElement,linkText.get(i).get(1));

        }
    }

    @Then("User should register successfully")
    public void userShouldRegisterSuccessfully() {
        dc.verifyContainsText(dc.welcomeText, "Welcome");
    }

    @And("Click on the element in dialouge")
    public void clickOnTheElementInDialouge(DataTable dataTable) {
        List<String> linkList=dataTable.asList(String.class);
        for (int i = 0; i < linkList.size(); i++) {
            WebElement linkWebElement= dc.getWebElement(linkList.get(i));
            dc.myClick(linkWebElement);

        }

    }
}
