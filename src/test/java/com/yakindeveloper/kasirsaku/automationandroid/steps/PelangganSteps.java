package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.PelangganPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class PelangganSteps extends ScenarioSteps {
    @Autowired
    PelangganPage pelangganPage;

    @Given("^user type username pelanggan$")
    public void userTypeUsernamePelanggan() {
        pelangganPage.typeUsername();
    }

    @Then("^user type nama pelanggan$")
    public void userTypeNamaPelanggan() {
        pelangganPage.typeNama();
    }

    @Then("^user type alamat pelanggan$")
    public void userTypeAlamatPelanggan() {
        pelangganPage.typeAlamat();
    }

    @Then("^user type telepon pelanggan$")
    public void userTypeTeleponPelanggan() {
        pelangganPage.typeTelepon();
    }

    @And("^user click button add pelanggan$")
    public void userClickButtonAddPelanggan() {
    }
}
