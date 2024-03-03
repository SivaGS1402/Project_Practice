package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Time_Orange {

	private  WebDriver driver;
	
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement dashboardText;
	
	@FindBy(xpath = "//span[text()='Time']")
	private WebElement timeBtn;
	
	@FindBy(xpath = "//span[text()='Timesheets ']")
	private WebElement timesheets;
	
	@FindBy(xpath = "//a[contains(text(),'My Timesheets')]")
	private WebElement myTimesheets;
	
	@FindBy(xpath = "//button[text()=' Edit ']")
	private WebElement editBtn;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-plus']")
	private WebElement addRow;
	
	@FindBy(xpath = "(//input[@placeholder='Type for hints...'])[2]")
	private WebElement project;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	private WebElement activity;
	
	@FindBy(xpath = "(//div[@class='oxd-select-text-input'])[2]")
	private WebElement selectBugFix;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[2]")
	private WebElement mon;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[3]")
	private WebElement tue;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[4]")
	private WebElement wed;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[5]")
	private WebElement thu;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[6]")
	private WebElement fri;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[7]")
	private WebElement sat;
	
	@FindBy(xpath = "((//label[text()='Project'])[2]/following::input)[8]")
	private WebElement sun;
	
	@FindBy(xpath = "//*[@class='oxd-icon bi-trash']")
	private WebElement deleteBtn;
	
	
	
	public WebElement getDeleteBtn() {
		return deleteBtn;
	}


	public void setDeleteBtn(WebElement deleteBtn) {
		this.deleteBtn = deleteBtn;
	}


	@FindBy(xpath = "//button[@type='submit']")
	private WebElement saveBtn;
	
	public WebElement getDashboardText() {
		return dashboardText;
	}


	public void setDashboardText(WebElement dashboardText) {
		this.dashboardText = dashboardText;
	}


	public WebElement getTimeBtn() {
		return timeBtn;
	}


	public void setTimeBtn(WebElement timeBtn) {
		this.timeBtn = timeBtn;
	}


	public WebElement getTimesheets() {
		return timesheets;
	}


	public void setTimesheets(WebElement timesheets) {
		this.timesheets = timesheets;
	}


	public WebElement getMyTimesheets() {
		return myTimesheets;
	}


	public void setMyTimesheets(WebElement myTimesheets) {
		this.myTimesheets = myTimesheets;
	}


	public WebElement getEditBtn() {
		return editBtn;
	}


	public void setEditBtn(WebElement editBtn) {
		this.editBtn = editBtn;
	}


	public WebElement getAddRow() {
		return addRow;
	}


	public void setAddRow(WebElement addRow) {
		this.addRow = addRow;
	}


	public WebElement getProject() {
		return project;
	}


	public void setProject(WebElement project) {
		this.project = project;
	}


	public WebElement getActivity() {
		return activity;
	}


	public void setActivity(WebElement activity) {
		this.activity = activity;
	}


	public WebElement getSelectBugFix() {
		return selectBugFix;
	}


	public void setSelectBugFix(WebElement selectBugFix) {
		this.selectBugFix = selectBugFix;
	}


	public WebElement getMon() {
		return mon;
	}


	public void setMon(WebElement mon) {
		this.mon = mon;
	}


	public WebElement getTue() {
		return tue;
	}


	public void setTue(WebElement tue) {
		this.tue = tue;
	}


	public WebElement getWed() {
		return wed;
	}


	public void setWed(WebElement wed) {
		this.wed = wed;
	}


	public WebElement getThu() {
		return thu;
	}


	public void setThu(WebElement thu) {
		this.thu = thu;
	}


	public WebElement getFri() {
		return fri;
	}


	public void setFri(WebElement fri) {
		this.fri = fri;
	}


	public WebElement getSat() {
		return sat;
	}


	public void setSat(WebElement sat) {
		this.sat = sat;
	}


	public WebElement getSun() {
		return sun;
	}


	public void setSun(WebElement sun) {
		this.sun = sun;
	}


	public WebElement getSaveBtn() {
		return saveBtn;
	}


	public void setSaveBtn(WebElement saveBtn) {
		this.saveBtn = saveBtn;
	}

	
	public Time_Orange(WebDriver abc){
		driver= abc;
		PageFactory.initElements(driver, this);

	}
}