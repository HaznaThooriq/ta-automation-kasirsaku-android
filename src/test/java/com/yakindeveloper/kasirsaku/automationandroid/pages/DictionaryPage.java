package com.yakindeveloper.kasirsaku.automationandroid.pages;

import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.stream.Collectors;

public class DictionaryPage extends PageObject {
    @FindBy(id = "com.yakindeveloper.bukakasir:id/button_get_started")
    private WebElementFacade logoGetStarted;


   @FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
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

    public void clickLogo(){
        logoGetStarted.click();
    }

}