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
		features = "C:\\Users\\Siva\\Downloads\\ProjectPractice\\src\\test\\java\\com\\featurefile\\OrangeHRM_Recruitment.feature",
		glue = "com.stepDefinition_Recruitment",
		snippets= SnippetType.CAMELCASE,
		dryRun=!true,
		monochrome=true,
		plugin= {"html:HtmlReport/OrangeHrmRecruitment",
				"pretty",

				"json:JsonReport/OrangehrmRecruitment.jason",
				"com.cucumber.listener.ExtentCucumberFormatter:ExtentReport/"+"OrangehrmRecruitment.html"},
		tags= {"@SmokeTest,@SanityTest,@Logout"}
		)


public class OrangeHRM_Recruitment_Runner extends BaseClass {

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


