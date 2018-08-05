package ActionClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {
	
	 static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver =new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.actimind.com/");
		WebElement ele = driver.findElement(By.xpath("//a[@ class='c-link dropdown-toggle']"));
		Actions action = new Actions(driver);
		action.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a [text()='Data Science Applications']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.close();
	}

}
