package TestCases;

import com.practice.automation.Pages.Modals;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class ModalsTest {

    @Test
    public void modalsPageTest(){
        Modals modals = Modals.modalsPage();

        //Access the Modals Page
        modals.goToModalsPage();

        //Asserting that the Modals field header is equal to the expected text on the website
        modals.verifyModalsPageHeader();

        //click simple modal button
        modals.clickSimpleModalBtn();

        //Assert features in simple modal
        modals.verifyFeaturesInSimpleModal();

        //Close Modal
        modals.clickCloseModalBtn();

        //click form modal button
        modals.clickFormModalBtn();

        //Assert the features in the form modal
        modals.verifyFeaturesInFormModal();

        //Filling form modal
        modals.fillForm("Joel Bamfo", "bameybamford10@gmail.com", "I am the goat");

        //submit form
        modals.submitForm();
    }
}

