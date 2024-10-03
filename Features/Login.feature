Feature: Successful Login to Lycamobile App

  Scenario: User successfully logs in with valid credentials
    Given the user is on the homepage
    When the user clicks on the profile icon
    And the user clicks on My LycaMobile
    And the user enters a valid phone number
    And the user clicks on the Login button
    And the user enters a valid one-time passcode
    And the user clicks on Confirm one-time passcode
    Then the user should be redirected to the My Account page
    And the user should see their account dashboard