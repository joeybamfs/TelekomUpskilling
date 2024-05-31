package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.WebPageUrls.WebPageUrls.WINDOWSOPERATIONS;

public class WindowsOperationsPage {
    private final WebDriver driver;

    public WindowsOperationsPage(WebDriver driver) {
        this.driver = driver;
    }

    public static WindowsOperationsPage windowsOperationsPage(WebDriver driver){
        return new WindowsOperationsPage(driver);
    }
    public void gotToWindowsOperationsPage(){
        driver.get(WINDOWSOPERATIONS);
    }

    public void verifyWindowsOperationsHeader(){
        WebElement WindowsOperationsHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(WindowsOperationsHeader.getText(),"Window Operations");
    }


}
