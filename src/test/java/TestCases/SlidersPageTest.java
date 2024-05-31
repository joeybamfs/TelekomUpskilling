package TestCases;

import org.example.Pages.IframesPage;
import org.example.Pages.SlidersPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class SlidersPageTest extends RunAlways {
    @Test
    public void SlidersTest(){
        SlidersPage sliders = SlidersPage.slidersPage(driver);

        //Access the Iframes web page
        sliders.gotToSlidersPage();

        //Asserting the that the Iframes header is displayed
        sliders.verifySlidersHeader();
    }
}
