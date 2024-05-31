package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.WebPageUrls.WebPageUrls.SLIDERS;

public class SlidersPage {
    private final WebDriver driver;

    public SlidersPage(WebDriver driver) {
        this.driver = driver;
    }

    public static SlidersPage slidersPage(WebDriver driver){
        return new SlidersPage(driver);
    }
    public void gotToSlidersPage(){
        driver.get(SLIDERS);
    }

    public void verifySlidersHeader(){
        WebElement SlidersHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(SlidersHeader.getText(),"Slider");
    }


}
