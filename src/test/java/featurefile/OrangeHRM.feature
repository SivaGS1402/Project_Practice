Feature: Orange Hrm Login and visit my Info page

  @SmokeTest
  Scenario: Login functionality
    Given User launch the URL
    When User enter the username  in Username field
    And User enter the password in Password field
    Then click the login button
    And It navigate to Home Page

  @SanityTest
  Scenario: Visit My Info page
    Given Navigate to my info page User after succesfully logged in
    When User clicks on the My Info link
    Then User should be on the My Info page
    And User fill up the all details of my Info page
    Then User click on the save button
    And It will fianlly save My info details succesfully

	@Logout
  Scenario: Logout functionality
    Given User logout from Orange HRM page
