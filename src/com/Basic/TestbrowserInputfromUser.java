package com.Basic;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class TestbrowserInputfromUser {
	
	static WebDriver driver;//Global variable so we can use in all methods
	
	public static void TestBrowser(){
		driver.get("https://www.actitime.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please put the input");
		String browser= scan.next();
	if (browser.equals("chrome")){
	System.setProperty("webdriver.chrome.driver" , "C:/SeleniumWorkplace/SeleniumAutomation/BrowserExe/chromedriver.exe");
	 driver = new ChromeDriver();
	 TestBrowser();
	}
	else
	{
		 driver = new FirefoxDriver();
		TestBrowser();
	}
	}

}
