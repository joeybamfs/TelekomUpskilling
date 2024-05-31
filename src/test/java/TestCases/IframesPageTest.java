package TestCases;

import org.example.Pages.FileUploadPage;
import org.example.Pages.IframesPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class IframesPageTest extends RunAlways {
    @Test
    public void IframesTest(){
        IframesPage iframes = IframesPage.iframesPage(driver);

        //Access the Iframes web page
        iframes.gotToIframesPage();

        //Asserting the that the Iframes header is displayed
        iframes.verifyIframesHeader();

        //Switch to first iframe
        iframes.switchToFirstIframe();

        //Handle ad popup
        iframes.handleAds();

        //clicking the search button
        iframes.clickSearchButton();

        //Searching for earthquakes
        iframes.search("Earthquakes");

        //Submit search
        iframes.submitSearch();

        //Switch back to the default iframe
        iframes.switchToDefaultFrame();

        //Switch then to the second iframe
        iframes.switchToSecondFrame();
    }
}
