package com.Page_Object_Manager;

import org.openqa.selenium.WebDriver;

import com.pom.Admin_Orange;
import com.pom.Amazom_cart_Page;
import com.pom.Amazon_Search_Page;
import com.pom.Login_Page_Orange;
import com.pom.My_info_Orange;
import com.pom.Myntra_Search_Page;
import com.pom.PIM_Orange;
import com.pom.Recruitment_Orange;
import com.pom.Time_Orange;

public class Page_Object_Manager {

	private WebDriver driver;

	private Login_Page_Orange lp;

	public Login_Page_Orange getInstanceLP() {

		if(lp == null) {

			lp= new Login_Page_Orange(driver);
		}
		return lp;
	}

	private My_info_Orange myInf;

	public My_info_Orange getInstancemyInf() {

		if(myInf == null) {

			myInf = new My_info_Orange(driver); 

		}
		return myInf;
	}

	private PIM_Orange myPIM;

	public PIM_Orange getInstancemyPIM() {

		if(myPIM == null) {

			myPIM = new PIM_Orange(driver); 

		}
		return myPIM;
	}
	

	private Admin_Orange myAdmin;

	public Admin_Orange getInstancemyAdmin() {

		if(myAdmin == null) {

			myAdmin = new Admin_Orange(driver); 

		}
		return myAdmin;
	}
	
	private Recruitment_Orange myRecruit;

	public Recruitment_Orange getInstancemyRecruit() {

		if(myRecruit == null) {

			myRecruit = new Recruitment_Orange(driver); 

		}
		return myRecruit;
	}
	
	private Time_Orange myTime;
	
	public Time_Orange getInstancemyTime() {
		
		if(myTime == null) {
			myTime = new Time_Orange(driver);
		}
		
		return myTime;
	}
	
	//For Amazon purchase Page 1
	private Amazon_Search_Page amzSearch;

	public Amazon_Search_Page getInstancemyAmzSearch() {

		if(amzSearch == null) {

			amzSearch = new Amazon_Search_Page(driver); 

		}
		return amzSearch;
	}
	//For Amazon purchase Page 2
	private Amazom_cart_Page amzCart;

	public Amazom_cart_Page getInstancemyamzCart() {

		if(amzCart == null) {

			amzCart = new Amazom_cart_Page(driver); 

		}
		return amzCart;
	}
	private Myntra_Search_Page myntSearch;

	public Myntra_Search_Page getInstancemymyntSearch() {

		if(myntSearch == null) {

			myntSearch = new Myntra_Search_Page(driver); 

		}
		return myntSearch;
	}
	
	public Page_Object_Manager(WebDriver driver2) {

		driver = driver2;

	}


}
