package com.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample_admin {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");

		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");

		driver.findElement(By.xpath("//button[text()=' Login ']")).click();

		driver.findElement(By.xpath("//*[text()='Recruitment']")).click();

		driver.findElement(By.xpath("//*[text()=' Add ']")).click();


		driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("sjidfoj");
		Thread.sleep(1000);

		driver.findElement(By.xpath("//*[text()='Browse']")).click();


		Thread.sleep(2000);

		setClipboardData("C:\\Users\\Siva\\Downloads\\OrangeHRM.docx"); // Replace with the actual file path

		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(5000);

		driver.findElement(By.xpath("//*[@class='oxd-icon bi-check oxd-checkbox-input-icon']")).click();
	} 



	private static void setClipboardData(String string) {
		StringSelection stringSelection = new StringSelection(string);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	}

}
