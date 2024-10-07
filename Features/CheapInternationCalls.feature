Feature: Access International Plans from Homepage

  As a customer,
  I want to easily access international plans specific to countries
  So that I can choose the best plan for my needs.

  Background:
    Given I am on the homepage of the service provider

  Scenario: View International Plans for Countries
    When I navigate to the International Plans section
    Then I should see a list of all available countries
    And select any country from the list
    And I should see the details of each plan including price and data limits
