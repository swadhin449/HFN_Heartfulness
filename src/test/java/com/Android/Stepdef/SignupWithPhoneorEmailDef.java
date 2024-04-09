package com.Android.Stepdef;

import com.Android.Pages.SignupwithPhoneorEmail;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignupWithPhoneorEmailDef {
    @When("^I click on continue with phone or email$")
    public void iClickOnContinueWithPhoneOrEmail() throws InterruptedException {
        new SignupwithPhoneorEmail().continuePhone();
    }

    @When("^Enter invalid phone number as \"([^\"]*)\"$")
    public void enterInvalidPhoneNumberAs(String number) throws InterruptedException {
        new SignupwithPhoneorEmail().invalidPhone(number);
    }
    @When("^Verify the error1 message as \"([^\"]*)\"$")
    public void verifyTheError1MessageAs(String err1) throws InterruptedException {
        new SignupwithPhoneorEmail().errTxt1(err1);
    }
    @When("^Clear the mobile number$")
    public void clearTheMobileNumber() throws InterruptedException {
        new SignupwithPhoneorEmail().clearNum();
    }
    @When("^Enter Valid mobile number as \"([^\"]*)\"$")
    public void enterValidMobileNumberAs(String number1) throws InterruptedException {
        new SignupwithPhoneorEmail().validPhone(number1);
    }
    @When("^Click on Get OTP$")
    public void clickOnGetOTP() throws InterruptedException {
        new SignupwithPhoneorEmail().clkOtp();
    }
    /*@When("^Enter invalid OTP$")
    public void enterInvalidOTP() throws InterruptedException {
        new SignupwithPhone().invalidOtp();
    }
    @When("^Verify the error2 message as \"([^\"]*)\"$")
    public void verifyTheError2MessageAs(String err2) throws InterruptedException {
        new SignupwithPhone().errTxt2(err2);
    }
    @When("^Click on Resend Link$")
    public void clickOnResendLink() throws InterruptedException {
        new SignupwithPhone().resendLink();
    }*/
    @When("^Enter Valid OTP$")
    public void enterValidOTP() throws InterruptedException {
        new SignupwithPhoneorEmail().validOtp();
    }
    @When("^Verify Welcome message$")
    public void verifyWelcomeMessage() throws InterruptedException {
        new SignupwithPhoneorEmail().welcomeTxt();
    }
    @When("^Enter Username as \"([^\"]*)\"$")
    public void enterUsernameAs(String username) throws InterruptedException {
        new SignupwithPhoneorEmail().userName(username);
    }
    @When("^Enter Date of Birth \"([^\"]*)\"$")
    public void enterDateOfBirth(String dob) throws InterruptedException {
        new SignupwithPhoneorEmail().dateOfBirth(dob);
    }
    @When("^Click on Continue$")
    public void clickOnContinue() throws InterruptedException {
        new SignupwithPhoneorEmail().cont();
    }
    @Then("^HomeScreen is displayed$")
    public void homeScreenisDisplayed() throws InterruptedException {
        new SignupwithPhoneorEmail().HomeScreen();
    }
    //Invalid Email-----------------------------------------------------------------------------------------------------
    @When("I click on continue with phone or email1")
    public void i_click_on_continue_with_phone_or_email1() throws InterruptedException {
        new SignupwithPhoneorEmail().continueemail();
    }
    @When("Click on Use email instead link")
    public void click_on_use_email_instead_link() throws InterruptedException {
        new SignupwithPhoneorEmail().Useemail();
    }
    @When("Enter invalid email {string}")
    public void enter_invalid_email(String invemail) throws InterruptedException {
        new SignupwithPhoneorEmail().enteremail(invemail);
    }
    @When("Click on Next button")
    public void click_on_next_button() throws InterruptedException {
        new SignupwithPhoneorEmail().nxt();
    }
    @When("Verify the error message for incorrect email {string}")
    public void verify_the_error_message_for_incorrect_email(String Error) throws InterruptedException {
        new SignupwithPhoneorEmail().errormsgiemail(Error);
    }
    @Then("Click on Use phone number instead link")
    public void click_on_use_phone_number_instead_link() throws InterruptedException {
        new SignupwithPhoneorEmail().usephonelink();
    }
    //Valid Email-------------------------------------------------------------------------------------------------------
    @When("I click on continue with phone or email2")
    public void i_click_on_continue_with_phone_or_email2() throws InterruptedException {
        new SignupwithPhoneorEmail().continueemail();
    }
    @When("Click on Use email instead link1")
    public void click_on_use_email_instead_link1() throws InterruptedException {
        new SignupwithPhoneorEmail().Useemail();
    }
    @When("Enter valid email {string}")
    public void enter_valid_email(String Email) throws InterruptedException {
        new SignupwithPhoneorEmail().vemail(Email);
    }
    @When("Click on Next button1")
    public void click_on_next_button1() throws InterruptedException {
        new SignupwithPhoneorEmail().nxt();
    }
    @When("Enter invalid otp")
    public void enter_invalid_otp() throws InterruptedException {
        new SignupwithPhoneorEmail().iotp();
    }
    @When("Verify the error message for incorrect otp {string}")
    public void verify_the_error_message_for_incorrect_otp(String errormessage) throws InterruptedException {
        new SignupwithPhoneorEmail().errmsg(errormessage);
    }
    @When("Click on Resend link")
    public void click_on_resend_link() throws InterruptedException {
        new SignupwithPhoneorEmail().resend();
    }
    @When("Enter valid otp")
    public void enter_valid_otp() throws InterruptedException {
        new SignupwithPhoneorEmail().votp();
    }
    @When("Enter password less than seven characters {string}")
    public void enter_password_less_than_characters( String ipass) throws InterruptedException {
        new SignupwithPhoneorEmail().passlessthanreq(ipass);
    }
    @When("Verify the error message for less than seven characters {string}")
    public void verify_the_error_message_for_less_than_characters(String errmsg) throws InterruptedException {
        new SignupwithPhoneorEmail().passErrmsg(errmsg);
    }
    @When("Enter password with min eight characters {string}")
    public void enter_password_with_min_characters(String vpass) throws InterruptedException {
        new SignupwithPhoneorEmail().validpass(vpass);
    }
    @When("Click on show icon to show the password and again click hide icon to hide password")
    public void click_on_show_icon_to_show_the_password_and_again_click_hide_icon_to_hide_password() throws InterruptedException {
        new SignupwithPhoneorEmail().showhideicon();
    }
    @When("Re-enter the password with less than seven characters {string}")
    public void re_enter_the_password_with_less_than_characters(String Rpass) throws InterruptedException {
        new SignupwithPhoneorEmail().ReEnteripass(Rpass);
    }
    @When("Verify the error message for less characters {string}")
    public void verify_the_error_message_for_less_characters(String errmsg1) throws InterruptedException {
        new SignupwithPhoneorEmail().passErrmsg1(errmsg1);
    }
    @When("Enter the password without matching valid password")
    public void enter_the_password_without_matching_valid_password() throws InterruptedException {
        new SignupwithPhoneorEmail().reenterpassmincharacter();
    }
    @When("Click on Next button2")
    public void click_on_next_button2() throws InterruptedException {
        new SignupwithPhoneorEmail().clknxt();
    }
    @When("Verify the error message for not matching the passwords {string}")
    public void verify_the_error_message_for_not_matching_the_passwords(String errormessage) throws InterruptedException {
        new SignupwithPhoneorEmail().errormsgpassnotmatched(errormessage);
    }
    @When("Clear the re-enter password field")
    public void clear_the_re_enter_password_field() {
        new SignupwithPhoneorEmail().clear();
    }
    @When("Enter password matching the valid one")
    public void enter_password_matching_the_valid_one() throws InterruptedException {
        new SignupwithPhoneorEmail().reentervalidpass();
    }
    @When("Click on show icon to show the password and click hide icon to hide password for re-enter field")
    public void click_on_show_icon_to_show_the_password_and_click_hide_icon_to_hide_password_for_re_enter_field() throws InterruptedException {
        new SignupwithPhoneorEmail().Showorhide1();
    }
    @When("Click on Next button3")
    public void clickOnNextButton3() throws InterruptedException {
       new SignupwithPhoneorEmail().emailnext();
    }

    @When("Verify Welcome Image")
    public void verify_welcome_image() throws InterruptedException {
        new SignupwithPhoneorEmail().Welcomeimage();
    }
    @When("Enter display name {string}")
    public void enter_display_name(String usname) throws InterruptedException {
        new SignupwithPhoneorEmail().userName1(usname);
    }
    @When("Enter Date of Birth for email signup {string}")
    public void enter_date_of_birth_for_email_signup(String dob1) throws InterruptedException {
        new SignupwithPhoneorEmail().dobfield1(dob1);
    }
    @When("Click on Continue for email signup")
    public void click_on_continue_for_email_signup() throws InterruptedException {
        new SignupwithPhoneorEmail().cont();
    }
    @Then("HomeScreen is displayed for email signup")
    public void home_screen_is_displayed_for_email_signup() throws InterruptedException {
        new SignupwithPhoneorEmail().HomeScreen();
    }

    //Continue with Google account--------------------------------------------------------------------------------------
    @When("I click on continue with google")
    public void iClickOnContinueWithGoogle() throws InterruptedException {
        new SignupwithPhoneorEmail().cntwithgoogle();
    }
    @When("Click on any one of existing google account")
    public void clickOnAnyOneOfExistingGoogleAccount() throws InterruptedException {
        new SignupwithPhoneorEmail().googleAccount();
    }
    @Then("User should see the Homescreen")
    public void userShouldSeeTheHomescreen() throws InterruptedException {
        new SignupwithPhoneorEmail().HomeScreen();
    }





}
