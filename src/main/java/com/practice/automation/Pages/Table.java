package com.practice.automation.Pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.TABLES;

public class Table {

    // Constructor is not necessary as Selenide handles the WebDriver internally
    public Table() {
    }

    public static Table tablePage() {
        return new Table();
    }

    public void goToTablePage() {
        open(TABLES);
    }

    public void verifyTableFieldHeader() {
        $("[itemprop='headline']").shouldHave(text("Tables"));
    }

    public String getItemPrice(String item) {
        SelenideElement itemPriceElement = $x("//td[text()='" + item + "']/following-sibling::td");
        String itemPrice = itemPriceElement.getText();
        System.out.println("Price of " + item + ": " + itemPrice);
        return itemPrice;
    }

    public void verifyPrice(String item, String price) {
        Assert.assertEquals(getItemPrice(item), price, "Price is incorrect");
    }
}
