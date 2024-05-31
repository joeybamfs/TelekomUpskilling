package org.example.Pages;

import org.example.Utilies.Scroll;
import org.example.Utilies.SwitchFrames;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.time.Duration;
import java.util.List;

import static org.example.WebPageUrls.WebPageUrls.FILEDOWNLOAD;
import static org.example.WebPageUrls.WebPageUrls.TABLES;

public class FileDownloadPage {
    private final WebDriver driver;

    SwitchFrames Switch;


    private FileDownloadPage(WebDriver driver){
        this.driver = driver;
        Switch = new SwitchFrames(driver);
    }

    public static FileDownloadPage fileDownloadPage(WebDriver driver){
        return new FileDownloadPage(driver);
    }

    public void gotToFileDownloadPage(){
        driver.get(FILEDOWNLOAD);
    }

    public void verifyFileDownloadHeader(){
        WebElement FileDownloadHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(FileDownloadHeader.getText(),"File Download");
    }

    public String pathFirstDownload(){
        return "C:\\Users\\JoelBamfo\\Downloads\\Documents";
    }

    public String pathSecondDownload(){
        return "C:\\Users\\JoelBamfo\\Downloads";
    }


    public WebElement downloadFirstBtn(){
        return driver.findElement(By.cssSelector("[rel=\"nofollow\"]"));
    }

    public void clickFirstDownloadBtn(){
        downloadFirstBtn().click();
    }

    public void verifyFirstDownloadedFile(){
        File downloadedFile = new File(pathFirstDownload() + "\\test.pdf");
        Assert.assertTrue(downloadedFile.exists(), "File does not exist");
    }

    public WebElement downloadSecondBtn(){
        return driver.findElement(By.xpath("//a[@class='wpdm-download-link wpdm-download-locked btn btn-primary ']"));
    }

    public void clickSecondDownloadButton(){
        downloadSecondBtn().click();
    }

    public void switchFrame(){
        Switch.switchFrame("wpdm-lock-frame");
    }

    public void typePassword (String password){
        WebElement passwordField = driver.findElement(By.cssSelector("[type=\"password\"]"));
        passwordField.sendKeys(password);
    }

    public WebElement submitBtn(){
         return driver.findElement(By.cssSelector("[type=\"submit\"]"));
    }

    public void submitPassword(){
        submitBtn().click();
    }

    public void verifySecondDownloadedFile(){
        File downloadedFile = new File(pathSecondDownload() + "\\test.docx");
        Assert.assertTrue(downloadedFile.exists());
    }





}
