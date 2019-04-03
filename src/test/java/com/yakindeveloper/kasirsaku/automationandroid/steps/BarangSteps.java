package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.BarangPage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.HomePage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class BarangSteps extends ScenarioSteps {
    @Autowired
    BarangPage barangPage;

    @Then("^user click button Add$")
    public void userClickButtonAdd() {
        barangPage.clickAddButton();
    }

    @Given("^user type nama barang$")
    public void userTypeNamaBarang() {
        barangPage.typeNamaBarang();
    }

    @Then("^user type stock barang$")
    public void userTypeStockBarang() {
        barangPage.typeStockBarang();
    }

    @Then("^user type harga satuan barang$")
    public void userTypeHargaSatuanBarang() {
        barangPage.typeHargaSatuanBarang();
    }

    @Then("^user type harga supplier barang$")
    public void userTypeHargaSupplierBarang() {
        barangPage.typeHargaSupplierBarang();
    }

    @Then("^user type scan barcode$")
    public void userTypeScanBarcode() {
        barangPage.typeScanBarcode();
    }

    @And("^user click button add barang$")
    public void userClickButtonAddBarang() {
    }

    @Given("^user longpress barang$")
    public void userLongpressBarang() {
        barangPage.longpressTehPucuk();
    }
}
