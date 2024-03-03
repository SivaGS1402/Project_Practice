Feature: Login functionality

  Scenario Outline: Login functionality
    Given User launch the URL
    When User enter the "<Username>" in Username field
    And User enter the "<Password>" in Password field
    Then click the login Button And It navigate to Home Page

    Examples: 
      | Username | Password |
      | user1    | pass1    |
      | Admin    | pass1    |
      | user1    | admin123 |
      | Admin    | admin123 |
