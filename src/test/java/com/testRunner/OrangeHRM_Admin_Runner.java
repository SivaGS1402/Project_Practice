package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Siva\\eclipse-workspace\\ProjectPractice\\src\\test\\java\\featurefile\\OrangeHRM_Admin.feature",
		glue = "com.stepDefinition_Admin",
		snippets= SnippetType.CAMELCASE,
		dryRun=!true,
		monochrome=true,
		plugin= {"html:HtmlReport/OrangeHrmAdmin",
				"pretty",

				"json:JsonReport/OrangehrmAdmin.jason",
				"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/"+"OrangehrmAdmin.html"},
		tags= {"@SmokeTest,@SanityTest,@Logout"}
		)


public class OrangeHRM_Admin_Runner extends BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = browserLaunch("chrome");
	}

	@AfterClass

	public static void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}

}


