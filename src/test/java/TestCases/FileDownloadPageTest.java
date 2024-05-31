package TestCases;

import org.example.Pages.FileDownloadPage;
import org.example.Pages.TablePage;
import org.example.RunAlways.RunAlways;
import org.example.Utilies.Wait;
import org.testng.annotations.Test;

import java.io.File;

public class FileDownloadPageTest extends RunAlways {

    Wait wait = new Wait();
    @Test
    public void downloadFileWithoutPassword() {
        FileDownloadPage fileDownload = FileDownloadPage.fileDownloadPage(driver);

        //Access the File Download Page
        fileDownload.gotToFileDownloadPage();

        //Asserting that the File Download header is equal to the expected text on the website
        fileDownload.verifyFileDownloadHeader();

        //Click on the download button and download file
        fileDownload.clickFirstDownloadBtn();

        //Assert that the downloaded file exists
        fileDownload.verifyFirstDownloadedFile();
    }

    @Test(dependsOnMethods = {"downloadFileWithoutPassword"})
    public void downloadFileWithPassword(){
        FileDownloadPage fileDownload = FileDownloadPage.fileDownloadPage(driver);

        //Access the Tables Page
        fileDownload.gotToFileDownloadPage();

        //Click on the download button and download file
        fileDownload.clickSecondDownloadButton();

        //Switch to second iframe
        fileDownload.switchFrame();

        //Type password "automateNow"
        fileDownload.typePassword("automateNow");

        //Submit Password
        fileDownload.submitPassword();

        //Verify that second file got downloaded
        fileDownload.verifySecondDownloadedFile();




    }
}
