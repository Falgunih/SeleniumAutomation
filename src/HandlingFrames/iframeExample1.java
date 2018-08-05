package HandlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframeExample1 {//iframe is html page which is embeded within the html main page 

	public static void main(String[] args) throws Exception {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Patel%20Family/Desktop/iframe.html/demoA.html");
		driver.findElement(By.id("un")).sendKeys("Falguni");
		//driver.switchTo().frame(0);// by switch the frame by index
		//driver.switchTo().frame("f1");// by switch the frame by string
		WebElement frame = driver.findElement( By.xpath("//iframe[@class='c1']"));//swith the frame by webelement
		driver.switchTo().frame(frame);
		driver.findElement(By.id("pwd")).sendKeys("password");
		
		//This are the two method to switch back to the parent window
		driver.switchTo().parentFrame();
		String title = driver.getTitle();
		System.out.println(title);
		if (title.equals("file:///C:/Users/Patel%20Family/Desktop/iframe.html/demoA.html")){
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}
	
		//driver.switchTo().defaultContent();
		driver.quit();
	}

}
