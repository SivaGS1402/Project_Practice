package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


public class Login_Page_Orange {

	private  WebDriver driver;

	@FindBy(xpath = "//*[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//*[@name='password']")
	private WebElement password;	
	
	@FindBy(xpath = "//*[@type='submit']")
	private WebElement loginBtn;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}
	public Login_Page_Orange(WebDriver abc) {
		driver= abc;
		
		PageFactory.initElements(driver, this);
		
	}



}

