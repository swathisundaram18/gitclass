package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class project_Roombooking {
public static void main(String[] args) { 
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
	driver.get("https://adactinhotelapp.com/index.php");
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("swathisundaram");
	WebElement pass = driver.findElement(By.id("password"));
	pass.sendKeys("swathi@18");
	WebElement login = driver.findElement(By.id("login"));
	login.click();
	WebElement location = driver.findElement(By.id("location"));
	Select s = new Select(location);
	s.selectByVisibleText("Paris");
	WebElement hotel = driver.findElement(By.xpath("(//select[@class='search_combobox'])[2]"));
	Select s1 = new Select(hotel);
	s1.selectByValue("Hotel Hervey");
	WebElement hoteltype = driver.findElement(By.xpath("//select[@name='room_type']"));
	Select s2 = new Select(hoteltype);
	s2.selectByValue("Super Deluxe");
	WebElement noofroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
	Select s3 = new Select(noofroom);
	s3.selectByIndex(3);
	WebElement cheakin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	cheakin.sendKeys("10/11/2022");
	WebElement cheakout = driver.findElement(By.id("datepick_out"));
	cheakout.sendKeys("11/11/2022");
	WebElement adult = driver.findElement(By.id("adult_room"));
	Select s4 = new Select(adult);
	s4.selectByValue("3");
	WebElement child = driver.findElement(By.id("child_room"));
	Select s5 = new Select(child);
	s5.selectByValue("2");
	WebElement search = driver.findElement(By.xpath("//input[@value='Search']"));
    search.click();
    driver.findElement(By.id("radiobutton_0")).click();
	driver.findElement(By.xpath("//input[@value='Continue']")).click();
	driver.findElement(By.id("first_name")).sendKeys("swathi");
	driver.findElement(By.id("last_name")).sendKeys("sundaram");
	driver.findElement(By.id("address")).sendKeys("Ramapuram,porur");
	WebElement creditcard = driver.findElement(By.xpath("(//input[@class='reg_input'])[3]"));
	creditcard.sendKeys("2222333344445555");
	WebElement cctype = driver.findElement(By.id("cc_type"));
	Select s6 = new Select(cctype);
	s6.selectByVisibleText("American Express");
	WebElement expirymonth = driver.findElement(By.id("cc_exp_month"));
	Select s7 = new Select(expirymonth);
	s7.selectByValue("12");
	WebElement expiryyear = driver.findElement(By.id("cc_exp_year"));
	Select s8 = new Select(expiryyear);
	s8.selectByVisibleText("2022");
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys("123");
	driver.findElement(By.id("book_now")).click();
	
	
	
	
	
}
}
