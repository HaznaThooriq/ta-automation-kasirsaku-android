package com.yakindeveloper.kasirsaku.automationandroid;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/KasirsakuAndroid", tags = "@PembelianHappyFlow")
//@CucumberOptions(features="src/test/resources/KasirsakuAndroid/Register.feature", tags = "@RegisterHappyFlow")
public class DefinitionTestSuite {
}