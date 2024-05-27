package org.example.RunAlways;

import org.example.Driver.DriverFactory;
import org.example.Utilies.Sleep;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class RunAlways {
    protected WebDriver driver;


    @BeforeMethod
    public void initialDriver(){
        driver = DriverFactory.newChromeDriver();
    }

    @AfterMethod
    public void closeDriver(){
        Sleep.sleep();
        driver.quit();
    }
}
