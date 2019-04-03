package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class PelangganPage extends PageObject {

    @FindBy(id = "com.yakindeveloper.bukakasir:id/fab_scan_bardode")
    private WebElementFacade btnAddPelanggan;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    private WebElementFacade btnDeletePelanggan;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElementFacade fieldpelanggan1;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageButton[1]")
    private WebElementFacade fieldSms1;

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageButton[2]")
    private WebElementFacade fieldTelepon1;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_pelanggan_username")
    private WebElementFacade fieldUsernamePelanggan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_pelanggan_nama")
    private WebElementFacade fieldNamaPelanggan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_pelanggan_alamat")
    private WebElementFacade fieldAlamat;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_pelanggan_nomor")
    private WebElementFacade fieldNomorPelanggan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_add_pelanggan")
    private WebElementFacade btnAddNewPelanggan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_hutang_pelanggan")
    private WebElementFacade fieldDetailHutang;

    public void typeUsername(){
        fieldUsernamePelanggan.sendKeys("lalala");
    }

    public void typeNama(){
        fieldNamaPelanggan.sendKeys("lili");
    }

    public void typeAlamat(){
        fieldAlamat.sendKeys("alamat123");
    }

    public void typeTelepon(){
        fieldNomorPelanggan.sendKeys("123456789");
    }



    
}