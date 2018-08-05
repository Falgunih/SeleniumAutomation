package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverDemo {

	public static void main(String[] args) {
		//What is the difference between Webdriver driver=new Firefoxdriver();where as if we use this syntax we can use any browsers.
				//Firefoxdriver driver=new Firefoxdriver();This driver reference only limited for the firefox,IE and Chrome
		
				
				WebDriver driver;//with webdriver we can call firefox,IE,chrome without creating individual object for them because webdriver is interface and all browser are classes.
			 
				System.setProperty("webdriver.chrome.driver", "C:/SeleniumWorkplace/SeleniumAutomation/BrowserExe/chromedriver.exe");
				driver = new ChromeDriver();
				
				driver= new FirefoxDriver();


	}

}
