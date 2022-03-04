package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoautomationtesting {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://toolsqa.com/automation-practice-form/" );
	
	WebElement clickbutton = driver.findElement(By.xpath("//a[@class=\"btn btn-primary-shadow btn-block\"]"));
		clickbutton.click();
		//By.xpath( "//input[@type='text']"));
		WebElement clickbutton2 = driver.findElement(By.xpath("//a[@class=\"btn btn-primary-shadow btn-block\"]"));
		clickbutton2.click();
		
	WebElement firstname = driver.findElement(By.id("id=\"first-name\""));
	firstname.sendKeys("gopalanan");
	
	WebElement lastname = driver.findElement(By.id("id=\"last-name\""));
	lastname.sendKeys("ramanadhan");
	
	
	}

	
	
}
