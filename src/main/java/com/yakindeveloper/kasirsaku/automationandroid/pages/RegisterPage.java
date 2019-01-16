package com.yakindeveloper.kasirsaku.automationandroid.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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


    @FindBy(id = "com.yakindeveloper.bukakasir:id/tv_daftar")
    private WebElementFacade btnRegister;

    public void typeUsername(String username){
        fieldUsername.sendKeys(username);
    }

    public void typePassword(String password){
        fieldPassword.sendKeys(password);
    }

    public void typeNamaLengkap(String namalengkap){
        fieldNamaLengkap.sendKeys(namalengkap);
    }

    public void typeNamaToko(String namaToko){
        fieldNamaToko.sendKeys(namaToko);
    }

    public void typeKota(String kota){
        fieldKota.sendKeys(kota);
    }

    public void typeTelefon(String telefon){
        fieldNomorTelepon.sendKeys(telefon);
    }

    public void typeEmail(String email){
        fieldEmail.sendKeys(email);
    }

    public void clickBtnSignUp(){
        btnSignUp.click();
        waitABit(1000L);
    }

    public void clickBtnRegisterrr(){
        btnRegister.click();
        waitABit(1000L);
    }
}