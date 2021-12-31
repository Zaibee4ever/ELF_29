package Listeners;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass {
	
	@BeforeSuite
	public void testOneMethod() {
		Reporter.log("Before suite method started",true);
	}
	@Test
	@BeforeTest
	
		public void beforeTestexecution() {
			Reporter.log("Before test execution started",true);
		}
	
    @BeforeClass
    public void testTwoMethod() {
    	Reporter.log("Before class method execution started",true);
    }
    @BeforeMethod
    public void beforetestCaseExecution1() {
    	Reporter.log("Before method execution started",true);
    }
    
    @AfterMethod
    public void aftertestCaseExecution() {
    	Reporter.log("test execution",true);
    }
    @AfterClass
    public void testFourMethod() {
    	Reporter.log("logout action done",true);
    }
    @AfterTest 
    public void closeApp() {
    	Reporter.log("closing of app is done",true);
    }
    @AfterSuite
    public void closeAllTransaction() {
    	Reporter.log("execution done",true);
    }
    
    
     
  


	public static int  add() {
		// TODO Auto-generated method stub
		int a=2;
    	int b=4;
    	int c=a+b;
    	System.out.println(c);
    	return c;
    
	}
}
    
    

