@HomeScreen
  Feature: HomeScreen features
    Scenario: verifying homescreen features
      When I Click on continue with google and select the google account1
      And verify the username is displayed or not
      And select any one language and verify whether the language is changed or not
      And click on profile screen and verify whether the profile screen is displayed or not
      And click on mood meter and verify whether mood meter screen is displayed or not
      And verify fifteen, thirty, forty-five, other meditation options are displayed or not
#      And Verify meditate with trainer
#      And verify recommendations is displayed or not
      And verify meditations section
#      And verify daaji wisdom bridge book is displayed or not
      And verify self development section
      And verify donate section is displayed or not
      And verify feedback option
      And verify about Heartfulness
      And verify goals tab
      And Verify connect tab
      And verify discover tab
      And I select meditate button and select 30min and click on meditate now
      And I verify title of the session
      Then Click on end session and verify the summary screen and close the session

  @Circles
  Scenario: Verify creating My circle
    When I Click on continue with google and select the google account3
    And I click on connect tab then connect tab is displayed by verifying tittle
    And I verify My Circle title is displayed or not
    And I verify About My circle
    And I click on create meditation session and verify title and enter description
    And click on edit to change the meditation and confirm it
    Then Verify whether the circle is created or not











