package StepDefinitions;

import Pages.DialogContent;
import Pages.ParentPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class ProductAddAndRemoveSteps {
    DialogContent dc=new DialogContent();
    @Given("User selects random items")
    public void userSelectsRandomItems() {
            int randomProduct= ParentPage.randomGenerator(dc.productsAddToCart.size());

            dc.myClick(dc.productsAddToCart.get(randomProduct));
            if (dc.swatchOptionText.size()>0){
                dc.myClick(dc.swatchOptionText.get(0));}

            if (dc.swatchColor.size()>0){
                dc.myClick(dc.swatchColor.get(0));


                    dc.scrollToElement(dc.addToCartButton);

                }
            else
                dc.scrollToElement(dc.addToCartButton);
    }

    @Then("User should be able to verify after adding item to the cart")
    public void userShouldBeAbleToVerifyAfterAddingItemToTheCart() {
        dc.verifyContainsText(dc.dataBindText2,"You added");
        dc.scrollToElement(dc.shoppingCart);

    }

    @Then("Remove products from the Cart")
    public void removeProductsFromTheCart() {
      // for (int i = 0; i <= dc.deleteButton.size() + 1; i++) {

      //     dc.JSClick(dc.deleteButton.get(0));
      //     dc.JSClick(dc.deleteOK);
      //     dc.wait.until(ExpectedConditions.invisibilityOf(dc.deleteButton.get(0)));
      // }
        for (int i=dc.deleteButton.size();i>0;i--){
            dc.myClick(dc.deleteButton.get(i-1));
            dc.myClick(dc.deleteOK);

        }
    }

    @And("User should be able to Change the Quantity")
    public void userShouldBeAbleToChangeTheQuantity() {
        dc.mySendKeys(dc.inputQuantity,"2");
        dc.myClick(dc.ButtonUpdate);
    }
}
