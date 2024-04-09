package com.iOS.Pages;

import com.utils.DriverManager;
import com.utils.GlobalParams;
import com.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.MobileBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginflowiOS {
    private AppiumDriver driver;

    TestUtils utils = new TestUtils();

    public LoginflowiOS(){
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
    public String allw = "Allow";
    public String continuewithgoogle = "Continue with Google";
    public String conte = "Continue";
    public String existinggoogleaccount = "Noel Reddy noel.reddy@codeprism.in";
    public String profileScreen = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]";
    public String Logot = "Logout";
    public String continuewithPhoneorEmail = "Continue with Phone or Email";
    public String PhoneNoField = "**/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[2]/XCUIElementTypeOther[3]/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeTextField";
    public String Getotp = "Get OTP";
    public String UseEmail = "Use email instead";
    public String EmailField = "Email";
    public String NextButton = "Next";
    public String PasswordField = "Enter Password";
    public String LoginButton = "Login";
    public String DeleteAccount = "Delete Account";
    public String CnfDelete = "Delete";

    public void CntWithGoogle() throws InterruptedException {
        /*WebElement pop = driver.findElement(AppiumBy.accessibilityId(allw));
        pop.click();*/
        Thread.sleep(10000);
        WebElement google = driver.findElement(AppiumBy.accessibilityId(continuewithgoogle));
        google.click();
        Thread.sleep(2000);
        WebElement cnt = driver.findElement(AppiumBy.accessibilityId(conte));
        cnt.click();
        Thread.sleep(3000);
        WebElement Account = driver.findElement(AppiumBy.accessibilityId(existinggoogleaccount));
        Account.click();
        Thread.sleep(20000);
    }
    public void Logout() throws InterruptedException {
        WebElement PS = driver.findElement(MobileBy.iOSClassChain(profileScreen));
        PS.click();
        Thread.sleep(5000);
        WebElement LGOut = driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Logout\"]"));
        LGOut.click();
        Thread.sleep(10000);
    }
    public void cntWithPhOREmail() throws InterruptedException {
        WebElement PhOrEmail = driver.findElement(AppiumBy.accessibilityId(continuewithPhoneorEmail));
        PhOrEmail.click();
        Thread.sleep(3000);
    }
    public void PHField() throws InterruptedException {
        WebElement PhoneField = driver.findElement(MobileBy.iOSClassChain(PhoneNoField));
        PhoneField.sendKeys("8466983358");
        Thread.sleep(2000);
        WebElement otpbtn = driver.findElement(AppiumBy.accessibilityId(Getotp));
        otpbtn.click();
        Thread.sleep(30000);
    }
    public void EmailLogin() throws InterruptedException {
        WebElement Useemaillink = driver.findElement(AppiumBy.accessibilityId(UseEmail));
        Useemaillink.click();
        Thread.sleep(3000);
    }
    public void Emailcredentials() throws InterruptedException {
        WebElement emailField = driver.findElement(AppiumBy.accessibilityId(EmailField));
        emailField.sendKeys("ksnp.gnt8466@gmail.com");
        Thread.sleep(2000);
        WebElement NxtBtn = driver.findElement(AppiumBy.accessibilityId(NextButton));
        NxtBtn.click();
        Thread.sleep(10000);
    }
    public void PasswordScreen() throws InterruptedException {
        WebElement passwordField = driver.findElement(AppiumBy.accessibilityId(PasswordField));
        passwordField.sendKeys("prasanth@123");
        Thread.sleep(2000);
        WebElement LoginBtn = driver.findElement(AppiumBy.accessibilityId(LoginButton));
        LoginBtn.click();
        Thread.sleep(15000);
    }
    public void DeleteAcct() throws InterruptedException {
        WebElement PS = driver.findElement(MobileBy.iOSClassChain(profileScreen));
        PS.click();
        Thread.sleep(5000);
        WebElement DLTAcct = driver.findElement(AppiumBy.accessibilityId(DeleteAccount));
        DLTAcct.click();
        Thread.sleep(2000);
        WebElement DLTcnf = driver.findElement(AppiumBy.accessibilityId(CnfDelete));
        DLTcnf.click();
        Thread.sleep(10000);

    }
    public void ConfirmDltAcct() throws InterruptedException {
        Thread.sleep(4000);
    }

}
