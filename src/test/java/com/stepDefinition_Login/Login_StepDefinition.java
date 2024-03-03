package com.stepDefinition_Login;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Manager.Page_Object_Manager;
import com.baseClass.BaseClass;
import com.helper.Data_Reader_Manager;
import com.testRunner.Login_Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_StepDefinition extends BaseClass{

	public static WebDriver driver= Login_Runner.driver;

	static Page_Object_Manager pom = new Page_Object_Manager(driver);


	
	@Given("^User launch the URL$")
	public void user_launch_the_URL() throws Throwable {
		String propUrl = Data_Reader_Manager.getInstanceDRM().getInstance().getPropUrl();
		url_Launch(propUrl);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	@When("^User enter the \"([^\"]*)\" in Username field$")
	public void user_enter_the_in_Username_field(String username) throws Throwable {
		send_values(pom.getInstanceLP().getUsername(), username);
	}

	@When("^User enter the \"([^\"]*)\" in Password field$")
	public void user_enter_the_in_Password_field(String password) throws Throwable {
		send_values(pom.getInstanceLP().getPassword(), password);
	}

	@Then("^click the login Button And It navigate to Home Page$")
	public void click_the_login_Button_And_It_navigate_to_Home_Page() throws Throwable {
		click_element(pom.getInstanceLP().getLoginBtn());
	}





}
