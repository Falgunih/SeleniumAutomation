package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CloseQuit {

	public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.get("https://www.naukri.com/");
	//Close: used to close only the browser in focus
//	driver.close();
	
	//Quit: closes all the opened browser by current webdriver instance
	//driver.close(); it's close only focus window 
	driver.quit();//its close all the window 

	}

}
