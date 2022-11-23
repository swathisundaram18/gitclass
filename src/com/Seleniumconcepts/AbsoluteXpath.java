package com.Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AbsoluteXpath {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/input")).sendKeys("swathi@gmail.com");
	driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/div/div/form/div/div/div/input")).sendKeys("swathi123");
	driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
	
	
	
	
	
}
}
