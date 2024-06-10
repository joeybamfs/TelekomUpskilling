package TestCases;

import com.codeborne.selenide.WebDriverRunner;
import com.practice.automation.Pages.PopUps;
import com.practice.automation.Utilities.Sleep;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.FORMS;
import static com.practice.automation.WebPageUrls.WebPageUrls.HOME;
import static org.testng.Assert.*;

public class PopUpsTest{

    @Test
    public void popUpsPageTest() {
        PopUps popups = PopUps.popUpsPage();

        // Access the Popups Page
        popups.goToPopupsPage();

        // Asserting that the form field header is equal to the expected text on the website
        popups.verifyPopUpsPageHeader();

        // Asserting that the text in the alert button matches "Alert Popup"
        popups.verifyAlertBtnText();

        // Click alert button
        popups.clickAlertBtn();

        // Handle alert pop up
        popups.handleAlert();

        // Asserting that the text in the confirm button matches "Confirm Popup"
        popups.verifyConfirmBtnText();

        // Click confirm button
        popups.clickConfirmBtn();

        // Handle confirm alert pop up
        popups.handleConfirm();

        // Asserting that the confirmation message matches that of the expected
        popups.verifyConfirmMessage();

        // Asserting that the text in the prompt button matches "Prompt Popup"
        popups.verifyPromptBtnText();

        // Click prompt button
        popups.clickPromptBtn();

        // Handle prompt alert pop up
        popups.handlePrompt("Joel Bamfo");

        // Asserting that the confirmation message matches that of the expected
        popups.verifyPromptMessage();

        // Click tool tip text
        popups.clickToolTip();

        // Asserting that the tool tip is displayed after the click
        popups.verifyToolTipMessage();
    }
}
