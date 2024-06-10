package com.practice.automation.Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import static com.practice.automation.WebPageUrls.WebPageUrls.MODALS;
import org.testng.Assert;

public class Modals {

    String name;

    private Modals() {
    }

    public static Modals modalsPage() {
        return new Modals();
    }

    public void goToModalsPage() {
        open(MODALS);
    }

    public void verifyModalsPageHeader() {
        $("[itemprop='headline']").shouldHave(text("Modals"));
    }

    public SelenideElement simpleModalBtn() {
        return $("#simpleModal");
    }

    public void clickSimpleModalBtn() {
        simpleModalBtn().click();
    }

    public void verifyFeaturesInSimpleModal() {
        SelenideElement simpleModal = $("#popmake-1318");
        simpleModal.find("#pum_popup_title_1318").shouldHave(text("Simple Modal"));
    }

    public SelenideElement closeModalBtn() {
        return $x("(//button[@aria-label='Close'][normalize-space()='×'])[2]");
    }

    public void clickCloseModalBtn() {
        closeModalBtn().click();
    }

    public SelenideElement formModalBtn() {
        return $("#formModal");
    }

    public void clickFormModalBtn() {
        formModalBtn().click();
    }

    public SelenideElement formModal() {
        return $x("(//div[@id='popmake-674'])[1]");
    }

    public void verifyFeaturesInFormModal() {
        formModal().shouldHave(text("Modal Containing A Form"));
    }

    public void fillForm(String name, String email, String message) {
        $("#g1051-name").setValue(name);
        $("#g1051-email").setValue(email);
        $("#contact-form-comment-g1051-message").setValue(message);
    }

    public void submitForm() {
        $x("//button[normalize-space()='Submit']").click();
    }
}
