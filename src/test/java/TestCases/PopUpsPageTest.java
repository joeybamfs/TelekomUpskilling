package TestCases;

import org.example.Pages.FormPage;
import org.example.Pages.PopUpsPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class PopUpsPageTest extends RunAlways {

    @Test
    public void popUpsPageTest(){
        PopUpsPage popups = PopUpsPage.popUpsPage(driver);

        //Access the Popups Page
        popups.gotToPopupsPage();

        //Asserting that the form field header is equal to the expected text on the website
        popups.verifyPopUpsPageHeader();

        //Asserting that the text in the alert button matches "Alert Button"
        popups.verifyAlertBtnText();

        //Click alert button
        popups.clickAlertBtn();

        //Handle alert pop up
        popups.handleAlert();

        //Asserting that the text in the confirm button matches "Confirm Button"
        popups.verifyConfirmBtnText();

        //Click confirm button
        popups.clickConfirmBtn();

        //Handle confirm alert pop up
        popups.handleConfirm();

        //Asserting that the confirmation message matches that of the expected
        popups.verifyConfirmMessage();

        //Asserting that the text in the prompt button matches "Prompt Button"
        popups.verifyPromptBtnText();

        //Click prompt button
        popups.clickPromptBtn();

        //Handle prompt alert pop up
        popups.handlePrompt("Joel Bamfo");

        //Asserting that the confirmation message matches that of the expected
        popups.verifyPromptMessage();

        //Click tool tip text
        popups.clickToolTip();

        //Asserting that the tool tip is displayed after the click
        popups.verifyToolTipMessage();
    }



}
