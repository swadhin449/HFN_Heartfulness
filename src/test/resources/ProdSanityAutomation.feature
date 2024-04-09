@ProdSanity
Feature: Login Flow
  Scenario: Verifying Login with Continue with google
    When I Open the app select the english language
    And Click on continue with google and select the google account
    And Click on continue
    Then Verify through continue with google is logged in

  Scenario Outline: Verify the login with email credentials
    When I Open the app select the english language
    And I click on continue with phone or email
    And Enter email as "<email>"
    And Enter OTP
    And Create Password "<Password>" and click on Next button
    And Enter details in Namaste screen "<Name>"
    And Verify through email credentials user got logged in
    Then Verify user is able to view Register as Heartfulness Practitioner button

    Examples:
      | email                     | Password | Name   |  |
      | sanitymail@mailinator.com | password | Sanity |  |

  Scenario Outline: verify the login with mobile number
    When I Open the app select the english language
    And I click on continue with phone or email
    And Enter mobile number as "<Number>"
    And Enter OTP
    And Verify through mobile number user got logged in
    Then Verify user is able to view locate trainer near me button
      Examples:
        | Number     |  |
        | 8466983358 |  |

@Profile
  Scenario: Verify Profile Bio
    When I Open the app select the english language
    And Click on continue with google and select the google account
    And Click on continue
    And Click on ProfileScreen and verify BIO
    And Click on profile image edit
    Then Verify the options

@TmtInsightesScreen
  Scenario: Verify log meditation details
    When I Open the app select the english language
    And And Click on continue with google and select the google account
    And Click on continue
    And Click on ProfileScreen and move to insightes screen
    And Click on share and cancel options
    And Click on view insightes and Log meditation button
    Then Add log meditation and verify whether it is adding

@Achievements
  Scenario: Verify Achievements
    When I Open the app select the english language
    And And Click on continue with google and select the google account
    And Click on continue
    And Click on ProfileScreen and move to Achievements section
    And Click on achievements share and cancel options
    And Add log meditation for sixty minutes and verify
    Then Verify achievements screen are updated

@ProfileME
  Scenario: Verify Profile ME section
    When I Open the app select the english language
    And And Click on continue with google and select the google account
    And Click on continue
    And Click on ProfileScreen and move to Me section
    And Enter details in the fields required to move to practitioner registration from
    Then verify details are edited and move to practitioner form

@Favourites
  Scenario: Verify Favourites screen
  When I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to favourites section
  And Click on Favourites
  Then Verify the favourites screen by provided options

@InviteFriends
  Scenario: Verify invite friends link
  When I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to invite friend section
  Then Share the link and verify

@HelpAndSupport
  Scenario: Verify help and support link
  When I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to Help and support section
  Then Verify the help and support option

@AboutHeartfulness
  Scenario: Verify about heartfulness
  When  I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to about heartfulness section
  Then Verify the about heartfulness option

@SelectLanguage
  Scenario: Verify Language section in the app
  When  I Open the app select the any language
  And And Click on continue with google and select the google account
  And Click on continue
  And Change languages
  Then verify app language is changed to selected language

@PrivacyPolicy
  Scenario: Verify Privacy Policy in the app
  When  I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to Privacy Policy section
  Then Verify the privacy policy option

@TermsAndConditions
  Scenario: Verify terms and conditions in the app
  When  I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to Terms and conditions section
  Then Verify the Terms and conditions section

@DeleteAccount
  Scenario: Verify deleting the account
  When  I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to delete option
  Then Verify deleting the account is working

@LogOut
  Scenario: Verify log out option in the app
  When  I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Click on ProfileScreen and move to LogOut option
  Then Verify LogOut option is working

@Donate
  Scenario: Verify Donation screen
  When  I Open the app select the english language
  And And Click on continue with google and select the google account
  And Click on continue
  And Navigate to Donation section
  And Verify the Donation functionality



