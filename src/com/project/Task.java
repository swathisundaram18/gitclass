package com.project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
	
	List<WebElement> Data = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td"));
	for (WebElement alldata : Data) {
		System.out.println(alldata.getText());
	}
	System.out.println("===========RowData=======");
	List<WebElement> RowData = driver.findElements(By.xpath("(//table)[2]/tbody/tr[1]/td"));
	for (WebElement Row1 : RowData) {
		System.out.println(Row1.getText());
	}
	System.out.println("===========singledata=========");
	WebElement singledata = driver.findElement(By.xpath("(//table)[2]/tbody/tr[1]/td[3]"));
    System.out.println(singledata.getText());
    
    System.out.println("========Columndata=========");
    List<WebElement> column = driver.findElements(By.xpath("(//table)[2]/tbody/tr/td[4]"));
	for (WebElement col : column) {
		System.out.println(col.getText());
	}
	
	
	
	
	
	
}
}
