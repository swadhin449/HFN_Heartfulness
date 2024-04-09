@Meditations
  Feature: Verifying Discover Tab
    Scenario: Verify Meditations
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      And Click on Meditations option and verify meditations are displayed or not
      And Verify Core Practices
      And Verify For Better Sleep
      And Verify Expand Consciousness
      And Verify For World Peace
      And Verify Develop Focus
      And Verify Sense of Calmness
      And Verify Attain inner Peace
      And Verify For Emotional Balance
      Then Verify Feel Rejuvenated

    @Diary
    Scenario: Verify Diary
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      And Click on Diary and verify its functionality
      Then Add one New Diary and verify

    @MoodMeter
    Scenario: Verify MoodMeter
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      Then Click on MoodMeter and verify its functionality

    @Donate
    Scenario: Verify Donate
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      Then Click on Donate and verify its fields

    @Achievements
    Scenario: Verify Achievements
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      Then Verify Achievements page and its functionality

    @Resources
    Scenario: Verify Resources
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      Then Verify Resources page and its functionality

    @SelfDevelopment
    Scenario: Verify Self Development
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      Then Verify Self development page and its functionality

    @Events
    Scenario: Verify Events
      When I Click on continue with google and select the google account
      And Navigate to Discover Tab
      And Click on Events
      And Click on Scheduled events and verify
      And Click on My Registrations and verify
      And Click on Key Locations and verify
      And Click on Announcements and verify
      And Click on Share my location and verify
      And Click on Lost and Found and verify
      And Click on Donate and verify
      And Click on About Kanha and verify
      And Click on Essential Services and verify
      And Click on Masters Message and verify
      And Click on Free Wifi and Verify
      And Click on Golden book check-in and verify
      And Click on Report an issue and verify
      And Click on Suggestions and verify
      Then Click on Archives and verify


