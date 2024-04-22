package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class DialogContent extends ParentPage {

    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(xpath = "(//a[text()='Create an Account'])[1]")
    public WebElement createAccount;
    @FindBy(xpath = "//input[@id='firstname']")
    public WebElement firstName;
    @FindBy(xpath = "//input[@id='lastname']")
    public WebElement lastname;
    @FindBy(xpath = "//input[@id='email_address']")
    public WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    public WebElement password;
    @FindBy(xpath = "//input[@id='password-confirmation']")
    public WebElement passConfirmation;
    @FindBy(xpath = "//button[@title='Create an Account']")
    public WebElement CreateAccountButton;

    @FindBy(xpath = "(//span[text()='Welcome, AliKemal Cakiral!'])[1]")
    public WebElement welcomeText;
    @FindBy(css = "body > div.page-wrapper > header > div.panel.wrapper > div > ul > li.authorization-link > a")
    public WebElement signIn;
    @FindBy(xpath = "//input[@id='email']")
    public WebElement loginEmail;
    @FindBy(xpath = "(//input[@id='pass'])[1]")
    public WebElement loginPass;
    @FindBy(xpath = "(//button[@id='send2'])[1]")
    public WebElement signInButton;
    @FindBy(xpath = "//div[text()='This is a required field.']")
    public WebElement requiredContent;
    @FindBy(xpath = "//div[text()='The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later.']")
    public WebElement invalidEmail;
    @FindBy(xpath = "(//button[@class='action switch'])[1]")
    public WebElement actionSwitchButton;
    @FindBy(xpath = "(//a[text()='My Account'])[1]")
    public WebElement MyAccount;
    @FindBy(xpath = "//span[text()='Manage Addresses']")
    public WebElement ManageAddresses;
    @FindBy(xpath = "//input[@id='telephone']")
    public WebElement inputPhone;
    @FindBy(xpath = "//input[@id='street_1']")
    public WebElement inputStreet;
    @FindBy(xpath = "//input[@id='city']")
    public WebElement inputCity;
    @FindBy(xpath = "//input[@id='zip']")
    public WebElement inputZip;
    @FindBy(xpath = "//select[@id='region_id']")
    public WebElement selectState;
    @FindBy(xpath = "//select[@id='country']")
    public WebElement selectCountry;
    @FindBy(xpath = "//button[@title='Save Address']")
    public WebElement saveAddressButton;
    @FindBy(xpath = "//button[@title='Add New Address']")
    public WebElement buttonAddNewAddress;
    @FindBy(xpath = "//input[@id='primary_billing']")
    public WebElement inputBilling;
    @FindBy(xpath = "//input[@id='primary_shipping']")
    public WebElement inputShipping;
    @FindBy(xpath = "//span[text()='Women']")
    public WebElement TabMenuWomen;
    @FindBy(xpath = "//a[@id='ui-id-9']")
    public WebElement TabMenuTops;
    @FindBy(xpath = "(//span[text()='Bottoms'])[1]")
    public WebElement TabMenuBottom;
    @FindBy(xpath = "//span[text()='Men']")
    public WebElement TabMenuMen;
    @FindBy(xpath = "//a[@id='ui-id-17']")
    public WebElement TabMenuMenTops;
    @FindBy(xpath = "(//span[text()='Bottoms'])[2]")
    public WebElement TabMenuBottomMen;
    @FindBy(xpath = "//a[@class='product-item-link']")
    public List<WebElement> productsAddToCart;
    @FindBy(xpath = "//span[text()='Add to Cart']")
    public WebElement addToCartButton;
    @FindBy(xpath = "//div[@class='swatch-option color']")
    public List<WebElement>swatchColor;
    @FindBy(xpath = "//div[@class='swatch-option text']") //div[@data-ui-id='message-success']
    public List<WebElement>swatchOptionText;
    @FindBy(xpath = "//a[text()='shopping cart']")
    public WebElement dataBindText;
    @FindBy(xpath = "//*[contains(text(),'You added')]")
    public WebElement dataBindText2;
    @FindBy(xpath = "//a[@class='action showcart']")
    public WebElement shoppingCart;
    @FindBy(xpath = "//a[@title='Remove item']")
    public List<WebElement> deleteButton;
    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement deleteOK;
    @FindBy(xpath = "(//input[@type='number'])[1]")
    public WebElement inputQuantity;
    @FindBy(xpath = "//button[@title='Update']")
    public WebElement ButtonUpdate;
    @FindBy(xpath = "(//div[@id='option-label-size-143-item-168'])[3]")
    public WebElement sizeMedium;
    @FindBy(xpath = "(//div[@id='option-label-color-93-item-52'])[1]")
    public WebElement itemColor;
    @FindBy(xpath = "(//button[@title='Add to Cart'])[3]")
    public WebElement itemAddToCart;
    @FindBy(id = "top-cart-btn-checkout")
    public WebElement CheckOutButton;
    @FindBy(xpath = "(//span[text()='Ship Here'])[1]")
    public WebElement shippingAddress;
    @FindBy (xpath = "(//input[@type='radio'])[2]")
    public WebElement totalPrice;
    @FindBy(xpath = "//span[text()='Next']")
    public WebElement nextButton;
    @FindBy(id = "billing-address-same-as-shipping-checkmo")
    public WebElement billingCheckBox;
    @FindBy(xpath = "//button[@title='Place Order']")
    public WebElement placeOrder;
    @FindBy(xpath = "//span[text()='Thank you for your purchase!']")
    public WebElement SuccessMessagge;
    @FindBy(xpath = "//strong[contains(text(),'000')]")
    public WebElement shippingNumber;
    @FindBy(xpath = "//span[text()='Continue Shopping']")
    public WebElement continueShopping;
    @FindBy(xpath = "//input[@id='search']")
    public WebElement searchBox;
    @FindBy(xpath = "//span[@class='base']")
    public WebElement confirmingId;
    @FindBy(xpath = "//div[contains(text(),'Your search returned no results.')]")
    public WebElement invalidTextMessage;
    @FindBy(xpath = "(//span[text()='Add to Wish List'])[1]")
    public WebElement addToWishList;
    @FindBy(xpath = "(//a[@title='Argus All-Weather Tank'])[2]")
    public WebElement chosenItem;
    @FindBy(xpath = "//*[contains(text(),'added to your Wish List.')]")
    public WebElement wishListText;
    @FindBy(xpath = "//a[text()='My Wish List']")
    public WebElement wishListButton;
    @FindBy(xpath = "(//a[@title='Argus All-Weather Tank'])[3]")
    public WebElement itemHoverOver;
    @FindBy(xpath = "//a[@title='Remove Item']")
    public WebElement removingFromWishList;
    @FindBy(xpath = "//span[text()='You have no items in your wish list.']")
    public WebElement wishListDeletingText;





  /*  public void deleteItem(String deleteName) {
        mySendKeys(searchInput, deleteName);
        myClick(searchButton);

        //search butonun tıklanabilir olana kadar bekle
        //wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//ms-delete-button//button"),1));
        wait.until(ExpectedConditions.elementToBeClickable(searchButton));

        myClick(deleteImageBtn);
        myClick(deleteDialogBtn);
    }*/

    public WebElement getWebElement(String strElement) {

        switch (strElement) {
            case "createAccount": return this.createAccount;
            case "firstName" : return this.firstName;
            case "lastname" : return this.lastname;
            case "email" : return this.email;
            case "password" : return this.password;
            case "passConfirmation" : return this.passConfirmation;
            case "CreateAccountButton" : return this.CreateAccountButton;
            case "signIn" : return this.signIn;
            case "loginEmail" : return this.loginEmail;
            case "loginPass" : return this.loginPass;
            case "signInButton" : return this.signInButton;
            case "actionSwitchButton" : return this.actionSwitchButton;
            case "MyAccount" : return this.MyAccount;
            case "ManageAddresses" : return this.ManageAddresses;
            case "inputPhone" : return this.inputPhone;
            case "inputStreet" : return this.inputStreet;
            case "inputCity" : return this.inputCity;
            case "inputZip" : return this.inputZip;
            case "saveAddressButton" : return this.saveAddressButton;
            case "buttonAddNewAddress" : return this.buttonAddNewAddress;
            case "TabMenuTops" : return this.TabMenuTops;
            case "addToCartButton" : return this.addToCartButton;
            case "shoppingCart" : return this.shoppingCart;
            case "itemAddToCart" : return this.itemAddToCart;
            case "CheckOutButton" : return this.CheckOutButton;
            case "shippingAddress" : return this.shippingAddress;
            case "totalPrice" : return this.totalPrice;
            case "nextButton" : return this.nextButton;
            case "billingCheckBox" : return this.billingCheckBox;
            case "placeOrder" : return this.placeOrder;
            case "continueShopping" : return this.continueShopping;
            case "addToWishList" : return this.addToWishList;
            case "chosenItem" : return this.chosenItem;
            case "wishListButton" : return this.wishListButton;
            case "removingFromWishList" : return this.removingFromWishList;



        }

        return null;
    }


}


