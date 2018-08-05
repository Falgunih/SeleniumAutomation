package com.Basic;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class TesttheBrowser {

	
	public static void main(String[] args) {
	
		
	//FirefoxDriver driver = new FirefoxDriver();
	//driver.get("https://global.gotomeeting.com/join/540940173");
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWorkplace\\SeleniumAutomation\\BrowserExe\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://global.gotomeeting.com/join/540940173");

	}

}
