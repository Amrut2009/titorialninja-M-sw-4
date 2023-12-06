package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By welcomeText = By.tagName("h2");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }
}
