package com.herokuapp.the_internet.testsuite;

import com.herokuapp.the_internet.pages.ForgotPasswordTest;
import com.herokuapp.the_internet.pages.Login;
import com.herokuapp.the_internet.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
//* Enter “Admin” username
//        * Enter “admin123 password
//        * Click on ‘LOGIN’ button
//        * Verify the ‘Welcome’ text is display

public class LoginPageTest extends TestBase {
    Login login=new Login();
    ForgotPasswordTest forgotPasswordTest=new ForgotPasswordTest();

    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials (){
        login.username("Admin");
        login.password("admin123");
        login.clickOnLogin();
        String expectedMessage="Welcome";
        String actualMessage=login.verifytheMessage();
        Assert.assertEquals(actualMessage,expectedMessage,"Welcome message is different");

    }
    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully(){


        String expectedMessage="LOGIN Panel\n" +
                "Forgot your password?";
        String actualMessage=forgotPasswordTest.varifyforgetPassword();

    }
}
