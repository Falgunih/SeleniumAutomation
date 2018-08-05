package HandlingList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ListExample {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.navigate().to("http://demowebshop.tricentis.com/");
		List<WebElement> allLinks = driver.findElements(By.tagName("div"));
		int size = allLinks.size();
		System.out.println("Total Links Avaiable on this Website "+size);
		for(WebElement al:allLinks){
			System.out.println(al);
		}
		driver.close();
		}
	
	
	
	
	
	
	
		

	}


