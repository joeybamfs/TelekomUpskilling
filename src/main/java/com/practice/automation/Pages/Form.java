package com.practice.automation.Pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.FORMS;

public class Form {


    public Form() {
    }

    public static Form formPage() {
        return new Form();
    }

    public void goToFormPage() {
        open(FORMS);
    }

    public void verifyFormFieldHeader() {
        $("[itemprop='headline']").shouldHave(text("Form Fields"));
    }

    public SelenideElement nameField() {
        return $("#name");
    }

    public void verifyNameLabelIsDisplayed() {
        $("[for='name']").shouldBe(visible);
    }

    public void typeName(String name) {
        nameField().setValue(name);
    }

    public SelenideElement drinkLabel() {
        return $x("//label[normalize-space()='What is your favorite drink?']");
    }

    public void verifyDrinkLabel() {
        drinkLabel().shouldHave(text("What is your favorite drink?"));
    }

    public ElementsCollection selectDrink() {
        ElementsCollection drinks = $$("[type='checkbox']");
        Random random = new Random();
        int randomIndex = random.nextInt(drinks.size());
        drinks.get(randomIndex).click();
        return drinks;
    }

    public SelenideElement colorLabel() {
        return $x("//*[@id='feedbackForm']/label[8]");
    }

    public void verifyColorLabel() {
        colorLabel().shouldHave(text("What is your favorite color?"));
    }

    public ElementsCollection selectRandomColor() {
        ElementsCollection colors = $$("[type='radio']");
        Random random = new Random();
        int randomIndex = random.nextInt(colors.size());
        SelenideElement randomRadioButton = colors.get(randomIndex);
        randomRadioButton.scrollTo().click();
        return colors;
    }

    public SelenideElement siblingsLabel() {
        return $x("//*[@id='feedbackForm']/label[14]");
    }

    public void verifySiblingsLabel() {
        siblingsLabel().shouldHave(text("Do you have any siblings?"));
    }

    public void selectSiblingChoice() {
        Select select = new Select($("#siblings"));
        select.selectByValue("yes");
    }

    public SelenideElement emailLabel() {
        return $("[for='email']").scrollTo();
    }

    public void verifyEmailLabelVisibility() {
        emailLabel().shouldBe(visible);
    }

    public SelenideElement emailField() {
        return $("#email");
    }

    public void typeEmail(String email) {
        emailField().setValue(email);
    }

    public SelenideElement messageField() {
        return $("[name='message']");
    }

    public void typeMessage(String message) {
        messageField().setValue(message);
    }

    public SelenideElement submitBtn() {
        return $("#submit-btn");
    }

    public void submitClick() {
        submitBtn().click();
    }

    public void acceptAlert() {
        switchTo().alert().accept();
    }

    public void verifyInputFieldsAreEmpty() {
        nameField().shouldHave(value(""));
        emailField().shouldHave(value(""));
        messageField().shouldHave(value(""));
    }
}
