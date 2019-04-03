package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.LoginPage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.RegisterPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;

public class RegisterSteps extends ScenarioSteps {

    RegisterPage registerPage;

    @When("^user type username as '(.*)'$")
    public void userTypeUsernameAs(String username) {
        registerPage.typeUsername(username);
    }

    @When("^user type nama toko as '(.*)'$")
    public void userTypeNamaTokoAs(String namaToko) {
        registerPage.typeNamaToko(namaToko);
    }

    @When("^user type nomor telefon as '(.*)'$")
    public void userTypeNomorTelefonAs(String telefon) {
        registerPage.typeTelefon(telefon);
    }

    @When("^user type kota as '(.*)'$")
    public void userTypeKotaAs(String kota) {
        registerPage.typeKota(kota);
    }

    @When("^user type password as '(.*)'$")
    public void userTypePasswordAs(String password) {
        registerPage.typePassword(password);
    }

    @Then("^user already registered$")
    public void userRegister() {
        registerPage.clickBtnSignUp();
    }

    @When("user type nama lengkap as '(.*)'")
    public void userTypeNamaLengkapAs(String namaLengkap) {
        registerPage.typeNamaLengkap(namaLengkap);
    }

    @When("user type email as '(.*)'")
    public void userTypeEmailAs(String email) {
        registerPage.typeEmail(email);
    }

    @Given("^user go to LoginActivity r$")
    public void userGoToLoginActivityR() {

    }

    @Then("^user click Register Button r$")
    public void userClickRegisterButtonR() {
        registerPage.clickBtnRegisterrr();
    }

    @Then("^user cant register$")
    public void userCantRegister() {
        registerPage.clickBtnSignUp();
        waitABit(10000L);
    }
}
