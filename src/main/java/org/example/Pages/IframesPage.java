package org.example.Pages;

import org.example.Utilies.Scroll;
import org.example.Utilies.SwitchFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.WebPageUrls.WebPageUrls.IFRAMES;

public class IframesPage {

        private final WebDriver driver;

        SwitchFrames Switch;

        Scroll scroll;


        public IframesPage(WebDriver driver){
            this.driver = driver;
            System.out.println(driver);
            Switch = new SwitchFrames(driver);
            scroll = new Scroll(driver);
        }


        public static IframesPage iframesPage(WebDriver driver){
            return new IframesPage(driver);
        }

        public void gotToIframesPage(){
            driver.get(IFRAMES);
        }

        public void verifyIframesHeader(){
            WebElement FileIframesHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
            Assert.assertEquals(FileIframesHeader.getText(),"Iframes");
        }

        public void switchToFirstIframe(){
            Switch.switchFrame("frame2");
        }

        public WebElement okBtn(){
            return driver.findElement(By.xpath("//button[text()='OK']"));
        }

        public void handleAds(){
            okBtn().click();
        }
        public WebElement getSearchButton(){
            return driver.findElement(By.xpath("//a[@aria-label='Search']"));
        }

        public void clickSearchButton(){
            getSearchButton().click();
        }

        public WebElement searchBar(){
            return driver.findElement(By.cssSelector("[type=\"search\"]"));
        }

        public void search(String text){
            searchBar().sendKeys(text);
        }

        public void submitSearch(){
            WebElement searchBtn = driver.findElement(By.xpath("//a[@aria-label='Search']"));
            searchBtn.click();
        }

        public void switchToDefaultFrame(){
            Switch.switchToDefault();
        }

        public void switchToSecondFrame(){
            WebElement natGeoIframe = driver.findElement(By.id("frame2"));
            scroll.scroll(natGeoIframe);
            Switch.switchFrame("frame1");
        }
}
