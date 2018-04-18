package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DictionaryPage extends PageObject {
    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_get_started")
    private WebElementFacade logoGetStarted;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_login_welcome")
    private WebElementFacade btnLogin;


    public void openApk() {
        System.out.println("success");
    }

    public void logo() {
        System.out.println("test");
        logoGetStarted.isDisplayed();
        System.out.println("123");
    }

    public void clickLogo() {
        logoGetStarted.click();
        waitABit(1000L);
    }

    public void btnLogin(){
        btnLogin.isDisplayed();
        waitABit(1000L);
        btnLogin.click();
    }

}