package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Recruitment_Orange {

	private  WebDriver driver;


	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement dashboardText;
	
	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitmentBtn;

	@FindBy(xpath = "//button[text()=' Add ']")
	private WebElement addBtn;

	@FindBy(xpath = "//input[@placeholder='First Name']")
	private WebElement firstName;

	@FindBy(xpath = "//input[@placeholder='Middle Name']")
	private WebElement middleName;

	@FindBy(xpath = "//input[@placeholder='Last Name']")
	private WebElement lastName;

	@FindBy(xpath = "//*[contains(@class,'oxd-icon bi-caret-down-fill oxd-select-text--arrow')]")
	private WebElement vacancy;

	@FindBy(xpath = "//*[text()='Associate IT Manager']")
	private WebElement selectAssociateITM;

	@FindBy(xpath = "(//input[@placeholder='Type here'])[1]")
	private WebElement email;

	@FindBy(xpath = "(//input[@placeholder='Type here'])[2]")
	private WebElement contactNumber;

	@FindBy(xpath = "//*[text()='Browse']")
	private WebElement browseFile;

	@FindBy(xpath = "//input[@placeholder='Enter comma seperated words...']")
	private WebElement keywords;

	@FindBy(xpath = "//input[@placeholder='yyyy-mm-dd']")
	private WebElement dateOfApplication;

	@FindBy(xpath = "//textarea[@placeholder='Type here']")
	private WebElement notes;

	@FindBy(xpath = "//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")
	private WebElement consent;

	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	@FindBy(xpath = "//*[@class='oxd-userdropdown-name']")
	private WebElement toLogout;

	@FindBy(xpath = "(//*[@class='oxd-userdropdown-link'])[4]")
	private WebElement logoutBtn;

	
	public WebElement getToLogout() {
		return toLogout;
	}
	public void setToLogout(WebElement toLogout) {
		this.toLogout = toLogout;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public void setLogoutBtn(WebElement logoutBtn) {
		this.logoutBtn = logoutBtn;
	}
	public WebElement getDashboardText() {
		return dashboardText;
	}
	public void setDashboardText(WebElement dashboardText) {
		this.dashboardText = dashboardText;
	}
	public WebElement getRecruitmentBtn() {
		return recruitmentBtn;
	}


	public void setRecruitmentBtn(WebElement recruitmentBtn) {
		this.recruitmentBtn = recruitmentBtn;
	}


	public WebElement getAddBtn() {
		return addBtn;
	}


	public void setAddBtn(WebElement addBtn) {
		this.addBtn = addBtn;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public void setFirstName(WebElement firstName) {
		this.firstName = firstName;
	}


	public WebElement getMiddleName() {
		return middleName;
	}


	public void setMiddleName(WebElement middleName) {
		this.middleName = middleName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public void setLastName(WebElement lastName) {
		this.lastName = lastName;
	}


	public WebElement getVacancy() {
		return vacancy;
	}


	public void setVacancy(WebElement vacancy) {
		this.vacancy = vacancy;
	}


	public WebElement getSelectAssociateITM() {
		return selectAssociateITM;
	}


	public void setSelectAssociateITM(WebElement selectAssociateITM) {
		this.selectAssociateITM = selectAssociateITM;
	}


	public WebElement getEmail() {
		return email;
	}


	public void setEmail(WebElement email) {
		this.email = email;
	}


	public WebElement getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(WebElement contactNumber) {
		this.contactNumber = contactNumber;
	}


	public WebElement getBrowseFile() {
		return browseFile;
	}


	public void setBrowseFile(WebElement browseFile) {
		this.browseFile = browseFile;
	}


	public WebElement getKeywords() {
		return keywords;
	}


	public void setKeywords(WebElement keywords) {
		this.keywords = keywords;
	}


	public WebElement getDateOfApplication() {
		return dateOfApplication;
	}


	public void setDateOfApplication(WebElement dateOfApplication) {
		this.dateOfApplication = dateOfApplication;
	}


	public WebElement getNotes() {
		return notes;
	}


	public void setNotes(WebElement notes) {
		this.notes = notes;
	}


	public WebElement getConsent() {
		return consent;
	}


	public void setConsent(WebElement consent) {
		this.consent = consent;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}
	
	
	public Recruitment_Orange(WebDriver abc){
		driver= abc;
		PageFactory.initElements(driver, this);

	}
}