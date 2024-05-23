package org.example.Utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput;

public class Scroll {
    public void scrollAndClick(WebDriver driver, WebElement element1, WebElement element2) {
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element1);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 600)
                .click(element2)
                .perform();
    }

    public void scroll(WebDriver driver, WebElement element){
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin,0,600)
                .perform();
    }

    public void scrollAndType(WebDriver driver, WebElement element1, WebElement element2){
        WheelInput.ScrollOrigin scrollOrigin = WheelInput.ScrollOrigin.fromElement(element1);
        new Actions(driver)
                .scrollFromOrigin(scrollOrigin, 0, 600)
                .sendKeys(element2)
                .perform();
    }
}
