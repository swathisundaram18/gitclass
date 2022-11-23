package com.Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTypes {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/frame");
	//main page to frame
	driver.switchTo().frame("firstFr");
	driver.findElement(By.name("fname")).sendKeys("swathi");
	driver.findElement(By.name("lname")).sendKeys("sundaram");
	
	//outer frame to innerframe
    WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
    driver.switchTo().frame(innerframe);
    driver.findElement(By.name("email")).sendKeys("swathi@gmai.com");
    
	//inner frame to outer frame 
    driver.switchTo().parentFrame();
    
	//outerframe/innerfframe  to mainpage
    driver.switchTo().defaultContent();
	
	
	
	
}
}
