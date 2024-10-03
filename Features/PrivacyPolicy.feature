Feature: Privacy Policy Navigation

  Background:
    Given I am on the homepage

  Scenario: Customer should be able to navigate to the Privacy Policy page successfully
    When I click on the Privacy Policy link in the footer
    Then I should be redirected to the Privacy Policy page
    And the page title should be Best Pay Monthly & Pay as You Go SIM Only Deals | Lyca Mobile
    And it should display privacy policy text