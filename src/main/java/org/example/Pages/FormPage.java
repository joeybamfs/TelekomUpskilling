package org.example.Pages;

import org.example.Driver.DriverFactory;
import org.example.Utilies.Scroll;
import org.example.WebPageUrls.WebPageUrls;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.text.Normalizer;
import java.util.List;
import java.util.Random;

import static org.example.WebPageUrls.WebPageUrls.FORMS;

public class FormPage{
    private final WebDriver driver;

    Scroll scrollIntoView = new Scroll();

    private FormPage(WebDriver driver){
        this.driver = driver;
    }

    public static FormPage formPage(WebDriver driver){
        return new FormPage(driver);
    }

    public void gotToFormPage(){
        driver.get(FORMS);
    }

    public void verifyFormFieldHeader(){
        WebElement formHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(formHeader.getText(),"Form Fields");
    }

    public WebElement nameField(){
        return driver.findElement(By.id("name"));
    }

    public void verifyNameLabelIsDisplayed(){
        WebElement nameLabel = driver.findElement(By.cssSelector("[for=\"name\"]"));
        Assert.assertTrue(nameLabel.isDisplayed());
    }

    public void typeName(String name){
        nameField().sendKeys(name);
    }

    public WebElement drinkLabel(){
        return driver.findElement(By.xpath("//label[normalize-space()='What is your favorite drink?']"));
    }

    public void verifyDrinkLabel(){
        String expectedDrinkLabelText = "What is your favorite drink?";
        Assert.assertEquals(drinkLabel().getText(), expectedDrinkLabelText);
    }
    public List<WebElement> selectDrink(){
        List<WebElement> drinks = driver.findElements(By.cssSelector("[type=\"checkbox\"]"));
        Random randomOne = new Random();
        int randomIndexOne = randomOne.nextInt(drinks.size());
        WebElement randomCheckbox = drinks.get(randomIndexOne);
        randomCheckbox.click();
        return drinks;
    }

    public WebElement colorLabel(){
        return driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[8]"));
    }

    public void verifyColorLabel(){
        String expectedColorLabelText = "What is your favorite color?";
        Assert.assertEquals(colorLabel().getText(), expectedColorLabelText);
    }

    public List<WebElement> selectRandomColor(){
        List<WebElement> colors = driver.findElements(By.cssSelector("[type=\"radio\"]"));
        Random random = new Random();
        int randomIndex = random.nextInt(colors.size());
        WebElement randomRadioButton = colors.get(randomIndex);
        scrollIntoView.scrollAndClick(driver, colorLabel(), randomRadioButton);
        return colors;
    }

    public WebElement siblingsLabel(){
        return driver.findElement(By.xpath("//*[@id=\"feedbackForm\"]/label[14]"));
    }

    public void verifySiblingsLabel(){
        String expectedSiblingsLabelText = "Do you have any siblings?";
        Assert.assertEquals(siblingsLabel().getText(), expectedSiblingsLabelText);
    }

    public void selectSiblingChoice(){
        WebElement siblings = driver.findElement(By.id("siblings"));
        Select select = new Select(siblings);
        select.selectByValue("yes");
    }

    public WebElement emailLabel(){
        scrollIntoView.scroll(driver, siblingsLabel());
        return driver.findElement(By.cssSelector("[for=\"email\"]"));
    }

    public void verifyEmailLabelVisibility(){
        Assert.assertTrue(emailLabel().isDisplayed());
    }

    public WebElement emailField(){
        return driver.findElement(By.id("email"));
    }

    public void typeEmail(String email){
        emailField().sendKeys(email);
    }

    public WebElement messageField(){
        return driver.findElement(By.cssSelector("[name=\"message\"]"));
    }

    public void typeMessage(String message){
        messageField().sendKeys(message);
    }

    public WebElement submitBtn(){
        return driver.findElement(By.id("submit-btn"));
    }

    public void submitClick(){
        submitBtn().submit();
    }

    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public void verifyInputFieldsAreEmpty(){
        Assert.assertEquals(nameField().getAttribute("value"), "");
        Assert.assertEquals(emailField().getAttribute("value"), "");
        Assert.assertEquals(messageField().getAttribute("value"), "");
    }


}
