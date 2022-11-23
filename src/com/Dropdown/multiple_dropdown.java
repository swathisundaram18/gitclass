package com.Dropdown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class multiple_dropdown {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://letcode.in/dropdowns");
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.MICROSECONDS);
	WebElement multi = driver.findElement(By.id("superheros"));
	Select s= new Select(multi);
	s.selectByValue("bt");
	s.selectByValue("im");
	s.selectByValue("sm");
	s.selectByVisibleText("Supergirl");
	s.selectByVisibleText("Wolverine");
	s.selectByVisibleText("Wonder Woman");
	
	//get options method
	
	List<WebElement> get = s.getOptions();
	for (WebElement options : get) {
		System.out.println(options.getText());
	}
	System.out.println("---------selected options---------");
	//get all selected options 
	List<WebElement> allSelected = s.getAllSelectedOptions();
	for (WebElement selected : allSelected) {
		System.out.println(selected.getText());
	}
	
	//get first selected option
	
	WebElement firstSelectedOption = s.getFirstSelectedOption();
	System.out.println(firstSelectedOption.getText());
	
	
	//s.deselectAll();
	
}
}
