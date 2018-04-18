package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.DictionaryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AppsSteps {

    DictionaryPage dictionaryPage;

    @Given("^user open$")
    public void userOpenKasirsaku() throws Throwable {
        dictionaryPage.openApk();
    }


    @Then("^logo will appear$")
    public void logoKasirsakuWillAppear() throws Throwable {
       dictionaryPage.logo();
    }

    @When("^user click logo get started$")
    public void userClickLogoGetStarted() throws Throwable {
      dictionaryPage.clickLogo();
    }

    @Then("^button login is displayed$")
    public void buttonLoginIsDisplayed() throws Throwable {
        dictionaryPage.btnLogin();
    }

    @When("^user click login button$")
    public void userClickLoginButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @When("^user type username and password$")
    public void userTypeUsernameAndPassword() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^user already login$")
    public void userAlreadyLogin() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
