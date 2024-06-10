package com.practice.automation.Pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.IFRAMES;

public class Iframes {

    public Iframes() {
        // No need for WebDriver in Selenide
    }

    public static Iframes iframesPage() {
        return new Iframes();
    }

    public void goToIframesPage() {
        open(IFRAMES);
    }

    public void verifyIframesHeader() {
        $("[itemprop='headline']").shouldHave(text("Iframes"));
    }

    public void switchToFirstIframe() {
        switchTo().frame("frame2");
    }

    public SelenideElement okBtn() {
        return $x("//button[text()='OK']");
    }

    public void handleAds() {
        okBtn().click();
    }

    public SelenideElement getSearchButton() {
        return $x("//a[@aria-label='Search']");
    }

    public void clickSearchButton() {
        getSearchButton().click();
    }

    public SelenideElement searchBar() {
        return $("[type='search']");
    }

    public void search(String text) {
        searchBar().setValue(text);
    }

    public void submitSearch() {
        getSearchButton().click();
    }

    public void switchToDefaultFrame() {
        switchTo().defaultContent();
    }

    public void switchToSecondFrame() {
        SelenideElement natGeoIframe = $("#frame2");
        natGeoIframe.scrollIntoView(true);
        switchTo().frame("frame1");
    }
}
