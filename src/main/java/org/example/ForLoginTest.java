package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ForLoginTest {
    private final static String URL = "https://ok.ru/";
    private final static String LOGIN = "technopol44";
    private final static String password = "technopolisPassword";
    @BeforeEach
    public void init(){

        new ForLogin(URL);
    }

    @Test
    public void authorized(){
        ForLogin loginPage = new ForLogin(URL);
        loginPage.enterLogin(LOGIN);
        loginPage.enterPassword(password);
        loginPage.clickLoginButton();
        yes();
    }
    public void yes(){
        Assertions.assertTrue(new VKpage().Checking.isDisplayed());

    }
}

