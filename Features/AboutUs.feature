Feature: Navigate to About Us Page

  Scenario: Customer accesses About Us from footer
    Given user on the homepage
    And I click on the About Us link in the footer
    Then I should be redirected to the About Us page
    And I should see information about the company