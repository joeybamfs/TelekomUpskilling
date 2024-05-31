package org.example.Utilies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchFrames{
    WebDriver driver;

    public SwitchFrames(WebDriver driver) {
        this.driver = driver;
    }

    public void switchFrame(String id){
        driver.switchTo().frame(id);
    }

    public void switchToDefault(){
        driver.switchTo().defaultContent();
    }
}
