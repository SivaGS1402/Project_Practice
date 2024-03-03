package com.testRunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.baseClass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	@RunWith(Cucumber.class)

	@CucumberOptions(
			features = "C:\\Users\\Siva\\Downloads\\ProjectPractice\\src\\test\\java\\com\\featurefile\\OrangeHRM_myinfo.feature",
			glue = "com.stepDefinition" ,
			plugin= "pretty"
			)


	public class MyInfo_Runner extends BaseClass {

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


