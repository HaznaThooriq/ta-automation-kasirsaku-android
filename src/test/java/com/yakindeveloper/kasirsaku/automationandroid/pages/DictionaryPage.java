package com.yakindeveloper.kasirsaku.automationandroid.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class DictionaryPage extends PageObject {
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.Button")
    private WebElementFacade logoGetStarted;


    @FindBy(name = "search")
    private WebElementFacade searchTerms;

    @FindBy(name = "go")
    private WebElementFacade lookupButton;

    public void enter_keywords(String keyword) {
        //searchTerms.type(keyword);
    }

    public void lookup_terms() {
        lookupButton.click();
    }

    public void logo2() {
        System.out.println("success");
    }

    public void logo() {
        System.out.println("test");
        logoGetStarted.isDisplayed();
        System.out.println("123");
    }

    public void clickLogo() {
        logoGetStarted.click();
    }

}