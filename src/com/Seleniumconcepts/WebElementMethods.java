package com.Seleniumconcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementMethods {
public static void main(String[] args) {
  
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Selenium.pro\\Driver\\chromedriver.exe");
    WebDriver Driver=new ChromeDriver();  
    Driver.manage().window().maximize(); 
    Driver.get("https://www.facebook.com/campaign/landing.php?campaign_id=14884913640&extra_1=s%7Cc%7C589460569849%7Cb%7Cfacebook%20%27%7C&placement=&creative=589460569849&keyword=facebook%20%27&partner_id=googlesem&extra_2=campaignid%3D14884913640%26adgroupid%3D128696220912%26matchtype%3Db%26network%3Dg%26source%3Dnotmobile%26search_or_content%3Ds%26device%3Dc%26devicemodel%3D%26adposition%3D%26target%3D%26targetid%3Dkwd-327195741349%26loc_physical_ms%3D9061914%26loc_interest_ms%3D%26feeditemid%3D%26param1%3D%26param2%3D&gclid=CjwKCAjwtp2bBhAGEiwAOZZTuLLDN7Qw0XUjyeCa6RVXznXVa04cdWooJDdM_HfyAEN4DA0HSl8oQxoCXAgQAvD_BwE"); //url Launch
    WebElement firstname=Driver.findElement(By.xpath("//input[@type='text'][1]"));
    firstname.sendKeys("Swathi");
    WebElement surname=Driver.findElement(By.name("lastname"));
    surname.sendKeys("Sundaram");
    WebElement email=Driver.findElement(By.name("reg_email__"));
    email.sendKeys("swathisundaram@123");
    WebElement pass=Driver.findElement(By.id("password_step_input"));
    pass.sendKeys("swathi123");
    WebElement day=Driver.findElement(By.id("day"));
    Select s=new Select(day);
    s.selectByValue("18");
    WebElement month=Driver.findElement(By.id("month"));
    Select s1=new Select(month);
    s1.selectByIndex(0);
    System.out.println(s1.isMultiple());
    WebElement year=Driver.findElement(By.xpath("//select[@title='Year']"));
    Select s2=new Select(year);
    s2.selectByVisibleText("2000");
    WebElement gender=Driver.findElement(By.xpath("//label[text()='Female']"));
    gender.click();
    WebElement submit=Driver.findElement(By.xpath("//button[text()='Sign Up']"));
    submit.click();
    
    
  
   
    




}

	
}
