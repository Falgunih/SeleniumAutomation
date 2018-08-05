package HandlingList;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class handlingListDemo2 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		
WebElement lestle = driver.findElement(By.name("country"));
Select select = new Select(lestle);
List<WebElement> allOptions= select.getOptions();
int size= allOptions.size();

for(int i=1;i<size;i++){

	
	String option=allOptions.get(i).getText();
	System.out.println(option);
		
	
}


driver.close();


	}

}
