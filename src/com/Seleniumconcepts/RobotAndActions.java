package com.Seleniumconcepts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotAndActions {
public static void main(String[] args) throws AWTException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://testautomationpractice.blogspot.com/");
    Actions ac = new Actions(driver);
    Robot rb = new Robot();
    //DragAndDrop
    WebElement src = driver.findElement(By.id("draggable"));
    WebElement des = driver.findElement(By.id("droppable"));
    ac.dragAndDrop(src, des).build().perform();
    
    WebElement men = driver.findElement(By.xpath("//img[@width='100'][1]"));
    WebElement trash = driver.findElement(By.id("trash"));
    ac.dragAndDrop(men, trash).build().perform();
    //MoveToElement		
    driver.navigate().to("https://www.amazon.in/");
    WebElement prime = driver.findElement(By.id("nav-link-amazonprime"));
    ac.moveToElement(prime).perform();
    //ContextClick
    WebElement mob = driver.findElement(By.linkText("Mobiles"));
    ac.contextClick(mob).perform();
    
    rb.keyPress(KeyEvent.VK_DOWN);
    rb.keyRelease(KeyEvent.VK_DOWN);
    
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
    
    
}
}
