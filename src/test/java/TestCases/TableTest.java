package TestCases;

import com.practice.automation.Pages.Table;
import org.testng.annotations.Test;

public class TableTest {
    @Test
    public void simpleTablePageTest() {
        Table table = Table.tablePage();

        //Access the Tables Page
        table.goToTablePage();

        //Asserting that the Table field header is equal to the expected text on the website
        table.verifyTableFieldHeader();

        //Finding the price of a simple table
        table.getItemPrice("Oranges");

        //Asserting that the price input corresponds to the item input
        table.verifyPrice("Oranges", "$3.99");
    }

    @Test(dependsOnMethods = {"simpleTablePageTest"})
    public void complexTableTest(){
        Table table = Table.tablePage();

        //Asserting that the Table field header is equal to the expected text on the website
        table.verifyTableFieldHeader();
    }
}
