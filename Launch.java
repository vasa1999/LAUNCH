package com.base;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class Launch {

		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\VASANTH\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

		driver.get("http://demo.automationtesting.in/Register.html");	
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		WebElement firstname = driver.findElement(By.xpath("//input[@type='text']"));
		firstname.sendKeys("vasanth");
		
		WebElement lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("dhatchanamoorthy");
		
		WebElement add =driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		 add.sendKeys("baranakoil street");
		 WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
			email.sendKeys("d.vasanthd@1234");
			
			WebElement phoneno = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
			phoneno.sendKeys("1234567892");
			
			 WebElement maleclick = driver.findElement(By.xpath("//input[@value=\"Male\"]"));
				maleclick.click();
			 
				WebElement hobbies = driver.findElement(By.id("checkbox1"));
				hobbies.click();
				
				//WebElement lang = driver.findElement(By.xpath("(//li[@class=\"ng-scope ui-elemfocus\"])[8]"));
				//lang.click();
				
				WebElement skills = driver.findElement(By.xpath("//select[@id=\"Skills\"]"));
			    Select se=new Select(skills);
			    se.selectByVisibleText("Android");
		
		WebElement passwords = driver.findElement(By.xpath("//input[@id='firstpassword']"));
		passwords.sendKeys("vasa123@#");
		
		WebElement confrompassword = driver.findElement(By.xpath("//input[@id=\"secondpassword\"]"));
		confrompassword.sendKeys("vasa123@#");
		
		WebElement clickbutton = driver.findElement(By.xpath("//button[@id=\"submitbtn\"]"));
			clickbutton.click();
			
			WebElement refreshbutton = driver.findElement(By.id("id=\"Button1\""));
				refreshbutton.click();
			
	
}
}
