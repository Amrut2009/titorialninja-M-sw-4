package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HPLP3065ProductPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeskTopsTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    HPLP3065ProductPage hplp3065ProductPage = new HPLP3065ProductPage();
    ShoppingCartPage shoppingCartPage =new ShoppingCartPage();


    //1.Test name verifyProductArrangeInAlphaBeticalOrder()
    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        Thread.sleep(2000);
//1.1 Mouse hover on Desktops Tab.and click
        homePage.mouseHoverOnDeskTopsMenu();
//1.2 Click on “Show All Desktops”
        homePage.clickOnShowAllDeskTopSubMenu();
        //          1.3 Select Sort By position "Name: Z to A"
        desktopsPage.sortByFilter("Name: Z to A");
        //        1.4 Verify the Product will arrange in Descending order.
        List<WebElement> list = desktopsPage.getAllProductTitleOnPage();
        ArrayList originalList = new ArrayList();
        for (WebElement l : list) {
            originalList.add(l.getText());
        }
        Collections.reverse(originalList);
        //System.out.println(originalList);

        desktopsPage.sortByFilter("Name (Z - A)");
        Thread.sleep(2000);
        ArrayList sortedList = new ArrayList();
        list = desktopsPage.getAllProductTitleOnPage();
        for (WebElement l : list) {
            sortedList.add(l.getText());
        }
        //System.out.println(sortedList);
        Assert.assertEquals(originalList, sortedList);

        //      2. Test name verifyProductAddedToShoppingCartSuccessFully()
    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {

//2.1 Mouse hover on Currency Dropdown and click
        homePage.mouseHoverAndClickOnCurrencyDroDown();
//2.2 Mouse hover on £Pound Sterling and click
        homePage.selectSterlingPoundFromCurrencyDropDown();
//2.3 Mouse hover on Desktops Tab .
        homePage.mouseHoverOnDeskTopsMenu();
//2.4 Click on “Show All Desktops”
        homePage.clickOnShowAllDeskTopSubMenu();
        // 2.5 Select Sort By position "Name: A to Z
        desktopsPage.sortByFilter("Name: A to Z");
        //  2.6 Select product “HP LP3065”
        desktopsPage.clickOnHPLP3065Product();
        // 2.7 Verify the Text "HP LP3065"

        //    2.8 Select Delivery Date "2023-11-28"
        hplp3065ProductPage.selectDeliveryDate("28","Nov", "2023");
        //  2.9.Enter Qty "1” using Select class.
        hplp3065ProductPage.sendDataToQuantityField("1");
        //2.10 Click on “Add to Cart” button
        hplp3065ProductPage.clickOnAddToCart();
//2.11 Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
        String expectedSuccessMessage = "Success: You have added HP LP3065 to your shopping cart!";
        String actualSuccessMessage = hplp3065ProductPage.getCartAddSuccessfulMessage().substring(0, expectedSuccessMessage.length());
        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage);
        //          2.12 Click on link “shopping cart” display into success message
        hplp3065ProductPage.clickOnShoppingCartLinkInMessage();

        Thread.sleep(2000);

//2.13 Verify the text "Shopping Cart"
        String expectedShoppingCartText = "Shopping Cart";
        String actualShoppingCartText = shoppingCartPage.getWelcomeText().substring(0,expectedShoppingCartText.length());
        Assert.assertEquals(actualShoppingCartText, expectedShoppingCartText);
        //          2.14 Verify the Product name "HP LP3065"
        String expectedProductName = "HP LP3065";
        String actualProductName = shoppingCartPage.getProductName().substring(0,expectedProductName.length());
        Assert.assertEquals(actualProductName, expectedProductName);

        //        2.15 Verify the Delivery Date "2023-11-27"
        String expectedDeliveryDate = "Delivery Date:2023-11-28";
        String actualDeliveryDate = shoppingCartPage.getDeliveryDate().substring(0, expectedDeliveryDate.length());
        Assert.assertEquals(actualDeliveryDate, expectedDeliveryDate);
        //      2.16 Verify the Model "Product21"
        String expectedModel = "Product 21";
        String actualModel = shoppingCartPage.getModel().substring(0, expectedModel.length());
        Assert.assertEquals(actualModel, expectedModel);

        //    2.17 Verify the Total "£74.73"
        String expectedPrice = "£74.73";
        String actualPrice = shoppingCartPage.getTotalPrice().substring(0, expectedPrice.length());
        Assert.assertEquals(actualPrice, expectedPrice);
    }


    }


