package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class SupplierPage extends PageObject {

    @FindBy(id = "com.yakindeveloper.bukakasir:id/fab_scan_bardode")
    private WebElementFacade btnAddSupplier;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    private WebElementFacade btnDeleteSupplier;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout")
    private WebElementFacade fieldSupplier1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageButton[1]")
    private WebElementFacade fieldEmail1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageButton[2]")
    private WebElementFacade fieldSMS1;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ImageButton[3]")
    private WebElementFacade fieldTelepon1;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_Supplier_username")
    private WebElementFacade fieldUsernameSupplier;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_Supplier_nama")
    private WebElementFacade fieldNamaSupplier;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_Supplier_alamat")
    private WebElementFacade fieldAlamatSupplier;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_supplier_email")
    private WebElementFacade fieldEmailSupplier;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_add_Supplier_nomor")
    private WebElementFacade fieldTeleponSupplier;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_add_Supplier")
    private WebElementFacade btnAddNewSupplier;

    public void typeUsername(){
        fieldUsernameSupplier.sendKeys("usernameSupplier");
    }

    public void typeNamaSupplier(){
        fieldNamaSupplier.sendKeys("NamaSupplier");
    }

    public void typeAlamatSupplier(){
        fieldAlamatSupplier.sendKeys("AlamatSupplier");
    }

    public void typeEmailSupplier(){
        fieldEmailSupplier.sendKeys("EmailSupplier");
    }

    public void typeTelepon(){
        fieldTeleponSupplier.sendKeys("09182763729");
    }

    
}