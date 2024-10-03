Feature: Navigate to Coverage and Services Page

  As a customer,
  I want to navigate to the Coverage and Services page,
  So that I can understand the coverage options and services available.

  Background:
    Given I am on the homepage

  Scenario: Customer clicks on Coverage and Services link
    When I click on the Coverage and Services link in footerr
    Then I should be redirected to the Coverage and Services page
    And I should see the title Coverage and Services
    And I should see information about coverage options and available services
