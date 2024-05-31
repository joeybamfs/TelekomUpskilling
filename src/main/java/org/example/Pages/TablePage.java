package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import static org.example.WebPageUrls.WebPageUrls.TABLES;


public class TablePage {
    private final WebDriver driver;


    private TablePage(WebDriver driver){
        this.driver = driver;
    }

    public static TablePage TablePage(WebDriver driver){
        return new TablePage(driver);
    }

    public void gotToTablePage(){
        driver.get(TABLES);
    }

    public void verifyTableFieldHeader(){
        WebElement TableHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(TableHeader.getText(),"Tables");
    }

    public String getItemPrice(String item){
        String itemPrice = driver.findElement(By.xpath("//td[text()='" + item + "']/following-sibling::td")).getText();
        System.out.println("Price of " + item + ": " + itemPrice);
        return itemPrice;
    }

    public void verifyPrice(String item, String price){
        Assert.assertEquals(price, getItemPrice(item), "Is incorrect");
    }

}


