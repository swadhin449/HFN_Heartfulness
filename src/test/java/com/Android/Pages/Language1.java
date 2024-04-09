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

public class Language1 {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public Language1(){
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
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

    public void launchApp() throws InterruptedException {
        switch(new GlobalParams().getPlatformName()){
            case "Android":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("appPackage").toString());
                Thread.sleep(5000);
                break;
            case "iOS":
                ((InteractsWithApps) driver).activateApp(driver.getCapabilities().
                        getCapability("bundleId").toString());
        }
    }

    public String dropdown = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.widget.Button";
    public String hindi = "//android.view.View[@content-desc=\"अ\nहिन्दी\"]";
    public String btn = "//android.widget.Button[@content-desc=\"Done\"]";
    public String telegu = "అ\n" +
            "తెలుగు";
    public String btn1 = "हो गया";
    public String gujurati = "અ\n" +
            "ગુજરાતી";
    public String btn2 = "పూర్తి అయ్యింది";
    public String tamil= "அ\n" +
            "தமிழ்";
    public String btn3 = " થઈ ગયું ";
    public String kannada = "ಅ\n" +
            "ಕನ್ನಡ";
    public String btn4 = "செய்யப்பட்டது";
    public String marathi = "आ\n" +
            "मराठी";
    public String btn5 = "ಮುಗಿಯಿತು";

    public void dropClick() throws InterruptedException {
        Thread.sleep(7000);
        WebElement drop = driver.findElement(By.xpath(dropdown));
        drop.click();
        Thread.sleep(2000);
    }

    public void hindiLanguage() throws InterruptedException {
        WebElement lang1 = driver.findElement(By.xpath(hindi));
        lang1.click();
        Thread.sleep(1000);
    }
    public void btnClick() throws InterruptedException {
        WebElement button = driver.findElement(By.xpath(btn));
        button.click();
        Thread.sleep(1000);
    }
    public void teluguLanguage() throws InterruptedException {
        WebElement lang2 = driver.findElement(AppiumBy.accessibilityId(telegu));
        lang2.click();
        Thread.sleep(1000);
    }
    public void btn1Click() throws InterruptedException {
        WebElement button1 = driver.findElement(AppiumBy.accessibilityId(btn1));
        button1.click();
        Thread.sleep(1000);
    }
    public void gujuratiLanguage() throws InterruptedException {
        WebElement lang3 = driver.findElement(AppiumBy.accessibilityId(gujurati));
        lang3.click();
        Thread.sleep(1000);
    }
    public void btn2Click() throws InterruptedException {
        WebElement button2 = driver.findElement(AppiumBy.accessibilityId(btn2));
        button2.click();
        Thread.sleep(1000);
    }
    public void tamilLanguage() throws InterruptedException {
        WebElement lang4 = driver.findElement(AppiumBy.accessibilityId(tamil));
        lang4.click();
        Thread.sleep(1000);
    }
    public void btn3Click() throws InterruptedException {
        WebElement button3 = driver.findElement(AppiumBy.accessibilityId(btn3));
        button3.click();
        Thread.sleep(1000);
    }
    public void kannadaLanguage() throws InterruptedException {
        WebElement lang5 = driver.findElement(AppiumBy.accessibilityId(kannada));
        lang5.click();
        Thread.sleep(1000);
    }
    public void btn4Click() throws InterruptedException {
            WebElement button4 = driver.findElement(AppiumBy.accessibilityId(btn4));
        button4.click();
        Thread.sleep(1000);
    }
    public void marathiLanguage() throws InterruptedException {
        WebElement lang6 = driver.findElement(AppiumBy.accessibilityId(marathi));
        lang6.click();
        Thread.sleep(1000);
    }
    public void btn5Click() throws InterruptedException {
        WebElement button5 = driver.findElement(AppiumBy.accessibilityId(btn5));
        button5.click();
        Thread.sleep(3000);
    }
}
