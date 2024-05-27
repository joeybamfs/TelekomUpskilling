package TestCases;

import org.example.Pages.FormPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class FormPageTest extends RunAlways {


    @Test
    public void formPageTest(){
        FormPage form = FormPage.formPage(driver);

        //Access the Forms Page
        form.gotToFormPage();

        //Asserting that the form field header is equal to the expected text on the website
        form.verifyFormFieldHeader();

        //Asserting the  name field is displayed
        form.verifyNameLabelIsDisplayed();

        //Typing the name Joel Bamfo in the name field
        form.typeName("Joel Bamfo");

        //Asserting that the Drink Label is equal to "What is your favorite drink?"
        form.verifyDrinkLabel();

        //Random selection of a drink
        form.selectDrink();

        //Asserting that the Color Label is equal to "What is your favorite color?"
        form.verifyColorLabel();

        //Random selection of a color
        form.selectRandomColor();

        //Asserting that the Siblings question
        form.verifySiblingsLabel();

        //Selecting the "yes" option
        form.selectSiblingChoice();

        //Asserting the email label is visible
        form.verifyEmailLabelVisibility();

        //Typing the email bameybamford10@gmail.com in the email filed
        form.typeEmail("bameybamford10@gmail.com");

        //Typing a message in the message filed
        form.typeMessage("A lot bro.. a lot");

        //Submit form
        form.submitClick();

        //Accept alert after it appears
        form.acceptAlert();

        //Assert that all input fields are empty after the alert has been accepted
        form.verifyInputFieldsAreEmpty();
    }
}
