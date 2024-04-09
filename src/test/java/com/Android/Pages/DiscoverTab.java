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

public class DiscoverTab {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public DiscoverTab(){
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


    //    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
    public String continuewithgoogle = "//android.widget.ImageView[@content-desc=\"Continue with Google\"]";
    public String existinggoogleaccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.ImageView";
    public String DiscoverTab = "//android.widget.ImageView[@content-desc=\"Discover\"]";
    public String Meditations = "//android.view.View[@content-desc=\"Meditations\"]";
    public String MeditationsTitle = "//android.view.View[@content-desc=\"Why do you want to \n" +
            "meditate?\"]";
    public String CorePractices = "//android.widget.Button[@content-desc=\"Core Practices\"]";
    public String CorePracticesImage = "//android.widget.ImageView[@content-desc=\"Core Practices\"]";
    public String BodyandMindVideo = "//android.view.View[@content-desc=\"Body and mind relaxation\n" +
            " 04.20 min\n" +
            "Stress affects different parts of the body and your mind. This relaxation meditation can have deep effects on both the body and \"]";
    public String RelaxationVideo = "//android.view.View[@content-desc=\"Relaxation\n" +
            " 07.39 min\n" +
            "Learning to relax is vital for well-being. It reduces tension in all parts of your body and helps you to stay balanced even in stressful situations. jashoidklk i;ou;iukhn mn2jkenk/ mkl/sw,;p; l;;lwske,;'' opkpo  lkd0w[p kml ndek;wlm oi iudhwknb dhje fl r\"]";
    public String CorePracticesBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String ForBetterSleep = "//android.widget.Button[@content-desc=\"For Better Sleep\"]";
    public String ForBetterSleepTitleAndImage = "//android.widget.ImageView[@content-desc=\"For Better Sleep\"]";
    public String GuidedSleepMeditation = "//android.view.View[@content-desc=\"Guided sleep meditation\n" +
            " 01.46 min\n" +
            "This bedtime prayer meditation is a great way of removing your troubling habits as well as to help you ensure a good night sleep.\"]";
    public String ForBetterSleepBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String ExpandConsciousness = "//android.widget.Button[@content-desc=\"Expand Consciousness \"]";
    public String ExpandConsciousnessTitleAndImage = "//android.widget.ImageView[@content-desc=\"Expand Consciousness \"]";
    public String ExpandConsciousnessBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String ForWorldPeace = "//android.widget.Button[@content-desc=\"For World Peace\"]";
    public String ForWorldPeaceTitleAndImage = "//android.widget.ImageView[@content-desc=\"For World Peace\"]";
    public String ForWorldPeaceBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String DevelopFocus = "//android.widget.Button[@content-desc=\"Develop Focus\"]";
    public String DevelopFocusTitleAndImage = "//android.widget.ImageView[@content-desc=\"Develop Focus\"]";
    public String DevelopFocusBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String SenseofCalmness = "//android.widget.Button[@content-desc=\"Sense of Calmness\"]";
    public String SenseofCalmnessTitleAndImage = "//android.widget.ImageView[@content-desc=\"Sense of Calmness\"]";
    public String SenseofCalmnessBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String AttainInnerPeace = "//android.widget.Button[@content-desc=\"Attain Inner Peace\"]";
    public String AttainInnerPeaceTitleAndImage = "//android.widget.ImageView[@content-desc=\"Attain Inner Peace\"]";
    public String AttainInnerPeaceBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String ForEmotionalBalance = "//android.widget.Button[@content-desc=\"For Emotional Balance\"]";
    public String ForEmotionalBalanceTitleAndImage = "//android.widget.ImageView[@content-desc=\"For Emotional Balance\"]";
    public String ForEmotionalBalanceBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String FeelRejuvenated = "//android.widget.Button[@content-desc=\"Feel Rejuvenated\"]";
    public String FeelRejuvenatedTitleAndImage = "//android.widget.ImageView[@content-desc=\"Feel Rejuvenated\"]";
    public String FeelRejuvenatedBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String MeditationsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String BodyandMindShare = "//android.widget.ImageView[@content-desc=\"Share\"]";
    public String BodyandMindShareCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String BodyandMindClose = "//android.widget.Button[@content-desc=\"Close\"]";
    public String BodyandMindConfirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String ExitBodyAndMind = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";



