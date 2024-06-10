package com.practice.automation.Pages;

import com.codeborne.selenide.SelenideElement;
import org.testng.Assert;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;
import static com.practice.automation.WebPageUrls.WebPageUrls.CALENDARS;

public class Calendar{
    String day;

    public Calendar() {
    }

    public static Calendar calendarPage() {
        return new Calendar();
    }

    public void goToCalendarPage() {
        open(CALENDARS);
    }

    public void verifyCalendarFieldHeader() {
        $("[itemprop='headline']").shouldHave(text("Calendars"));
    }

    public SelenideElement calendarInputField() {
        return $("[type='text']");
    }

    public void clickCalendarInputField() {
        calendarInputField().click();
    }

    public SelenideElement calendarDay() {
        return $x("//a[normalize-space()='" + day + "']");
    }

    public SelenideElement calendarMonth() {
        return $x("//span[@class='ui-datepicker-month']");
    }

    public SelenideElement calendarYear() {
        return $x("//span[@class='ui-datepicker-year']");
    }

    public SelenideElement arrowNext() {
        return $x("//a[@title='Next']");
    }

    public SelenideElement arrowPrevious() {
        return $x("//a[@title='Previous']");
    }

    private int monthToNumber(String month) {
        switch (month) {
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }

    public void selectDate(String day, String month, String year) {
        clickCalendarInputField();
        this.day = day;

        while (true) {
            int monthNumber = monthToNumber(month);
            int yearNumber = Integer.parseInt(year);

            String currentMonth = calendarMonth().getText();
            String currentYear = calendarYear().getText();

            int currentMonthNumber = monthToNumber(currentMonth);
            int currentYearNumber = Integer.parseInt(currentYear);

            if (currentMonthNumber == monthNumber && currentYearNumber == yearNumber) {
                break;
            } else if (currentYearNumber > yearNumber || (currentYearNumber == yearNumber && currentMonthNumber > monthNumber)) {
                arrowPrevious().click();
            } else {
                arrowNext().click();
            }
        }
        calendarDay().click();
    }

    private SelenideElement submitBtn() {
        return $("[type='submit']");
    }

    public void clickSubmitBtn() {
        submitBtn().click();
    }

    public void verifyDateSubmission() {
        SelenideElement submissionMessage = $("#contact-form-success-header");
        SelenideElement dateSubmitted = $(".field-value");

        submissionMessage.shouldHave(text("Your message has been sent"));
        dateSubmitted.shouldHave(text("2025-01-15"));
    }
}
