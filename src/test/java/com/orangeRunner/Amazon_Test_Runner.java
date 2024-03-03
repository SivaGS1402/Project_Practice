package com.orangeRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Page_Object_Manager.Page_Object_Manager;
import com.baseClass.BaseClass;
import com.pom.Amazon_Search_Page;

public class Amazon_Test_Runner extends BaseClass {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = browserLaunch("chrome");


		url_Launch("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		Page_Object_Manager pom = new Page_Object_Manager(driver);

		send_values(pom.getInstancemyAmzSearch().getGoogleSearch(), "amazon");

		click_element(pom.getInstancemyAmzSearch().getSelectAmazon());

		click_element(pom.getInstancemyAmzSearch().getClickAmazon());

		send_values(pom.getInstancemyAmzSearch().getSearchMobile(), "samsung");

		click_element(pom.getInstancemyAmzSearch().getSelectMobile());
		
		String parentWindow  = driver.getWindowHandle();
	
		click_element(pom.getInstancemyAmzSearch().getSelectSamsungUltra5g());

		Set<String> s = driver.getWindowHandles();
		for (String windowHandle : s) {
			
			driver.switchTo().window(windowHandle);

			if(driver.getTitle().equals("Samsung Galaxy S24 5G (Onyx Black, 8GB, 256GB Storage) : Amazon.in")) {

			click_element(pom.getInstancemyAmzSearch().getAddToCart());
			
			Thread.sleep(2000);
			driver.switchTo().window(parentWindow);

			click_element(pom.getInstancemyAmzSearch().getOptionBtn());
			
			click_element(pom.getInstancemyAmzSearch().getMoversAndShakers());


			
		}



	}


}
}
