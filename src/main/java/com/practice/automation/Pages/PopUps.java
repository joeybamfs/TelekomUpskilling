package com.practice.automation.Pages;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.SelenideElement;
import static com.practice.automation.WebPageUrls.WebPageUrls.POPUPS;
import org.testng.Assert;

public class PopUps {

    String name;

    private PopUps() {
    }

    public static PopUps popUpsPage() {
        return new PopUps();
    }

    public void goToPopupsPage() {
        open(POPUPS);
    }

    public void verifyPopUpsPageHeader() {
        $("[itemprop='headline']").shouldHave(text("Popups"));
    }

    public SelenideElement alertBtn() {
        return $("#alert");
    }

    public void verifyAlertBtnText() {
        alertBtn().shouldHave(text("Alert Popup"));
    }

    public void clickAlertBtn() {
        alertBtn().click();
    }

    public void handleAlert() {
        switchTo().alert().accept();
    }

    public SelenideElement confirmBtn() {
        return $("#confirm");
    }

    public void verifyConfirmBtnText() {
        confirmBtn().shouldHave(text("Confirm Popup"));
    }

    public void clickConfirmBtn() {
        confirmBtn().click();
    }

    public void handleConfirm() {
        switchTo().alert().dismiss();
    }

    public void verifyConfirmMessage() {
        $("#confirmResult").shouldHave(text("Cancel it is!"));
    }

    public SelenideElement promptBtn() {
        return $("#prompt");
    }

    public void verifyPromptBtnText() {
        promptBtn().shouldHave(text("Prompt Popup"));
    }

    public void clickPromptBtn() {
        promptBtn().click();
    }

    public void handlePrompt(String name) {
        this.name = name;
        switchTo().alert().sendKeys(name);
        switchTo().alert().accept();
    }

    public void verifyPromptMessage() {
        $("#promptResult").shouldHave(text("Nice to meet you, " + name + "!"));
    }

    public SelenideElement toolTip() {
        return $x("//*[@id='post-1055']/div/div[5]");
    }

    public void clickToolTip() {
        toolTip().click();
    }

    public void verifyToolTipMessage() {
        $("#myTooltip").shouldBe(visible);
    }
}


