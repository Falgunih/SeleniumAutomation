package HandlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class handlingFramesEX1 {

	public static void main(String[] args) throws Exception {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Patel%20Family/Desktop/JAVA_Practical/HTML%20Pages/Iframe%20Multiple.html");
		// how to get the no. of frames on the webpage are as follows..
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("total no of the frames in the webpage is"+ framecount);
		
		driver.switchTo().frame(0);
		driver.findElement(By.linkText("Car Rentals")).click();
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		driver.findElement(By.id("username")).sendKeys("falguni");
		driver.findElement(By.name("pwd")).sendKeys("12345");
		driver.findElement(By.xpath("//a [@id='loginButton']")).click();
		driver.switchTo().parentFrame();
		
		 WebElement frame = driver.findElement(By.xpath("//iframe[@title='SeleniumHQ']"));
		 Thread.sleep(10000);
		 driver.switchTo().frame(frame);
		driver.findElement(By.linkText("Projects")).click();
		String t1 = driver.getTitle();//question why my title is not printing?
		System.out.println(t1);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//a [text()='Click Here to Navigate to Yahoo!!']")).click();
		driver.close();
		

	}

}
