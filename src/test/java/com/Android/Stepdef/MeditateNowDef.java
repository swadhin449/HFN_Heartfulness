package com.Android.Stepdef;

import com.Android.Pages.MeditateNow;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class MeditateNowDef {
    @Given("Click on continue with google and select the google account")
    public void clickOnContinueWithGoogleAndSelectTheGoogleAccount() throws InterruptedException {
        new MeditateNow().cntwithgoogle();
    }
    @Given("User should able to see the meditate now options for fifteen thirty forty-five and others")
    public void userShouldAbleToSeeTheMeditateNowOptionsForFifteenThirtyFortyFiveAndOthers() {
        new MeditateNow().MeditationOptions();
    }
    @Given("Click on fifteen minutes option and click on meditate now button")
    public void ClickOnFifteenMinutesOptionAndClickOnMeditateNowButton() throws InterruptedException {
        new MeditateNow().Session();
    }
    @Given("Verify Settings option and change audio and background for meditation screen")
    public void verifySettingsOptionAndChangeAudioAndBackgroundForMeditationScreen() throws InterruptedException {
        new MeditateNow().MDNowOptions();
    }
    @Given("Click on share option and verify whether it can be shared or not")
    public void ClickOnShareOptionAndVerifyWhetherItCanBeSharedOrNot() throws InterruptedException {
        new MeditateNow().ShareOption();
    }
    @Given("verify star icon whether it is getting starred or not")
    public void verifyStarIconWhetherItIsGettingStarredOrNot() throws InterruptedException {
        new MeditateNow().starOption();
    }
    @Given("Verify closing the session")
    public void verifyClosingTheSession() throws InterruptedException {
        new MeditateNow().EndSession();
    }
    @Then("verify the summary screen with encourage message, meditated time, diary for note and close the session")
    public void verifyTheSummaryScreenWithEncourageMessageMeditatedTimeDiaryForNoteAndCloseTheSession() throws InterruptedException {
        new MeditateNow().SummaryScreen();
    }
    @Given("Click on Thirty minutes option and click on meditate now button")
    public void ClickOnThirtyMinutesOptionAndClickOnMeditateNowButton() throws InterruptedException {
        new MeditateNow().thirty();
    }
    @Then("Closing the session1")
    public void closingTheSession1() throws InterruptedException {
        new MeditateNow().ClosingSession();
    }
    @Given("Click on forty five minutes option and click on meditate now button")
    public void ClickOnFortyFiveMinutesOptionAndClickOnMeditateNowButton() throws InterruptedException {
        new MeditateNow().fortyfive();
    }
    @Then("Closing the session2")
    public void closingTheSession2() throws InterruptedException {
        new MeditateNow().ClosingSession1();
    }
    @Given("Click on others option and click on meditate now button")
    public void ClickOnOthersOptionAndClickOnMeditateNowButton() throws InterruptedException {
        new MeditateNow().OTHER();
    }
    @Then("Closing the session3")
    public void closingTheSession3() throws InterruptedException {
        new MeditateNow().ClosingSession2();
    }


}
