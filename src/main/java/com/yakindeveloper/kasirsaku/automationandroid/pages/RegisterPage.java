package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class RegisterPage extends PageObject {
    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_nama_orang_signup")
    private WebElementFacade fieldNamaLengkap;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_email_signup")
    private WebElementFacade fieldEmail;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_username_signup")
    private WebElementFacade fieldUsername;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_nama_toko_signup")
    private WebElementFacade fieldNamaToko;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_nomor_telepon_signup")
    private WebElementFacade fieldNomorTelepon;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_kota_signup")
    private WebElementFacade fieldKota;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_password_signup")
    private WebElementFacade fieldPassword;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_signup_register")
    private WebElementFacade btnSignUp;



}