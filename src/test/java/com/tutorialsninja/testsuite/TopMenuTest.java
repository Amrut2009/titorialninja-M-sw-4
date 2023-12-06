package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNotebooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopsAndNotebooksPage laptopsAndNotebooksPage = new LaptopsAndNotebooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

    // 1.1 create method with name "selectMenu" it has one parameter name "menu" of typeString
    //1.2 This method should click on the menu whatever name is passed as parameter.Write the following Test:
    // 1. verifyUserShouldNavigateToDesktopsPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
//1.1 Mouse hover on “Desktops” Tab and click
        homePage.mouseHoverOnDeskTopsMenu();
//1.2 call selectMenu method and pass the menu = “Show All Desktops”
        homePage.clickOnShowAllDeskTopSubMenu();
        //          1.3 Verify the text ‘Desktops’
        String actualDesktopPageText = desktopsPage.getWelcomeText();
        String expectedDesktopPageText = "Desktops";
        Assert.assertEquals(actualDesktopPageText, expectedDesktopPageText);
    }
        //2. verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
//2.1 Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopsAndNotebooks();
//2.2 call selectMenu method and pass the menu = “Show All Laptops & Notebooks”
        homePage.mouseHoverOnLaptopsAndNotebooks();
        //   2.3 Verify the text ‘Laptops & Notebooks’
        String actualLaptopAndNotebooksPageText = laptopsAndNotebooksPage.getWelcomeText();
        String expectedLaptopAndNotebooksPageText = "Laptops & Notebooks";
        Assert.assertEquals(actualLaptopAndNotebooksPageText, expectedLaptopAndNotebooksPageText);
    }
        //  3. verifyUserShouldNavigateToComponentsPageSuccessfully()
        @Test
        public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
//3.1 Mouse hover on “Components” Tab and click
            homePage.mouseHoverOnComponentsMenu();
//3.2 call selectMenu method and pass the menu = “Show All Components”
            homePage.clickOnShowAllComponentsSubMenu();
        //          3.3 Verify the text ‘Components’
            String actualComponentsPageText = componentsPage.getWelcomeText();
            String expectedComponentsPageText = "Components";
            Assert.assertEquals(actualComponentsPageText, expectedComponentsPageText);
        }
    }
