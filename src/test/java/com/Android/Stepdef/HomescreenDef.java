package com.Android.Stepdef;

import com.Android.Pages.Homescreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomescreenDef {
    @When("I Click on continue with google and select the google account1")
    public void click_on_continue_with_google_and_select_the_google_account1() throws InterruptedException {
        new Homescreen().cntwithgoogle();
    }
    @Given("verify the username is displayed or not")
    public void verifyTheUsernameIsDisplayedOrNot() throws InterruptedException {
        new Homescreen().USname();
    }
    @Given("select any one language and verify whether the language is changed or not")
    public void selectAnyOneLanguageAndVerifyWhetherTheLanguageIsChangedOrNot() throws InterruptedException {
        new Homescreen().changelanguage();
    }
    @Given("click on profile screen and verify whether the profile screen is displayed or not")
    public void clickOnProfileScreenAndVerifyWhetherTheProfileScreenIsDisplayedOrNot() throws InterruptedException {
        new Homescreen().ProfileScreen();
    }
    @Given("click on mood meter and verify whether mood meter screen is displayed or not")
    public void clickOnMoodMeterAndVerifyWhetherMoodMeterScreenIsDisplayedOrNot() throws InterruptedException {
        new Homescreen().MoodMeter();
    }
    @Given("verify fifteen, thirty, forty-five, other meditation options are displayed or not")
    public void verifyOtherMeditationOptionsAreDisplayedOrNot() throws InterruptedException {
        new Homescreen().MedidationOptions();
    }
    /*@Given("Verify meditate with trainer")
    public void verifyMeditateWithTrainer() throws InterruptedException {
        new Homescreen().Meditatewithtrainer();
    }*/
    /*@Given("verify recommendations is displayed or not")
    public void verifyRecommendationsIsDisplayedOrNot() throws InterruptedException {
        new Homescreen().Recommendations();
    }*/
    @Given("verify meditations section")
    public void verifyMeditationsSection() throws InterruptedException {
        new Homescreen().scrolldownMeditations();
    }
    /*@Given("verify daaji wisdom bridge book is displayed or not")
    public void verifyDaajiWisdomBridgeBookCanBeOrderedOrNot() throws InterruptedException {
        new Homescreen().daajiWb();
    }*/
    @Given("verify self development section")
    public void verifySelfDevelopmentSection() throws InterruptedException {
        new Homescreen().SelfDevelopment();
    }
    @Given("verify donate section is displayed or not")
    public void verifyDonateSectionIsDisplayedOrNot() throws InterruptedException {
        new Homescreen().Donation();
    }
    @Given("verify feedback option")
    public void verifyFeedbackOption() throws InterruptedException {
        new Homescreen().FeedBack();
    }
    @Given("verify about Heartfulness")
    public void verifyAboutHeartfulness() throws InterruptedException {
        new Homescreen().About();
    }
    @Given("verify goals tab")
    public void verifyGoalsTab() throws InterruptedException {
        new Homescreen().Goals();
    }
    @Given("Verify connect tab")
    public void verifConnectTab() throws InterruptedException {
        new Homescreen().Connect();
    }
    @Then("verify discover tab")
    public void verifyDiscoverTab() throws InterruptedException {
        new Homescreen().Discover();
    }
 //---------------------------------------------------------------------------------------------------------------------

    @Given("I select meditate button and select 30min and click on meditate now")
    public void iSelectMeditateButtonAndSelect30minAndClickOnMeditateNow() throws InterruptedException {
        new Homescreen().clickonPurpleButton();
    }

    @Given("I verify title of the session")
    public void iVerifyTitleOfTheSession() throws InterruptedException {
        new Homescreen().VerifyTittle();
    }

    /*@Given("I click on pause button to stop the audio")
    public void iClickOnPauseButtonToStopTheAudio() throws InterruptedException {
        new Homescreen().playButton();
    }

    *//*@Given("I click on settings option and select one background and sound and click on save")
    public void iClickOnSettingsOptionAndSelectOneBackgroundAndSoundAndClickOnSave() throws InterruptedException {
        new Homescreen().SelectBackground();
    }*//*

    @Given("I verify share option")
    public void iVerifyShareOption() throws InterruptedException {
        new Homescreen().ShareOption();
    }

    @Given("I verify making the audio clip star item")
    public void iVerifyMakingTheAudioClipStarItem() throws InterruptedException {
        new Homescreen().MakingStar();
    }*/

    @Then("Click on end session and verify the summary screen and close the session")
    public void clickOnEndSessionAndVerifyTheSummaryScreenAndCloseTheSession() throws InterruptedException {
        new Homescreen().CloseSession();
    }
    //------------------------------------------------------------------------------------------------------------------
    @When("I Click on continue with google and select the google account3")
    public void clickOnContinueWithGoogleAndSelectTheGoogleAccount3() throws InterruptedException {
        new Homescreen().cntwithgoogle();
    }

    @Given("I click on connect tab then connect tab is displayed by verifying tittle")
    public void iClickOnConnectTabThenConnectTabIsDisplayedByVerifyingTittle() throws InterruptedException {
        new Homescreen().Connect1();
    }

    @Given("I verify My Circle title is displayed or not")
    public void iVerifyMyCircleTitleIsDisplayedOrNot() throws InterruptedException {
        new Homescreen().myCircleCard();
    }

    @Given("I verify About My circle")
    public void iVerifyAboutMyCircle() throws InterruptedException {
        new Homescreen().AboutMycircles();
    }

    @Given("I click on create meditation session and verify title and enter description")
    public void iClickOnCreateMeditationSessionAndVerifyTitleAndEnterDescription() throws InterruptedException {
        new Homescreen().creatingsession();
    }

    @Given("click on edit to change the meditation and confirm it")
    public void clickOnEditToChangeTheMeditationAndConfirmIt() throws InterruptedException {
        new Homescreen().changeVideo();
    }

    @Then("Verify whether the circle is created or not")
    public void verifyWhetherTheCircleIsCreatedOrNot() throws InterruptedException {
        new Homescreen().VerifyMyCircle();
    }
}
