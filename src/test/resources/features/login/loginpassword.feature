Feature: Can I log in to the page?
  Everyone with correct credential should be able to log in

  Scenario: positive path
    Given I am on the landing page
    And I enter my correct credentials
    Then I should be able to see successful log in message

  Scenario: wrong username
    Given I am on the landing page
    And I enter my incorrect username
    Then I should be able to see error message

  Scenario: Wrong password
    Given I am on the landing page
    And I enter my incorrect password
    Then I should be able to see unsuccessful log in message