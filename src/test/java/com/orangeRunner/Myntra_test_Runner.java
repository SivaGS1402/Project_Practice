package com.orangeRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.Page_Object_Manager.Page_Object_Manager;
import com.baseClass.BaseClass;

public class Myntra_test_Runner extends BaseClass {
	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = browserLaunch("chrome");

		
		url_Launch("https://www.myntra.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Page_Object_Manager pom = new Page_Object_Manager(driver);
	
		Thread.sleep(3000);
		click_element(pom.getInstancemymyntSearch().getMenBtn());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().getLevisBtn());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().getshirts());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().gethighlanderRadio());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().getdiscountRadio());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().getPopularity());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().gethighToLow());
		
		Thread.sleep(1000);
		click_element(pom.getInstancemymyntSearch().getWishList());
		
		Thread.sleep(1000);

		
//		driver.quit();
		
	}

	
}