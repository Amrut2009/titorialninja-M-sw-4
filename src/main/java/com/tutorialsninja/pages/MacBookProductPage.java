package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class MacBookProductPage extends Utility {

    By welcomeText = By.xpath("//h1[normalize-space()='MacBook']");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By addToCartSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLinkInMessage = By.xpath("//a[normalize-space()='shopping cart']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickOnAddToCart() {
        clickOnElement(addToCartButton);
    }

    public String getCartAddSuccessfulMessage() {
        return getTextFromElement(addToCartSuccessMessage);
    }

    public void clickOnShoppingCartLinkInMessage() {
        clickOnElement(shoppingCartLinkInMessage);
    }
}