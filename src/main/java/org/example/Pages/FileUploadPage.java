package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.File;

import static org.example.WebPageUrls.WebPageUrls.FILEUPLOAD;

public class FileUploadPage {
    private final WebDriver driver;
    private FileUploadPage(WebDriver driver){
        this.driver = driver;
    }

    public static FileUploadPage fileUploadPage(WebDriver driver){
        return new FileUploadPage(driver);
    }

    public void gotToFileUploadPage(){
        driver.get(FILEUPLOAD);
    }

    public void verifyFileUploadHeader(){
        WebElement FileUploadHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(FileUploadHeader.getText(),"File Upload");
    }

    public WebElement uploadFileSelector(){
        return driver.findElement(By.id("file-upload"));
    }

    public File path(){
        return new File("C:/Users/JoelBamfo/Downloads/test.pdf");
    }

    public String fileName(){
        return path().getAbsolutePath();
    }

    public void uploadFile(){
        uploadFileSelector().sendKeys(fileName());
    }

    public void clickUploadBtn(){
        WebElement uploadBtn = driver.findElement(By.id("upload-btn"));
        uploadBtn.click();
    }

    public void verifyMessageDisplayed(){
        WebElement message = driver.findElement(By.xpath("//*[@id=\"wpcf7-f13587-p1037-o1\"]/form/div[2]"));

        Assert.assertTrue(message.isDisplayed());

        String sentFileMessage = message.getText();

        Assert.assertEquals(sentFileMessage, "Thank you for your message. It has been sent.", "The two messages are not the same hence file did not upload successfully.");
    }


}
