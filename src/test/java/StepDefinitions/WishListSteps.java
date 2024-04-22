package StepDefinitions;

import Pages.DialogContent;
import io.cucumber.java.en.And;

import javax.tools.Diagnostic;

public class WishListSteps {
    DialogContent dc=new DialogContent();
    @And("User should be able to verify after adding item to the wishlist")
    public void userShouldBeAbleToVerifyAfterAddingItemToTheWishlist() {
        dc.verifyContainsText(dc.wishListText,"added to your Wish List.");
    }

    @And("User should be able to hoverover on the item")
    public void userShouldBeAbleToHoveroverOnTheItem() {
        dc.scrollToElement(dc.itemHoverOver);
        dc.hoverOver(dc.itemHoverOver);
    }

    @And("User should be able to verify after deleting the item from wishList")
    public void userShouldBeAbleToVerifyAfterDeletingTheItemFromWishList() {
        dc.verifyContainsText(dc.wishListDeletingText,"You have no items in your wish list.");
    }
}
