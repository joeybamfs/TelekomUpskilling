package org.example.Utilies;

import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static java.util.concurrent.TimeUnit.SECONDS;

public class Wait {
    public void wait(WebDriver driver, int seconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
    }
}
