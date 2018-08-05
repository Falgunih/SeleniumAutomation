package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickOnElemet {
	
	static WebDriver driver;
	
public static void main(String[] args) {
	
	
	driver =new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.linkText("Forgot account?"));
	Actions action = new Actions(driver);
	action.contextClick(ele).sendKeys("w").perform();
	String title = driver.getTitle();
	System.out.println(title);
	driver.close();
	
}
}
