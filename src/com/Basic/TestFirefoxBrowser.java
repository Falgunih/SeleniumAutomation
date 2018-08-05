package com.Basic;

import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxBrowser {

	public static void main(String[] args) {
		//Create an instance of the browser
	FirefoxDriver driver = new FirefoxDriver();
	//maximize the window 
	driver.manage().window().maximize();
	//navigate to url
	driver.get("https://www.google.com/");
	//Fetch the current Window Title
	String title=driver.getTitle();//local variable title which store driver.gettitle
	System.out.println(title);
	//Fore validation with expected result
	if(title.equals("Yahoo")){
		System.out.println("pass");
	}
		else{
			System.out.println("Fail");
	}
	//close the browser
	driver.close();
	}

}
