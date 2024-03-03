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
		features = "C:\\Users\\Siva\\Downloads\\ProjectPractice\\src\\test\\java\\com\\featurefile\\OrangeHRM_Time.feature",
		glue = "com.stepDefinition_Time",
		snippets= SnippetType.CAMELCASE,
		dryRun=!true,
		monochrome=true,
		plugin= {"html:HtmlReport/OrangeHrmRecruitment",
				"pretty",
				"json:JsonReport/OrangehrmTime.json",
				"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/"+"OrangehrmTime.html"},

		tags= {"@SmokeTest,@SanityTest,@Logout"}
		)

public class OrangeHRM_Time_Runner extends BaseClass {

	public static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = browserLaunch("chrome");
	}

	@AfterClass

	public static void close() throws InterruptedException {
		Thread.sleep(3000);
		//		driver.quit();
	}



}


