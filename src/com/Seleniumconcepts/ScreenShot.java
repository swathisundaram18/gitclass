package com.Seleniumconcepts;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
public static void main(String[] args) throws IOException  {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.amazon.in/");
	
	TakesScreenshot ts = (TakesScreenshot) driver;
	File src=ts.getScreenshotAs(OutputType.FILE);
	File des = new File("C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\ScreenShots//Amazon.png");
	FileUtils.copyFile(src, des); 
	
	
}
}
