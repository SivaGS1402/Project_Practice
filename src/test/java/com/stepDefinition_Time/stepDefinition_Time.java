package com.stepDefinition_Time;

import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Page_Object_Manager.Page_Object_Manager;
import com.baseClass.BaseClass;
import com.helper.Data_Reader_Manager;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class stepDefinition_Time extends BaseClass{

	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^User launches the URL$")
	public void user_launches_the_URL() throws IOException {
		String propUrl = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUrl();
		url_Launch(propUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

	@When("^User enters the username in the Username field$")
	public void user_enters_the_username_in_the_Username_field() throws IOException {

		String propUsername = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUsername();
		send_values(pom.getInstanceLP().getUsername(), propUsername);
	}

	@When("^User enters the password in the Password field$")
	public void user_enters_the_password_in_the_Password_field() throws IOException {

		String propPassword = Data_Reader_Manager.getInstanceDRM().getInstance().getPropPassword();
		send_values(pom.getInstanceLP().getPassword(), propPassword);
	}

	@Then("^User clicks login button$")
	public void user_clicks_login_button(){

		click_element(pom.getInstanceLP().getLoginBtn());

		String expectedResult= pom.getInstancemyRecruit().getDashboardText().getText();

		String actualResult = "Recruitment";
		assertEquals(actualResult, actualResult);
	}

	@Then("^It navigates to the Home Page$")
	public void itNavigatesToTheHomePage() throws Throwable {
	}

	@Given("^Navigate to Dashboard page User after successfully logged in$")
	public void navigate_to_Dashboard_page_User_after_successfully_logged_in() {


	}

	@When("^User clicks on the Time link$")
	public void user_clicks_on_the_Time_link() throws InterruptedException {
		Thread.sleep(2000);
		click_element(pom.getInstancemyTime().getTimeBtn());

	}

	@When("^User should be on the Timesheets page$")
	public void user_should_be_on_the_Timesheets_page() throws InterruptedException, AWTException {

		click_element(pom.getInstancemyTime().getTimesheets());
		
		click_element(pom.getInstancemyTime().getMyTimesheets());

		click_element(pom.getInstancemyTime().getEditBtn());
		
		click_element(pom.getInstancemyTime().getAddRow());
		
		send_values(pom.getInstancemyTime().getProject(), "a");
		Thread.sleep(2000);
		
		robotKeyPressDown();
		robotKeyPressEnter();

		click_element(pom.getInstancemyTime().getActivity());
		Thread.sleep(2000);

		robotKeyPressDown();
		robotKeyPressDown();
		robotKeyPressEnter();
		Thread.sleep(2000);

		send_values(pom.getInstancemyTime().getMon(), "4:00");
		
		send_values(pom.getInstancemyTime().getTue(), "5:00");
		
		send_values(pom.getInstancemyTime().getWed(), "4:00");
		
		send_values(pom.getInstancemyTime().getThu(), "6:00");
		
		send_values(pom.getInstancemyTime().getFri(), "5:00");

		send_values(pom.getInstancemyTime().getSat(), "8:00");
		
		send_values(pom.getInstancemyTime().getSun(), "2:00");

		click_element(pom.getInstancemyTime().getDeleteBtn());
		
	}
	

	@When("^User enter the Timesheets details of selected Employee$")
	public void user_enter_the_Timesheets_details_of_selected_Employee() {


	}

	@Then("^User will finally processed the Recruitment page details successfully$")
	public void user_will_finally_processed_the_Recruitment_page_details_successfully() {

	}

	@When("^User clicks on the save button$")
	public void userClicksOnTheSaveButton() throws Throwable {
	
	click_element(pom.getInstancemyTime().getSaveBtn());

	
	}

	
	@Given("^User logs out from Orange HRM page$")
	public void userLogsOutFromOrangeHRMPage() throws Throwable {
	}

}




