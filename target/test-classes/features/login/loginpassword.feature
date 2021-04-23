Feature: Can I log in to the page?
  Everyone with correct credential should be able to log in

  Scenario: positive path
    Given I am on the landing page
#    When I see the log in field
    And I enter my correct credentials
#    Then I should be able to see Home page