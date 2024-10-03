Feature: Access FAQ Section

  As a customer,
  I want to access the FAQ section from the footer and the Help & Support section,
  So that I can find answers to my questions easily.

  Scenario: Accessing FAQ from the footer
    Given I am on the homepage
    And I click on the FAQ link in the footer
    Then I should be taken to the FAQ page