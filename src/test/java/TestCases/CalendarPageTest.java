package TestCases;

import org.example.Pages.CalendarPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class CalendarPageTest extends RunAlways{
    @Test
    public void calendarPageTest(){
        CalendarPage calendar = CalendarPage.calendarPage(driver);

        //Access the Popups Page
        calendar.gotToCalendarPage();

        //Asserting that the form field header is equal to the expected text on the website
        calendar.verifyCalendarFieldHeader();

        //Selecting a date
        calendar.selectDate("15", "January", "2025");

        //Click the submit button
        calendar.clickSubmitBtn();

        //Assert that the date submission is equal to the expected
        calendar.verifyDateSubmission();
    }

}
