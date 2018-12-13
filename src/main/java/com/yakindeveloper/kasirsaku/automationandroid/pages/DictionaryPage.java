package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DictionaryPage extends PageObject {
    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_get_started")
    private WebElementFacade logoGetStarted;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_email_login")
    private WebElementFacade fieldEmail;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_password_login")
    private WebElementFacade fieldPassword;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_login_welcome")
    private WebElementFacade btnLogin;


    public void openApk() {
        System.out.println("success");
    }

    public void logo() {
    }

    public void clickLogo() {
        /*System.out.println("lili");
        logoGetStarted.click();
        System.out.printf("LALA");
        waitABit(1000L);*/
        fieldEmail.click();
        fieldEmail.sendKeys("kasir_saku");
        fieldPassword.sendKeys("kasir_saku");
        /*typeInto(fieldEmail, "kasir_saku");
        fieldPassword.click();
        typeInto(fieldPassword, "kasir_saku");*/
    }

    public void btnLogin(){
        btnLogin.isDisplayed();
        waitABit(1000L);
        btnLogin.click();
    }

}