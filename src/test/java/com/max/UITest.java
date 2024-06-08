package com.max;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UITest extends UIAbstractTest{

    @Test
    void testGBNotEmailLogin() {


        loginPage.inputEmail("login");
        loginPage.inputPassword("password");
        loginPage.clickLoginButton();

        Assertions.assertFalse(loginPage.getNotLoginError().isEmpty());

    }

    @Test
    void testGBWithoutPassword() {

        loginPage.inputEmail("login@login.ru");
        loginPage.clickLoginButton();
    }

}
