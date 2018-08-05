package WindowHandling;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class windowHandle2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.naukri.com/");
        Iterator<String> it = driver.getWindowHandles().iterator();
        String mainPage = it.next();//it.next means its move to main and accordingly child and so on...
        System.out.println("Address of main page "+mainPage);
        String child1 = it.next();
        System.out.println("Address of child1 page "+child1);
        String child2 = it.next();
        String child3 = it.next();
        
        driver.switchTo().window(child1);
        driver.manage().window().maximize();
        String childtitle = driver.getTitle();
        System.out.println(childtitle);
        driver.close();
        
        driver.switchTo().window(child2);
        driver.manage().window().maximize();
        String child2title = driver.getTitle();
        System.out.println(child2title);
        driver.close();
        
        driver.switchTo().window(child3);
        driver.manage().window().maximize();
        String child3title = driver.getTitle();
        System.out.println(child3title);
        driver.close();
        
        driver.switchTo().window(mainPage);
        driver.close();
        
       
        

        
        
        
        
        
	}

}
