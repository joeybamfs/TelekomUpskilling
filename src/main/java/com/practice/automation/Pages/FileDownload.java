package com.practice.automation.Pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.FILEDOWNLOAD;

public class FileDownload {
    private FileDownload() {
    }

    public static FileDownload fileDownloadPage() {
        return new FileDownload();
    }

    public void goToFileDownloadPage() {
        open(FILEDOWNLOAD);
    }

    public void verifyFileDownloadHeader() {
        $("[itemprop='headline']").shouldHave(text("File Download"));
    }

    public String pathFirstDownload() {
        return "C:\\Users\\JoelBamfo\\Downloads\\Documents";
    }

    public String pathSecondDownload() {
        return "C:\\Users\\JoelBamfo\\Downloads";
    }

    public SelenideElement downloadFirstBtn() {
        return $("[rel='nofollow']");
    }

    public void clickFirstDownloadBtn() {
        downloadFirstBtn().click();
    }

    public void verifyFirstDownloadedFile() {
        File downloadedFile = new File(pathFirstDownload() + "\\test.pdf");
        Assert.assertTrue(downloadedFile.exists(), "File does not exist");
    }

    public SelenideElement downloadSecondBtn() {
        return $x("//a[@class='wpdm-download-link wpdm-download-locked btn btn-primary ']");
    }

    public void clickSecondDownloadButton() {
        downloadSecondBtn().click();
    }

    public void switchFrame() {
        switchTo().frame("wpdm-lock-frame");
    }

    public void typePassword(String password) {
        $("[type='password']").setValue(password);
    }

    public SelenideElement submitBtn() {
        return $("[type='submit']");
    }

    public void submitPassword() {
        submitBtn().click();
    }

    public void verifySecondDownloadedFile() {
        File downloadedFile = new File(pathSecondDownload() + "\\test.docx");
        Assert.assertTrue(downloadedFile.exists(), "File does not exist");
    }
}
