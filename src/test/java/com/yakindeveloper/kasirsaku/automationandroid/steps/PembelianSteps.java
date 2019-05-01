package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.BarangPage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.HomePage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.PembelianPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class PembelianSteps extends ScenarioSteps {
    @Autowired
    PembelianPage pembelianPage;

    @Given("^user click btn search$")
    public void userClickBtnSearch() {
        pembelianPage.clickBtnSearch();
    }

    @When("^user type barang$")
    public void userTypeBarang() {
        pembelianPage.typeSearchBarang();
    }

    @Then("^user click btn Add To Cart$")
    public void userClickBtnAddToCart() {
        pembelianPage.clickBtnAdToCart();
    }

    @Then("^user click btn Checkout$")
    public void userClickBtnCheckout() {
        pembelianPage.clickBtnCheckout();
    }

    @And("^user type total bayar pelanggan$")
    public void userTypeTotalBayarPelanggan() {
        pembelianPage.typeBayarPelanggan();
    }

    @Then("^user click btn bayar$")
    public void userClickBtnBayar() {
        pembelianPage.clickBtnBayar();
    }

    @And("^user click btn Ok$")
    public void userClickBtnOk() {
        pembelianPage.clickBtnOkPembayaran();
    }

    @Then("^user click btn Selesai$")
    public void userClickBtnSelesai() {
        pembelianPage.clickBtnSelesai();
    }
}
