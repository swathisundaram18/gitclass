package com.Seleniumconcepts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Types {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://letcode.in/alert");
    //simple alert
    driver.findElement(By.xpath("//button[@class='button is-link']")).click();
    driver.switchTo().alert().accept();
	
	//confirm alert
    driver.findElement(By.id("confirm")).click();
    driver.switchTo().alert().dismiss();
    
    //prompt alert
    driver.findElement(By.xpath("//button[text()='Prompt Alert']")).click();
    Alert prompt = driver.switchTo().alert();
    prompt.sendKeys("swathisundaram");
    prompt.accept();
	
	
}
}
