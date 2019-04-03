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

    @FindBy(id = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout[2]/android.widget.ImageView")
    private WebElementFacade btnSearch;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_checkout")
    private WebElementFacade btnCheckout;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/actv_dialog_keranjang")
    private WebElementFacade fieldSearchAddToCart;

    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_ke_keranjang_dialog")
    private WebElementFacade btnAddToCart;

    
}