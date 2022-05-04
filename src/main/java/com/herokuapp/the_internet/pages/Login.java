package com.herokuapp.the_internet.pages;
//1. userSholdLoginSuccessfullyWithValidCredentials
//
//        * Enter “Admin” username
//        * Enter “admin123 password
//        * Click on ‘LOGIN’ button
//        * Verify the ‘Welcome’ text is display

import com.herokuapp.the_internet.utility.Utility;
import org.openqa.selenium.By;

public class Login extends Utility {
    By UsernameLink=By.xpath("//input[@id='txtUsername']");
    By Password=By.xpath("//input[@id='txtPassword']");
    By Login=By.xpath("//input[@id='btnLogin']");
    By WelcomeMessage=By.xpath("//a[@id='welcome']");


    public void username(String textUserName) {
        sendTextToElement(UsernameLink, textUserName);
    }
    public void password(String textPassword){
        sendTextToElement(Password,textPassword);
    }
    public void clickOnLogin(){
        clickOnElement(Login);
    }
    public String verifytheMessage(){
        return getTextFromElement(WelcomeMessage);
    }
}
