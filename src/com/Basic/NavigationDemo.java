package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationDemo {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	driver .navigate().to("http://www.dzeesolutions.com");
	driver.navigate().back();

	driver.navigate().forward();
	driver.navigate().refresh();
	driver.close();

	}

}
