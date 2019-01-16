package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.DictionaryPage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {

    LoginPage loginPage;

    @Given("^user go to LoginActivity$")
    public void userGoToLoginActivity() {
        loginPage.logoLoginIsDisplayed();
    }

    @When("^user type username as '(.*)' and password as '(.*)'$")
    public void userTypeUsernameAndPassword(String username, String password) {
        loginPage.typeUsernamePassword(username, password);
        loginPage.clickBtnLogin();
    }

    @Then("^user login as kasir saku$")
    public void userLoginAsKasirSaku() {
        loginPage.logoKasirsakuIsDisplayed();
    }

    @Then("^user cant login as kasir saku$")
    public void userCantLoginAsKasirSaku() {

    }

    @Then("^user click Register Button$")
    public void userClickRegisterButton() {
        loginPage.clickBtnRegister();
    }
}
