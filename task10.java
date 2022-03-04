package com.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class task10 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\VASANTH\\eclipse-workspace\\JavaSelenium\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://adactinhotelapp.com/");
		
		//33WebElement clickbutton = driver.findElement(By.xpath(" //div[@id=\"heading20\"] "));
//		clickbutton.click();
		
		WebElement gettext = driver.findElement(By.xpath("//p[contains(text()='Adactin Launches The Adactin Hotel App!')] "));
	String text = driver.getTitle();
System.out.println(text);
driver.quit();
	}
	
	
}
