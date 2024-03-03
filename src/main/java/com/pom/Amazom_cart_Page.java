package com.pom;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazom_cart_Page {

	private WebDriver driver;


	@FindBy(xpath = "//input[@data-mix-operations='AddToCart']")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//input[@value='Proceed to checkout']")
	private WebElement proceedToBuy;

	public WebElement proceedToBuy() {
		return proceedToBuy;
	}
	public WebElement addToCart() {
		return addToCartBtn;
	}
	public WebElement getAddToCartBtn() {
		return addToCartBtn;
	}
	public WebElement getproceedToBuy() {
		return proceedToBuy;
	}


	public Amazom_cart_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}



