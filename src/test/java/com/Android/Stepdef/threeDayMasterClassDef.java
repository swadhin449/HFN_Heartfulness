package com.Android.Stepdef;

import com.Android.Pages.threeDayMasterCLass;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class threeDayMasterClassDef {
    @When("Click on continue with google and select the google  account")
    public void clickOnContinueWithGoogleAndSelectTheGoogleAccount() throws InterruptedException {
        new threeDayMasterCLass().cntwithgoogle();
    }
    @When("I open the three-day master class feature")
    public void iOpenTheThreeDayMasterClassFeature() throws InterruptedException {
        new threeDayMasterCLass().threedaymasterclass();
    }
    @When("Verify three-day master class screen")
    public void verifyThreeDayMasterClassScreen() throws InterruptedException {
        new threeDayMasterCLass().threedaymasterclassscreen();
    }
    @When("Click on the share link and verify")
    public void clickOnTheShareLinkAndVerify() throws InterruptedException {
        new threeDayMasterCLass().deeplink();
    }
    @When("Click on introduction video")
    public void clickOnIntroductionVideo() throws InterruptedException {
        new threeDayMasterCLass().intro();
    }
    @When("Verify video is playing by clicking on media button")
    public void verifyVideoIsPlayingByClickingOnMediaButton() throws InterruptedException {
        new threeDayMasterCLass().mediabuttons();
    }
    @When("Click on close button and verify buttons")
    public void clickOnCloseButtonAndVerifyButtons() throws InterruptedException {
        new threeDayMasterCLass().popupbuttons();
    }
    @When("Verify summary screen")
    public void verifySummaryScreen() throws InterruptedException {
        new threeDayMasterCLass().Summaryscreen();
    }
    @When("Click on day-one video and verify whether it is playing by clicking on media button")
    public void clickOnDayOneVideoAndVerifyWhetherItIsPlayingByClickingOnMediaButton() throws InterruptedException {
        new threeDayMasterCLass().dayonemedia();
    }
    @When("Close the day-one session")
    public void closeTheDayOneSession() throws InterruptedException {
        new threeDayMasterCLass().end();
    }
    @Then("Exit from the three-day master class screen")
    public void exitFromTheThreeDayMasterClassScreen() throws InterruptedException {
        new threeDayMasterCLass().Exit();
    }

}
