package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.DictionaryPage;
import com.yakindeveloper.kasirsaku.automationandroid.steps.serenity.EndUserSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AppsSteps {
    @Steps
    EndUserSteps anna;

    @Given("^user open$")
    public void userOpenKasirsaku() throws Throwable {
        anna.logo();
    }


    @Then("^logo will appear$")
    public void logoKasirsakuWillAppear() throws Throwable {
        anna.logo();
    }

    @When("^user click logo get started$")
    public void userClickLogoGetStarted() throws Throwable {
       anna.clickLogo();
    }
}
