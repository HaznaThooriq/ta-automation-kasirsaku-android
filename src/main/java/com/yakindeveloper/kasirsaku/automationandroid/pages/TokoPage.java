package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class TokoPage extends PageObject {
    @FindBy(id = "com.yakindeveloper.bukakasir:id/btn_logout")
    private WebElementFacade btnLogout;


    @FindBy(xpath = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"HUTANG\"]")
    private WebElementFacade btnHutang;

    @FindBy(id = "//android.support.v7.app.ActionBar.Tab[@content-desc=\"PROFIL\"]")
    private WebElementFacade btnProfil;

    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v4.view.ViewPager/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.TextView[2]")
    private WebElementFacade fieldLunasi1;
    
}