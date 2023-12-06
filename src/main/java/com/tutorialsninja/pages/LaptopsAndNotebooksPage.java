package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNotebooksPage extends Utility {
    By welcomeText = By.tagName("h2");
    By sortByFilter = By.xpath("//select[@id='input-sort']");
    By MacBookProductName = By.xpath("//a[normalize-space()='MacBook']");
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sortByFilter(String sortByOption) {
        selectByVisibleTextFromDropDown(sortByFilter, sortByOption);
    }

    public void clickOnMacBookProduct () {
        clickOnElement(MacBookProductName);
    }
}


