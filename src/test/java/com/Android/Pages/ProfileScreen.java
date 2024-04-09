package com.Android.Pages;

import com.utils.DriverManager;
import com.utils.GlobalParams;
import com.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class ProfileScreen {
    private AppiumDriver driver;

    TestUtils utils = new TestUtils();

    public ProfileScreen(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }
    public void launchApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                break;
            case "iOS":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
        Thread.sleep(5000);
    }
    public void closeApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                Thread.sleep(5000);
                break;
            case "iOS":
                ((InteractsWithApps) driver).terminateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
    }

    public String continuewithgoogle = "//android.widget.ImageView[@content-desc=\"Continue with Google\"]";
    public String existinggoogleaccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout";
    public String profileScreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String settings = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String settingsRef = "//android.view.View[@content-desc=\"Settings\"]";
    public String MyprofileTittle = "//android.view.View[@content-desc=\"MY PROFILE\"]";
    public String MyprofileCard = "//android.view.View[@content-desc=\"Profile image, Name and Description\"]";
    public String Visiblebutton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[6]";
    public String VisibleOnlytome = "//android.view.View[@content-desc=\"Visible only to me\"]";
    public String VisibletoAll = "//android.view.View[@content-desc=\"Visible to all\"]";
    public String closeSettings = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String Profileimage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[1]";
    public String ProfileCard = "//android.widget.Button[@content-desc=\"Edit\n" +
            "Prasanth K\"]";
    public String TotalMeditationShareOption = "//android.widget.ImageView[@content-desc=\"Share\"]";
    public String ViewInsights = "//android.view.View[@content-desc=\"View Insights\"]";
    public String ViewInsightsTitle = "//android.view.View[@content-desc=\"Insights\"]";
    public String WeelTitle = "//android.widget.Button[@content-desc=\"Week\"]";
    public String leftArrow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[3]";
    public String rightArrow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[4]";
    public String LogmeditationShareOption = "//android.widget.ImageView[@content-desc=\"Share\"]";
    public String LogMeditation = "//android.widget.Button[@content-desc=\"Log Meditation\"]";
    public String LogMeditationTitle = "//android.view.View[@content-desc=\"Log Meditation\"]";
    public String DateandTimeTitle = "//android.view.View[@content-desc=\"Date and Time\"]";
    public String chooseDuration = "//android.view.View[@content-desc=\"30 min\"]";
    public String SubmitButton = "//android.widget.Button[@content-desc=\"Submit\"]";
    public String CustomDuration = "//android.view.View[@content-desc=\"Custom\"]";
    public String CustomTime = "//android.view.View[@content-desc=\"Custom Duration\"]/android.widget.EditText";
    public String cancelButton = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String AddButton = "//android.widget.Button[@content-desc=\"Add\"]";
    public String ConfirmMessage = "//android.view.View[@content-desc=\"The meditation time has been successfully logged.\"]";
    public String ViewInsightsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String AchievementsCard = "//android.widget.ImageView[@content-desc=\"Achievements\"]";
    public String view = "View All";
    public String AchivementsTitle = "//android.view.View[@content-desc=\"Achievements\"]";
    public String AboutAchievements = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]";
    public String AboutAchievementsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    public String ShareAchivements = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String ShareCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String AchievementsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
   /* public String Me = "//android.view.View[@content-desc=\"Me\"]";
    public String ChangeUsername = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[1]/android.widget.EditText[1]";
    public String Gender = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[1]/android.view.View[3]";
    public String Male = "//android.widget.Button[@content-desc=\"Male\"]";
    public String Location = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View/android.widget.EditText[2]";*/
    public String Favourites = "//android.view.View[@content-desc=\"Favourites\"]";
    public String Meditations = "//android.view.View[@content-desc=\"Meditations\n" +
            "Tab 2 of 4\"]";
    public String Videos = "//android.view.View[@content-desc=\"Videos\n" +
            "Tab 3 of 4\"]";
    public String Articles = "//android.view.View[@content-desc=\"Articles\n" +
            "Tab 4 of 4\"]";
    public String FavouritesBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String Donatenow = "//android.widget.Button[@content-desc=\"Donate now\"]";
    public String DonatenowBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String inviteAFriend = "//android.widget.Button[@content-desc=\"Invite a friend\"]";
    public String inviteCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String AboutHeartfulnessProfileScreen = "//android.view.View[@content-desc=\"About \n" +
            "Heartfulness\"]";
    public String AHPSBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String Language = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[4]";
    public String Languageclose = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String PrivacyPolicy = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[5]";
    public String PrivacyPolicyBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String TermsandConditions = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ScrollView/android.view.View[6]";
    public String TermsandConditionsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void cntwithgoogle() throws InterruptedException {
        Thread.sleep(8000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(3000);
        WebElement account = driver.findElement(By.xpath(existinggoogleaccount));
        account.click();
        Thread.sleep(20000);
    }
    public void Profile() throws InterruptedException {
        WebElement PS = driver.findElement(By.xpath(profileScreen));
        PS.click();
        Thread.sleep(3000);
    }
    public void Settings() throws InterruptedException {
        WebElement Sett = driver.findElement(By.xpath(settings));
        Sett.click();
        Thread.sleep(2000);
        WebElement ref = driver.findElement(By.xpath(settingsRef));
        ref.isDisplayed();
        Thread.sleep(1000);
        WebElement visibility = driver.findElement(By.xpath(Visiblebutton));
        visibility.click();
        Thread.sleep(1000);
        WebElement onlyToMe = driver.findElement(By.xpath(VisibleOnlytome));
        onlyToMe.click();
        Thread.sleep(3000);
        visibility.click();
        Thread.sleep(1000);
        WebElement visibleToAll = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Visible to all\"]"));
        visibleToAll.click();
        Thread.sleep(3000);
        WebElement close = driver.findElement(By.xpath(closeSettings));
        close.click();
        Thread.sleep(1000);
    }
    public void TotalMeditationTime() throws InterruptedException {
        WebElement share = driver.findElement(By.xpath(TotalMeditationShareOption));
        share.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
        cancel.click();
        Thread.sleep(2000);
        WebElement viewinsights = driver.findElement(By.xpath(ViewInsights));
        viewinsights.click();
        Thread.sleep(5000);
        WebElement logshare = driver.findElement(By.xpath(LogmeditationShareOption));
        logshare.click();
        Thread.sleep(2000);
        WebElement cancel1 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button"));
        cancel1.click();
        Thread.sleep(2000);
        WebElement logmeditation = driver.findElement(By.xpath(LogMeditation));
        logmeditation.click();
        Thread.sleep(3000);
        WebElement custom = driver.findElement(By.xpath(CustomDuration));
        custom.click();
        Thread.sleep(3000);
        WebElement enterduration = driver.findElement(By.xpath(CustomTime));
        enterduration.sendKeys("25");
        Thread.sleep(1000);
        WebElement add = driver.findElement(By.xpath(AddButton));
        add.click();
        Thread.sleep(10000);
        WebElement submit = driver.findElement(By.xpath(SubmitButton));
        submit.click();
        Thread.sleep(6000);
        WebElement ViewinsightsBack = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]"));
        ViewinsightsBack.click();
        Thread.sleep(4000);
    }
    public void Achievements() throws InterruptedException {
        WebElement VA = driver.findElement(AppiumBy.accessibilityId(view));
        VA.click();
        Thread.sleep(3000);
        WebElement about = driver.findElement(By.xpath(AboutAchievements));
        about.click();
        Thread.sleep(4000);
        /*WebElement close = driver.findElement(By.xpath(AboutAchievementsBack));
        close.click();
        Thread.sleep(4000);*/
        /*WebElement shareachivements = driver.findElement(By.xpath(ShareAchivements));
        shareachivements.click();
        Thread.sleep(2000);
        WebElement cancel1 = driver.findElement(By.xpath(ShareCancel));
        cancel1.click();
        Thread.sleep(2000);*/
        WebElement back = driver.findElement(By.xpath(AchievementsBack));
        back.click();
        Thread.sleep(4000);
    }
    //Scroll from here
    public void Favourites() throws InterruptedException {
        WebElement fav = driver.findElement(By.xpath(Favourites));
        fav.click();
        Thread.sleep(3000);
        WebElement med = driver.findElement(By.xpath(Meditations));
        med.click();
        Thread.sleep(3000);
        WebElement vid = driver.findElement(By.xpath(Videos));
        vid.click();
        Thread.sleep(3000);
        WebElement art = driver.findElement(By.xpath(Articles));
        art.click();
        Thread.sleep(3000);
        WebElement back = driver.findElement(By.xpath(FavouritesBack));
        back.click();
        Thread.sleep(3000);
    }
    public void Donatenow() throws InterruptedException {
        WebElement donate = driver.findElement(By.xpath(Donatenow));
        donate.click();
        Thread.sleep(3000);
        WebElement donateback = driver.findElement(By.xpath(DonatenowBack));
        donateback.click();
        Thread.sleep(1000);
    }
    public void Invitefriend() throws InterruptedException {
        WebElement Invitefrnd = driver.findElement(By.xpath(inviteAFriend));
        Invitefrnd.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(inviteCancel));
        cancel.click();
        Thread.sleep(2000);
    }
    public void AbtHrtfulness() throws InterruptedException {
        WebElement AbtHrt = driver.findElement(By.xpath(AboutHeartfulnessProfileScreen));
        AbtHrt.click();
        Thread.sleep(3000);
        WebElement back = driver.findElement(By.xpath(AHPSBack));
        back.click();
        Thread.sleep(2000);
    }
    public void SelectLanguage() throws InterruptedException {
        WebElement slktlan = driver.findElement(By.xpath(Language));
        slktlan.click();
        Thread.sleep(4000);
        WebElement close = driver.findElement(By.xpath(Languageclose));
        close.click();
        Thread.sleep(2000);
    }
    public void PrivacyPolicy() throws InterruptedException {
        WebElement pp = driver.findElement(By.xpath(PrivacyPolicy));
        pp.click();
        Thread.sleep(3000);
        WebElement ppback = driver.findElement(By.xpath(PrivacyPolicyBack));
        ppback.click();
        Thread.sleep(2000);
    }
    public void TrmsCond() throws InterruptedException {
        WebElement TC = driver.findElement(By.xpath(TermsandConditions));
        TC.click();
        Thread.sleep(3000);
        WebElement TCback = driver.findElement(By.xpath(TermsandConditionsBack));
        TCback.click();
        Thread.sleep(3000);
    }
}
