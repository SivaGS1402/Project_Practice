Feature: Orange HRM Login and visit Admin page

  @SmokeTest
  Scenario: Login functionality
    Given User launches the URL
    When User enters the username in the Username field
    And User enters the password in the Password field
    Then click  login button
    And It navigates to the Home Page

  @SanityTest
  Scenario: Visit the Admin page
    Given Navigate to admin page User after successfully logged in
    When User clicks on the Admin link
    Then User should be on the Admin page
    And User adds some details of Employee on the Admin page
    Then User clicks on the save button
    And It will finally save My info details successfully

  @Logout
  Scenario: Logout functionality
    Given User logs out from Orange HRM page
