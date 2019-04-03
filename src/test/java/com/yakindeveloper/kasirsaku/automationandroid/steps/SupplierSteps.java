package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.BarangPage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.HomePage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.SupplierPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class SupplierSteps extends ScenarioSteps {
    @Autowired
    SupplierPage supplierPage;

    @Given("^user type username supplier$")
    public void userTypeUsernameSupplier() {
        supplierPage.typeUsername();
    }

    @When("^user type nama supplier$")
    public void userTypeNamaSupplier() {
        supplierPage.typeNamaSupplier();
    }

    @Then("^user type alamat supplier$")
    public void userTypeAlamatSupplier() {
        supplierPage.typeAlamatSupplier();
    }

    @Then("^user type email supplier$")
    public void userTypeEmailSupplier() {
        supplierPage.typeEmailSupplier();
    }


    @Then("^user click button add supplier$")
    public void userClickButtonAddSupplier() {
    }

    @Then("^user type telepon supplier$")
    public void userTypeTeleponSupplier() {
        supplierPage.typeTelepon();
    }
}
