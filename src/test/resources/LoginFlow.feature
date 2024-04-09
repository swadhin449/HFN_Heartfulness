@LoginFlow
  Feature: Login Flow
    Scenario: Verifying Login Flow
      When I click on Continue with google it need to be login
      And Open profile screen and click on logout
      And I click on continue with phone or email it should open signup page
      And I enter phone number and click on get OTP button it redirect to OTP authentication screen
      And Logout from the app
      And I click on continue with phone or email it should open signup page
      And Click on Use email instead
      And Enter the email and click on next
      And Enter the password
      Then Verify the Login Flow

  @DeleteAccount
  Scenario: Verify Deleting the account
    When I click on Continue with google it need to be login
    And Open profile screen and click on Delete account
    Then Verify whether the account is deleted