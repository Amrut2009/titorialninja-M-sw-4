package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By welcomeText = By.xpath("//h1[normalize-space()='Register Account']");
    By registrationFirstNameField = By.name("firstname");
    By registrationLastNameField = By.name("lastname");
    By registrationEmailField = By.id("input-email");
    By registrationTelephoneField = By.name("telephone");
    By registrationPasswordField = By.xpath("//input[@id='input-password']");
    By registrationConfirmPasswordField = By.xpath("//input[@id='input-confirm']");
    By registrationSubscriptionYesRadioButton = By.xpath("//label[normalize-space()='Yes']");
    By registrationPrivacyPolicyCheckBox = By.xpath("//input[@name='agree']");
    By registrationContinueButton = By.xpath("//input[@value='Continue']");
    By accountCreatedSuccessMessage = By.xpath("//h1[normalize-space()='Your Account Has Been Created!']");
    By successMessageContinueButton = By.xpath("//a[normalize-space()='Continue']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void sendDataToRegistrationFirstNameField(String fname){
        sendTextToElement(registrationFirstNameField, fname);
    }

    public void sendDataToRegistrationLastNameField(String lname){
        sendTextToElement(registrationLastNameField, lname);
    }

    public void sendDataToRegistrationEmailField(String email){
        sendTextToElement(registrationEmailField, email);
    }

    public void sendDataToRegistrationTelephoneField(String number){
        sendTextToElement(registrationTelephoneField, number);
    }

    public void sendDataToRegistrationPasswordField(String password){
        sendTextToElement(registrationPasswordField, password);
    }

    public void sendDataToRegistrationConfirmPasswordField(String cPassword){
        sendTextToElement(registrationConfirmPasswordField, cPassword);
    }

    public void clickOnSubscriptionYesButton () {
        clickOnElement(registrationSubscriptionYesRadioButton);
    }

    public void clickOnPrivatePolicyCheckBox () {
        clickOnElement(registrationPrivacyPolicyCheckBox);
    }

    public void clickOnRegistrationContinueButton() {
        clickOnElement(registrationContinueButton);
    }

    public String getMessageOfAccountCreatedSuccess() {
        return getTextFromElement(accountCreatedSuccessMessage);
    }

    public void clickOnSuccessAccountContinueButton () {
        clickOnElement(successMessageContinueButton);
    }


}
