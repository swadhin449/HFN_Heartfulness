@SignupPhone
Feature: Continue with Phone or Email
  Scenario Outline: Phone valid
    When I click on continue with phone or email
    And Enter invalid phone number as "<number>"
    And Verify the error1 message as "<err1>"
    And Clear the mobile number
    And Enter Valid mobile number as "<number1>"
    And Click on Get OTP
    And Enter Valid OTP
    And Verify Welcome message
    And Enter Username as "<username>"
    And Enter Date of Birth "<dob>"
    And Click on Continue
    Then HomeScreen is displayed
    Examples:
      | number    | number1    | username | dob        | err1                        | err2        |
      | 112233445 | 7077311277 | tester1  | 13/06/1999 | Please enter a valid number | Invalid otp |

  @invalidEmail
  Scenario Outline: Email invalid
    When I click on continue with phone or email1
    And Click on Use email instead link
    And Enter invalid email "<invemail>"
    And Click on Next button
    And Verify the error message for incorrect email "<err>"
    Then Click on Use phone number instead link
    Examples:
      | invemail | err |
      | codeprism123 | Please check your email |

  @ValidEmail
  Scenario Outline: Email valid
    When I click on continue with phone or email2
    And Click on Use email instead link1
    And Enter valid email "<Vemail>"
    And Click on Next button1
    And Enter invalid otp
    And Verify the error message for incorrect otp "<err>"
    And Click on Resend link
    And Enter valid otp
    And Enter password less than seven characters "<invpass>"
    And Verify the error message for less than seven characters "<err1>"
    And Enter password with min eight characters "<vpass>"
    And Click on show icon to show the password and again click hide icon to hide password
    And Re-enter the password with less than seven characters "<invpass1>"
    And Verify the error message for less characters "<err2>"
    And Enter the password without matching valid password
    And Click on Next button2
    And Verify the error message for not matching the passwords "<err3>"
    And Clear the re-enter password field
    And Enter password matching the valid one
    And Click on show icon to show the password and click hide icon to hide password for re-enter field
    And Click on Next button3
    And Verify Welcome Image
    And Enter display name "<dname>"
    And Enter Date of Birth for email signup "<dob>"
    And Click on Continue for email signup
    Then HomeScreen is displayed for email signup
    Examples:
      | Vemail                  | err         | invpass | err1                                 | vpass    | invpass1 | err2                                 | err3                  | dname   | dob        |
      | prasanth.k@codeprism.in | Invalid otp | 123456  | password must be of min 8 characters | Prasanth | 12345    | password must be of min 8 characters | Passwords not matched | Testing | 13/06/1999 |

  @ContinuewithGoogle
  Scenario: Signup with Google account
    When I click on continue with google
    And Click on any one of existing google account
    Then User should see the Homescreen




