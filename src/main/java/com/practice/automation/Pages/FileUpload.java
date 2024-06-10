package com.practice.automation.Pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.FILEUPLOAD;
import static org.testng.Assert.assertEquals;

public class FileUpload {

    private FileUpload() {
        // No need for WebDriver in Selenide
    }

    public static FileUpload fileUploadPage() {
        return new FileUpload();
    }

    public void goToFileUploadPage() {
        open(FILEUPLOAD);
    }

    public void verifyFileUploadHeader() {
        $("[itemprop='headline']").shouldHave(text("File Upload"));
    }

    public SelenideElement uploadFileSelector() {
        return $("#file-upload");
    }

    public File path() {
        return new File("C:/Users/JoelBamfo/Downloads/test.pdf");
    }

    public String fileName() {
        return path().getAbsolutePath();
    }

    public void uploadFile() {
        uploadFileSelector().uploadFile(path());
    }

    public void clickUploadBtn() {
        $("#upload-btn").click();
    }

    public void verifyMessageDisplayed() {
        SelenideElement message = $x("//*[@id='wpcf7-f13587-p1037-o1']/form/div[2]");

        message.shouldBe(visible);

        String sentFileMessage = message.getText();

        assertEquals(sentFileMessage, "Thank you for your message. It has been sent.", "The two messages are not the same hence file did not upload successfully.");
    }
}
