package com.practice.automation.Utilities;

import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class Scroll {
        WebDriver driver;
        Actions actions;

        public Scroll(WebDriver driver) {
            this.driver = WebDriverRunner.getWebDriver();
            actions = new Actions(driver);
        }

        public void scrollAndClick(WebElement element1, WebElement element2) {
            WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element1);
            actions
                    .scrollFromOrigin(scrollOrigin, 0, 600)
                    .click(element2)
                    .perform();
        }

        public void scroll(WebElement element){
            WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element);
            actions
                    .scrollFromOrigin(scrollOrigin,0,600)
                    .perform();
        }

        public void scrollAndType(WebDriver driver, WebElement element1, WebElement element2){
            WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element1);
            actions
                    .scrollFromOrigin(scrollOrigin, 0, 600)
                    .sendKeys(element2)
                    .perform();
        }
}
