package TestCases;

import com.practice.automation.Pages.Calendar;
import org.testng.annotations.Test;

public class CalendarTest {
    @Test
    public void calendarPageTest(){
        Calendar calendar = Calendar.calendarPage();

        //Access the Popups Page
        calendar.goToCalendarPage();

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
