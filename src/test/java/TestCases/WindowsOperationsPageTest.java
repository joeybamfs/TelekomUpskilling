package TestCases;

import org.example.Pages.WindowsOperationsPage;
import org.example.RunAlways.RunAlways;
import org.testng.annotations.Test;

public class WindowsOperationsPageTest extends RunAlways{
    @Test
    public void WindowsOperationsTest(){
        WindowsOperationsPage WindowsOperations = WindowsOperationsPage.windowsOperationsPage(driver);

        //Access the Iframes web page
        WindowsOperations.gotToWindowsOperationsPage();

        //Asserting the that the Iframes header is displayed
        WindowsOperations.verifyWindowsOperationsHeader();
    }
}
