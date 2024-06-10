package TestCases;

import com.practice.automation.Pages.Iframes;
import org.testng.annotations.Test;

public class IfarmesTest {
    @Test
    public void IframesTest() {
        Iframes iframes = Iframes.iframesPage();

        //Access the Iframes web page
        iframes.goToIframesPage();

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
