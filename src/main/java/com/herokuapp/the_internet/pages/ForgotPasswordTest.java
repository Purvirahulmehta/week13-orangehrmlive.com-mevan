package com.herokuapp.the_internet.pages;
//1. userShouldNavigateToForgotPasswordPageSuccessfully
//        * click on the ‘Forgot your password’ link
//        * Verify the text ‘Forgot Your Password?’


import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordTest extends Utility {
    By varifyText =By.xpath("//a[contains(text(),'Forgot your password?')]");
    public String varifyforgetPassword (){
        return getTextFromElement(varifyText);

    }

}
