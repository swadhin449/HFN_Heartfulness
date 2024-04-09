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


public class Homescreen {
    private AppiumDriver driver;
    
    TestUtils utils = new TestUtils();

    public Homescreen(){
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
    public String username = "//android.view.View[@content-desc=\"Prasanth\"]";
    public String Language = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]";
    public String Telugu = "//android.view.View[@content-desc=\"అ\n" +
            "తెలుగు\"]";
    public String done = "//android.widget.Button[@content-desc=\"Done\"]";
    public String English = "//android.view.View[@content-desc=\"A\n" +
            "English\"]";
    public String profilelink = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]";
    public String profilewidget = "//android.widget.Button[@content-desc=\"Edit\n" +
            "Prasanth\"]";
    public String profilebackbutton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String moodmeter = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String moodmeterReference = "//android.view.View[@content-desc=\"Mood Meter\"]";
    public String moodmeterBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String fifteen = "//android.view.View[@content-desc=\"15 mins\"]";
    public String thirty = "//android.view.View[@content-desc=\"30 mins\"]";
    public String fortyfive = "//android.view.View[@content-desc=\"45 mins\"]";
    public String other = "//android.view.View[@content-desc=\"Other\"]";
    public String meditatewithTrainer = "//android.widget.Button[@content-desc=\"Meditate with a Trainer\"]";
    public String meditatewithTrainerReference = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]";
    public String meditatewithTrainerback = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]";
    public String calender = "//android.view.View[@content-desc=\"March 2023\"]";
    public String recommendations = "//android.widget.ImageView[@content-desc=\"Recommendations\n" +
            "Setup a daily meditation\n" +
            "session\"]/android.widget.Button";
    public String RecommendationsBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String liveevents = "//android.widget.Button[@content-desc=\"2\n" +
            "testing the update of define session\n" +
            "Praveen1\n" +
            "December 1, 2023\n" +
            "10:13 AM, Fri\n" +
            "Add\"]";
    public String Goals = "//android.view.View[@content-desc=\"Good start \n" +
            "159\n" +
            "1 times | 15 mins\n" +
            "Timeline: \n" +
            "3 Days\n" +
            "Add\"]";
    public String meditations = "//android.widget.Button[@content-desc=\"Meditations\n" +
            "View All\"]";
    public String MeditatewithTrainer1 = "//android.widget.Button[@content-desc=\"Meditate with a Trainer\"]";
    public String Daajiwisdombridge = "//android.view.View[@content-desc=\"Meditate Now\n" +
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
            "valuable to us.\"]/android.widget.Button[3]";
    public String Quote = "//android.view.View[@content-desc=\"What is the source from which Grace descends? Tell me now, the air you are breathing, where is it contained?\n" +
            "Babuji\"]";
    public String Quote1 = "//android.view.View[@content-desc=\"In a heart-based meditation practice, we explore and experience the simplest and purest aspect of our existence.\n" +
            "Daaji\"]";
    public String Quote2 = "//android.view.View[@content-desc=\"The ego cannot be removed but transformed.\n" +
            "Daaji\"]";
    public String SDMind = "//android.widget.ImageView[@content-desc=\"mind\"]";
    public String SDBody = "//android.view.View[@content-desc=\"BODY\n" +
            "Tab 2 of 3\"]";
    public String SDSpirit = "//android.view.View[@content-desc=\"SPIRIT\n" +
            "Tab 3 of 3\"]";
    public String SDBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.Button";
    public String donate = "//android.widget.Button[@content-desc=\"Donate\"]";
    public String donationscreen = "//android.view.View[@content-desc=\"Donate\"]";
    public String donateBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String RateUS = "//android.widget.Button[@content-desc=\"Please rate us\"]";
    public String later = "//android.widget.Button[@content-desc=\"Later\"]";
    public String Aboutheartfulness = "//android.view.View[@content-desc=\"About Heartfulness\"]";
    public String AboutheartfulnessBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String GoalsTab = "//android.widget.ImageView[@content-desc=\"Goals\"]";
    public String connectTab = "//android.widget.ImageView[@content-desc=\"Connect\"]";
    public String discoverTab = "//android.widget.ImageView[@content-desc=\"Discover\"]";

    public void cntwithgoogle() throws InterruptedException {
        Thread.sleep(10000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(5000);
        WebElement account = driver.findElement(By.xpath(existinggoogleaccount));
        account.click();
        Thread.sleep(20000);
    }
    public void USname() throws InterruptedException {
        /*WebElement UN = driver.findElement(By.xpath(username));
        UN.isDisplayed();*/
        Thread.sleep(1000);
    }

    public void changelanguage() throws InterruptedException {
        WebElement lan = driver.findElement(By.xpath(Language));
        lan.click();
        Thread.sleep(2000);
        WebElement telugu = driver.findElement(By.xpath(Telugu));
        telugu.click();
        Thread.sleep(1000);
        WebElement cnt = driver.findElement(By.xpath(done));
        cnt.click();
        Thread.sleep(5000);
        Thread.sleep(1000);
        lan.click();
        Thread.sleep(1000);
        WebElement eng = driver.findElement(By.xpath(English));
        eng.click();
        Thread.sleep(1000);
        WebElement cnt1 = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"పూర్తి అయ్యింది\"]"));
        cnt1.click();
        Thread.sleep(2000);
    }
    public void ProfileScreen() throws InterruptedException {
        WebElement PS = driver.findElement(By.xpath(profilelink));
        PS.click();
        Thread.sleep(3000);
        WebElement back = driver.findElement(By.xpath(profilebackbutton));
        back.click();
        Thread.sleep(2000);
    }
    public void MoodMeter() throws InterruptedException {
        WebElement mm = driver.findElement(By.xpath(moodmeter));
        mm.click();
        Thread.sleep(2000);
        WebElement mm1 = driver.findElement(By.xpath(moodmeterReference));
        mm1.isDisplayed();
        Thread.sleep(2000);
        WebElement mm2 = driver.findElement(By.xpath(moodmeterBack));
        mm2.click();
        Thread.sleep(2000);
    }
    public void MedidationOptions() throws InterruptedException {
        WebElement fift = driver.findElement(By.xpath(fifteen));
        fift.isDisplayed();
        Thread.sleep(1000);
        WebElement Thirty = driver.findElement(By.xpath(thirty));
        Thirty.click();
        Thread.sleep(1000);
        Thirty.isDisplayed();
        Thread.sleep(1000);
        WebElement Fortyfive = driver.findElement(By.xpath(fortyfive));
        Fortyfive.click();
        Thread.sleep(1000);
        Fortyfive.isDisplayed();
        Thread.sleep(1000);
        WebElement Other = driver.findElement(By.xpath(other));
        Other.click();
        //Thread.sleep(1000);
        //Other.isDisplayed();
        Thread.sleep(10000);
    }
    /*public void Meditatewithtrainer() throws InterruptedException {
        WebElement MT = driver.findElement(By.xpath(meditatewithTrainer));
        MT.click();
        Thread.sleep(7000);
        *//*WebElement MTreference = driver.findElement(By.xpath(meditatewithTrainerReference));
        MTreference.isDisplayed();
        Thread.sleep(2000);*//*
        WebElement MTback = driver.findElement(By.xpath(meditatewithTrainerback));
        MTback.click();
        Thread.sleep(6000);
    }*/

    /*public void Recommendations() throws InterruptedException {
        WebElement Recom = driver.findElement(By.xpath(recommendations));
        Recom.click();
        Thread.sleep(2000);
        WebElement RecomBack = driver.findElement(By.xpath(RecommendationsBack));
        RecomBack.click();
        Thread.sleep(5000);
    }*/
    public void scrolldownMeditations() throws InterruptedException {
        /*Thread.sleep(5000);
        WebElement mdt = driver.findElement(By.xpath(meditations));
        mdt.isDisplayed();*/
        Thread.sleep(1000);
    }
    /*public void daajiWb() throws InterruptedException {
        WebElement Wisdombridge = driver.findElement(By.xpath(Daajiwisdombridge));
        Wisdombridge.isDisplayed();
        Thread.sleep(1000);
    }*/
    public void SelfDevelopment() throws InterruptedException {
        Thread.sleep(3000);
        WebElement SDM = driver.findElement(By.xpath(SDMind));
        SDM.click();
        Thread.sleep(7000);
        WebElement SDB = driver.findElement(By.xpath(SDBody));
        SDB.click();
        Thread.sleep(5000);
        WebElement SDS = driver.findElement(By.xpath(SDSpirit));
        SDS.click();
        Thread.sleep(5000);
        WebElement selfDevelopmentBack = driver.findElement(By.xpath(SDBack));
        selfDevelopmentBack.click();
        Thread.sleep(2000);
    }
    public void Donation() throws InterruptedException {
        Thread.sleep(3000);
        WebElement dnt = driver.findElement(By.xpath(donate));
        dnt.click();
        Thread.sleep(3000);
        WebElement dntscreen = driver.findElement(By.xpath(donationscreen));
        dntscreen.isDisplayed();
        Thread.sleep(2000);
        WebElement dntBack = driver.findElement(By.xpath(donateBack));
        dntBack.click();
        Thread.sleep(5000);
    }
    public void FeedBack() throws InterruptedException {
        WebElement FB = driver.findElement(By.xpath(RateUS));
        FB.click();
        Thread.sleep(10000);
        WebElement FBlater = driver.findElement(By.xpath(later));
        FBlater.click();
        Thread.sleep(1000);
    }
    public void About() throws InterruptedException {
        WebElement AboutHeartfulness = driver.findElement(By.xpath(Aboutheartfulness));
        AboutHeartfulness.click();
        Thread.sleep(2000);
        WebElement AboutHeartfulnessBack = driver.findElement(By.xpath(AboutheartfulnessBack));
        AboutHeartfulnessBack.click();
        Thread.sleep(2000);
    }
    public  void Goals() throws InterruptedException {
        WebElement gls = driver.findElement(By.xpath(GoalsTab));
        gls.click();
        Thread.sleep(3000);
    }
    public void Connect() throws InterruptedException {
        WebElement cnn = driver.findElement(By.xpath(connectTab));
        cnn.click();
        Thread.sleep(3000);
    }
    public void Discover() throws InterruptedException {
        WebElement dis = driver.findElement(By.xpath(discoverTab));
        dis.click();
        Thread.sleep(3000);
    }
 //----------------------------------------------------------------------------------------------------------------------
 // Meditate Now
    public String MeditateButton = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView";
    public String Thirtymin = "//android.view.View[@content-desc=\"30 mins\"]";
    public String meditatenow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String playPause = "//android.view.View[@content-desc=\"30 mins meditation\n" +
            "00:30:02\"]/android.view.View[2]/android.widget.ImageView[2]";
    public String skipintro = "//android.widget.Button[@content-desc=\"Skip Intro\"]";
    public String settings = "//android.view.View[@content-desc=\"30 mins meditation\n00:30:02\"]/android.widget.ImageView";
    public String stillBackground = "//android.widget.Button[@content-desc=\"Still\"]";
    public String HarpSound = "//android.widget.Button[@content-desc=\"Harp\"]";
    public String save = "//android.widget.Button[@content-desc=\"Save\"]";
    public String share = "//android.view.View[@content-desc=\"30 mins meditation\n" +
            "00:29:47\"]/android.view.View[1]/android.widget.ImageView[2]";
    public String star = "//android.view.View[@content-desc=\"30 mins meditation\n" +
            "00:29:42\"]/android.view.View[1]/android.widget.ImageView[1]";
    public String endsession = "//android.view.View[@content-desc=\"30 mins meditation\n" +
            "00:29:40\"]/android.view.View[1]/android.widget.Button";
    public String cancel = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String confirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String motivationMsg = "//android.view.View[@content-desc=\"Nice Try!\"]";
    public String meditationtime = "//android.view.View[@content-desc=\"You have meditated for\"]";
    public String closeSession = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String CloseMeditateNow = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.widget.ImageView";

    public void clickonPurpleButton() throws InterruptedException {
        Thread.sleep(3000);
        WebElement purpleButton = driver.findElement(By.xpath(MeditateButton));
        purpleButton.click();
        Thread.sleep(1000);
        WebElement thirtyMin = driver.findElement(By.xpath(Thirtymin));
        thirtyMin.click();
        Thread.sleep(1000);
        WebElement Meditatenow = driver.findElement(By.xpath(meditatenow));
        Meditatenow.click();
        Thread.sleep(4000);
    }
    public void VerifyTittle() throws InterruptedException {
        Thread.sleep(3000);
    }
    public void CloseSession() throws InterruptedException {
        /*WebElement Close = driver.findElement(By.xpath(endsession));
        Close.click();
        Thread.sleep(1000);
        WebElement Cancel = driver.findElement(By.xpath(cancel));
        Cancel.click();
        Thread.sleep(1000);
        Close.click();
        WebElement Confirm = driver.findElement(By.xpath(confirm));
        Confirm.click();
        Thread.sleep(3000);
        WebElement MotivationMsg = driver.findElement(By.xpath(motivationMsg));
        MotivationMsg.isDisplayed();
        WebElement time = driver.findElement(By.xpath(meditationtime));
        time.isDisplayed();
        Thread.sleep(1000);
        WebElement exit = driver.findElement(By.xpath(closeSession));
        exit.click();
        WebElement exitHomeScreen = driver.findElement(By.xpath(CloseMeditateNow));
        exitHomeScreen.click();
        Thread.sleep(2000);*/
        Thread.sleep(5000);
    }
    //------------------------------------------------------------------------------------------------------------------
    //My Circles
    public String Mediatewithtrainer = "//android.widget.ImageView[@content-desc=\"Meditate with a \n" +
            "Trainer\n" +
            "Meditate with a Trainer\"]";
    public String MeditatewithtrainerReference = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[2]";
    public String BackMeditatewithtrainer = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.ViewGroup/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TextView[1]";
    public String liveEventsinConnectTab = "//android.widget.Button[@content-desc=\"7\n" +
            "testing the update of define session\n" +
            "Praveen1\n" +
            "December 1, 2023\n" +
            "10:13 AM, Fri\n" +
            "Add\"]";
    public String MycircleCard = "//android.view.View[@content-desc=\"0\n" +
            "My Circle\"]";
    public String AboutMyCircle = "//android.view.View[@content-desc=\"0\n" +
            "My Circle\"]/android.widget.ImageView[1]";
    public String MycircleSettings = "//android.view.View[@content-desc=\"0\n" +
            "My Circle\"]/android.widget.ImageView[2]";
    public String invitefriends = "//android.widget.ImageView[@content-desc=\"Invite Friends\"]";
    public String searchfriends = "//android.view.View[@content-desc=\"My Circle\n" +
            "Search and form new connections with \n" +
            "friends who are using this app\"]/android.widget.EditText";
    public String friend = "//android.view.View[@content-desc=\"ksn Prasanth\"]";
    public String sendRequest = "//android.view.View[@content-desc=\"Send request\"]";
    public String CreateSession = "//android.widget.ImageView[@content-desc=\"Create a \n" +
            "Meditation session\"]";
    public String MeditateTogetherCard = "//android.view.View[@content-desc=\"Meditate Together\"]";
    public String EditDescription = "//android.view.View[@content-desc=\"Meditate Together\"]/android.widget.EditText";
    public String EditPurpose = "//android.widget.Button[@content-desc=\"Edit\"]";
    public String selectVideo = "//android.widget.ImageView[@content-desc=\"In this post we will look at 6 types of meditation videos that YouTube creators can easily make without the need for an expensive camera, lights, complicated software, or advance video editing skills.\n" +
            "00:10 min\"]";
    public String CreateActivity = "//android.widget.Button[@content-desc=\"Create Activity\"]";
    public String sucessfulcreativity = "//android.view.View[@content-desc=\"Activity \n" +
            "'Meditate Together' \n" +
            "has been successfully created.\"]";

    public void Connect1() throws InterruptedException {
        WebElement cnn = driver.findElement(By.xpath(connectTab));
        cnn.click();
        Thread.sleep(3000);
        WebElement reference = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Connect\"]"));
        reference.isDisplayed();
        Thread.sleep(1000);
    }
    public void myCircleCard() throws InterruptedException {
        /*WebElement Tittle = driver.findElement(By.xpath(MycircleCard));
        Tittle.isDisplayed();*/
        Thread.sleep(1000);
    }
    public void AboutMycircles() throws InterruptedException {
        WebElement about = driver.findElement(By.xpath(AboutMyCircle));
        about.click();
        Thread.sleep(2000);
        WebElement aboutreference = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"You can add or invite people to join your circle or be invited to join others’ circles.\"]"));
        aboutreference.isDisplayed();
        Thread.sleep(1000);
        WebElement quitaboutMycircle = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.widget.ImageView"));
        quitaboutMycircle.click();
        Thread.sleep(1000);
    }
    public void creatingsession() throws InterruptedException {
        WebElement creatmeditationsession = driver.findElement(By.xpath(CreateSession));
        creatmeditationsession.click();
        Thread.sleep(5000);
        WebElement meditateTogetherCard = driver.findElement(By.xpath(MeditateTogetherCard));
        meditateTogetherCard.isDisplayed();
        WebElement enterdescription = driver.findElement(By.xpath(EditDescription));
        enterdescription.click();
        Thread.sleep(2000);
        enterdescription.sendKeys("Lets meditate");
        Thread.sleep(3000);
        //click Keyboard back manually
    }
    public void changeVideo() throws InterruptedException {
        WebElement editVideo = driver.findElement(By.xpath(EditPurpose));
        editVideo.click();
        Thread.sleep(3000);
        WebElement Video = driver.findElement(By.xpath(selectVideo));
        Video.click();
        Thread.sleep(5000);
        //Confirm Manually
        //Select date and time manually
        WebElement createActivity = driver.findElement(By.xpath(CreateActivity));
        createActivity.click();
        Thread.sleep(5000);
    }
    public void VerifyMyCircle() throws InterruptedException {
        /*WebElement SucessfullMsg = driver.findElement(By.xpath(sucessfulcreativity));
        SucessfullMsg.isDisplayed();*/
        Thread.sleep(2000);
    }
}



