package HandlingFrames;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNGDemo2 {
	
	static  WebDriver driver;
	@BeforeMethod
	public static void setup(){
		driver =new FirefoxDriver();
	}	
	@Test
		public void testLogin(){
		
		}
		
	}


