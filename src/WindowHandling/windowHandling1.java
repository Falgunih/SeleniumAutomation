package WindowHandling;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandling1 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
       //driver.getwindowHandles is for all windows whch one is opens with main page its collectin Set example is unique everytime 
        Set<String> windows = driver.getWindowHandles();
        System.out.println(windows);
        int totalwin = windows.size();
        String title = driver.getTitle();
       System.out.println("Total no. windows open"+totalwin);
        System.out.println(title);
        
        //for main window we use getwindowHandle()method:
        //String window = driver.getWindowHandle();
        //System.out.println(window);
       // String tt = driver.getTitle();
      // System.out.println(tt);
        driver.switchTo().window(title);
        
       
        
        
        
        
        driver.quit();//close all the windows
	}

}
