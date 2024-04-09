@MeditateNowFeatures
  Feature: Meditation features
    Scenario: 15 minutes Meditate now feature
      Given Click on continue with google and select the google account
      And User should able to see the meditate now options for fifteen thirty forty-five and others
      And Click on fifteen minutes option and click on meditate now button
      And Verify Settings option and change audio and background for meditation screen
      And Click on share option and verify whether it can be shared or not
      And verify star icon whether it is getting starred or not
      And Verify closing the session
      Then verify the summary screen with encourage message, meditated time, diary for note and close the session

    @Thirtymin
    Scenario: 30 minutes Meditate now feature
      Given Click on continue with google and select the google account
      And Click on Thirty minutes option and click on meditate now button
      Then Closing the session1


    @FortyFive
    Scenario: 45 minutes Meditate now feature
      Given Click on continue with google and select the google account
      And Click on forty five minutes option and click on meditate now button
      Then Closing the session2


    @Others
    Scenario: Other Meditate now feature
      Given Click on continue with google and select the google account
      And Click on others option and click on meditate now button
      Then Closing the session3
