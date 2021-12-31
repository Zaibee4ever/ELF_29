package Listeners;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(ListenerImplementationClass1.class)

public class TC_Listener_001   {
	
	public static WebDriver driver;
	@Test
	public void createAcc()   {
		
		Reporter.log("From Create Account", true);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	    driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://zomato.com/");
		
		//BaseClass.add();
		driver.close();
		
	}

}
