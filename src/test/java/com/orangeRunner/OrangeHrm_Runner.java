package com.orangeRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Page_Object_Manager.Page_Object_Manager;
import com.baseClass.BaseClass;

public class OrangeHrm_Runner extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = browserLaunch("chrome");


		url_Launch("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Page_Object_Manager pom = new Page_Object_Manager(driver);

		//LOGIN PAGE
		send_values(pom.getInstanceLP().getUsername(), "Admin");

		send_values(pom.getInstanceLP().getPassword(), "admin123");

		click_element(pom.getInstanceLP().getLoginBtn());

		//HOME PAGE

		click_element(pom.getInstancemyInf().getMyInfoBtn());

		Thread.sleep(2000);
		doubleClick_element(pom.getInstancemyInf().getFirstName());
		Thread.sleep(2000);
		send_values(pom.getInstancemyInf().getFirstName(), "Suresh");


		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getMiddleName(), "Gopi");

		Thread.sleep(1000);
		doubleClick_element(pom.getInstancemyInf().getLastName());
		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getLastName(), "Ram");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getNickName(), "Randy");

		Thread.sleep(1000);
		doubleClick_element(pom.getInstancemyInf().getEmployeeID());
		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getEmployeeID(), "159357");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getOtherId(), "963213585	");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getDriervLicenseNum(), "75534490");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getLicenseExpDate(), "2025-02-14");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getSsnNumber(), "6322656");

		Thread.sleep(1000);
		send_values(pom.getInstancemyInf().getSinNumber(), "440026");

		click_element(pom.getInstancemyInf().getNationality());
		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSelectIndian());

		click_element(pom.getInstancemyInf().getMaritalStatus());
		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getSelectMarried());

		Thread.sleep(2000);
		send_values(pom.getInstancemyInf().getdOB(), "1992-10-25");

		Thread.sleep(1000);
		click_element(pom.getInstancemyInf().getGenderBtn());

		Thread.sleep(3000);
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

		// ADMIN PAGE

//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin().getAdminBtn());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin().getUserMgmt());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin().getUsers());
//
//		WebDriverWait wait1 = new WebDriverWait(driver, 10);
//		wait1.until(ExpectedConditions.elementToBeClickable(pom.getInstancemyAdmin().getViratKohli()));
//		click_element(pom.getInstancemyAdmin().getViratKohli());
//
//		Thread.sleep(1000);
//		send_values(pom.getInstancemyAdmin().getEmpName(), "Cric");
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin().getYesBtn());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin(). getSubmitBtn());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin(). getQualificaionBtn());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin(). getEducationBtn());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin(). getEditEduBtn());
//
//		Thread.sleep(1000);
//		click_element(pom.getInstancemyAdmin(). getSubmitBtn1());
//

		driver.quit();
	}



}
