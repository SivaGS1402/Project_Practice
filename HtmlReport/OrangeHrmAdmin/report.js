$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Siva/eclipse-workspace/ProjectPractice/src/test/java/featurefile/OrangeHRM_Admin.feature");
formatter.feature({
  "line": 1,
  "name": "Orange HRM Login and visit Admin page",
  "description": "",
  "id": "orange-hrm-login-and-visit-admin-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login functionality",
  "description": "",
  "id": "orange-hrm-login-and-visit-admin-page;login-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "User launches the URL",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User enters the username in the Username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters the password in the Password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "click  login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "It navigates to the Home Page",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition_Admin.user_launches_the_URL()"
});
formatter.result({
  "duration": 2173393500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.user_enters_the_username_in_the_Username_field()"
});
formatter.result({
  "duration": 7708699000,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.user_enters_the_password_in_the_Password_field()"
});
formatter.result({
  "duration": 153777400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.clickLoginButton()"
});
formatter.result({
  "duration": 171729800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.it_navigates_to_the_Home_Page()"
});
formatter.result({
  "duration": 24200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Visit the Admin page",
  "description": "",
  "id": "orange-hrm-login-and-visit-admin-page;visit-the-admin-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@SanityTest"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "Navigate to admin page User after successfully logged in",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "User clicks on the Admin link",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "User should be on the Admin page",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "User adds some details of Employee on the Admin page",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User clicks on the save button",
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "It will finally save My info details successfully",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition_Admin.navigate_to_admin_page_User_after_successfully_logged_in()"
});
formatter.result({
  "duration": 38800,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.user_clicks_on_the_Admin_link()"
});
formatter.result({
  "duration": 6151555500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.user_should_be_on_the_Admin_page()"
});
formatter.result({
  "duration": 33500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.user_adds_some_details_of_Employee_on_the_Admin_page()"
});
formatter.result({
  "duration": 28649792500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.user_clicks_on_the_save_button()"
});
formatter.result({
  "duration": 16900,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition_Admin.it_will_finally_save_My_info_details_successfully()"
});
formatter.result({
  "duration": 14700,
  "status": "passed"
});
formatter.scenario({
  "line": 21,
  "name": "Logout functionality",
  "description": "",
  "id": "orange-hrm-login-and-visit-admin-page;logout-functionality",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 20,
      "name": "@Logout"
    }
  ]
});
formatter.step({
  "line": 22,
  "name": "User logs out from Orange HRM page",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinition_Admin.user_logs_out_from_Orange_HRM_page()"
});
formatter.result({
  "duration": 56200,
  "status": "passed"
});
});