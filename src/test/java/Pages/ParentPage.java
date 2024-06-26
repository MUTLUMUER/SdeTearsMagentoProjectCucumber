package Pages;

import Utilities.GWD;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ParentPage {

    public WebDriverWait wait = new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(5));

    public void myClick(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        scrollToElement(element);
        element.click();
    }

    public void mySendKeys(WebElement element, String text) {
        wait.until(ExpectedConditions.visibilityOf(element));
        scrollToElement(element);
        element.clear();
        element.sendKeys(text);
    }

    //elemente kadar scroll yap
    public void scrollToElement(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        js.executeScript("arguments[0].scrollIntoView();", element);
    }
    public void JSClick(WebElement element){
        JavascriptExecutor js=(JavascriptExecutor) GWD.getDriver();
        wait.until(ExpectedConditions.visibilityOf(element));
        js.executeScript("arguments[0].click();", element);
    }

    public void verifyContainsText(WebElement element, String value){
        wait.until(ExpectedConditions.textToBePresentInElement(element,value));
        Assert.assertTrue(element.getText().toLowerCase().contains(value.toLowerCase()));

        new Actions(GWD.getDriver()).sendKeys(Keys.ESCAPE).build().perform();
        //sayfaya ESC tuşu gönderildi
    }
    public void hoverOver(WebElement element){
        Actions aksiyonDriver=new Actions(GWD.getDriver());
        wait.until(ExpectedConditions.visibilityOf(element));
        Action aksiyon=aksiyonDriver.moveToElement(element).build();
        aksiyon.perform();
    }
    public static int randomGenerator(int max){
        return (int)(Math.random()*max);
    }

}
