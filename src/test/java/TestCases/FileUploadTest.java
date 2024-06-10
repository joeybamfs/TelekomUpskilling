package TestCases;

import com.practice.automation.Pages.FileUpload;
import com.practice.automation.Utilities.Sleep;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class FileUploadTest {
    @Test
    public void UploadFile() {
        FileUpload fileUpload = FileUpload.fileUploadPage();

        //Access the File Upload page
        fileUpload.goToFileUploadPage();

        //Asserting that the File Download header is equal to the expected text on the website
        fileUpload.verifyFileUploadHeader();

        //Upload the file
        fileUpload.uploadFile();

        //Click the upload button
        fileUpload.clickUploadBtn();
        // Use WebDriverWait to wait for a specific element to be visible

        Sleep.sleep(5000);

        //Asserting that the success message shows when the upload is complete
        fileUpload.verifyMessageDisplayed();
    }
}
