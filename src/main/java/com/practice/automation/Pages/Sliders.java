package com.practice.automation.Pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.text;
import static com.practice.automation.WebPageUrls.WebPageUrls.SLIDERS;

public class Sliders{

    String value;

    public Sliders() {
    }

    public static Sliders slidersPage() {
        return new Sliders();
    }

    public void goToSlidersPage() {
        open(SLIDERS);
    }

    public void verifySlidersHeader() {
        $("[itemprop='headline']").shouldHave(text("Slider"));
    }

    public SelenideElement sliderKnob() {
        return $("#slideMe");
    }

    public void clickAndDrag(SelenideElement element,int x) {
        Actions actions = actions();
        actions.dragAndDropBy(element, x, 0).perform();
    }

    public SelenideElement valueChosen(String value) {
        return $x("//span[text()='" + value + "']");
    }

    public void verifyValue(String value) {
        this.value = value;
        $("#value").shouldHave(text(value));
    }
}
