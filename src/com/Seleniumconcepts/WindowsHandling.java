package com.Seleniumconcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowsHandling  {
public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");
    Actions ac = new Actions(driver);
    Robot rb = new Robot();
    
	WebElement bestseller = driver.findElement(By.linkText("Best Sellers"));
    ac.contextClick(bestseller).build().perform();
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    WebElement mobiles = driver.findElement(By.linkText("Mobiles"));
    ac.contextClick(mobiles).build().perform();
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    WebElement electronic = driver.findElement(By.linkText("Electronics"));
    ac.contextClick(electronic).build().perform();
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    Set<String> windowHandles = driver.getWindowHandles();
    System.out.println(windowHandles);
    
    for (String id : windowHandles) {
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		}
    String mystring = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
    
    for (String id : windowHandles) {
		if (driver.switchTo().window(id).getTitle().equals(mystring)) {
			break;
		}
	}
    
    
    
    
    
    
    
    
}
}
