package WindowHandling;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PracticalDemo {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.actitime.com/");
        driver.findElement(By.xpath("//a[@class='button button--land']")).click();
       
        driver.findElement(By.id("first-name")).sendKeys("Falguni");
        driver.findElement(By.id("last-name")).sendKeys("Patel");
        driver.findElement(By.id("email")).sendKeys("fagu20ptl@yahoo.ca");
        driver.findElement(By.xpath("//input[@id='start-trial-submit']")).click();
        
        Iterator<String> it = driver.getWindowHandles().iterator();
        String actitimeParent = it.next();
       String openwindow = it.next();
       driver.switchTo().window(openwindow);
       
      System.out.println("pass");
         driver.close();
	}

}
