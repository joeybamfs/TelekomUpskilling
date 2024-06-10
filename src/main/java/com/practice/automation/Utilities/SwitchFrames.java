package com.practice.automation.Utilities;

import static com.codeborne.selenide.Selenide.*;

public class SwitchFrames {

    public SwitchFrames() {
    }

    public void switchFrame(String id) {
        switchTo().frame(id);
    }

    public void switchToDefault() {
        switchTo().defaultContent();
    }
}