package org.example.Pages;

import org.example.Utilies.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.WebPageUrls.WebPageUrls.MODALS;
import static org.example.WebPageUrls.WebPageUrls.POPUPS;

public class ModalsPage {
    private final WebDriver driver;

    Scroll scrollIntoView = new Scroll();

    String name;


    private ModalsPage(WebDriver driver){
        this.driver = driver;
    }

    public static ModalsPage modalsPage(WebDriver driver){
        return new ModalsPage(driver);
    }

    public void gotToModalsPage(){
        driver.get(MODALS);
    }

    public void verifyModalsPageHeader(){
        WebElement modalsHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(modalsHeader.getText(),"Modals");
    }

    public WebElement simpleModalBtn(){
        return driver.findElement(By.id("simpleModal"));
    }

    public void clickSimpleModalBtn(){
        simpleModalBtn().click();
    }

    public void verifyFeaturesInSimpleModal(){
        WebElement simpleModal = driver.findElement(By.id("popmake-1318"));

        String simpleModalHeading = simpleModal.getText();
        String simpleModalBody = simpleModal.getText();

        Assert.assertTrue(simpleModalHeading.contains("Simple Modal"), "Does not exist");
        Assert.assertTrue(simpleModalBody.contains("Hi, I’m a simple modal."));
    }

    public WebElement closeModalBtn(){
        return driver.findElement(By.xpath("(//button[@aria-label='Close'][normalize-space()='×'])[2]"));
    }

    public void clickCloseModalBtn(){
        closeModalBtn().click();
    }

    public WebElement formModalBtn(){
        return driver.findElement(By.id("formModal"));
    }

    public void clickFormModalBtn(){
        formModalBtn().click();
    }

    public WebElement formModal(){
        return driver.findElement(By.xpath("(//div[@id='popmake-674'])[1]"));
    }

    public void verifyFeaturesInFormModal(){
        String formModalHeading = formModal().getText();

        Assert.assertTrue(formModalHeading.contains("Modal Containing A Form"), "Does not exist");
    }

    public void fillform (String name, String email, String message){
        WebElement nameField = driver.findElement(By.id("g1051-name"));
        WebElement emailField = driver.findElement(By.id("g1051-email"));
        WebElement messageField = driver.findElement(By.id("contact-form-comment-g1051-message"));

        nameField.sendKeys(name);
        emailField.sendKeys(email);
        messageField.sendKeys(message);
    }

    public void submitForm(){
        WebElement submitBtn = driver.findElement(By.xpath("//button[normalize-space()='Submit']"));

        submitBtn.click();
    }

}
