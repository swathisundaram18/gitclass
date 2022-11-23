package com.Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    
		driver.get("https://www.amazon.in/");
		WebElement type=driver.findElement(By.xpath("(//input[contains(@class,'progressive')])[4]"));
		type.sendKeys("Women Dress");
		WebElement search=driver.findElement(By.xpath("(//input[contains(@class,'progressive')])[5]"));
		search.click();
		WebElement all=driver.findElement(By.xpath("//span[@class='hm-icon-label']"));
		all.click();
		WebElement signin=driver.findElement(By.xpath("//a[text()='Sign in']"));
		signin.click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.close();
		
		
	}
}
