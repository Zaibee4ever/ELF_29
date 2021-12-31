package pomtestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.Login_Page;

public class BaseClass1 {
	public static WebDriver driver;
	@BeforeTest
	public void LaunchingBrowser(){
	{
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   
	}
	}
	@BeforeMethod
	
		public void login() {
			String actualUrl = "http://localhost:8888/";
			driver.get("http://localhost:8888/");
			if(actualUrl.equals(driver.getCurrentUrl()))
				Reporter.log("Pass:: URL is Correct",true);
			else
				Reporter.log("Fail:: URL is not Correct",true);
			
		Login_Page	login=new Login_Page(driver);
		
	     WebElement userName = login.getUserNameTextField();
	     userName.sendKeys("admin");
	     String actualusername = "admin";
	     String expectedUname = userName.getAttribute("value");
	     
	     if(actualusername.equalsIgnoreCase(expectedUname)) 
	    	 Reporter.log("Pass:: successfully entered username",true);
	     else
	    	Reporter.log("Fail::  Not entered username",true);
	    	 
	    	 
	     String actualPassword = "root";
	     
	     WebElement password = login.getPasswordTextField();
	     password.sendKeys("root");
	     String expectedPaWord = password.getAttribute("value");
	     login.getLoginButton().click();
	     if(actualPassword.equalsIgnoreCase(expectedPaWord)) 
	    	 Reporter.log("Pass:: successfully entered password",true);
	    	 else
	    		 Reporter.log("Fail:: not entered password",true);

	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	     }
		
		
	}

	
