package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin_Orange {

	private  WebDriver driver;
	
	@FindBy(xpath = "//a[.='Admin']")
	private WebElement adminBtn;
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement userMgmt;
	
	@FindBy(xpath = "//a[contains(text(),'Users')]")
	private WebElement users;
	
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--secondary']")
	private WebElement addBtn;
	
	@FindBy(xpath = "(//i[contains(@class,'oxd-icon bi-caret-down-fill')])[2]")
	private WebElement userRole;
	
	@FindBy(xpath = "(//*[text()='Admin'])[3]")
	private WebElement selectAdmin;
	
	@FindBy(xpath = "//input[@placeholder='Type for hints...']")
	private WebElement employeeName;
	
	@FindBy(xpath = "(//*[contains(@class,'oxd-icon bi-caret-down-fill')])[3]")
	private WebElement status;
	
	@FindBy(xpath = "//*[text()='Enabled']")
	private WebElement selectEnabled;
	
	@FindBy(xpath = "(//input[@class='oxd-input oxd-input--active'])[2]")
	private WebElement usernamefield;
	
	@FindBy(xpath = "(//input[@type='password'])[1]")
	private WebElement passwordfield;
	
	@FindBy(xpath = "(//input[@type='password'])[2]")
	private WebElement confirmPasswordfield;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;

	public WebElement getAdminBtn() {
		return adminBtn;
	}
	public void setAdminBtn(WebElement adminBtn) {
		this.adminBtn = adminBtn;
	}
	public WebElement getUserMgmt() {
		return userMgmt;
	}
	public void setUserMgmt(WebElement userMgmt) {
		this.userMgmt = userMgmt;
	}
	public WebElement getUsers() {
		return users;
	}
	public void setUsers(WebElement users) {
		this.users = users;
	}
	public WebElement getAddBtn() {
		return addBtn;
	}
	public void setAddBtn(WebElement addBtn) {
		this.addBtn = addBtn;
	}
	public WebElement getUserRole() {
		return userRole;
	}
	public void setUserRole(WebElement userRole) {
		this.userRole = userRole;
	}
	public WebElement getSelectAdmin() {
		return selectAdmin;
	}
	public void setSelectAdmin(WebElement selectAdmin) {
		this.selectAdmin = selectAdmin;
	}
	public WebElement getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(WebElement employeeName) {
		this.employeeName = employeeName;
	}
	public WebElement getStatus() {
		return status;
	}
	public void setStatus(WebElement status) {
		this.status = status;
	}
	public WebElement getSelectEnabled() {
		return selectEnabled;
	}
	public void setSelectEnabled(WebElement selectEnabled) {
		this.selectEnabled = selectEnabled;
	}
	public WebElement getUsernamefield() {
		return usernamefield;
	}
	public void setUsernamefield(WebElement usernamefield) {
		this.usernamefield = usernamefield;
	}
	public WebElement getPasswordfield() {
		return passwordfield;
	}
	public void setPasswordfield(WebElement passwordfield) {
		this.passwordfield = passwordfield;
	}
	public WebElement getConfirmPasswordfield() {
		return confirmPasswordfield;
	}
	public void setConfirmPasswordfield(WebElement confirmPasswordfield) {
		this.confirmPasswordfield = confirmPasswordfield;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}
	

	public Admin_Orange(WebDriver abc){
		driver= abc;
		PageFactory.initElements(driver, this);

	}
	
}