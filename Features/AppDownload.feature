Feature: Redirect customer to app download links

  Background:
    Given the customer is on the homepage

  Scenario: Customer clicks on app download button for iOS
    When the customer clicks on the Download for iOS button
    Then the customer should be redirected to the Apple App Store link

  Scenario: Customer clicks on app download button for Android
    When the customer clicks on the Download for Android button
    Then the customer should be redirected to the Google Play Store link
