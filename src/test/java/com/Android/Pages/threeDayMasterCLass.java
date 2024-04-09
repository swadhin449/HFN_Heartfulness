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

public class threeDayMasterCLass {
    private AppiumDriver driver;

    TestUtils utils = new TestUtils();

    public threeDayMasterCLass(){
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

    public String lanpopup = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String continuewithgoogle = "//android.widget.ImageView[@content-desc=\"Continue with Google\"]";
    public String existinggoogleaccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout";
    public String lan = "//android.view.View[@content-desc=\"Click to change the\n" +
            "language\"]";
    public String masterClassCard = "//android.view.View[@content-desc=\"Learn how to Meditate\n" +
            "3-Day Masterclass\n" +
            "Start >\"]";
    public String title = "//android.view.View[@content-desc=\"3-Day Masterclass\"]";
    public String dayOne = "//android.view.View[@content-desc=\"Day 1\"]";
    public String dayTwo = "//android.view.View[@content-desc=\"Day 2\"]";
    public String dayThree = "//android.view.View[@content-desc=\"Day 3\"]";
    public String shareOption = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String  shareCancel = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.Button";
    public String introVideo = "//android.view.View[@content-desc=\"Introduction\n" +
            "Get started\n" +
            "01:03 min\"]";
    public String playPause = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button";
    //public String landScape = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView";
    public String introclose = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String cancel = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String confirm = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String summaryScreen = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.ImageView";
    public String exit = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String dayOneVideo = "//android.view.View[@content-desc=\"Relax\n" +
            "07:38 min\"]";
    public String PlayPauseDayOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.widget.Button";
    public String closeOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button[1]";
    public String cancelOne = "//android.widget.Button[@content-desc=\"Cancel\"]";
    public String confirmOne = "//android.widget.Button[@content-desc=\"Confirm\"]";
    public String exitOne = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.ImageView";
    public String threeDayMasterClassBack = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";

    public void cntwithgoogle() throws InterruptedException {
        Thread.sleep(6000);
        WebElement lan = driver.findElement(By.xpath(lanpopup));
        lan.click();
        Thread.sleep(2000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(3000);
        WebElement account = driver.findElement(By.xpath(existinggoogleaccount));
        account.click();
        Thread.sleep(20000);
    }
    public void threedaymasterclass() throws InterruptedException {
        /*WebElement l = driver.findElement(By.xpath(lan));
        l.click();
        Thread.sleep(3000);*/
        WebElement msCard = driver.findElement(By.xpath(masterClassCard));
        msCard.click();
        Thread.sleep(3000);
    }
    public void threedaymasterclassscreen() throws InterruptedException {
        WebElement header = driver.findElement(By.xpath(title));
        header.isDisplayed();
        WebElement subheader = driver.findElement(By.xpath(dayOne));
        subheader.isDisplayed();
        WebElement subheaderTwo = driver.findElement(By.xpath(dayTwo));
        subheaderTwo.isDisplayed();
        WebElement subheaderThree = driver.findElement(By.xpath(dayThree));
        subheaderThree.isDisplayed();
        Thread.sleep(2000);
    }
    public void deeplink() throws InterruptedException {
        WebElement share = driver.findElement(By.xpath(shareOption));
        share.click();
        Thread.sleep(3000);
        WebElement cancel = driver.findElement(By.xpath(shareCancel));
        cancel.click();
        Thread.sleep(2000);
    }
    public void intro() throws InterruptedException {
        WebElement introduction = driver.findElement(By.xpath(introVideo));
        introduction.click();
        Thread.sleep(5000);
    }
    public void mediabuttons() throws InterruptedException {
        WebElement media = driver.findElement(By.xpath(playPause));
        media.click();
        Thread.sleep(2000);
    }
    public void popupbuttons() throws InterruptedException {
        WebElement introClose = driver.findElement(By.xpath(introclose));
        introClose.click();
        Thread.sleep(1000);
        WebElement cancelintro = driver.findElement(By.xpath(cancel));
        cancelintro.click();
        Thread.sleep(2000);
        introClose.click();
        Thread.sleep(1000);
        WebElement confirmintro = driver.findElement(By.xpath(confirm));
        confirmintro.click();
        Thread.sleep(3000);
    }
    public void Summaryscreen() throws InterruptedException {
        WebElement ref = driver.findElement(By.xpath(summaryScreen));
        ref.isDisplayed();
        Thread.sleep(1000);
        WebElement end = driver.findElement(By.xpath(exit));
        end.click();
        Thread.sleep(3000);
    }
    public void dayonemedia() throws InterruptedException {
        WebElement dayOne = driver.findElement(By.xpath(dayOneVideo));
        dayOne.click();
        Thread.sleep(5000);
        WebElement media = driver.findElement(By.xpath(PlayPauseDayOne));
        media.click();
        Thread.sleep(2000);
    }
    public void end() throws InterruptedException {
        WebElement close = driver.findElement(By.xpath(closeOne));
        close.click();
        Thread.sleep(1000);
        WebElement cancel = driver.findElement(By.xpath(cancelOne));
        cancel.click();
        Thread.sleep(2000);
        close.click();
        WebElement confirm = driver.findElement(By.xpath(confirmOne));
        confirm.click();
        Thread.sleep(3000);
        WebElement closeDayOne = driver.findElement(By.xpath(exitOne));
        closeDayOne.click();
        Thread.sleep(2000);
    }
    public void Exit() throws InterruptedException {
        WebElement back = driver.findElement(By.xpath(threeDayMasterClassBack));
        back.click();
        Thread.sleep(4000);
    }
}
