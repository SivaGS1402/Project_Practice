package com.stepDefinition_PIM;

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


public class stepDefinition_PIM extends BaseClass{

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

	}

	@Then("^It navigates to the Home Page$")
	public void itNavigatesToTheHomePage() throws Throwable {
	}


	@Given("^Navigate to PIM page User after successfully logged in$")
	public void navigateToPIMPageUserAfterSuccessfullyLoggedIn() {
	}
	@When("^User clicks on the PIM link$")
	public void user_clicks_on_the_PIM_link(){

		click_element(pom.getInstancemyPIM().getPimBtn());

	}

	@Then("^User should be on the PIM page$")
	public void user_should_be_on_the_PIM_page(){
	}

	@Then("^User search some details of an Employee and add Qualification details$")
	public void user_search_some_details_of_an_Employee_and_add_Qualification_details() throws InterruptedException, AWTException{

		click_element(pom.getInstancemyPIM().getEmployeeList());

		//		click_element(pom.getInstancemyPIM().getEmployeeInformation());
		//		
		//		Thread.sleep(1000);

		send_values(pom.getInstancemyAdmin().getEmployeeName(), "admin");
		Thread.sleep(2000);
		robotKeyPressDown();
		robotKeyPressEnter();

		click_element(pom.getInstancemyPIM().getSearchBtn());
		Thread.sleep(1000);
		click_element(pom.getInstancemyPIM().getEditBtn());

		click_element(pom.getInstancemyPIM().getQualificationDiv());

		click_element(pom.getInstancemyPIM().getAddBtn1());

		Thread.sleep(2000);
		click_element(pom.getInstancemyPIM().getLevelDiv());
		robotKeyPressDown();
		robotKeyPressEnter();
		 Thread.sleep(2000);
		 
		send_values(pom.getInstancemyPIM().getInstitute(), "Oxford University");
		Thread.sleep(2000);

		send_values(pom.getInstancemyPIM().getMajor(), "BE");
		Thread.sleep(2000);

		send_values(pom.getInstancemyPIM().getYear(), "2023");

		send_values(pom.getInstancemyPIM().getGpaScore(), "9");

		send_values((pom.getInstancemyPIM().getStartDate()), "2021-10-25");
//		Thread.sleep(3000);

		send_values(pom.getInstancemyPIM().getEndDate(), "2023-10-25");
		Thread.sleep(2000);


	}
	@Then("^User clicks on the save button$")
	public void userClicksOnTheSaveButton()  {

		click_element(pom.getInstancemyPIM().getSaveBtn());

	}


	@Then("^It will finally save PIM page details successfully$")
	public void itWillFinallySavePIMPageDetailsSuccessfully() throws Throwable {
	}


	@Given("^User logs out from Orange HRM page$")
	public void userLogsOutFromOrangeHRMPage()  {

		click_element(pom.getInstancemyPIM().getClicklog());
		click_element(pom.getInstancemyPIM().getLogOut());



	}



}








