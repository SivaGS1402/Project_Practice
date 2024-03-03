Feature: Orange HRM Login and visit Recruitment page

  @SmokeTest
  Scenario: Login functionality
    Given User launches the URL
    When User enters the username in the Username field
    And User enters the password in the Password field
    Then User clicks login button
    And It navigates to the Home Page

  @SanityTest
  Scenario: Visit the Recruitment page
    Given Navigate to Dashboard page User after successfully logged in
    When User clicks on the Recruitment link
    Then User should be on the Recruitment page
    And User enter the details for Employee and corresponding details
    And User uploads the document file
    Then User clicks on the save button
    And User will finally processed the Recruitment page details successfully

  @Logout
  Scenario: Logout functionality
    Given User logs out from Orange HRM page
