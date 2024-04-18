package Pages;


import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

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


        }

        return null;
    }


}


