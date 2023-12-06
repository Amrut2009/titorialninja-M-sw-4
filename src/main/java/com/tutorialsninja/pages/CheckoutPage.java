package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class CheckoutPage extends Utility {
    By checkoutText = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By guestCheckoutRadioButton = By.xpath("//input[@value='guest']");
    By guestCheckoutContinueButton = By.xpath("//input[@id='button-account']");
    By billingDetailFirstNameField = By.name("firstname");
    By billingDetailLastNameField = By.name("lastname");
    By billingDetailEmailField = By.id("input-payment-email");
    By billingDetailTelephoneField = By.name("telephone");
    By billingDetailAddress1Field = By.name("address_1");
    By billingDetailCityField = By.name("city");
    By billingDetailPostCodeField = By.name("postcode");
    By billingDetailCountryDropdown = By.name("country_id");
    By billingDetailStateDropDown = By.name("zone_id");
    By billingDetailContinueButton = By.xpath("//input[@id='button-guest']");
    By commentArea = By.xpath("//textarea[@name='comment']");
    By termAndConditionCheckbox = By.xpath("//input[@name='agree']");
    By paymentMethodContinueButton = By.xpath("//input[@id='button-payment-method']");
    By paymentWarningWarning = By.xpath("//div[@class='alert alert-danger alert-dismissible']");
    public String getCheckoutText () {
        return getTextFromElement(checkoutText);
    }

    public String getNewCustomerText(){
        return getTextFromElement(newCustomerText);
    }

    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(guestCheckoutRadioButton);
    }

    public void clickOnGuestCheckoutContinueButton() {
        clickOnElement(guestCheckoutContinueButton);
    }

    public void sendDataToFirstNameField(String fname) {
        sendTextToElement(billingDetailFirstNameField, fname);
    }

    public void sendDataToLastNameField(String lname) {
        sendTextToElement(billingDetailLastNameField, lname);
    }

    public void sendDataToEmailField(String email) {
        sendTextToElement(billingDetailEmailField, email);
    }

    public void sendDataToTelephoneField(String number) {
        sendTextToElement(billingDetailTelephoneField, number);
    }

    public void sendDataToAddressField(String address) {
        sendTextToElement(billingDetailAddress1Field, address);
    }

    public void sendDataToCityField(String city) {
        sendTextToElement(billingDetailCityField, city);
    }

    public void sendDataToPostCodeField(String pc) {
        sendTextToElement(billingDetailPostCodeField, pc);
    }

    public void selectCountry(String country){
        selectByVisibleTextFromDropDown(billingDetailCountryDropdown, country);
    }

    public void selectState(String state){
        selectByVisibleTextFromDropDown(billingDetailStateDropDown, state);
    }

    public void clickOnBillingDetailContinueButton() {
        clickOnElement(billingDetailContinueButton);
    }

    public void sendDataToCommentField(String comment) {
        sendTextToElement(commentArea, comment);
    }

    public void clickOnTermAndCondition() {
        clickOnElement(termAndConditionCheckbox);
    }

    public void clickOnPaymentMethodContinueButton() {
        clickOnElement(paymentMethodContinueButton);
    }

    public String getPaymentWarningMessage () {
        return getTextFromElement(paymentWarningWarning);
    }
}
