package testNGDemo;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testNG {
	
	@BeforeClass
public static void Beforeclass(){
	System.out.println("++++Execute the before class++++");	
	}
@AfterClass
public static void Afterclass(){
	System.out.println("++++Execute the After class++++");
		
	}
@BeforeMethod
public static void Beforemethod(){
	System.out.println("++++Execute the before method++++");
}
@AfterMethod
public static void  Aftermethod(){
	System.out.println("++++Execute the After method++++");
}
@Test
public static void demoone(){
	System.out.println("+++++here is the demoOne+++++");
	
}
@Test
public static void demotwo(){
	System.out.println("++++here is the demotwo++++");
	
}
@BeforeSuite
public static void beforesuit(){
	System.err.println("++++ before suite++++");//make it this one is red color we put err
}
@AfterSuite
public static void aftersuit(){
	System.err.println("++++ after suite++++");
}
}
