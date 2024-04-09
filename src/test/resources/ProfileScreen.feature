@ProfileScreen
  Feature: ProfileScreen validation
    Scenario: Profile Screen
      When I Click continue with google and select the google account
      And Click on ProfileScreen
      And Click on settings option and verify
      And Verify Log meditation and verify share option and view insights page
      And Verify Achievements card and click on view all
      And Verify Favourites card and its options
      And Click on Donate now will redirecting to donate page
      And Verify invite a friend card
      And Verify About Heartfulness Card in Profile page
      And Verify Select Language card
      And Verify Privacy Policy card
      Then Verify Terms and Conditions Card