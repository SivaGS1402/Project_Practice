package com.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Myntra_Search_Page {

	private WebDriver driver;


	@FindBy(xpath = "(//*[@data-group='men'])[1]")
	private WebElement menBtn;

	@FindBy(xpath = "(//*[@class='image-image undefined image-hand'])[2]")
	private WebElement LevisBtn;

	@FindBy(xpath = "//label[text()='Shirts']")
	private WebElement shirts;
	
	@FindBy(xpath = "//label[text()='HIGHLANDER']")
	private WebElement highlanderRadio;

	@FindBy(xpath = "//label[text()='50% and above']")
	private WebElement discountRadio;

	@FindBy(xpath = "(//div[@class='horizontal-filters-sortContainer']//div)[3]")
	private WebElement popularity;

	@FindBy(xpath = "(//*[@class='sort-label '])[5]")
	private WebElement highToLow;
	
	@FindBy(xpath = "(//span[text()='wishlist'])[3]")
	private WebElement wishList;
	

	public WebElement getWishList() {
		return wishList;
	}

	public void setWishList(WebElement wishList) {
		this.wishList = wishList;
	}

	public void setPopularity(WebElement popularity) {
		this.popularity = popularity;
	}
	
	public WebElement gethighToLow() {
		return highToLow;
	}
	
	public void sethighToLow(WebElement highToLow) {
		this.highToLow = highToLow;
	}
	public WebElement getHighlanderRadio() {
		return highlanderRadio;
	}

	public void setHighlanderRadio(WebElement highlanderRadio) {
		this.highlanderRadio = highlanderRadio;
	}

	public WebElement getDiscountRadio() {
		return discountRadio;
	}

	public void setDiscountRadio(WebElement discountRadio) {
		this.discountRadio = discountRadio;
	}

	public WebElement getHighToLow() {
		return highToLow;
	}
	public WebElement getwishList() {
		return wishList;
	}

	public void setHighToLow(WebElement highToLow) {
		this.highToLow = highToLow;
	}

	public WebElement getMenBtn() {
		return menBtn;
	}

	public void setMenBtn(WebElement menBtn) {
		this.menBtn = menBtn;
	}

	public WebElement getLevisBtn() {
		return LevisBtn;
	}

	public void setLevisBtn(WebElement LevisBtn) {
		this.LevisBtn = LevisBtn;
	}

	public WebElement gethighlanderRadio() {
		return highlanderRadio;
	}

	public WebElement getShirts() {
		return shirts;
	}

	public void setShirts(WebElement shirts) {
		this.shirts = shirts;
	}

	public void sethighlanderRadio(WebElement highlanderRadio) {
		this.highlanderRadio = highlanderRadio;
	}

	public WebElement getshirts() {
		return shirts;
	}

	public void setshirts(WebElement shirts) {
		this.shirts = shirts;
	}

	public WebElement getdiscountRadio() {
		return discountRadio;
	}

	public void setdiscountRadio(WebElement discountRadio) {
		this.discountRadio = discountRadio;
	}

	public WebElement getPopularity() {
		return popularity;
	}
	
	public Myntra_Search_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
}