package TestCases;

import com.practice.automation.Pages.Sliders;
import org.testng.annotations.Test;

public class SliderTest {
    @Test
    public void SlidersTest(){
        Sliders sliders = Sliders.slidersPage();

        //Access the Iframes web page
        sliders.goToSlidersPage();

        //Asserting the that the Iframes header is displayed
        sliders.verifySlidersHeader();

        //Slide
        sliders.clickAndDrag(sliders.sliderKnob(), 83);

        //Verify value chosen
        sliders.verifyValue("56");
    }
}
