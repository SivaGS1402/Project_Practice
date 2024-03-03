package com.stepDefinition_Recruitment;

import static org.testng.Assert.assertEquals;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
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


public class stepDefinition_Recruitment extends BaseClass{

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
	public void itNavigatesToTheHomePage() {
	}

	@Given("^Navigate to Dashboard page User after successfully logged in$")
	public void navigate_to_Dashboard_page_User_after_successfully_logged_in(){


	}

	@When("^User clicks on the Recruitment link$")
	public void user_clicks_on_the_Recruitment_link(){

		click_element(pom.getInstancemyRecruit().getRecruitmentBtn());

	}

	@Then("^User should be on the Recruitment page$")
	public void user_should_be_on_the_Recruitment_page(){


	}

	@Then("^User enter the details for Employee and corresponding details$")
	public void user_enter_the_details_for_Employee_and_corresponding_details() throws InterruptedException{

		click_element(pom.getInstancemyRecruit().getAddBtn());

		send_values(pom.getInstancemyRecruit().getFirstName(), "Suresh");

		send_values(pom.getInstancemyRecruit().getMiddleName(), "Gopi");

		send_values(pom.getInstancemyRecruit().getLastName(), "Ram");

		click_element(pom.getInstancemyRecruit().getVacancy());

		click_element(pom.getInstancemyRecruit().getSelectAssociateITM());

		send_values(pom.getInstancemyRecruit().getEmail(), "admin@example.com");

		send_values(pom.getInstancemyRecruit().getContactNumber(), "987654321");


	}


	@Then("^User uploads the document file$")
	public void user_uploads_the_document_file() throws InterruptedException, AWTException {


		click_element(pom.getInstancemyRecruit().getBrowseFile());
		Thread.sleep(2000);
		setClipboardData("C:\\Users\\Siva\\Downloads\\OrangeHRM.docx"); // Replace with the actual file path


		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

	} 




	private static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}



	@Then("^User will finally processed the Recruitment page details successfully$")
	public void user_will_finally_processed_the_Recruitment_page_details_successfully(){

	}

	@Then("^User clicks on the save button$")
	public void userClicksOnTheSaveButton() throws InterruptedException  {

		click_element(pom.getInstancemyRecruit().getDateOfApplication());
		Thread.sleep(1000);
		pressCtrlA(pom.getInstancemyRecruit().getDateOfApplication());
		Thread.sleep(2000);
		send_values(pom.getInstancemyRecruit().getDateOfApplication(), "2022-10-01");

		send_values(pom.getInstancemyRecruit().getNotes(), "Hi I am a software Automation Engineer");

		Thread.sleep(2000);
		click_element(pom.getInstancemyRecruit().getConsent());

		click_element(pom.getInstancemyRecruit().getSaveBtn());

	}

	@Given("^User logs out from Orange HRM page$")
	public void userLogsOutFromOrangeHRMPage() {

		click_element(pom.getInstancemyRecruit().getToLogout());

		click_element(pom.getInstancemyRecruit().getLogoutBtn());


	}





}






