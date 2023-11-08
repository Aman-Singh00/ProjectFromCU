package com.section1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_File_Upload_Using_Robot_Class {

	public static void main(String[] args) throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.naukri.com/");

		driver.findElement(By.id("register_Layer")).click();

		driver.findElement(By.className("uploadResume")).click();

		Thread.sleep(2000);
		// select
		StringSelection path = new StringSelection("E:\\resume.pdf");

		// copy
		Clipboard cp = Toolkit.getDefaultToolkit().getSystemClipboard();
		cp.setContents(path, null);

		Robot r = new Robot();
		// paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);

		// enter

		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

}
