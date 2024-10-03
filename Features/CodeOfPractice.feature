Feature: Navigate to Code of Practice Page
  As a customer,
  I want to navigate to the Code of Practice page,
  So that I can understand the standards and practices of the company.
  Background:
    Given I am on the homepage
  Scenario: Customer clicks on Code of Practice link
    When I click on the Code of Practice link in the navigation menu
    Then I should be redirected to the Code of Practice page
    And I should see the content related to the Code of Practice
