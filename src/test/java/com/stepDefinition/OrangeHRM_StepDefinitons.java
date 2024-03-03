package com.stepDefinition;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.Page_Object_Manager.Page_Object_Manager;
import com.baseClass.BaseClass;
import com.helper.Data_Reader_Manager;
import com.testRunner.OrangeHRM_Runner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OrangeHRM_StepDefinitons extends BaseClass{

	public static WebDriver driver=OrangeHRM_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);


	@Given("^User launch the URL$")
	public void user_launch_the_URL() throws Throwable {
		String propUrl = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUrl();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^User enter the \"([^\"]*)\" in Username field$")
	public void user_enter_the_in_Username_field(String arg1) throws Throwable {
		String propUsername = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUsername();
		send_values(pom.getInstanceLP().getUsername(), propUsername);
		
	}

	@When("^User enter the \"([^\"]*)\" in Password field$")
	public void user_enter_the_in_Password_field(String arg1) throws Throwable {
		String propPassword = Data_Reader_Manager.getInstanceDRM().getInstance().getPropPassword();
		send_values(pom.getInstanceLP().getPassword(), propPassword);
		
	}

	@Then("^click the login Button And It navigate to Home Page$")
	public void click_the_login_Button_And_It_navigate_to_Home_Page() throws Throwable {
		
		click_element(pom.getInstanceLP().getLoginBtn());
		
	}
	
	@Then("^It navigate to Home Page$")
	public void it_navigate_to_Home_Page()  {
	}
	@Given("^Naviagate to home page User after succesfully logged in$")
	public void naviagateToHomePageUserAfterSuccesfullyLoggedIn()  {
	}
	@Given("^Navigate to my info page User after succesfully logged in$")
	public void navigateToMyInfoPageUserAfterSuccesfullyLoggedIn() throws Throwable {
	}
	@When("^User clicks on the My Info link$")
	public void userClicksOnTheMyInfoLink()  {
		click_element(pom.getInstancemyInf().getMyInfoBtn());

	}

	@Then("^User should be on the My Info page$")
	public void userShouldBeOnTheMyInfoPage()  {

	}
	@Then("^User fill up the all details of my Info page$")
	public void userFillUpTheAllDetailsOfMyInfoPage() throws InterruptedException {
		
		Thread.sleep(2000);
		doubleClick_element(pom.getInstancemyInf().getFirstName());
		pressCtrlA(pom.getInstancemyInf().getFirstName());
		send_values(pom.getInstancemyInf().getFirstName(), "Suresh");

		
		
		click_element(pom.getInstancemyInf().getMiddleName());
		Thread.sleep(3000);
		pressCtrlA(pom.getInstancemyInf().getMiddleName());
		send_values(pom.getInstancemyInf().getMiddleName(), "Kanna");

		
		click_element(pom.getInstancemyInf().getLastName());
		pressCtrlA(pom.getInstancemyInf().getLastName());
		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getLastName(), "Ram");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getNickName(),"Randy");

		
		doubleClick_element(pom.getInstancemyInf().getEmployeeID());
		
		send_values(pom.getInstancemyInf().getEmployeeID(), "159357");

		
		doubleClick_element(pom.getInstancemyInf().getOtherId());
		
		send_values(pom.getInstancemyInf().getOtherId(), "963213585	");

		
		doubleClick_element(pom.getInstancemyInf().getDriervLicenseNum());
		
		send_values(pom.getInstancemyInf().getDriervLicenseNum(), "75534490");

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getLicenseExpDate());
		pressCtrlA(pom.getInstancemyInf().getLicenseExpDate());
		
		send_values(pom.getInstancemyInf().getLicenseExpDate(), "2025-02-14");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getSsnNumber(), "2548372");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getSinNumber(), "86315");

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getNationality());

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSelectIndian());

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getMaritalStatus());

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSelectMarried());

		Thread.sleep(3000);
		click_element(pom.getInstancemyInf().getdOB());
		doubleClick_element(pom.getInstancemyInf().getdOB());
		
		send_values(pom.getInstancemyInf().getdOB(), "1992-10-25");

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getGenderBtn());

		Thread.sleep(1000);
		doubleClick_element(pom.getInstancemyInf().getMilitarySer());
		
		send_values(pom.getInstancemyInf().getMilitarySer(), "No");

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSmoke());

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSaveSub());

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getBloodGrp());

		
		click_element(pom.getInstancemyInf().getSelectbloodGrp());

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSaveSub1());

	}
	@Then("^User click on the save button$")
	public void userClickOnTheSaveButton() {

	}
	@Then("^It will fianlly save My info details succesfully$")
	public void itWillFianllySaveMyInfoDetailsSuccesfully() {

	}

	@Given("^User logout from Orange HRM page$")
	public void user_logout_from_Orange_HRM_page() throws InterruptedException  {
		Thread.sleep(2000);
		click_element(pom.getInstancemyInf().getLogout());
		click_element(pom.getInstancemyInf().getLogoutBtn());

	}


}
