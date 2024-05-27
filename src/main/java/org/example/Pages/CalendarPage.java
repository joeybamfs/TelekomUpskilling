package org.example.Pages;

import org.example.Utilies.Scroll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import static org.example.WebPageUrls.WebPageUrls.CALENDARS;


public class CalendarPage {
    private final WebDriver driver;

    Scroll scrollIntoView = new Scroll();

    String day;

    public CalendarPage(WebDriver driver) {
        this.driver = driver;
    }

    public static CalendarPage calendarPage(WebDriver driver){
        return new CalendarPage(driver);
    }

    public void gotToCalendarPage(){
        driver.get(CALENDARS);
    }

    public void verifyCalendarFieldHeader(){
        WebElement calendarHeader = driver.findElement(By.cssSelector("[itemprop=\"headline\"]"));
        Assert.assertEquals(calendarHeader.getText(),"Calendars");
    }
    public WebElement calendarInputField(){
        return driver.findElement(By.cssSelector("[type=\"text\"]"));
    }

    public void clickCalendarInputField(){
        calendarInputField().click();
    }

    public WebElement calendarDay(){
        return driver.findElement(By.xpath("//a[normalize-space()='" + day + "']"));
    }

    public WebElement calendarMonth(){
        return driver.findElement(By.xpath("//span[@class=\"ui-datepicker-month\"]"));
    }

    public WebElement calendarYear(){
        return driver.findElement(By.xpath("//span[@class=\"ui-datepicker-year\"]"));
    }

    public WebElement arrowNext(){
        return driver.findElement(By.xpath("//a[@title='Next']"));
    }

    public WebElement arrowPrevious(){
        return driver.findElement(By.xpath("//a[@title='Previous']"));
    }

    private int monthToNumber(String Month) {
        switch (Month) {
            case "January": return 1;
            case "February": return 2;
            case "March": return 3;
            case "April": return 4;
            case "May": return 5;
            case "June": return 6;
            case "July": return 7;
            case "August": return 8;
            case "September": return 9;
            case "October": return 10;
            case "November": return 11;
            case "December": return 12;
            default: throw new IllegalArgumentException("Invalid month: " + Month);
        }
    }

    public void selectDate(String day, String month, String year){
        clickCalendarInputField();
        this.day = day;

        while(true){
            //Checks for what the user provides
            int monthNumber = monthToNumber(month);
            int yearNumber = Integer.parseInt(year);

            //Getting the actual text of the month and year in the calendar
            String currentMonth = calendarMonth().getText();
            String currentYear = calendarYear().getText();

            //Checks for what is currently displayed once the date input field is clicked
            int currentMonthNumber = monthToNumber(currentMonth);
            int currentYearNumber = Integer.parseInt(currentYear);

            if(currentMonthNumber == monthNumber && currentYearNumber == yearNumber){
                break;
            }
            else if(currentYearNumber > yearNumber || (currentYearNumber == yearNumber && currentMonthNumber > monthNumber)){
                arrowPrevious().click();
            }
            else {
                arrowNext().click();
            }
        }
        calendarDay().click();
    }

    private WebElement submitBtn(){
        return driver.findElement(By.cssSelector("[type=\"submit\"]"));
    }

    public void clickSubmitBtn(){
        submitBtn().click();
    }

    public void verifyDateSubmission(){
        WebElement submissionMessage = driver.findElement(By.id("contact-form-success-header"));
        WebElement datedSubmitted = driver.findElement(By.className("field-value"));

        String expectedMessage = submissionMessage.getText();
        String expectedDate = datedSubmitted.getText();

        Assert.assertEquals(expectedMessage, "Your message has been sent");
        Assert.assertEquals(expectedDate, "2025-01-15");
    }

}
