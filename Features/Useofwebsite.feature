Feature: Customer Navigation to Website Usage Page

  Scenario: Customer navigates to the website usage page successfully
    When the customer clicks on the Usage of this website link from footer
    Then the customer should be redirected to the website usage page
    And the website usage page should display details of Website Usage Statistics