    public void cntwithgoogle() throws InterruptedException {
        Thread.sleep(10000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(3000);
        WebElement account = driver.findElement(By.xpath(existinggoogleaccount));
        account.click();
        Thread.sleep(20000);
    }
    public void GotoDiscoverTab() throws InterruptedException {
        WebElement DiscvrTab = driver.findElement(By.xpath(DiscoverTab));
        DiscvrTab.click();
        Thread.sleep(2000);
    }
    public void Meditations() throws InterruptedException {
        WebElement Mdtations = driver.findElement(By.xpath(Meditations));
        Mdtations.click();
        Thread.sleep(8000);
        WebElement Title = driver.findElement(By.xpath(MeditationsTitle));
        Title.isDisplayed();
        WebElement CP = driver.findElement(By.xpath(CorePractices));
        CP.isDisplayed();
        WebElement FBS = driver.findElement(By.xpath(ForBetterSleep));
        FBS.isDisplayed();
        WebElement EC = driver.findElement(By.xpath(ExpandConsciousness));
        EC.isDisplayed();
        WebElement FWP = driver.findElement(By.xpath(ForWorldPeace));
        FWP.isDisplayed();
        WebElement DF = driver.findElement(By.xpath(DevelopFocus));
        DF.isDisplayed();
        WebElement SOC = driver.findElement(By.xpath(SenseofCalmness));
        SOC.isDisplayed();
        /*Thread.sleep(3000);
        WebElement AIP = driver.findElement(By.xpath(AttainInnerPeace));
        AIP.isDisplayed();
        WebElement FEB = driver.findElement(By.xpath(ForEmotionalBalance));
        FEB.isDisplayed();
        WebElement FR = driver.findElement(By.xpath(FeelRejuvenated));
        FR.isDisplayed();
        Thread.sleep(2000);*/
    }
    public void CorePractices() throws InterruptedException {
        WebElement CP = driver.findElement(By.xpath(CorePractices));
        CP.click();
        Thread.sleep(5000);
        WebElement CPTitle = driver.findElement(By.xpath(CorePracticesImage));
        CPTitle.isDisplayed();
        /*WebElement Video = driver.findElement(By.xpath(BodyandMindVideo));
        Video.click();
        Thread.sleep(5000);
        WebElement share = driver.findElement(By.xpath(BodyandMindShare));
        share.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(BodyandMindShareCancel));
        cancel.click();
        Thread.sleep(2000);
        WebElement close = driver.findElement(By.xpath(BodyandMindClose));
        close.click();
        Thread.sleep(1000);
        WebElement Confirm = driver.findElement(By.xpath(BodyandMindConfirm));
        Confirm.click();
        Thread.sleep(3000);
        WebElement Exit = driver.findElement(By.xpath(ExitBodyAndMind));
        Exit.click();
        Thread.sleep(3000);*/
        WebElement CPBack = driver.findElement(By.xpath(CorePracticesBack));
        CPBack.click();
        Thread.sleep(2000);
    }
    public void ForBetterSleep() throws InterruptedException {
        WebElement FBS = driver.findElement(By.xpath(ForBetterSleep));
        FBS.click();
        Thread.sleep(5000);
        WebElement FBSTitle = driver.findElement(By.xpath(ForBetterSleepTitleAndImage));
        FBSTitle.isDisplayed();
        WebElement FBSBack = driver.findElement(By.xpath(ForBetterSleepBack));
        FBSBack.click();
        Thread.sleep(2000);
    }
    public void ExpandConsciousness() throws InterruptedException {
        WebElement EC = driver.findElement(By.xpath(ExpandConsciousness));
        EC.click();
        Thread.sleep(5000);
        WebElement ECTitle = driver.findElement(By.xpath(ExpandConsciousnessTitleAndImage));
        ECTitle.isDisplayed();
        WebElement ECBack = driver.findElement(By.xpath(ExpandConsciousnessBack));
        ECBack.click();
        Thread.sleep(2000);
    }
    public void ForWorldPeace() throws InterruptedException {
        WebElement FWP = driver.findElement(By.xpath(ForWorldPeace));
        FWP.click();
        Thread.sleep(5000);
        WebElement FWPTitle = driver.findElement(By.xpath(ForWorldPeaceTitleAndImage));
        FWPTitle.isDisplayed();
        WebElement FWPBack = driver.findElement(By.xpath(ForWorldPeaceBack));
        FWPBack.click();
        Thread.sleep(2000);
    }
    public void DevelopFocus() throws InterruptedException {
        WebElement DF = driver.findElement(By.xpath(DevelopFocus));
        DF.click();
        Thread.sleep(5000);
        WebElement DFTitle = driver.findElement(By.xpath(DevelopFocusTitleAndImage));
        DFTitle.isDisplayed();
        WebElement DFBack = driver.findElement(By.xpath(DevelopFocusBack));
        DFBack.click();
        Thread.sleep(2000);
    }
    public void SenseOfCalmness() throws InterruptedException {
        WebElement Soc = driver.findElement(By.xpath(SenseofCalmness));
        Soc.click();
        Thread.sleep(5000);
        WebElement SocTitle = driver.findElement(By.xpath(SenseofCalmnessTitleAndImage));
        SocTitle.isDisplayed();
        WebElement SocBack = driver.findElement(By.xpath(SenseofCalmnessBack));
        SocBack.click();
        Thread.sleep(3000);
        //Scroll Down
    }
    public void AttainInnerPeace() throws InterruptedException {
        WebElement AIP = driver.findElement(By.xpath(AttainInnerPeace));
        AIP.click();
        Thread.sleep(5000);
        WebElement AIPTitle = driver.findElement(By.xpath(AttainInnerPeaceTitleAndImage));
        AIPTitle.isDisplayed();
        WebElement AIPBack = driver.findElement(By.xpath(AttainInnerPeaceBack));
        AIPBack.click();
        Thread.sleep(2000);
    }
    public void ForEmotionalBalance() throws InterruptedException {
        WebElement FEB = driver.findElement(By.xpath(ForEmotionalBalance));
        FEB.click();
        Thread.sleep(5000);
        WebElement FEBTitle = driver.findElement(By.xpath(ForEmotionalBalanceTitleAndImage));
        FEBTitle.isDisplayed();
        WebElement FEBBack = driver.findElement(By.xpath(ForEmotionalBalanceBack));
        FEBBack.click();
        Thread.sleep(2000);
    }
    public void FeelRejuvenated() throws InterruptedException {
        WebElement FR = driver.findElement(By.xpath(FeelRejuvenated));
        FR.click();
        Thread.sleep(5000);
        WebElement FRTitle = driver.findElement(By.xpath(FeelRejuvenatedTitleAndImage));
        FRTitle.isDisplayed();
        WebElement FRBack = driver.findElement(By.xpath(FeelRejuvenatedBack));
        FRBack.click();
        Thread.sleep(4000);
        //Scroll to top
        WebElement MDBack = driver.findElement(By.xpath(MeditationsBack));
        MDBack.click();
        Thread.sleep(2000);
    }

    //Diary Elements------------------------------------------------------------------------------------------------------

    public String Diary = "//android.view.View[@content-desc=\"Diary\"]";
    public String DiaryTitle = "//android.view.View[@content-desc=\"Diary\"]";
    public String Searchoption = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String Plusbutton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String Edit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
    public String Donebutton = "//android.widget.Button[@content-desc=\"Done\"]";
    public String DiaryBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void Diary() throws InterruptedException {
        WebElement diary = driver.findElement(By.xpath(Diary));
        diary.click();
        Thread.sleep(5000);
        WebElement diaryTitle = driver.findElement(By.xpath(DiaryTitle));
        diaryTitle.isDisplayed();
        WebElement diarySearch = driver.findElement(By.xpath(Searchoption));
        diarySearch.isDisplayed();
    }
    public void AddDiary() throws InterruptedException {
        WebElement Plus = driver.findElement(By.xpath(Plusbutton));
        Plus.click();
        Thread.sleep(1000);
        WebElement edit = driver.findElement(By.xpath(Edit));
        edit.sendKeys("I am adding a new Diary");
        Thread.sleep(1000);
        WebElement Done = driver.findElement(By.xpath(Donebutton));
        Done.click();
        Thread.sleep(3000);
        WebElement diaryBack = driver.findElement(By.xpath(DiaryBack));
        diaryBack.click();
        Thread.sleep(2000);
    }

    //MoodMeter Elements-------------------------------------------------------------------------------------------------

    public String MoodMeter = "//android.view.View[@content-desc=\"Mood Meter\"]";
    public String AboutMM = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]";
    public String AboutMMBack = "//android.view.View[@content-desc=\"Mood Meter\n" +
            "Recognizing your\n" +
            "emotions help increase\n" +
            "self-awareness\n" +
            "You can choose one\n" +
            "emotion\n" +
            "Identifying emotional\n" +
            "triggers help you\n" +
            "understand your\n" +
            "reactions better\n" +
            "You can choose one\n" +
            "trigger\n" +
            "Dairy helps\n" +
            "reflect on your emotions and\n" +
            "process them\"]/android.widget.ImageView[1]";
    public String MMSymbol = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
   /* public String Peaceful = "//android.widget.Button[@content-desc=\"Peaceful\"]";
    public String Rightarrow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String Meditation = "//android.widget.ImageView[@content-desc=\"Meditation\"]";
    public String Rightarrow1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";*/
    public String MMSymbolBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String MMBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";

