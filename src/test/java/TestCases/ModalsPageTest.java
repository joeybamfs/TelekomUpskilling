package TestCases;

import org.example.Pages.ModalsPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class ModalsPageTest extends RunAlways {
    @Test
    public void modalsPageTest(){
        ModalsPage modals = ModalsPage.modalsPage(driver);

        //Access the Modals Page
        modals.gotToModalsPage();

        //Asserting that the Modals field header is equal to the expected text on the website
        modals.verifyModalsPageHeader();

        //click simple modal button
        modals.clickSimpleModalBtn();

        //Assert features in simple modal
//        modals.verifyFeaturesInSimpleModal();

        //Close Modal
        modals.clickCloseModalBtn();

        //click form modal button
        modals.clickFormModalBtn();

        //Filling form modal
        modals.fillform("Joel Bamfo", "bameybamford10@gmail.com", "I am the goat");

        //submit form
        modals.submitForm();
    }
}
