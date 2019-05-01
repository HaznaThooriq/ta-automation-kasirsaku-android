package com.yakindeveloper.kasirsaku.automationandroid.pages;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.TouchAction;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import java.time.Duration;

public class PembelianPage extends PageObject {
    @FindBy(id = "id\tcom.yakindeveloper.bukakasir:id/fab_scan_bardode")
    private WebElementFacade btnScanBarcode ;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/et_total_bayar_pelanggan")
    private WebElementFacade fieldTotalBayarPelanggan;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_bayar_belanja")
    private WebElementFacade btnBayarPelangan;

    @FindBy(id = "android:id/button1")
    private WebElementFacade btnOKPembelianBerhasil;

    @FindBy(id ="com.yakindeveloper.bukakasir:id/btn_selesai__chekout")
    private WebElementFacade btnSelesaiPembelian;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    private WebElementFacade btnSearch;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_checkout")
    private WebElementFacade btnCheckout;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/actv_dialog_keranjang")
    private WebElementFacade fieldSearchAddToCart;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_ke_keranjang_dialog")
    private WebElementFacade btnAddToCart;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[1]")
    private WebElementFacade fieldBarangMarjan;

    public void clickBtnSearch(){
        btnSearch.click();
    }

    public void typeSearchBarang(){
        fieldSearchAddToCart.click();
        fieldBarangMarjan.click();
    }

    public void clickBtnAdToCart(){
        btnAddToCart.click();
    }

    public void clickBtnCheckout(){
        btnCheckout.click();
    }

    public void typeBayarPelanggan(){
        fieldTotalBayarPelanggan.type("2500");
    }

    public void clickBtnBayar(){
        btnBayarPelangan.click();
    }

    public void clickBtnOkPembayaran(){
        btnOKPembelianBerhasil.click();
    }

    public void clickBtnSelesai(){
        btnSelesaiPembelian.click();
    }
    
}