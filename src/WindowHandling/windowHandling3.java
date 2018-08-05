package WindowHandling;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandling3 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        Iterator<String> windows = driver.getWindowHandles().iterator();
       //iterview Questions how  do u get all the title of the window ...
        while(windows.hasNext())
        {
       driver.switchTo().window(windows.next());
       String title = driver.getTitle();
       System.out.println(title);
       if (title.equals("Haier")){//this is for close the perticular window 
    	   driver.close();
       }
       
	}
        driver.switchTo().window("Haier");
        
        
driver.quit();
	}}
