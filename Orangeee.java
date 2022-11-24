package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Orangeee {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver project= new ChromeDriver();
	project.manage().window().maximize();
	project.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	WebElement username = project.findElement(By.xpath("//input[@name='username']"));
	username.sendKeys("Admin");
	WebElement pass = project.findElement(By.xpath("//input[@placeholder='Password']"));
	pass.sendKeys("admin123");
	project.findElement(By.xpath("//button[text()=' Login ']")).click();
	WebElement admin = project.findElement(By.xpath("//a[@class='oxd-main-menu-item'][1]"));
    admin.click();	
}
}
