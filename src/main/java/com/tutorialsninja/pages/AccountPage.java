package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class AccountPage  extends Utility {
    By welcomeText = By.xpath("//h2[normalize-space()='My Account']");
    By myAccountMenu = By.xpath("//span[normalize-space()='My Account']");
    By logoutOptionInMyAccount = By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Logout']");
    By logoutMessage = By.xpath("//h1[normalize-space()='Account Logout']");
    By logoutMessageContinueButton = By.xpath("//a[normalize-space()='Continue']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnMyAccountMenu() {
        clickOnElement(myAccountMenu);
    }

    public void clickOnLogoutOptionInMyAccount() {
        clickOnElement(logoutOptionInMyAccount);
    }

    public String getLogoutSuccessMessage() {
        return getTextFromElement(logoutMessage);
    }

    public void clickOnLogoutMessageContinueButton() {
        clickOnElement(logoutMessageContinueButton);
    }
}
