package com.Android.Stepdef;
import com.Android.Pages.DiscoverTab;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DiscoverTabDef {
    @When("I Click on continue with google and select the google account")
    public void iClickOnContinueWithGoogleAndSelectTheGoogleAccount() throws InterruptedException {
        new DiscoverTab().cntwithgoogle();
    }
    @When("Navigate to Discover Tab")
    public void navigateToDiscoverTab() throws InterruptedException {
        new DiscoverTab().GotoDiscoverTab();
    }
    @When("Click on Meditations option and verify meditations are displayed or not")
    public void clickOnMeditationsOptionAndVerifyMeditationsAreDisplayedOrNot() throws InterruptedException {
        new DiscoverTab().Meditations();
    }
    @When("Verify Core Practices")
    public void verifyCorePractices() throws InterruptedException {
        new DiscoverTab().CorePractices();
    }
    @When("Verify For Better Sleep")
    public void verifyForBetterSleep() throws InterruptedException {
        new DiscoverTab().ForBetterSleep();
    }
    @When("Verify Expand Consciousness")
    public void verifyExpandConsciousness() throws InterruptedException {
        new DiscoverTab().ExpandConsciousness();
    }
    @When("Verify For World Peace")
    public void verifyForWorldPeace() throws InterruptedException {
        new DiscoverTab().ForWorldPeace();
    }
    @When("Verify Develop Focus")
    public void verifyDevelopFocus() throws InterruptedException {
        new DiscoverTab().DevelopFocus();
    }
    @When("Verify Sense of Calmness")
    public void verifySenseOfCalmness() throws InterruptedException {
        new DiscoverTab().SenseOfCalmness();
    }
    @When("Verify Attain inner Peace")
    public void verifyAttainInnerPeace() throws InterruptedException {
        new DiscoverTab().AttainInnerPeace();
    }
    @When("Verify For Emotional Balance")
    public void verifyForEmotionalBalance() throws InterruptedException {
        new DiscoverTab().ForEmotionalBalance();
    }
    @Then("Verify Feel Rejuvenated")
    public void verifyFeelRejuvenated() throws InterruptedException {
        new DiscoverTab().FeelRejuvenated();
    }
    @When("Click on Diary and verify its functionality")
    public void clickOnDiaryAndVerifyItsFunctionality() throws InterruptedException {
        new DiscoverTab().Diary();
    }
    @Then("Add one New Diary and verify")
    public void addOneNewDiaryAndVerify() throws InterruptedException {
        new DiscoverTab().AddDiary();
    }
    @Then("Click on MoodMeter and verify its functionality")
    public void clickOnMoodMeterAndVerifyItsFunctionality() throws InterruptedException {
        new DiscoverTab().MoodMeter();
    }
    @Then("Click on Donate and verify its fields")
    public void clickOnDonateAndVerifyItsFields() throws InterruptedException {
        new DiscoverTab().Donate();
    }
    @Then("Verify Achievements page and its functionality")
    public void verifyAchievementsPageAndItsFunctionality() throws InterruptedException {
        new DiscoverTab().Achievements();
    }
    @Then("Verify Resources page and its functionality")
    public void verifyResourcesPageAndItsFunctionality() throws InterruptedException {
        new DiscoverTab().Resources();
    }
    @Then("Verify Self development page and its functionality")
    public void verifySelfDevelopmentPageAndItsFunctionality() throws InterruptedException {
        new DiscoverTab().SelfDevelopment();
    }
    @When("Click on Events")
    public void clickOnEvents() throws InterruptedException {
        new DiscoverTab().EventsTab();
    }
    @When("Click on Scheduled events and verify")
    public void clickOnScheduledEventsAndVerify() throws InterruptedException {
        new DiscoverTab().ScheduledEvents();
    }
    @When("Click on My Registrations and verify")
    public void clickOnMyRegistrationsAndVerify() throws InterruptedException {
        new DiscoverTab().MyRegistrations();
    }
    @When("Click on Key Locations and verify")
    public void clickOnKeyLocationsAndVerify() throws InterruptedException {
        new DiscoverTab().KeyLocations();
    }
    @When("Click on Announcements and verify")
    public void clickOnAnnouncementsAndVerify() throws InterruptedException {
        new DiscoverTab().Announcements();
    }
    @When("Click on Share my location and verify")
    public void clickOnShareMyLocationAndVerify() throws InterruptedException {
        new DiscoverTab().ShareMyLocation();
    }
    @When("Click on Lost and Found and verify")
    public void clickOnLostAndFoundAndVerify() throws InterruptedException {
        new DiscoverTab().LostAndFound();
    }
    @When("Click on Donate and verify")
    public void clickOnDonateAndVerify() throws InterruptedException {
        new DiscoverTab().ETDonate();
    }
    @When("Click on About Kanha and verify")
    public void clickOnAboutKanhaAndVerify() throws InterruptedException {
        new DiscoverTab().AboutKanha();
    }
    @When("Click on Essential Services and verify")
    public void clickOnEssentialServicesAndVerify() throws InterruptedException {
        new DiscoverTab().EssentialService();
    }
    @When("Click on Masters Message and verify")
    public void clickOnMastersMessageAndVerify() throws InterruptedException {
        new DiscoverTab().MastersMessage();
    }
    @When("Click on Free Wifi and Verify")
    public void clickOnFreeWifiAndVerify() throws InterruptedException {
        new DiscoverTab().FreeWifi();
    }
    @When("Click on Golden book check-in and verify")
    public void clickOnGoldenBookCheckInAndVerify() throws InterruptedException {
        new DiscoverTab().GoldenBook();
    }
    @When("Click on Report an issue and verify")
    public void clickOnReportAnIssueAndVerify() throws InterruptedException {
        new DiscoverTab().ReportAnIssue();
    }
    @When("Click on Suggestions and verify")
    public void clickOnSuggestionsAndVerify() throws InterruptedException {
        new DiscoverTab().Suggestions();
    }
    @Then("Click on Archives and verify")
    public void clickOnArchivesAndVerify() throws InterruptedException {
        new DiscoverTab().Archives();
    }

}
