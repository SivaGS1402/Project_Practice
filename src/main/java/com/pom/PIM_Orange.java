package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM_Orange {

	private  WebDriver driver;

	@FindBy(xpath = "//*[text()='PIM']")
	private WebElement pimBtn;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addBtn ;

	@FindBy(xpath = "//*[contains(text(),'Employee List')]")
	private WebElement employeeList;

	@FindBy(xpath = "//*[@class='oxd-icon bi-caret-down-fill']")
	private WebElement employeeInformation;

	@FindBy(xpath = "(//*[@placeholder='Type for hints...'])[1]")
	private WebElement employeeName;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement searchBtn;

	@FindBy(xpath = "//i[@class='oxd-icon bi-pencil-fill']")
	private WebElement editBtn;

	@FindBy(xpath = "//*[text()='Qualifications']")
	private WebElement qualificationDiv;

	@FindBy(xpath = "(//button[text()=' Add '])[2]")
	private WebElement addBtn1;

	@FindBy(xpath = "//div[@class='oxd-select-text--after']//i[1]")
	private WebElement levelDiv;
	
	@FindBy(xpath = "//div[text()='College Undergraduate']")
	private WebElement selectUG;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement institute;

	@FindBy(xpath = "(//label[text()='Major/Specialization']/following::input)[1]")
	private WebElement major;

	@FindBy(xpath = "(//label[text()='Year']/following::input)[1]")
	private WebElement year;
	
	@FindBy(xpath = "(//label[text()='GPA/Score']/following::input)[1]")
	private WebElement gpaScore;

	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[1]")
	private WebElement startDate;

	@FindBy(xpath = "(//input[@placeholder='yyyy-mm-dd'])[2]")
	private WebElement endDate;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-name']")
	private WebElement clicklog;
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement logOut;

	
	
	public WebElement getSelectUG() {
		return selectUG;
	}


	public void setSelectUG(WebElement selectUG) {
		this.selectUG = selectUG;
	}


	public WebElement getClicklog() {
		return clicklog;
	}


	public void setClicklog(WebElement clicklog) {
		this.clicklog = clicklog;
	}


	public WebElement getLogOut() {
		return logOut;
	}


	public void setLogOut(WebElement logOut) {
		this.logOut = logOut;
	}


	public WebElement getInstitute() {
		return institute;
	}


	public void setInstitute(WebElement institute) {
		this.institute = institute;
	}


	public WebElement getMajor() {
		return major;
	}


	public void setMajor(WebElement major) {
		this.major = major;
	}
	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getGpaScore() {
		return gpaScore;
	}

	public void setGpaScore(WebElement gpaScore) {
		this.gpaScore = gpaScore;
	}


	public WebElement getStartDate() {
		return startDate;
	}

	public void setStartDate(WebElement startDate) {
		this.startDate = startDate;
	}

	public WebElement getEndDate() {
		return endDate;
	}

	public void setEndDate(WebElement endDate) {
		this.endDate = endDate;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}

	public WebElement getPimBtn() {
		return pimBtn;
	}

	public void setPimBtn(WebElement pimBtn) {
		this.pimBtn = pimBtn;
	}

	public WebElement getEmployeeList() {
		return employeeList;
	}
	public WebElement getAddBtn1() {
		return addBtn1;
	}

	public void setAddBtn1(WebElement addBtn1) {
		this.addBtn1 = addBtn1;
	}

	public void setEmployeeList(WebElement employeeList) {
		this.employeeList = employeeList;
	}

	public WebElement getEmployeeInformation() {
		return employeeInformation;
	}

	public void setEmployeeInformation(WebElement employeeInformation) {
		this.employeeInformation = employeeInformation;
	}

	public WebElement getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(WebElement employeeName) {
		this.employeeName = employeeName;
	}

	public WebElement getSearchBtn() {
		return searchBtn;
	}

	public void setSearchBtn(WebElement searchBtn) {
		this.searchBtn = searchBtn;
	}

	public WebElement getEditBtn() {
		return editBtn;
	}

	public void setEditBtn(WebElement editBtn) {
		this.editBtn = editBtn;
	}

	public WebElement getQualificationDiv() {
		return qualificationDiv;
	}

	public void setQualificationDiv(WebElement qualificationDiv) {
		this.qualificationDiv = qualificationDiv;
	}

	public WebElement getLevelDiv() {
		return levelDiv;
	}

	public void setLevelDiv(WebElement levelDiv) {
		this.levelDiv = levelDiv;
	}


	public WebElement getAddBtn() {
		return addBtn;
	}

	public void setAddBtn(WebElement addBtn) {
		this.addBtn = addBtn;
	}

	public PIM_Orange(WebDriver abc){
		driver= abc;
		PageFactory.initElements(driver, this);

	}
}