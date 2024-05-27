package TestCases;

import org.example.Pages.TablePage;
import org.example.RunAlways.RunAlways;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TablePageTest extends RunAlways {
    @Test
    public void simpleTablePageTest() {
        TablePage table = TablePage.TablePage(driver);

        //Access the Tables Page
        table.gotToTablePage();

        //Asserting that the Table field header is equal to the expected text on the website
        table.verifyTableFieldHeader();

        //Finding the price of a simple table
        table.getItemPrice("Oranges");

        //Asserting that the price input corresponds to the item input
        table.verifyPrice("Oranges", "$3.99");
    }

    @Test(dependsOnMethods = {"simpleTablePageTest"})
    public void complexTableTest(){
        TablePage table = TablePage.TablePage(driver);

        //Asserting that the Table field header is equal to the expected text on the website
        table.verifyTableFieldHeader();
    }


}
