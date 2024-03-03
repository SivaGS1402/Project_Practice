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
		features = "C:\\Users\\Siva\\eclipse-workspace\\ProjectPractice\\src\\test\\java\\featurefile\\Login.feature",
	    glue = "com.stepDefinition_Login" ,
	    plugin= "pretty"
	)

	
	public class Login_Runner extends BaseClass {

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
