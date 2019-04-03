package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PaketDataPage extends PageObject {

    @FindBy(id = "com.yakindeveloper.bukakasir:id/tv_nomor_hp_pulsa")
    private WebElementFacade fieldNomerTelefon;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/imgbtn_logo_kontak")
    private WebElementFacade fieldKontak;


    
}