package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageView")
    private WebElementFacade logoLogin;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_email_login")
    private WebElementFacade fieldEmail;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_password_login")
    private WebElementFacade fieldPassword;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_login")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")
    private WebElementFacade logoKasirsakuHomeActivity;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/tv_daftar")
    private WebElementFacade btnRegister;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/tv_lupa_password")
    private WebElementFacade btnLupaPassword;


    public boolean logoLoginIsDisplayed() {
        return logoLogin.isVisible();
    }
    public boolean logoKasirsakuIsDisplayed() {
        return logoKasirsakuHomeActivity.isVisible();
    }

    public void typeUsernamePassword(String username, String password){
        fieldEmail.sendKeys("kasir_saku");
        fieldPassword.sendKeys("kasir_saku");
    }
    public void clickBtnLogin(){
        btnLogin.isVisible();
        btnLogin.click();
        waitABit(1000L);
    }

    public void clickBtnRegister(){
        btnRegister.click();
        waitABit(1000L);
    }
}