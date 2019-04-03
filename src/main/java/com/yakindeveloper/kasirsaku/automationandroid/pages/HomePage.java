package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class HomePage extends PageObject {
    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_barang")
    private WebElementFacade logoBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/cardview_barang")
    private WebElementFacade cardViewBarang;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_pembelian")
    private WebElementFacade logoPembelian;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_pulsa")
    private WebElementFacade logoPulsa;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_paketdata")
    private WebElementFacade logoPaketData;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_pelanggan")
    private WebElementFacade logoPelanggan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_toko")
    private WebElementFacade logoToko;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_supplier")
    private WebElementFacade logoSupplier;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_tagihan")
    private WebElementFacade logoTagihan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/img_token")
    private WebElementFacade logoToken;

    public void clickBarang(){
        waitABit(10000);
        cardViewBarang.click();
    }

    public void clickPembelian(){
        logoPembelian.click();
    }

    public void clickPulsa(){
        logoPulsa.click();
    }

    public void clickPaketData(){
        logoPaketData.click();
    }

    public void clickPelanggan(){
        logoPelanggan.click();
    }

    public void clickToko(){
        logoToko.click();
    }

    public void clickSupplier(){
        logoSupplier.click();
    }

    public void clickTagihan(){
        logoTagihan.click();
    }

    public void clickToken(){
        logoToken.click();
    }
}