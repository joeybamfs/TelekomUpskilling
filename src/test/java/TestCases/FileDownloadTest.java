package TestCases;

import com.practice.automation.Pages.FileDownload;
import org.testng.annotations.Test;

public class FileDownloadTest {
    @Test
    public void downloadFileWithoutPassword() {
        FileDownload fileDownload = FileDownload.fileDownloadPage();

        //Access the File Download Page
        fileDownload.goToFileDownloadPage();

        //Asserting that the File Download header is equal to the expected text on the website
        fileDownload.verifyFileDownloadHeader();

        //Click on the download button and download file
        fileDownload.clickFirstDownloadBtn();

        //Assert that the downloaded file exists
        fileDownload.verifyFirstDownloadedFile();
    }

    @Test(dependsOnMethods = {"downloadFileWithoutPassword"})
    public void downloadFileWithPassword(){
        FileDownload fileDownload = FileDownload.fileDownloadPage();

        //Access the Tables Page
        fileDownload.goToFileDownloadPage();

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
