package com.stepDefinition_Admin;

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


public class stepDefinition_Admin extends BaseClass{

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

	@Then("^click  login button$")
	public void clickLoginButton() {
		click_element(pom.getInstanceLP().getLoginBtn());
	}
	@Then("^It navigates to the Home Page$")
	public void it_navigates_to_the_Home_Page() {

	}

	@Given("^Navigate to admin page User after successfully logged in$")
	public void navigate_to_admin_page_User_after_successfully_logged_in() {

	}

	@When("^User clicks on the Admin link$")
	public void user_clicks_on_the_Admin_link() {
		click_element(pom.getInstancemyAdmin().getAdminBtn());
	}

	@Then("^User should be on the Admin page$")
	public void user_should_be_on_the_Admin_page() {

	}

	@Then("^User adds some details of Employee on the Admin page$")
	public void user_adds_some_details_of_Employee_on_the_Admin_page() throws InterruptedException, AWTException {

		click_element(pom.getInstancemyAdmin().getUserMgmt());

		click_element(pom.getInstancemyAdmin().getUsers());

		click_element(pom.getInstancemyAdmin().getAddBtn());

		click_element(pom.getInstancemyAdmin().getUserRole());

		click_element(pom.getInstancemyAdmin().getSelectAdmin());

		Thread.sleep(1000);
		send_values(pom.getInstancemyAdmin().getEmployeeName(), "p");
		Thread.sleep(2000);
		robotKeyPressDown();
		robotKeyPressEnter();


		click_element(pom.getInstancemyAdmin().getStatus());

		click_element(pom.getInstancemyAdmin().getSelectEnabled());

		send_values(pom.getInstancemyAdmin().getUsernamefield(), "Suresh");

		send_values(pom.getInstancemyAdmin().getPasswordfield(), "Ram@1234");

		send_values(pom.getInstancemyAdmin().getConfirmPasswordfield(), "Ram@1234");


	}

	@Then("^User clicks on the save button$")
	public void user_clicks_on_the_save_button() {

	}

	@Then("^It will finally save My info details successfully$")
	public void it_will_finally_save_My_info_details_successfully() {

	}

	@Given("^User logs out from Orange HRM page$")
	public void user_logs_out_from_Orange_HRM_page() {

	}





}
