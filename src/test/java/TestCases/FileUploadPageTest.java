package TestCases;

import org.example.Pages.FileUploadPage;
import org.example.RunAlways.RunAlways;
import org.example.Utilies.Sleep;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Instant;

public class FileUploadPageTest extends RunAlways {
    @Test
    public void UploadFile() {
        FileUploadPage fileUpload = FileUploadPage.fileUploadPage(driver);
        WebDriverWait wait;

        //Access the File Upload page
        fileUpload.gotToFileUploadPage();

        //Asserting that the File Download header is equal to the expected text on the website
        fileUpload.verifyFileUploadHeader();

        //Upload the file
        fileUpload.uploadFile();

        //Click the upload button
        fileUpload.clickUploadBtn();
        // Use WebDriverWait to wait for a specific element to be visible

        Sleep.sleep();

        //Asserting that the success message shows when the upload is complete
        fileUpload.verifyMessageDisplayed();
    }
}
