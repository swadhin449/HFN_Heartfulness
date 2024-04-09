package com.iOS.Stepdef;
import com.iOS.Pages.LoginflowiOS;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFlowDefiOS {
    @When("I click on Continue with google it need to be login")
    public void iClickOnContinueWithGoogleItNeedToBeLogin() throws InterruptedException {
        new LoginflowiOS().CntWithGoogle();
    }

    @When("Open profile screen and click on logout")
    public void openProfileScreenAndClickOnLogout() throws InterruptedException {
        new LoginflowiOS().Logout();
    }

    @When("I click on continue with phone or email it should open signup page")
    public void iClickOnContinueWithPhoneOrEmailItShouldOpenSignupPage() throws InterruptedException {
       new LoginflowiOS().cntWithPhOREmail();
    }

    @When("I enter phone number and click on get OTP button it redirect to OTP authentication screen")
    public void iEnterPhoneNumberAndClickOnGetOTPButtonItRedirectToOTPAuthenticationScreen() throws InterruptedException {
        new LoginflowiOS().PHField();
    }

    @When("Logout from the app")
    public void logoutFromTheApp() throws InterruptedException {
        new LoginflowiOS().Logout();
    }

    @When("Click on Use email instead")
    public void clickOnUseEmailInstead() throws InterruptedException {
        new LoginflowiOS().EmailLogin();
    }

    @When("Enter the email and click on next")
    public void enterTheEmailAndClickOnNext() throws InterruptedException {
        new LoginflowiOS().Emailcredentials();
    }

    @When("Enter the password")
    public void enterThePassword() throws InterruptedException {
        new LoginflowiOS().PasswordScreen();
    }

    @Then("Verify the Login Flow")
    public void verifyTheLoginFlow() throws InterruptedException {
        new LoginflowiOS().Logout();
    }
    @When("Open profile screen and click on Delete account")
    public void openProfileScreenAndClickOnDeleteAccount() throws InterruptedException {
        new LoginflowiOS().DeleteAcct();
    }

    @Then("Verify whether the account is deleted")
    public void verifyWhetherTheAccountIsDeleted() throws InterruptedException {
        new LoginflowiOS().ConfirmDltAcct();
    }
}

