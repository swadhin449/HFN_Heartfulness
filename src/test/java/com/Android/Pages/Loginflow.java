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

public class Loginflow {
    private AppiumDriver driver;

    TestUtils utils = new TestUtils();

    public Loginflow(){
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
    public String Logout = "//android.widget.Button[@content-desc=\"Logout\"]";
    public String continuewithPhoneorEmail = "//android.widget.ImageView[@content-desc=\"Continue with Phone or Email\"]";
    public String PhoneNoField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
    public String GetOTP = "//android.widget.Button[@content-desc=\"Get OTP\"]";
    public String Useemailinstead = "//android.view.View[@content-desc=\"Use email instead\"]";
    public String EmailField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
    public String NextButton = "//android.widget.Button[@content-desc=\"Next\"]";
    public String PasswordField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]";
    public String LoginButton = "//android.widget.Button[@content-desc=\"Login\"]";
    public String DeleteAccount = "//android.widget.Button[@content-desc=\"Delete Account\"]";
    public String CnfDelete = "//android.widget.Button[@content-desc=\"Delete\"]";

    public void CntWithGoogle() throws InterruptedException {
        Thread.sleep(5000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(3000);
        WebElement Account = driver.findElement(By.xpath(existinggoogleaccount));
        Account.click();
        Thread.sleep(20000);
    }
    public void Logout() throws InterruptedException {
        WebElement PS = driver.findElement(By.xpath(profileScreen));
        PS.click();
        /*boolean canScrollMore = (boolean) driver.executeScript("mobile: Scrollgesture", ImmutableMap.of(
                "left", 100, "top", 100, "width", 200, "height", 200,
                "direction", "down",
                "percent", 1.0
        ));*/
        Thread.sleep(5000);
        WebElement LGOut = driver.findElement(By.xpath(Logout));
        LGOut.click();
        Thread.sleep(7000);
    }
    public void cntWithPhOREmail() throws InterruptedException {
        WebElement PhOrEmail = driver.findElement(By.xpath(continuewithPhoneorEmail));
        PhOrEmail.click();
        Thread.sleep(3000);
    }
    public void PHField() throws InterruptedException {
        WebElement PhoneField = driver.findElement(By.xpath(PhoneNoField));
        PhoneField.click();
        Thread.sleep(1000);
        PhoneField.sendKeys("8688095255");
        Thread.sleep(1000);
        WebElement otpbtn = driver.findElement(By.xpath(GetOTP));
        otpbtn.click();
        Thread.sleep(40000);
    }
    public void EmailLogin() throws InterruptedException {
        WebElement Useemaillink = driver.findElement(By.xpath(Useemailinstead));
        Useemaillink.click();
        Thread.sleep(3000);
    }
    public void Emailcredentials() throws InterruptedException {
        WebElement emailField = driver.findElement(By.xpath(EmailField));
        emailField.click();
        Thread.sleep(2000);
        emailField.sendKeys("ksnp.gnt8466@gmail.com");
        Thread.sleep(3000);
        WebElement NxtBtn = driver.findElement(By.xpath(NextButton));
        NxtBtn.click();
        Thread.sleep(10000);
    }
    public void PasswordScreen() throws InterruptedException {
        WebElement passwordField = driver.findElement(By.xpath(PasswordField));
        passwordField.click();
        Thread.sleep(2000);
        passwordField.sendKeys("prasanth@123");
        Thread.sleep(2000);
        WebElement LoginBtn = driver.findElement(By.xpath(LoginButton));
        LoginBtn.click();
        Thread.sleep(40000);
    }
    public void DeleteAcct() throws InterruptedException {
        WebElement PS = driver.findElement(By.xpath(profileScreen));
        PS.click();
        Thread.sleep(5000);
        WebElement DLTAcct = driver.findElement(By.xpath(DeleteAccount));
        DLTAcct.click();
        Thread.sleep(2000);
        WebElement DLTcnf = driver.findElement(By.xpath(CnfDelete));
        DLTcnf.click();
        Thread.sleep(7000);

    }
    public void ConfirmDltAcct() throws InterruptedException {
        Thread.sleep(4000);
    }

}
