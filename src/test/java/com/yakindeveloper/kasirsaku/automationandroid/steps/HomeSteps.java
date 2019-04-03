package com.yakindeveloper.kasirsaku.automationandroid.steps;

import com.yakindeveloper.kasirsaku.automationandroid.pages.BarangPage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.HomePage;
import com.yakindeveloper.kasirsaku.automationandroid.pages.LoginPage;
import cucumber.api.java.bs.A;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

public class HomeSteps extends ScenarioSteps {
    @Autowired
    HomePage homePage;

    @Autowired
    BarangPage barangPage;

    @When("^user click logo barang$")
    public void userClickLogoBarang(){
        homePage.clickBarang();
        barangPage.clickAddButton();
    }
}
