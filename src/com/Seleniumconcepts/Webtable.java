package com.Seleniumconcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/table");
	
	System.out.println("------AllData------");
	
	List<WebElement> alldata = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
	for (WebElement all : alldata) {
		System.out.println(all.getText());
	}
	System.out.println("------RowData------");
	List<WebElement> rowdata = driver.findElements(By.xpath("(//table)[2]/tbody/tr[3]/td"));
	for (WebElement row3 : rowdata) {
		System.out.println(row3.getText());
	}
	
	
	
	
	
}
}
