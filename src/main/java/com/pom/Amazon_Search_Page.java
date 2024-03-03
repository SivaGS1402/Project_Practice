package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Search_Page {
	private WebDriver driver;

	@FindBy(xpath = "//*[@class='gLFyf']")
	private WebElement googleSearch;

	@FindBy(xpath = "//*[@class='sbic vYOkbe']")
	private WebElement selectAmazon;

	@FindBy(xpath = "//*[@class='d8lRkd']")
	private WebElement clickAmazon;

	@FindBy(xpath = "//*[@id='twotabsearchtextbox']")
	private WebElement searchMobile;

	@FindBy(xpath = "//*[text()=' s24 ultra 5g']")
	private WebElement selectMobile;

	@FindBy(xpath = "(//span[text()='Samsung Galaxy S24 5G (Onyx Black, 8GB, 256GB Storage)'])[2]")
	private WebElement selectSamsungUltra5g;

	@FindBy(xpath = "(//*[@id='add-to-cart-button'])[2]")
	private WebElement addToCart;

	@FindBy(xpath = "//*[@class='a-button a-button-base attach-button-large attach-cart-button']")
	private WebElement proceedToCart;
	

	@FindBy(xpath = "//*[@class='hm-icon nav-sprite']")
	private WebElement optionBtn;
	
	@FindBy(xpath = "//*[text()='Movers and Shakers']")
	private WebElement moversAndShakers;

	public WebElement getProceedToCart() {
		return proceedToCart;
	}
	
	public void setProceedToCart(WebElement proceedToCart) {
		this.proceedToCart = proceedToCart;
	}
	
	public WebElement getGoogleSearch() {
		return googleSearch;
	}

	public void setGoogleSearch(WebElement googleSearch) {
		this.googleSearch = googleSearch;
	}

	public WebElement getSelectAmazon() {
		return selectAmazon;
	}

	public void setSelectAmazon(WebElement selectAmazon) {
		this.selectAmazon = selectAmazon;
	}

	public WebElement getClickAmazon() {
		return clickAmazon;
	}

	public void setClickAmazon(WebElement clickAmazon) {
		this.clickAmazon = clickAmazon;
	}

	public WebElement getSearchMobile() {
		return searchMobile;
	}

	public void setSearchMobile(WebElement searchMobile) {
		this.searchMobile = searchMobile;
	}

	public WebElement getSelectMobile() {
		return selectMobile;
	}

	public void setSelectMobile(WebElement selectMobile) {
		this.selectMobile = selectMobile;
	}

	public WebElement getSelectSamsungUltra5g() {
		return selectSamsungUltra5g;
	}

	public void setSelectSamsungUltra5g(WebElement selectSamsungUltra5g) {
		this.selectSamsungUltra5g = selectSamsungUltra5g;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public void setAddToCart(WebElement addToCart) {
		this.addToCart = addToCart;
	}

	public WebElement getOptionBtn() {
		return optionBtn;
	}

	public void setOptionBtn(WebElement optionBtn) {
		this.optionBtn = optionBtn;
	}

	public WebElement getMoversAndShakers() {
		return moversAndShakers;
	}

	public void setMoversAndShakers(WebElement moversAndShakers) {
		this.moversAndShakers = moversAndShakers;
	}


	public Amazon_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
}