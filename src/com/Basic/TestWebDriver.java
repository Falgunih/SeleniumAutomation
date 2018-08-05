package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestWebDriver {

	public static void main(String[] args) {
		//Create an instance of the browser
				WebDriver driver = new FirefoxDriver();
				//Maximize the browser
				driver.manage().window().maximize();
				//Navigate to the URL
				driver.get("https://www.google.com/");
				//Fetch the Current Page Title
				String title = driver.getTitle();
				System.out.println(title);
				if(title.equals("Yahoo"))
				{
					System.out.println("Pass");
				}
				else
				{
					System.out.println("Fail");
				}
				//Close the browser
				driver.close();
				

	}

}
