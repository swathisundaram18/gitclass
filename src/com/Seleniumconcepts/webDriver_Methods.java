package com.Seleniumconcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriver_Methods {
public static void main(String[] args) {
	//illegal statement exception
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
    WebDriver Driver=new ChromeDriver();  //Browser launch
    Driver.manage().window().maximize();  //maximize
    Driver.navigate().to("https://www.amazon.in/"); //url Launch  
    Driver.navigate().back();            //back form the current page
    Driver.navigate().forward();          //Forward to Next page
    Driver.close();                      //close entire browser
}
}
