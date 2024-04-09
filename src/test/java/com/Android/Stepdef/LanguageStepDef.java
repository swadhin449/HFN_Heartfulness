package com.Android.Stepdef;


import com.Android.Pages.Language1;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LanguageStepDef {
    @When("^I click on language dropdown$")
    public void iClickOnLanguageDropdown() throws InterruptedException {
        new Language1().dropClick();
    }

    @When("^I click Hindi language$")
    public void iClickHindiLanguage() throws InterruptedException {
        new Language1().hindiLanguage();
    }
    @When("^Click on done$")
    public void clickOnDone() throws InterruptedException {
        new Language1().btnClick();

    }
    @When("^I click Telugu language$")
    public void iClickTeluguLanguage() throws InterruptedException {
        new Language1().teluguLanguage();
    }

    @When("^I click Gujarati language$")
    public void iClickGujaratiLanguage() throws InterruptedException {
        new Language1().gujuratiLanguage();
    }

    @When("^I click Tamil language$")
    public void iClickTamilLanguage() throws InterruptedException {
        new Language1().tamilLanguage();
    }

    @When("^I click Kannada language$")
    public void iClickKannadaLanguage() throws InterruptedException {
        new Language1().kannadaLanguage();

    }
    @When("^I click Marathi language$")
    public void iClickMarathiLanguage() throws InterruptedException {
        new Language1().marathiLanguage();
    }

    @When("Click on done1")
    public void clickOnDone1() throws InterruptedException {
        new Language1().btn1Click();
    }
    @When("Click on done2")
    public void clickOnDone2() throws InterruptedException {
        new Language1().btn2Click();
    }

    @When("Click on done3")
    public void clickOnDone3() throws InterruptedException {
        new Language1().btn3Click();
    }
    @When("Click on done4")
    public void clickOnDone4() throws InterruptedException {
        new Language1().btn4Click();
    }

    @Then("Click on done5")
    public void clickOnDone5() throws InterruptedException {
        new Language1().btn5Click();
    }


}
