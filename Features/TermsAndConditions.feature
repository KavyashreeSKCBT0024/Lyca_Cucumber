Feature: Terms and Conditions Navigation

  Background:
    Given I am on the homepage

  Scenario: Customer should be able to navigate to the Terms and Conditions page successfully
    When I click on the Terms and Conditions link in the footer
    Then I should be redirected to the Terms and Conditions page
    And the page title should be Terms and Conditions
    And the URL should be https://www.lycamobile.co.uk/en/termscondition/
