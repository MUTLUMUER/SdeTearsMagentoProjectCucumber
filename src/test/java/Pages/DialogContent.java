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


        }

        return null;
    }


}


