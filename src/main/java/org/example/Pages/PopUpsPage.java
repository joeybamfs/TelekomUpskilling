package org.example.Pages;

import org.example.Utilies.Scroll;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.WebPageUrls.WebPageUrls.FORMS;
import static org.example.WebPageUrls.WebPageUrls.POPUPS;

public class PopUpsPage {
    private final WebDriver driver;

    Scroll scrollIntoView = new Scroll();

    String name;


    private PopUpsPage(WebDriver driver){
        this.driver = driver;
    }

    public static PopUpsPage popUpsPage(WebDriver driver){
        return new PopUpsPage(driver);
    }

    public void gotToPopupsPage(){
        driver.get(POPUPS);
    }

    public void verifyPopUpsPageHeader(){
        WebElement popUpsHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(popUpsHeader.getText(),"Popups");
    }

    public WebElement alertBtn(){
        return driver.findElement(By.id("alert"));
    }

    public void verifyAlertBtnText(){
        Assert.assertEquals(alertBtn().getText(), "Alert Popup");
    }

    public void clickAlertBtn(){
        alertBtn().click();
    }

    public void handleAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public WebElement confirmBtn(){
        return driver.findElement(By.id("confirm"));
    }

    public void verifyConfirmBtnText(){
        Assert.assertEquals(confirmBtn().getText(), "Confirm Popup");
    }

    public void clickConfirmBtn(){
        confirmBtn().click();
    }

    public void handleConfirm(){
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    public void verifyConfirmMessage(){
        WebElement confirmMessage = driver.findElement(By.id("confirmResult"));
        Assert.assertEquals(confirmMessage.getText(), "Cancel it is!", "Actual message did not match the expected message.");
    }

    public WebElement promptBtn(){
        return driver.findElement(By.id("prompt"));
    }

    public void verifyPromptBtnText(){
        Assert.assertEquals(promptBtn().getText(), "Prompt Popup");
    }

    public void clickPromptBtn(){
        promptBtn().click();
    }

    public void handlePrompt(String name){
        this.name = name;
        Alert alert = driver.switchTo().alert();
        alert.sendKeys(name);
        alert.accept();
    }

    public void verifyPromptMessage(){
        WebElement promptMessage = driver.findElement(By.id("promptResult"));
        Assert.assertEquals(promptMessage.getText(), "Nice to meet you, " + name + "!");
    }

    public WebElement toolTip(){
        return driver.findElement(By.xpath("//*[@id=\"post-1055\"]/div/div[5]"));
    }

    public void clickToolTip(){
        toolTip().click();
    }

    public void verifyToolTipMessage(){
        WebElement toolTipPopup = driver.findElement(By.id("myTooltip"));
        Assert.assertTrue(toolTipPopup.isDisplayed());
    }





}
