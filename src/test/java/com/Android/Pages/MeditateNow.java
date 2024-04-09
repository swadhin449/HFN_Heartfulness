package com.Android.Pages;

import com.utils.DriverManager;
import com.utils.GlobalParams;
import com.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class MeditateNow {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public MeditateNow(){
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
    public String existinggoogleaccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout";
    public String fifteenmin = "//android.view.View[@content-desc=\"15 mins\"]";
    public String meditateNowButton = "//android.view.View[@content-desc=\"Meditate Now\n" +
            "Facing an App Issue?\n" +
            "Reach us for a quick support\n" +
            "Meditate with a \n" +
            "Trainer\n" +
            "We make meditation accessible for everyone\n" +
            "free of cost.People across 130 countries use \n" +
            "our meditative practices daily. Your support can \n" +
            "make a big difference.\n" +
            "Enjoying the app?\n" +
            "Your feedback will be\n" +
            "valuable to us.\"]/android.widget.Button[1]";
    public String skipintro = "//android.widget.Button[@content-desc=\"Skip Intro\"]";
    public String playpause = "//android.view.View[@content-desc=\"Prism AudioPlayer Controller\"]/android.widget.ImageView[2]";
    public String settings = "//android.widget.ImageView[@content-desc=\"Settings\"]";
    public String closesettings = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.widget.Button";
    public String BackgroundSerene = "//android.widget.Button[@content-desc=\"Serene\"]";
    public String SoundSitar = "//android.widget.Button[@content-desc=\"Sitar\"]";
    public String SaveButton = "//android.widget.Button[@content-desc=\"Save\"]";
    public String FavUNFav = "//android.widget.ImageView[@content-desc=\"Favourites and UnFavourites\"]";
    public String MDNowshare = "//android.widget.ImageView[@content-desc=\"Share\"]";
    public String MDNowshareCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String MDNowClose = "//android.widget.Button[@content-desc=\"Close\"]";
    public String Cancel = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String Confirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String MotivationMSG = "//android.view.View[@content-desc=\"Nice Try!\"]";
    public String Meditatedtime = "//android.view.View[@content-desc=\"You have meditated for\"]";
    public String AddaDiary = "//android.widget.Button[@content-desc=\"Add a Diary\"]";
    public String enterData = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
    public String Done = "//android.widget.Button[@content-desc=\"Done\"]";
    public String DiscoverTab = "//android.widget.ImageView[@content-desc=\"Discover\"]";
    public String Diary = "//android.view.View[@content-desc=\"Diary\"]";
    public String DiaryBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String Home = "//android.widget.ImageView[@content-desc=\"Home\"]";
    public String thirtyOption = "//android.view.View[@content-desc=\"30 mins\"]";
    public String CloseSession = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String fortyFive = "//android.view.View[@content-desc=\"45 mins\"]";
    public String OthersOption = "//android.view.View[@content-desc=\"Other\"]";

    public void cntwithgoogle() throws InterruptedException {
        Thread.sleep(10000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(3000);
        WebElement account = driver.findElement(By.xpath(existinggoogleaccount));
        account.click();
        Thread.sleep(15000);
    }
    public void MeditationOptions(){
        WebElement fifmin = driver.findElement(By.xpath(fifteenmin));
        fifmin.isDisplayed();
        WebElement thirtymin = driver.findElement(By.xpath(thirtyOption));
        thirtymin.isDisplayed();
        WebElement fortyfivemin = driver.findElement(By.xpath(fortyFive));
        fortyfivemin.isDisplayed();
        WebElement otheroption = driver.findElement(By.xpath(OthersOption));
        otheroption.isDisplayed();
    }
    public void Session() throws InterruptedException {
        WebElement MDNow = driver.findElement(By.xpath(meditateNowButton));
        MDNow.click();
        Thread.sleep(7000);
    }
    public void MDNowOptions() throws InterruptedException {
        WebElement Sttngs = driver.findElement(By.xpath(settings));
        Sttngs.click();
        Thread.sleep(3000);
        WebElement closeSettings = driver.findElement(By.xpath(closesettings));
        closeSettings.click();
        Thread.sleep(5000);
        Sttngs.click();
        WebElement BG = driver.findElement(By.xpath(BackgroundSerene));
        BG.click();
        Thread.sleep(1000);
        WebElement sound = driver.findElement(By.xpath(SoundSitar));
        sound.click();
        Thread.sleep(1000);
        WebElement save = driver.findElement(By.xpath(SaveButton));
        save.click();
        Thread.sleep(3000);
    }
    public void ShareOption() throws InterruptedException {
        WebElement share = driver.findElement(By.xpath(MDNowshare));
        share.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(MDNowshareCancel));
        cancel.click();
        Thread.sleep(2000);
    }
    public void starOption() throws InterruptedException {
        WebElement Fav = driver.findElement(By.xpath(FavUNFav));
        Fav.click();
        Thread.sleep(3000);
        Fav.click();
        Thread.sleep(3000);
    }
    public void EndSession() throws InterruptedException {
        WebElement close = driver.findElement(By.xpath(MDNowClose));
        close.click();
        Thread.sleep(2000);
        WebElement cancel = driver.findElement(By.xpath(Cancel));
        cancel.click();
        Thread.sleep(2000);
        close.click();
        WebElement confirm = driver.findElement(By.xpath(Confirm));
        confirm.click();
        Thread.sleep(3000);
    }
    public void SummaryScreen() throws InterruptedException {
        WebElement EncourageMsg = driver.findElement(By.xpath(MotivationMSG));
        EncourageMsg.isDisplayed();
        WebElement meditatedtime = driver.findElement(By.xpath(Meditatedtime));
        meditatedtime.isDisplayed();
        Thread.sleep(3000);
        WebElement diary = driver.findElement(By.xpath(AddaDiary));
        diary.click();
        Thread.sleep(1000);
        WebElement entertxt = driver.findElement(By.xpath(enterData));
        entertxt.sendKeys("I have meditated and my mind is relaxed");
        Thread.sleep(1000);
        WebElement addnote = driver.findElement(By.xpath(Done));
        addnote.click();
        Thread.sleep(5000);
        WebElement discover = driver.findElement(By.xpath(DiscoverTab));
        discover.click();
        Thread.sleep(1000);
        WebElement diary1 = driver.findElement(By.xpath(Diary));
        diary1.click();
        Thread.sleep(3000);
        WebElement diaryback = driver.findElement(By.xpath(DiaryBack));
        diaryback.click();
        Thread.sleep(1000);
        WebElement home = driver.findElement(By.xpath(Home));
        home.click();
        Thread.sleep(1000);
    }
    public void thirty() throws InterruptedException {
        WebElement Thirty = driver.findElement(By.xpath(thirtyOption));
        Thirty.click();
        Thread.sleep(1000);
        WebElement MDNow = driver.findElement(By.xpath(meditateNowButton));
        MDNow.click();
        Thread.sleep(3000);
        WebElement MDnowClose = driver.findElement(By.xpath(MDNowClose));
        MDnowClose.click();
        Thread.sleep(1000);
        WebElement MDConfirm = driver.findElement(By.xpath(Confirm));
        MDConfirm.click();
        Thread.sleep(3000);
    }
    public void ClosingSession() throws InterruptedException {
        WebElement close = driver.findElement(By.xpath(CloseSession));
        close.click();
        Thread.sleep(2000);
    }
    public void fortyfive() throws InterruptedException {
        WebElement ftyfive = driver.findElement(By.xpath(fortyFive));
        ftyfive.click();
        Thread.sleep(1000);
        WebElement MDNow = driver.findElement(By.xpath(meditateNowButton));
        MDNow.click();
        Thread.sleep(3000);
        WebElement MDnowClose = driver.findElement(By.xpath(MDNowClose));
        MDnowClose.click();
        Thread.sleep(1000);
        WebElement MDConfirm = driver.findElement(By.xpath(Confirm));
        MDConfirm.click();
        Thread.sleep(3000);
    }
    public void ClosingSession1() throws InterruptedException {
        WebElement close = driver.findElement(By.xpath(CloseSession));
        close.click();
        Thread.sleep(2000);
    }
    public void OTHER() throws InterruptedException {
        WebElement other = driver.findElement(By.xpath(OthersOption));
        other.click();
        Thread.sleep(1000);
        WebElement MDNow = driver.findElement(By.xpath(meditateNowButton));
        MDNow.click();
        Thread.sleep(3000);
        WebElement MDnowClose = driver.findElement(By.xpath(MDNowClose));
        MDnowClose.click();
        Thread.sleep(1000);
        WebElement MDConfirm = driver.findElement(By.xpath(Confirm));
        MDConfirm.click();
        Thread.sleep(3000);
    }
    public void ClosingSession2() throws InterruptedException {
        WebElement close = driver.findElement(By.xpath(CloseSession));
        close.click();
        Thread.sleep(2000);
    }


}

