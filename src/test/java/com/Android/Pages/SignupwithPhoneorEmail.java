package com.Android.Pages;

import com.utils.DriverManager;
import com.utils.GlobalParams;
import com.utils.TestUtils;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SignupwithPhoneorEmail {
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();

    public SignupwithPhoneorEmail(){
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

    public String continuewithPhoneorEmail = "Continue with Phone or Email";
    public String phonenumberfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
    public String incorrectPhnNumErrmsg = "//android.view.View[@content-desc=\"Please enter a valid number\"]";
    public String getotpbutton = "//android.widget.Button[@content-desc=\"Get OTP\"]";
    public String invalidotpfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View";
    public String ele5 = "//android.view.View[@content-desc=\"Invalid otp\"]";
    public String ResendLink = "//android.widget.Button[@content-desc=\"Resend\"]";
    public String Welcomemsg = "//android.widget.Button[@content-desc=\"Namaste!\n" +
            "What is your good name?\n" +
            "With any given name, you’d still be as good! :),\n" +
            "Continue\"]";
    public String usernameField = "//android.widget.Button[@content-desc=\"Namaste!\n" +
            "What is your good name?\n" +
            "With any given name, you’d still be as good! :),\n" +
            "Continue\"]/android.widget.EditText";
    public String dobField = "//android.widget.Button[@content-desc=\"Namaste!\n" +
            "What is your good name?\n" +
            "With any given name, you’d still be as good! :),\n" +
            "Continue\"]/android.view.View";
    public String don = "//android.widget.Button[@content-desc=\"Done\"]";
    public String continuebutton = "//android.widget.Button[@content-desc=\"Continue\"]";
    public String Homescreenelement = "//android.widget.ImageView[@content-desc=\"Home\"]";

    //For invalid Email Signup
    public String EmailInsteadLink = "//android.view.View[@content-desc=\"Use email instead\"]";
    public String EmailField = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText";
    public String Nextbutton = "//android.widget.Button[@content-desc=\"Next\"]";
    public String invalidEmailErrmsg = "//android.view.View[@content-desc=\"Please check your email\"]";
    public String usephonenumberinstead = "//android.view.View[@content-desc=\"Use phone number instead\"]";

    //For valid Email Signup
    public String InvalidOtpErrmsg = "//android.view.View[@content-desc=\"Invalid otp\"]";
    public String emailResendLink = "//android.widget.Button[@content-desc=\"Resend\"]";
    public String passwordfield = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]";
    public String passworderrmsg = "//android.view.View[@content-desc=\"password must be of min 8 characters\"]";
    public String showorhide = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[1]/android.widget.Button";
    public String reenterpass = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]";
    public String reenterpasserrmsg = "//android.view.View[@content-desc=\"password must be of min 8 characters\"]";
    public String nextbutton = "//android.widget.Button[@content-desc=\"Next\"]";
    public String passwordnotmatched = "//android.view.View[@content-desc=\"Passwords not matched\"]";
    public String showorhiderenter = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText[2]/android.widget.Button";
    public String Nextbutton1 = "//android.widget.Button[@content-desc=\"Next\"]";
    public String wlmimage = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.ImageView[2]";
    public String continuewithgoogle = "//android.widget.ImageView[@content-desc=\"Continue with Google\"]";
    public String existinggoogleaccount = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.LinearLayout";
    public void continuePhone() throws InterruptedException {
        Thread.sleep(12000);
        WebElement cwp = driver.findElement(AppiumBy.accessibilityId(continuewithPhoneorEmail));
        cwp.click();
        Thread.sleep(1000);
    }
    public void invalidPhone(String num) throws InterruptedException {
        WebElement no = driver.findElement(By.xpath(phonenumberfield));
        no.click();
        Thread.sleep(3000);
        no.sendKeys(num);
    }
    public void errTxt1(String error1) throws InterruptedException {
        WebElement errortxt = driver.findElement(By.xpath(incorrectPhnNumErrmsg));
        String data1 = errortxt.getAttribute("content-desc");
        Assert.assertEquals(error1,data1);
        Thread.sleep(2000);
    }
    public void clearNum() throws InterruptedException {
        WebElement cl = driver.findElement(By.xpath(phonenumberfield));
        cl.clear();
        Thread.sleep(1000);
    }
    public void validPhone(String num1) throws InterruptedException {
        WebElement no1 = driver.findElement(By.xpath(phonenumberfield));
        Thread.sleep(1000);
        no1.sendKeys(num1);
    }
    public void clkOtp() throws InterruptedException {
        WebElement otp = driver.findElement(By.xpath(getotpbutton));
        otp.click();
        Thread.sleep(30000);
    }
    public void validOtp() throws InterruptedException {
        Thread.sleep(5000);
    }
    public void welcomeTxt() throws InterruptedException {
        /*WebElement wlcmTxt = driver.findElement(By.xpath(Welcomemsg));
        String wlcmdata = wlcmTxt.getAttribute("content-desc");
        Assert.assertEquals(wlcmdata, "Namaste!\n" +
                "What is your good name?\n" +
                "With any given name, you’d still be as good! :),\n" +
                "Continue");*/
        Thread.sleep(2000);
    }
    public void userName(String uname) throws InterruptedException {
        WebElement un = driver.findElement(By.xpath(usernameField));
        un.click();
        Thread.sleep(1000);
        un.sendKeys(uname);
        Thread.sleep(2000);
    }
    public void dateOfBirth(String dateob) throws InterruptedException {
        WebElement db = driver.findElement(By.xpath(dobField));
        db.click();
        Thread.sleep(5000);
        /*List<WebElement> dob = driver.findElements(By.xpath("//android.widget.SeekBar"));
        for (int i=0; i<dob.size(); i++){
            System.out.println(dob.get(i).getText());
        }
        dob.get(0).sendKeys("10");
        dob.get(0).sendKeys(Keys.TAB);
        Thread.sleep(1000);
        dob.get(1).sendKeys("October");
        dob.get(1).sendKeys(Keys.TAB);
        Thread.sleep(1000);
        dob.get(2).sendKeys("2000");
        dob.get(2).sendKeys(Keys.TAB);
        Thread.sleep(1000);*/
        WebElement done = driver.findElement(By.xpath(don));
        done.click();
        Thread.sleep(2000);
        WebElement un = driver.findElement(By.xpath(usernameField));
        un.click();
        Thread.sleep(4000);
    }
    public void cont() throws InterruptedException {
        WebElement cn = driver.findElement(By.xpath(continuebutton));
        cn.click();
        Thread.sleep(15000);
    }
    public void HomeScreen() throws InterruptedException {
        WebElement HS = driver.findElement(By.xpath(Homescreenelement));
        HS.isDisplayed();
        Thread.sleep(3000);
    }
    //Invalid Email Credentials---------------------------------------------------------------------------------------
    public void continueemail() throws InterruptedException {
        Thread.sleep(15000);
        WebElement cwp = driver.findElement(AppiumBy.accessibilityId(continuewithPhoneorEmail));
        cwp.click();
        Thread.sleep(2000);
    }
    public void Useemail() throws InterruptedException {
        WebElement email = driver.findElement(By.xpath(EmailInsteadLink));
        email.click();
        Thread.sleep(2000);
    }
    public void enteremail(String iemail) throws InterruptedException {
        WebElement enteremail = driver.findElement(By.xpath(EmailField));
        enteremail.click();
        Thread.sleep(2000);
        enteremail.sendKeys(iemail);
        Thread.sleep(2000);
    }
    public void nxt() throws InterruptedException {
        WebElement next = driver.findElement(By.xpath(Nextbutton));
        next.click();
        Thread.sleep(1000);
    }
    public void errormsgiemail(String Error) throws InterruptedException {
        WebElement erroremail = driver.findElement(By.xpath(invalidEmailErrmsg));
        String Text = erroremail.getAttribute("content-desc");
        Assert.assertEquals(Text, Error);
        Thread.sleep(2000);
    }
    public void usephonelink() throws InterruptedException {
        WebElement phlink = driver.findElement(By.xpath(usephonenumberinstead));
        phlink.click();
        Thread.sleep(2000);
    }
    //Valid email credentials------------------------------------------------------------------------------------------
    public void vemail(String Email) throws InterruptedException {
        WebElement enteremail = driver.findElement(By.xpath(EmailField));
        enteremail.click();
        Thread.sleep(2000);
        enteremail.sendKeys(Email);
        Thread.sleep(10000);
    }
    public void iotp() throws InterruptedException {
        //Enter invalid otp
        Thread.sleep(20000);
    }
    public void errmsg(String errormessage) throws InterruptedException {
        /*WebElement otperrmsg = driver.findElement(By.xpath(InvalidOtpErrmsg));
        String Text = otperrmsg.getAttribute("content-desc");
        Assert.assertEquals(Text, errormessage);
        Thread.sleep(5000);*/
    }
    public void resend() throws InterruptedException {
        WebElement resendlink = driver.findElement(By.xpath(emailResendLink));
        resendlink.click();
        Thread.sleep(25000);
    }
    public void votp() throws InterruptedException {
        Thread.sleep(2000);
    }
    public void passlessthanreq(String ipass) throws InterruptedException {
        WebElement password = driver.findElement(By.xpath(passwordfield));
        password.click();
        Thread.sleep(1000);
        password.sendKeys(ipass);
        Thread.sleep(2000);
    }
    public void passErrmsg(String errmsg) throws InterruptedException {
        WebElement passworderrormsg = driver.findElement(By.xpath(passworderrmsg));
        String Text = passworderrormsg.getAttribute("content-desc");
        Assert.assertEquals(Text, errmsg);
        Thread.sleep(5000);
        passworderrormsg.clear();
        Thread.sleep(2000);
    }
    public void validpass(String vpass) throws InterruptedException {
        WebElement password1 = driver.findElement(By.xpath(passwordfield));
        password1.sendKeys(vpass);
        Thread.sleep(2000);
    }
    public void showhideicon() throws InterruptedException {
        WebElement icon = driver.findElement(By.xpath(showorhide));
        icon.click();
        Thread.sleep(2000);
        icon.click();
        Thread.sleep(2000);
    }
    public void ReEnteripass(String Rpass) throws InterruptedException {
        WebElement reenteripassword = driver.findElement(By.xpath(reenterpass));
        reenteripassword.click();
        Thread.sleep(2000);
        reenteripassword.sendKeys(Rpass);
        Thread.sleep(2000);
    }
    public void passErrmsg1(String errmsg1) throws InterruptedException {
        WebElement reentererrpass = driver.findElement(By.xpath(reenterpasserrmsg));
        String Text = reentererrpass.getAttribute("content-desc");
        Assert.assertEquals(Text, errmsg1);
        Thread.sleep(5000);
        reentererrpass.clear();
        Thread.sleep(2000);
    }
    public void reenterpassmincharacter() throws InterruptedException {
        WebElement reenteripassword = driver.findElement(By.xpath(reenterpass));
        reenteripassword.sendKeys("12345678");
        Thread.sleep(2000);
    }
    public void clknxt() throws InterruptedException {
        WebElement nxt = driver.findElement(By.xpath(nextbutton));
        nxt.click();

    }
    public void errormsgpassnotmatched(String errormessage) throws InterruptedException {
        WebElement errmsgpass = driver.findElement(By.xpath(passwordnotmatched));
        String Text = errmsgpass.getAttribute("content-desc");
        Assert.assertEquals(Text, errormessage);
        Thread.sleep(5000);
    }
    public void clear(){
        WebElement clr = driver.findElement(By.xpath(reenterpass));
        clr.clear();
    }
    public void reentervalidpass() throws InterruptedException {
        WebElement reentererrpass = driver.findElement(By.xpath(reenterpass));
        reentererrpass.sendKeys("Prasanth");
        Thread.sleep(1000);
    }
    public void Showorhide1() throws InterruptedException {
        WebElement icon = driver.findElement(By.xpath(showorhiderenter));
        icon.click();
        Thread.sleep(2000);
        icon.click();
        Thread.sleep(5000);
    }
    public void emailnext() throws InterruptedException {
        WebElement Next = driver.findElement(AppiumBy.accessibilityId("Next"));
        Next.click();
        Thread.sleep(5000);
    }

    public void Welcomeimage() throws InterruptedException {
        WebElement welimage = driver.findElement(By.xpath(wlmimage));
        welimage.isDisplayed();
        Thread.sleep(1000);
    }
    public void userName1(String usname) throws InterruptedException {
        WebElement un = driver.findElement(By.xpath(usernameField));
        un.click();
        Thread.sleep(1000);
        un.sendKeys(usname);
    }
    public void dobfield1(String dob1) throws InterruptedException {
        WebElement db = driver.findElement(By.xpath(dobField));
        db.click();
        Thread.sleep(15000);
        WebElement done = driver.findElement(By.xpath(don));
        done.click();
        Thread.sleep(1000);
        WebElement un = driver.findElement(By.xpath(usernameField));
        un.click();
        Thread.sleep(2000);
    }
    public void cntwithgoogle() throws InterruptedException {
        Thread.sleep(15000);
        WebElement google = driver.findElement(By.xpath(continuewithgoogle));
        google.click();
        Thread.sleep(3000);
    }
    public void googleAccount() throws InterruptedException {
        WebElement exgoogleAccount = driver.findElement(By.xpath(existinggoogleaccount));
        exgoogleAccount.click();
        Thread.sleep(10000);
    }




}

