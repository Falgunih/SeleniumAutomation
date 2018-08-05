package HandlingList;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingListdemo1 {

	public static void main(String[] args) {
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		WebElement listle = driver.findElement(By.name("country"));
		Select select = new Select(listle);
		//select.selectByVisibleText("PANAMA");
		//select.selectByIndex(5);;
		select.selectByValue("ZAMBIA");
		driver.close();
		
		

	}

}
