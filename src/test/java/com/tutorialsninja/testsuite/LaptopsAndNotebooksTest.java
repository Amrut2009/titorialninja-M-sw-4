package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.*;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class LaptopsAndNotebooksTest extends BaseTest {
HomePage homePage = new HomePage();
LaptopsAndNotebooksTest l = new LaptopsAndNotebooksTest();
MacBookProductPage macBookProductPage = new MacBookProductPage();
ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
CheckoutPage checkoutPage =new CheckoutPage();
    private DesktopsPage laptopsAndNotebooksPage;


    //1. Test name verifyProductsPriceDisplayHighToLowSuccessfully()
    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() throws InterruptedException {
//1.1 Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverOnLaptopsAndNotebooks();
//1.2 Click on “Show All Laptops & Notebooks”
        homePage.clickOnShowAllLaptopAndNotebooksSubMenu();
  //        1.3 Select Sort By "Price (High > Low)"
        laptopsAndNotebooksPage.sortByFilter("Price (High > Low)");
   //         1.4 Verify the Product price will arrange in High to Low order.
        String actualLaptopAndNotebooksPageText = laptopsAndNotebooksPage.getWelcomeText();
        String expectedLaptopAndNotebooksPageText = "Laptops & Notebooks";
        Assert.assertEquals(actualLaptopAndNotebooksPageText, expectedLaptopAndNotebooksPageText);}
//2. Test name verifyThatUserPlaceOrderSuccessfully()}
        @Test
        public void verifyThatUserPlaceOrderSuccessfully() throws InterruptedException {

//2.1 Mouse hover on Laptops & Notebooks Tab and click
            homePage.mouseHoverOnLaptopsAndNotebooks();
//2.2 Click on “Show All Laptops & Notebooks”
            homePage.clickOnShowAllLaptopAndNotebooksSubMenu();
  //          2.3 Select Sort By "Price (High > Low)"
            laptopsAndNotebooksPage.sortByFilter("Price (High > Low)");
    //        2.4 Select Product “MacBook”
            macBookProductPage.clickOnAddToCart();
      //      2.5 Verify the text “MacBook”
            String expectedSuccessMessage = "Success: You have added MacBook to your shopping cart!";
            String actualSuccessMessage = macBookProductPage.getCartAddSuccessfulMessage().substring(0, expectedSuccessMessage.length());
            Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        //    2.6 Click on ‘Add To Cart’ button
            shoppingCartPage.clickOnUpdateButton();

//2.7 Verify the message “Success: You have added MacBook to your shopping cart!”
            String expectedUpdateMessage = "Success: You have modified your shopping cart!";
            String actualUpdateMessage = shoppingCartPage.getShoppingCartUpdateMessage().substring(0, expectedUpdateMessage.length());
            Assert.assertEquals(actualUpdateMessage, expectedUpdateMessage);
  //          2.8 Click on link “shopping cart” display into success message
//2.9 Verify the text "Shopping Cart"
            String expectedShoppingCartText = "Shopping Cart";
            String actualShoppingCartText = shoppingCartPage.getWelcomeText().substring(0,expectedShoppingCartText.length());
            Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText);
  //          2.10 Verify the Product name "MacBook"
    //        2.11 Change Quantity "2"
            shoppingCartPage.sendDataToQuantityField(Keys.CONTROL +"a");
            shoppingCartPage.sendDataToQuantityField("2");
            //      2.12 Click on “Update” Tab
            shoppingCartPage.clickOnUpdateButton();

           // 2.14 Verify the Total £737.45
            String expectedCartTotal = "£737.45";
            String actualCartTotal = shoppingCartPage.getCartTotal().substring(0, expectedCartTotal.length());
            Assert.assertEquals(actualCartTotal, expectedCartTotal);

            // 2.15 Click on “Checkout” button
            shoppingCartPage.clickOnCheckOut();

//2.16 Verify the text “Checkout”
            String expectedCheckoutText = "Checkout";
            String actualCheckoutText = checkoutPage.getCheckoutText();
            Assert.assertEquals(actualCheckoutText, expectedCheckoutText);

            //          2.17 Verify the Text “New Customer”
            String expectedNewCustomerText = "New Customer";
            String actualNewCustomerText = checkoutPage.getNewCustomerText();
            Assert.assertEquals(actualNewCustomerText, expectedNewCustomerText);
    //        2.18 Click on “Guest Checkout” radio button
            checkoutPage.clickOnGuestCheckoutRadioButton();

//2.19 Click on “Continue” tab
            checkoutPage.clickOnGuestCheckoutContinueButton();

//2.20 Fill the mandatory fields
            checkoutPage.sendDataToFirstNameField("Abcd");
            checkoutPage.sendDataToLastNameField("Xyz");
            Random random = new Random();
            checkoutPage.sendDataToEmailField("abcd"+random.nextInt()+"@gmail.com");
            checkoutPage.sendDataToTelephoneField("074424856275");
            checkoutPage.sendDataToAddressField("1, ancd st.");
            checkoutPage.sendDataToCityField("London");
            checkoutPage.sendDataToPostCodeField("HA0 2AB");
            checkoutPage.selectCountry("United Kingdom");
            checkoutPage.selectState("Essex");
//2.21 Click on “Continue” Button
            checkoutPage.clickOnBillingDetailContinueButton();
//2.22 Add Comments About your order into text area
            checkoutPage.sendDataToCommentField("The product is good!")
//2.23 Check the Terms & Conditions check box
            checkoutPage.clickOnTermAndCondition();
//2.24 Click on “Continue” button
            checkoutPage.clickOnPaymentMethodContinueButton();

//2.25 Verify the message “Warning: Payment method required!”
            String expectedPaymentWarningMessage = "Warning: Payment method required!";
            String actualPaymentWarningMessage = checkoutPage.getPaymentWarningMessage().substring(0,expectedPaymentWarningMessage.length());
            Assert.assertEquals(actualPaymentWarningMessage, expectedPaymentWarningMessage);
        }
}
