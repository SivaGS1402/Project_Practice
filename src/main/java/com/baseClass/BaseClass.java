package com.baseClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver browserLaunch(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		return driver;
	}

	public static void url_Launch(String url) {
		driver.get(url);
	}

	public static void send_values(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void click_element(WebElement element) {
		element.click();
	}

	public static void clear_text(WebElement element) {
		element.clear();
	}
	public static void doubleClick_element(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}
	public static void select_dropdown_by_visible_text(WebElement dropdownElement, String visibleText) {
		Select dropdown = new Select(dropdownElement);
		dropdown.selectByVisibleText(visibleText);
	}
	public static void pressCtrlA(WebElement element) {
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).perform();
	}

	
	public static void selectElementWithArrowAndEnter(WebElement element) throws AWTException {
		
		
		// Simulate pressing the down arrow key
		robotKeyPressDown();

		// Simulate pressing the Enter key
		robotKeyPressEnter();
	}

	public static void robotKeyPressDown() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_DOWN);
		robot.keyRelease(java.awt.event.KeyEvent.VK_DOWN);
	}

	public static void robotKeyPressEnter() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(java.awt.event.KeyEvent.VK_ENTER);
		robot.keyRelease(java.awt.event.KeyEvent.VK_ENTER);
	}

	public static void typeAndPressEnter(WebElement element, String text) {
		Actions actions = new Actions(driver);
		actions.sendKeys(element, text).sendKeys(Keys.ENTER).perform();
	}

	



}


