package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productName = By.xpath("//table[@class = 'table table-bordered']/tbody[1]/tr[1]/td[2]/a[1]");
    By deliveryDate = By.xpath("//table[@class = 'table table-bordered']//small[1]");
    By model = By.xpath("//td[normalize-space()='Product 21']");
    By totalPrice = By.cssSelector("tbody tr td:nth-child(6)");
    By quantityField = By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]");
    By updateButton = By.xpath("(//button[@type='submit'])[1]");
    By shoppingCartUpdateMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By cartTotal = By.xpath("//div[@class = 'table-responsive']/table[1]/tbody[1]/tr[1]/td[6]");
    By checkOutButton = By.xpath("//a[@class='btn btn-primary']");
    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String getProductName() {
        return getTextFromElement(productName);
    }

    public String getDeliveryDate() {
        return getTextFromElement(deliveryDate);
    }
    public String getModel() {
        return getTextFromElement(model);
    }
    public String getTotalPrice() {
        return getTextFromElement(totalPrice);
    }

    public void sendDataToQuantityField(String quantity) {
        sendTextToElement(quantityField, quantity);
    }

    public void clickOnUpdateButton () {
        clickOnElement(updateButton);
    }

    public String getShoppingCartUpdateMessage() {
        return getTextFromElement(shoppingCartUpdateMessage);
    }

    public String getCartTotal () {
        return getTextFromElement(cartTotal);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOutButton);
    }




}
