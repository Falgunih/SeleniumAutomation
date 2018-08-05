package com.Basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class LocatorDemo {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Falguni");
		driver.findElement(By.id("pass")).sendKeys("12345");
		
		System.out.println("done");
		
		
		
		driver.close();
		
	}

}
