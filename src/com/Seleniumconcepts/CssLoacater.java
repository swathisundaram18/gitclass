package com.Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssLoacater {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	driver.findElement(By.cssSelector("input#email")).sendKeys("swathi@gmail.com");
	driver.findElement(By.cssSelector("input[Type='password']")).sendKeys("swatji123");
	driver.findElement(By.cssSelector("button[class^='_42ft _4jy0 ']")).click();
	
	
	
}
}
