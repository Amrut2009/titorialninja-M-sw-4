package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.AccountPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LoginPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class MyAccountsTest extends BaseTest {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginPage = new LoginPage();
    AccountPage accountPage = new AccountPage();

    //1.1 create method with name "selectMyAccountOptions" it has one parameter name"option" of type string
//1.2 This method should click on the options whatever name is passed as parameter(Hint: Handle List of Element and Select options)Write the following test
//1. Test name verifyUserShouldNavigateToRegisterPageSuccessfully()
    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully() {

//1.1 Click on My Account Link.
        homePage.clickOnMyAccountMenu();
//1.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        homePage.clickOnMyAccountMenu();
// 1.3 Verify the text “Register Account”.
        String expectedRegisterAccountWelcomeText = "Register Account";
        String actualRegisterAccountWelcomeText = registerPage.getWelcomeText().substring(0, expectedRegisterAccountWelcomeText.length());
        Assert.assertEquals(actualRegisterAccountWelcomeText,expectedRegisterAccountWelcomeText);
    }

        // 2. Test name verifyUserShouldNavigateToLoginPageSuccessfully()
        @Test
        public void verifyUserShouldNavigateToLoginPageSuccessfully() {
//2.1 Click on My Account Link.
            homePage.clickOnMyAccountMenu();
//2.2 Call the method “selectMyAccountOptions” method and pass the parameter“Login”
        // 2.3 Verify the text “Returning Customer”.
            String expectedLoginWelcomeText = "Returning Customer";
            String actualLoginWelcomeText = loginPage.getWelcomeText().substring(0, expectedLoginWelcomeText.length());
            Assert.assertEquals(actualLoginWelcomeText,expectedLoginWelcomeText);
        }
        // 3. Test name verifyThatUserRegisterAccountSuccessfully()
    @Test
    public void verifyThatUserRegisterAccountSuccessfully() {
//3.1 Click  on My Account Link.
        homePage.clickOnMyAccountMenu();
//3.2 Call the method “selectMyAccountOptions” method and pass the parameter“Register”
        homePage.clickOnRegisterOptionInMyAccount();
        //3.3 Enter First Name
        registerPage.sendDataToRegistrationFirstNameField("Abcd");
//3.4 Enter Last Name
        registerPage.sendDataToRegistrationLastNameField("Xyz");
//3.5 Enter Email
        Random random = new Random();
        registerPage.sendDataToRegistrationEmailField("abcd"+random.nextInt()+"@gmail.com");
//3.6 Enter Telephone
        registerPage.sendDataToRegistrationTelephoneField("074524215254");
//3.7 Enter Password
        registerPage.sendDataToRegistrationPasswordField("abcd123");
//3.8 Enter Password Confirm
        registerPage.sendDataToRegistrationConfirmPasswordField("abcd123");
//3.9 Select Subscribe Yes radio button
        registerPage.clickOnSubscriptionYesButton();
//3.10 Click on Privacy Policy check box
        registerPage.clickOnPrivatePolicyCheckBox();
//3.11 Click on Continue button
        registerPage.clickOnRegistrationContinueButton();
//3.12 Verify the message “Your Account Has Been Created!”
        String expectedAccountCreationSuccessMessage = "Your Account Has Been Created!";
        String actualAccountCreationSuccessMessage = registerPage.getMessageOfAccountCreatedSuccess().substring(0, expectedAccountCreationSuccessMessage.length());
        Assert.assertEquals(actualAccountCreationSuccessMessage, expectedAccountCreationSuccessMessage);
        //          3.13 Click on Continue button
        registerPage.clickOnSuccessAccountContinueButton();
//3.14 Click on My Account Link.
        accountPage.clickOnMyAccountMenu();
//3.15 Call the method “selectMyAccountOptions” method and pass the parameter
//“Logout”
        accountPage.clickOnLogoutOptionInMyAccount();
//            3.16 Verify the text “Account Logout”
        String expectedLogoutMessage = "Account Logout";
        String actualLogoutMessage = accountPage.getLogoutSuccessMessage().substring(0, expectedLogoutMessage.length());
        Assert.assertEquals(actualLogoutMessage, expectedLogoutMessage);

//            3.17 Click on Continue button
  accountPage.clickOnLogoutMessageContinueButton();
    }
//4. Test name verifyThatUserShouldLoginAndLogoutSuccessfully()

    @Test
    public void verifyThatUserShouldLoginAndLogoutSuccessfully() {
//
//4.1 Click on My Account Link.
        homePage.clickOnMyAccountMenu();
//4.2 Call the method “selectMyAccountOptions” method and pass the parameter
//“Login”
        String expectedLoginWelcomeText = "Returning Customer";
        String actualLoginWelcomeText = loginPage.getWelcomeText().substring(0, expectedLoginWelcomeText.length());
        Assert.assertEquals(actualLoginWelcomeText,expectedLoginWelcomeText);
//            4.3 Enter Email address
        loginPage.sendDataToEmailField("abcdxyz123@gmail.com");
//4.4 Enter Last Name
//4.5 Enter Password
        loginPage.sendDataToPasswordField("abcd@123");
//4.6 Click on Login button
        loginPage.clickOnLoginButton();
//4.7 Verify text “My Account”
        String expectedAccountPageWelcomeText = "My Account";
        String actualAccountPageWelcomeText = accountPage.getWelcomeText().substring(0, expectedAccountPageWelcomeText.length());
        Assert.assertEquals(actualAccountPageWelcomeText, expectedAccountPageWelcomeText);
//            4.8 Click on My Account Link.
        accountPage.clickOnMyAccountMenu();
//4.9 Call the method “selectMyAccountOptions” method and pass the parameter“Logout”
//            4.10 Verify the text “Account Logout”
        String expectedLogoutMessage = "Account Logout";
        String actualLogoutMessage = accountPage.getLogoutSuccessMessage().substring(0, expectedLogoutMessage.length());
        Assert.assertEquals(actualLogoutMessage, expectedLogoutMessage);

        //4.11 Click on Continue button
        accountPage.clickOnLogoutMessageContinueButton();
    }

    }

