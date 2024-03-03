Feature: Orange HRM Login and visit PIM page

  @SmokeTest
  Scenario: Login functionality
    Given User launches the URL
    When User enters the username in the Username field
    And User enters the password in the Password field
    Then User clicks login button
    And It navigates to the Home Page

  @SanityTest
  Scenario: Visit the PIM page
    Given Navigate to PIM page User after successfully logged in
    When User clicks on the PIM link
    Then User should be on the PIM page
    And User search some details of an Employee and add Qualification details
    Then User clicks on the save button
    And It will finally save PIM page details successfully

  @Logout
  Scenario: Logout functionality
    Given User logs out from Orange HRM page
