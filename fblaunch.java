package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fblaunch {

public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	
	WebDriver driver= new ChromeDriver();
	
	driver.get(" https://www.facebook.com/");
	
	
	WebElement username = driver.findElement(By.xpath( "//input[@type='text']"));
	username.sendKeys("vasanth");
	
	WebElement password = driver.findElement(By.xpath(" //input[@type=\"password\"] "));
	password.sendKeys("221601265");
	
	WebElement clickbutton = driver.findElement(By.xpath("//button[@value=\"1\"]"));

	clickbutton.click();
	
}
	
}
