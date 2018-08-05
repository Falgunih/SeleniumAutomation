package com.Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CompareUrl {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.actitime.com/");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		if (url.contains("actitime")){
			System.out.println("pass");
			}
			else
			{
				System.out.println("Fail");
			}
		driver.close();
		}
	}


