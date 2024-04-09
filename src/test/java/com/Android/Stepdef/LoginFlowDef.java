package com.Android.Stepdef;

import com.Android.Pages.Loginflow;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginFlowDef {
    @When("I click on Continue with google it need to be login")
    public void iClickOnContinueWithGoogleItNeedToBeLogin() throws InterruptedException {
        new Loginflow().CntWithGoogle();
    }

    @When("Open profile screen and click on logout")
    public void openProfileScreenAndClickOnLogout() throws InterruptedException {
        new Loginflow().Logout();
    }

    @When("I click on continue with phone or email it should open signup page")
    public void iClickOnContinueWithPhoneOrEmailItShouldOpenSignupPage() throws InterruptedException {
        new Loginflow().cntWithPhOREmail();
    }

    @When("I enter phone number and click on get OTP button it redirect to OTP authentication screen")
    public void iEnterPhoneNumberAndClickOnGetOTPButtonItRedirectToOTPAuthenticationScreen() throws InterruptedException {
        new Loginflow().PHField();
    }

    @When("Logout from the app")
    public void logoutFromTheApp() throws InterruptedException {
        new Loginflow().Logout();
    }

    @When("Click on Use email instead")
    public void clickOnUseEmailInstead() throws InterruptedException {
        new Loginflow().EmailLogin();
    }

    @When("Enter the email and click on next")
    public void enterTheEmailAndClickOnNext() throws InterruptedException {
        new Loginflow().Emailcredentials();
    }

    @When("Enter the password")
    public void enterThePassword() throws InterruptedException {
        new Loginflow().PasswordScreen();
    }

    @Then("Verify the Login Flow")
    public void verifyTheLoginFlow() throws InterruptedException {
        new Loginflow().Logout();
    }

    @When("Open profile screen and click on Delete account")
    public void openProfileScreenAndClickOnDeleteAccount() throws InterruptedException {
        new Loginflow().DeleteAcct();
    }

    @Then("Verify whether the account is deleted")
    public void verifyWhetherTheAccountIsDeleted() throws InterruptedException {
        new Loginflow().ConfirmDltAcct();
    }
}
