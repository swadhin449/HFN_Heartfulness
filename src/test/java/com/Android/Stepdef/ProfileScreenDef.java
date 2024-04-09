package com.Android.Stepdef;

import com.Android.Pages.ProfileScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileScreenDef {
    @When("I Click continue with google and select the google account")
    public void clickContinueWithGoogleAndSelectTheGoogleAccount() throws InterruptedException {
        new ProfileScreen().cntwithgoogle();
    }
    @Given("Click on ProfileScreen")
    public void clickOnProfileScreenAndVerifyWhetherItIsDisplayedOrNot() throws InterruptedException {
        new ProfileScreen().Profile();
    }
    @Given("Click on settings option and verify")
    public void clickOnSettingsOptionAndVerifyWhetherItIsDisplayedOrNot() throws InterruptedException {
        new ProfileScreen().Settings();
    }
    @Given("Verify Log meditation and verify share option and view insights page")
    public void verifyingLogMeditationCardIsDisplayedOrNotAndVerifyingShareOptionAndViewInsightsOption() throws InterruptedException {
        new ProfileScreen().TotalMeditationTime();
    }
    @Given("Verify Achievements card and click on view all")
    public void verifyAchievementsCardAndClickOnViewAll() throws InterruptedException {
        new ProfileScreen().Achievements();
    }
    @Given("Verify Favourites card and its options")
    public void verifyFavouritesCardAndItsOptions() throws InterruptedException {
        new ProfileScreen().Favourites();
    }
    @Given("Click on Donate now will redirecting to donate page")
    public void clickOnDonateNowWillRedirectingToDonatePageAndVerifyDonatePage() throws InterruptedException {
        new ProfileScreen().Donatenow();
    }
    @Given("Verify invite a friend card")
    public void verifyInviteAFriendCard() throws InterruptedException {
        new ProfileScreen().Invitefriend();
    }
    @Given("Verify About Heartfulness Card in Profile page")
    public void verifyAboutHeartfulnessCardInProfilePage() throws InterruptedException {
        new ProfileScreen().AbtHrtfulness();
    }
    @Given("Verify Select Language card")
    public void verifySelectLanguageCard() throws InterruptedException {
        new ProfileScreen().SelectLanguage();
    }
    @Given("Verify Privacy Policy card")
    public void verifyPrivacyPolicyCard() throws InterruptedException {
        new ProfileScreen().PrivacyPolicy();
    }
    @Then("Verify Terms and Conditions Card")
    public void verifyTermsAndConditionsCard() throws InterruptedException {
       new ProfileScreen().TrmsCond();
    }
}