    public void MoodMeter() throws InterruptedException {
        WebElement MM = driver.findElement(By.xpath(MoodMeter));
        MM.click();
        Thread.sleep(5000);
        WebElement aboutMM = driver.findElement(By.xpath(AboutMM));
        aboutMM.click();
        Thread.sleep(2000);
        WebElement aboutMMBack = driver.findElement(By.xpath(AboutMMBack));
        aboutMMBack.click();
        Thread.sleep(1000);
        WebElement Symbol = driver.findElement(By.xpath(MMSymbol));
        Symbol.click();
        Thread.sleep(2000);
        WebElement SymbolBack = driver.findElement(By.xpath(MMSymbolBack));
        SymbolBack.click();
        Thread.sleep(1000);
        WebElement MMback = driver.findElement(By.xpath(MMBack));
        MMback.click();
        Thread.sleep(2000);
    }

    //Donate Elements---------------------------------------------------------------------------------------------------

    public String Donate = "//android.view.View[@content-desc=\"Donate\"]";
    public String DonateTitle = "//android.view.View[@content-desc=\"Donate\"]";
    public String Amount = "//android.view.View[@content-desc=\"Donate\n" +
            "Donor Details\n" +
            "I want tax exemption\"]/android.widget.EditText";
    public String Country = "//android.view.View[@content-desc=\"Mobile number with country code*\"]/android.widget.Button";
    public String SearchBox = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.EditText";
    public String India = "//android.view.View[@content-desc=\"\uD83C\uDDEE\uD83C\uDDF3\n" +
            "India\"]";
    public String Donatebutton = "//android.widget.Button[@content-desc=\"Donate ₹100\"]";
    public String DonationScreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View";
    public String DonationBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String DonateBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void Donate() throws InterruptedException {
        WebElement Dnt = driver.findElement(By.xpath(Donate));
        Dnt.click();
        Thread.sleep(5000);
        WebElement Title = driver.findElement(By.xpath(DonateTitle));
        Title.isDisplayed();
        WebElement Amt = driver.findElement(By.xpath(Amount));
        Amt.click();
        Thread.sleep(1000);
        Amt.sendKeys("100");
        Thread.sleep(5000);
        WebElement cuntry = driver.findElement(By.xpath(Country));
        cuntry.click();
        Thread.sleep(3000);
        WebElement srch = driver.findElement(By.xpath(SearchBox));
        srch.click();
        Thread.sleep(2000);
        srch.sendKeys("India");
        Thread.sleep(2000);
        WebElement india = driver.findElement(By.xpath(India));
        india.click();
        Thread.sleep(2000);
        WebElement Mbnumber = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Mobile number with country code*\"]/android.widget.EditText[3]"));
        Mbnumber.click();
        Mbnumber.sendKeys("8466983358");
        Thread.sleep(3000);
        WebElement DntBtn = driver.findElement(By.xpath(Donatebutton));
        DntBtn.click();
        Thread.sleep(15000);
        WebElement DntScreen = driver.findElement(By.xpath(DonationScreen));
        DntScreen.isDisplayed();
        WebElement DntScreenBack = driver.findElement(By.xpath(DonationBack));
        DntScreenBack.click();
        Thread.sleep(2000);
        WebElement DntBack = driver.findElement(By.xpath(DonateBack));
        DntBack.click();
        Thread.sleep(2000);
    }

    //Achievements Elements---------------------------------------------------------------------------------------------

    public String Achievements = "//android.view.View[@content-desc=\"Achievements\"]";
    public String AchievementsShare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String Sharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String Title = "//android.view.View[@content-desc=\"Achievements\"]";
    public String Tokens = "//android.widget.Button[@content-desc=\"Simplify your life so as to be \n" +
            "       identical with Nature.\"]";
    public String AchievementsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void Achievements() throws InterruptedException {
        WebElement Achmnts = driver.findElement(By.xpath(Achievements));
        Achmnts.click();
        Thread.sleep(5000);
        WebElement title = driver.findElement(By.xpath(Title));
        title.isDisplayed();
        WebElement tokens = driver.findElement(By.xpath(Tokens));
        tokens.isDisplayed();
        WebElement share = driver.findElement(By.xpath(AchievementsShare));
        share.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(Sharecancel));
        cancel.click();
        Thread.sleep(2000);
        WebElement AchmntsBack = driver.findElement(By.xpath(AchievementsBack));
        AchmntsBack.click();
        Thread.sleep(2000);
    }

    //Resources Elements-------------------------------------------------------------------------------------------------

    public String Resource = "//android.view.View[@content-desc=\"Resources\n" +
            "Articles & videos\"]";
    public String  ResourceTitle = "//android.view.View[@content-desc=\"Resources\"]";
    public String FeaturedVideo = "//android.widget.ImageView[@content-desc=\"New testing video\n" +
            "00:12\n" +
            "min\n" +
            "￼\n" +
            "New testing video\"]";
    public String videopause = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String Videoshare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]";
    public String Cancelshare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String Fav = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]";

    //public String Landscape = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[1]";
    public String VideoClose = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String Confirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String WhyIMeditateVideo = "//android.view.View[@content-desc=\"HTC Video for Regression \"]";
    public String pause1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String share1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]";
    public String sharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String Videoclose1 = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String Confirm1 = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String VideosTab = "//android.view.View[@content-desc=\"Videos\n" +
            "Tab 2 of 3\"]";
    public String ArticlesTab = "//android.view.View[@content-desc=\"Articles\n" +
            "Tab 3 of 3\"]";
    public String FeaturedArticle = "//android.widget.ImageView[@content-desc=\"New test article\n" +
            "25\n" +
            "min read\n" +
            "￼\n" +
            "￼\n" +
            "Study the above article\"]";
    public String content = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.ImageView[2]";
    public String star = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]";
    public String ArticleShare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String ArticleShareCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String ArticleBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String ArticlesForYou = "//android.widget.ImageView[@content-desc=\"Regression Article\n" +
            "360\n" +
            "min read\"]";
    public String ForyouarticlesBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String FilterOption = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    public String FilterOptionClose = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    public String ResourcesBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void Resources() throws InterruptedException {
        WebElement RSoption = driver.findElement(By.xpath(Resource));
        RSoption.click();
        Thread.sleep(8000);
        WebElement title = driver.findElement(By.xpath(ResourceTitle));
        title.isDisplayed();
        WebElement FTVideo = driver.findElement(By.xpath(FeaturedVideo));
        FTVideo.click();
        Thread.sleep(10000);
        WebElement pause = driver.findElement(By.xpath(videopause));
        pause.click();
        Thread.sleep(2000);
        WebElement share = driver.findElement(By.xpath(Videoshare));
        share.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(Cancelshare));
        cancel.click();
        Thread.sleep(2000);
        WebElement favelement = driver.findElement(By.xpath(Fav));
        favelement.click();
        Thread.sleep(2000);
        favelement.click();
        Thread.sleep(2000);
        WebElement Vclose = driver.findElement(By.xpath(VideoClose));
        Vclose.click();
        Thread.sleep(2000);
        WebElement Cfm = driver.findElement(By.xpath(Confirm));
        Cfm.click();
        Thread.sleep(4000);
        WebElement WhyIMdt = driver.findElement(By.xpath(WhyIMeditateVideo));
        WhyIMdt.click();
        Thread.sleep(8000);
        WebElement pse = driver.findElement(By.xpath(pause1));
        pse.click();
        Thread.sleep(2000);
        WebElement shre = driver.findElement(By.xpath(share1));
        shre.click();
        Thread.sleep(3000);
        WebElement shrecancel = driver.findElement(By.xpath(sharecancel));
        shrecancel.click();
        Thread.sleep(2000);
        WebElement videoClose = driver.findElement(By.xpath(Videoclose1));
        videoClose.click();
        Thread.sleep(2000);
        WebElement confirm = driver.findElement(By.xpath(Confirm1));
        confirm.click();
        Thread.sleep(4000);
        WebElement vdsTab = driver.findElement(By.xpath(VideosTab));
        vdsTab.click();
        Thread.sleep(5000);
        WebElement AtclsTab = driver.findElement(By.xpath(ArticlesTab));
        AtclsTab.click();
        Thread.sleep(5000);
        /*WebElement FtArtcl = driver.findElement(By.xpath(FeaturedArticle));
        FtArtcl.click();
        Thread.sleep(5000);
        WebElement cntnt = driver.findElement(By.xpath(content));
        cntnt.isDisplayed();
        Thread.sleep(2000);
        WebElement str = driver.findElement(By.xpath(star));
        str.click();
        Thread.sleep(2000);
        str.click();
        WebElement Ashare = driver.findElement(By.xpath(ArticleShare));
        Ashare.click();
        Thread.sleep(3000);
        WebElement AshareCancel = driver.findElement(By.xpath(ArticleShareCancel));
        AshareCancel.click();
        Thread.sleep(2000);
        WebElement Aback = driver.findElement(By.xpath(ArticleBack));
        Aback.click();
        Thread.sleep(4000);*/
        WebElement FruArtls = driver.findElement(By.xpath(ArticlesForYou));
        FruArtls.click();
        Thread.sleep(4000);
        WebElement FruArtlsBack = driver.findElement(By.xpath(ForyouarticlesBack));
        FruArtlsBack.click();
        Thread.sleep(2000);
        WebElement filter = driver.findElement(By.xpath(FilterOption));
        filter.click();
        Thread.sleep(2000);
        WebElement filterClose = driver.findElement(By.xpath(FilterOptionClose));
        filterClose.click();
        Thread.sleep(2000);
        WebElement RSBack = driver.findElement(By.xpath(ResourcesBack));
        RSBack.click();
        Thread.sleep(2000);
    }
    //Self-Development Tab----------------------------------------------------------------------------------------------------
    public String SelfDevelopment = "//android.view.View[@content-desc=\"Self Development\n" +
            "Mind, Body and Spirit\"]";
    public String SDTitle = "//android.view.View[@content-desc=\"Self Development\"]";
    //public String SDFeaturedVideo = "//android.widget.ImageView[@content-desc=\"Self Healing \n" +
         //   "05:00 min\"]";
    public String SDVideo = "//android.view.View[@content-desc=\"Self Healing \n" +
            "05:00 min\"]";
    public String playpause = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String FavUfav = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]";
    public String SDshare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]";
    public String SDsharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String SDclose = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String SDConfirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String AFY = "//android.widget.ImageView[@content-desc=\"New Video\n" +
            "5\n" +
            "min read\"]";
    public String FavUnFav = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]";
    public String AFYShare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String AFYSharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String AFYBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String BooksFY = "//android.view.View[@content-desc=\"Sanity Mind Book\n" +
            "Test desc\"]";
    public String BodyTab = "//android.view.View[@content-desc=\"BODY\n" +
            "Tab 2 of 3\"]";
    public String BodyVideo = "//android.widget.Button[@content-desc=\"Test video body\n" +
            "12:00 minutes\"]";
    public String BVplayPause = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String BVshare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]";
    public String BVsharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String BVclose = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String BVconfirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String BTAFY = "//android.widget.ImageView[@content-desc=\"Sanity Body Article\n" +
            "360\n" +
            "min read\"]";
    public String BTAFYFavUnFav = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]";
    public String BTAFYshare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String BTAFYsharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String BTAFYBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String SpiritTab = "//android.view.View[@content-desc=\"SPIRIT\n" +
            "Tab 3 of 3\"]";
    public String STVideo = "//android.view.View[@content-desc=\"Latest Position videos for Spirit \n" +
            "07:25 min\"]";
    public String STvideoplaypause = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String STFavUnfav = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]";
    public String STVideoshare = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[1]";
    public String STvideosharecancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String STvideoclose = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView[2]";
    public String STvideoConfirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String SDback = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";


    public void SelfDevelopment() throws InterruptedException {
        WebElement SD = driver.findElement(By.xpath(SelfDevelopment));
        SD.click();
        Thread.sleep(10000);
        WebElement title = driver.findElement(By.xpath(SDTitle));
        title.isDisplayed();
        WebElement video = driver.findElement(By.xpath(SDVideo));
        video.click();
        Thread.sleep(10000);
        WebElement pause = driver.findElement(By.xpath(playpause));
        pause.click();
        Thread.sleep(2000);
        WebElement fav = driver.findElement(By.xpath(FavUfav));
        fav.click();
        Thread.sleep(2000);
        fav.click();
        WebElement share = driver.findElement(By.xpath(SDshare));
        share.click();
        Thread.sleep(3000);
        WebElement sharecancel = driver.findElement(By.xpath(SDsharecancel));
        sharecancel.click();
        Thread.sleep(2000);
        WebElement exit = driver.findElement(By.xpath(SDclose));
        exit.click();
        Thread.sleep(2000);
        WebElement exitConfirm = driver.findElement(By.xpath(SDConfirm));
        exitConfirm.click();
        Thread.sleep(5000);
        //Scroll
        WebElement ArticlesFY = driver.findElement(By.xpath(AFY));
        ArticlesFY.click();
        Thread.sleep(5000);
        WebElement star = driver.findElement(By.xpath(FavUnFav));
        star.click();
        Thread.sleep(3000);
        star.click();
        WebElement share1 = driver.findElement(By.xpath(AFYShare));
        share1.click();
        Thread.sleep(4000);
        WebElement share1Cancel = driver.findElement(By.xpath(AFYSharecancel));
        share1Cancel.click();
        Thread.sleep(3000);
        WebElement ArticlesBack = driver.findElement(By.xpath(AFYBack));
        ArticlesBack.click();
        Thread.sleep(5000);
        WebElement BFY = driver.findElement(By.xpath(BooksFY));
        BFY.isDisplayed();
        WebElement Btab = driver.findElement(By.xpath(BodyTab));
        Btab.click();
        Thread.sleep(10000);
        WebElement videos = driver.findElement(By.xpath(BodyVideo));
        videos.click();
        Thread.sleep(10000);
        WebElement pause1 = driver.findElement(By.xpath(BVplayPause));
        pause1.click();
        Thread.sleep(2000);
        WebElement share2 = driver.findElement(By.xpath(BVshare));
        share2.click();
        Thread.sleep(3000);
        WebElement share2Cancel = driver.findElement(By.xpath(BVsharecancel));
        share2Cancel.click();
        Thread.sleep(2000);
        WebElement exit1 = driver.findElement(By.xpath(BVclose));
        exit1.click();
        Thread.sleep(2000);
        WebElement exitConfirm1 = driver.findElement(By.xpath(BVconfirm));
        exitConfirm1.click();
        Thread.sleep(3000);
        WebElement STab = driver.findElement(By.xpath(SpiritTab));
        STab.click();
        Thread.sleep(10000);
        WebElement STvideo = driver.findElement(By.xpath(STVideo));
        STvideo.click();
        Thread.sleep(10000);
        WebElement pause2 = driver.findElement(By.xpath(STvideoplaypause));
        pause2.click();
        Thread.sleep(2000);
        WebElement star1 = driver.findElement(By.xpath(STFavUnfav));
        star1.click();
        Thread.sleep(2000);
        star1.click();
        WebElement share3 = driver.findElement(By.xpath(STVideoshare));
        share3.click();
        Thread.sleep(3000);
        WebElement share3cancel = driver.findElement(By.xpath(STvideosharecancel));
        share3cancel.click();
        Thread.sleep(2000);
        WebElement exit2 = driver.findElement(By.xpath(STvideoclose));
        exit2.click();
        Thread.sleep(3000);
        WebElement exit2confirm = driver.findElement(By.xpath(STvideoConfirm));
        exit2confirm.click();
        Thread.sleep(3000);
        WebElement SelfBack = driver.findElement(By.xpath(SDback));
        SelfBack.click();
        Thread.sleep(2000);
    }

    //Events Tab---------------------------------------------------------------------------------------------------------
    //Scheduled Events
    public String Events = "//android.view.View[@content-desc=\"Events\n" +
            "Rise with kindness\"]";
    public String ScheduledEvents = "//android.view.View[@content-desc=\"Scheduled \n" +
            "Events\"]";
    public String SETitle = "//android.view.View[@content-desc=\"Scheduled Events\"]";
    public String MM = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[2]";
    public String GoldenCheckBook = "//android.widget.Button[@content-desc=\"Golden Book \n" +
            "Check-In\"]";
    public String GCBRef = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView";
    public String GCBBack = "//android.widget.ImageButton[@content-desc=\"Close tab\"]";
    public String SEBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";

    public void EventsTab() throws InterruptedException {
        WebElement events = driver.findElement(By.xpath(Events));
        events.click();
        Thread.sleep(3000);
    }
    public void ScheduledEvents() throws InterruptedException {
        WebElement SE = driver.findElement(By.xpath(ScheduledEvents));
        SE.click();
        Thread.sleep(5000);
        WebElement SERef = driver.findElement(By.xpath(SETitle));
        SERef.isDisplayed();
        WebElement Mm = driver.findElement(By.xpath(MM));
        Mm.isDisplayed();
        WebElement GCB = driver.findElement(By.xpath(GoldenCheckBook));
        GCB.click();
        Thread.sleep(5000);
        WebElement Ref = driver.findElement(By.xpath(GCBRef));
        Ref.isDisplayed();
        Thread.sleep(2000);
        WebElement gcbBack = driver.findElement(By.xpath(GCBBack));
        gcbBack.click();
        Thread.sleep(3000);
        WebElement seBack = driver.findElement(By.xpath(SEBack));
        seBack.click();
        Thread.sleep(3000);
    }

    //My Registrations Elements-----------------------------------------------------------------------------------------

    public String MReg = "//android.view.View[@content-desc=\"My Registrations\"]";
    public String MRegBack = "//android.widget.ImageButton[@content-desc=\"Close tab\"]";
    public void MyRegistrations() throws InterruptedException {
        WebElement MR = driver.findElement(By.xpath(MReg));
        MR.click();
        Thread.sleep(5000);
        WebElement MRBack = driver.findElement(By.xpath(MRegBack));
        MRBack.click();
        Thread.sleep(3000);
    }
    //Key Locations Elements-----------------------------------------------------------------------------------------------------

    public String KeyLocations = "//android.view.View[@content-desc=\"Key \n" +
            "Locations\"]";
    public String KeylocationTitle = "//android.view.View[@content-desc=\"Key Locations\"]";
    public String KeylocationBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void KeyLocations() throws InterruptedException {
        WebElement KL = driver.findElement(By.xpath(KeyLocations));
        KL.click();
        Thread.sleep(5000);
        WebElement KLRef = driver.findElement(By.xpath(KeylocationTitle));
        KLRef.isDisplayed();
        WebElement KLBack = driver.findElement(By.xpath(KeylocationBack));
        KLBack.click();
        Thread.sleep(3000);
    }

    //Announcements Elements---------------------------------------------------------------------------------------------
    public String Announcements = "//android.view.View[@content-desc=\"Announcements\"]";
    public String AnnouncementsRef = "//android.view.View[@content-desc=\"Annoucements\"]";
    public String AnnouncementsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public void  Announcements() throws InterruptedException {
        WebElement Announce = driver.findElement(By.xpath(Announcements));
        Announce.click();
        Thread.sleep(5000);
        WebElement Ref = driver.findElement(By.xpath(AnnouncementsRef));
        Ref.isDisplayed();
        WebElement AnnounceBack = driver.findElement(By.xpath(AnnouncementsBack));
        AnnounceBack.click();
        Thread.sleep(3000);
    }
    //Share My Locations------------------------------------------------------------------------------------------------
    public String ShareMyLocation = "//android.view.View[@content-desc=\"Share My \n" +
            "Location\"]";
    public String WhileUsingTheApp = "/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.Button[1]";
    public String SMLCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";

    public void ShareMyLocation() throws InterruptedException {
        WebElement SML = driver.findElement(By.xpath(ShareMyLocation));
        SML.click();
        Thread.sleep(3000);
        WebElement WUTA = driver.findElement(By.xpath(WhileUsingTheApp));
        WUTA.click();
        Thread.sleep(4000);
        WebElement cancel = driver.findElement(By.xpath(SMLCancel));
        cancel.click();
        Thread.sleep(3000);
    }

    //Lost and Found--------------------------------------------------------------------------------------------------------

    public String LostandFound = "//android.view.View[@content-desc=\"Lost and \n" +
            "Found\"]";
    public String edit = "//android.view.View[@content-desc=\"I Lost\n" +
            "Near\n" +
            "Contact Me @\"]/android.widget.EditText[1]";
    public String Near = "//android.view.View[@content-desc=\"I Lost\n" +
            "Near\n" +
            "Contact Me @\"]/android.widget.EditText[2]";
    public String contactMe = "//android.view.View[@content-desc=\"I Lost\n" +
            "Near\n" +
            "Contact Me @\"]/android.widget.EditText[3]";
    public String submit = "//android.widget.Button[@content-desc=\"Submit\"]";
    public String Submitmsg = "//android.view.View[@content-desc=\"Your lost item has been reported \n" +
            "successfully. Please visit nearest \n" +
            "Helpdesk for more information!\"]";
    public String ViewFoundItems = "//android.widget.Button[@content-desc=\"View Found Items\"]";
    public String VFIBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String FoundTab = "//android.view.View[@content-desc=\"Found\n" +
            "Tab 2 of 2\"]";
    public String IFound = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.EditText[1]";
    public String FoundNear = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.EditText[2]";
    public String FoundContact = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[4]/android.view.View/android.view.View/android.view.View/android.widget.EditText[3]";
    public String Foundsubmit = "//android.widget.Button[@content-desc=\"Submit\"]";
    public String submitmsg1 = "//android.view.View[@content-desc=\"Thank you for reporting the found item.\n" +
            " Please submit the item to any Helpdesk!\"]";
    public String ViewLostItems = "//android.widget.Button[@content-desc=\"View Lost Items\"]";
    public String VLIBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String LandFBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void LostAndFound() throws InterruptedException {
        WebElement LandF = driver.findElement(By.xpath(LostandFound));
        LandF.click();
        Thread.sleep(2000);
        WebElement Ilost = driver.findElement(By.xpath(edit));
        Ilost.click();
        Thread.sleep(2000);
        Ilost.sendKeys("I lost my luggage");
        Thread.sleep(3000);
        WebElement place = driver.findElement(By.xpath(Near));
        place.click();
        Thread.sleep(2000);
        place.sendKeys("Kanha");
        Thread.sleep(3000);
        WebElement CntMe = driver.findElement(By.xpath(contactMe));
        CntMe.click();
        Thread.sleep(2000);
        CntMe.sendKeys("9876543219");
        Thread.sleep(3000);
        /*WebElement submitbtn = driver.findElement(By.xpath(submit));
        submitbtn.click();
        Thread.sleep(2000);
        WebElement msg = driver.findElement(By.xpath(Submitmsg));
        msg.isDisplayed();
        Thread.sleep(3000);*/
        WebElement VFI = driver.findElement(By.xpath(ViewFoundItems));
        VFI.click();
        Thread.sleep(5000);
        WebElement VFIback = driver.findElement(By.xpath(VFIBack));
        VFIback.click();
        Thread.sleep(2000);
        WebElement foundtab = driver.findElement(By.xpath(FoundTab));
        foundtab.click();
        Thread.sleep(2000);
        WebElement Ifound = driver.findElement(By.xpath(IFound));
        Ifound.click();
        Thread.sleep(2000);
        Ifound.sendKeys("luggage");
        Thread.sleep(3000);
        WebElement place1 = driver.findElement(By.xpath(FoundNear));
        place1.click();
        Thread.sleep(2000);
        place1.sendKeys("Main Hall");
        Thread.sleep(3000);
        WebElement CntMe1 = driver.findElement(By.xpath(FoundContact));
        CntMe1.click();
        Thread.sleep(2000);
        CntMe1.sendKeys("9876543219");
        Thread.sleep(3000);
        /*WebElement submitbtn1 = driver.findElement(By.xpath(Foundsubmit));
        submitbtn1.click();
        Thread.sleep(2000);
        WebElement msg1 = driver.findElement(By.xpath(submitmsg1));
        msg1.isDisplayed();
        Thread.sleep(4000);*/
        WebElement VLI = driver.findElement(By.xpath(ViewLostItems));
        VLI.click();
        Thread.sleep(5000);
        WebElement VLIback = driver.findElement(By.xpath(VLIBack));
        VLIback.click();
        Thread.sleep(2000);
        WebElement LAndFBack = driver.findElement(By.xpath(LandFBack));
        LAndFBack.click();
        Thread.sleep(2000);
    }

    //Donate Elements---------------------------------------------------------------------------------------------------

    public String ETDonate = "//android.view.View[@content-desc=\"Donate\"]";
    public String ETDTitle = "//android.view.View[@content-desc=\"Donate\"]";
    public String ETDonateBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void ETDonate() throws InterruptedException {
        WebElement ETD = driver.findElement(By.xpath(ETDonate));
        ETD.click();
        Thread.sleep(6000);
        WebElement ETDT = driver.findElement(By.xpath(ETDTitle));
        ETDT.isDisplayed();
        WebElement ETDBack = driver.findElement(By.xpath(ETDonateBack));
        ETDBack.click();
        Thread.sleep(3000);
    }

    //About Kanha Elements-----------------------------------------------------------------------------------------------

    public String AboutKanha = "//android.view.View[@content-desc=\"About Kanha\"]";
    public String AboutKanhaTile = "//android.view.View[@content-desc=\"About Kanha\"]";
    public String AboutKanhaBAck = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void AboutKanha() throws InterruptedException {
        WebElement AK = driver.findElement(By.xpath(AboutKanha));
        AK.click();
        Thread.sleep(5000);
        WebElement AKTitle = driver.findElement(By.xpath(AboutKanhaTile));
        AKTitle.isDisplayed();
        WebElement AKback = driver.findElement(By.xpath(AboutKanhaBAck));
        AKback.click();
        Thread.sleep(3000);
    }

    //Essential Service Elements-----------------------------------------------------------------------------------------

    public String EssentialService = "//android.view.View[@content-desc=\"Essential \n" +
            "Services\"]";
    public String EssentialServiceBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void EssentialService() throws InterruptedException {
        WebElement ES = driver.findElement(By.xpath(EssentialService));
        ES.click();
        Thread.sleep(5000);
        WebElement ESBack = driver.findElement(By.xpath(EssentialServiceBack));
        ESBack.click();
        Thread.sleep(3000);
    }

    //Master's Message Elements-------------------------------------------------------------------------------------------

    public String MasterMessage = "//android.view.View[@content-desc=\"Master's\n" +
            "Message\"]";
    public String MasterMessageBack = "//android.widget.ImageButton[@content-desc=\"Close tab\"]";

    public void MastersMessage() throws InterruptedException {
        WebElement MMsg = driver.findElement(By.xpath(MasterMessage));
        MMsg.click();
        Thread.sleep(5000);
        WebElement MMsgBack = driver.findElement(By.xpath(MasterMessageBack));
        MMsgBack.click();
        Thread.sleep(3000);
    }

    //Free Wifi Elements----------------------------------------------------------------------------------------------------

    public String FreeWifi = "//android.view.View[@content-desc=\"Free Wifi\"]";
    public String FreeWifiBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void FreeWifi() throws InterruptedException {
        WebElement FW = driver.findElement(By.xpath(FreeWifi));
        FW.click();
        Thread.sleep(4000);
        WebElement FWBAck = driver.findElement(By.xpath(FreeWifiBack));
        FWBAck.click();
        Thread.sleep(3000);
    }

    //GoldenBook Elements------------------------------------------------------------------------------------------------

    public String GoldenBook = "//android.view.View[@content-desc=\"Golden Book \n" +
            "Check-In\"]";
    public String GoldenBookBack = "//android.widget.ImageButton[@content-desc=\"Close tab\"]";

    public void GoldenBook() throws InterruptedException {
        WebElement GB = driver.findElement(By.xpath(GoldenBook));
        GB.click();
        Thread.sleep(5000);
        WebElement GBBack = driver.findElement(By.xpath(GoldenBookBack));
        GBBack.click();
        Thread.sleep(3000);
    }

    //Report an Issue Elements--------------------------------------------------------------------------------------------

    public String ReportAnIssue = "//android.view.View[@content-desc=\"Report an Issue\"]";
    public String ReportAnIssueBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void ReportAnIssue() throws InterruptedException {
        WebElement RAI = driver.findElement(By.xpath(ReportAnIssue));
        RAI.click();
        Thread.sleep(5000);
        WebElement RAIBack = driver.findElement(By.xpath(ReportAnIssueBack));
        RAIBack.click();
        Thread.sleep(3000);
    }

    //Suggestions Elements-----------------------------------------------------------------------------------------------

    public String Suggestions = "//android.view.View[@content-desc=\"Suggestions\"]";
    public String SuggestionsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void Suggestions() throws InterruptedException {
        WebElement Sug = driver.findElement(By.xpath(Suggestions));
        Sug.click();
        Thread.sleep(5000);
        WebElement SugBack = driver.findElement(By.xpath(SuggestionsBack));
        SugBack.click();
        Thread.sleep(3000);
    }

    //Archives Elements-------------------------------------------------------------------------------------------------

    public String Archives = "//android.view.View[@content-desc=\"Archives\"]";
    public String ArchivesBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";

    public void Archives() throws InterruptedException {
        WebElement Ar = driver.findElement(By.xpath(Archives));
        Ar.click();
        Thread.sleep(5000);
        WebElement ArBack = driver.findElement(By.xpath(ArchivesBack));
        ArBack.click();
        Thread.sleep(3000);
    }
}
