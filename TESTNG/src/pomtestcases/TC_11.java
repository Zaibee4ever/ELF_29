package pomtestcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Listeners.BaseClass;

@Test
public class TC_11 extends BaseClass1 {
	public void purchase() throws InterruptedException {
	WebElement moretext = driver.findElement(By.xpath("//a[text()='More']"));
	moretext.click();
      String actualText = moretext.getText();
      String expectedtext = "More";
      if(actualText.equalsIgnoreCase(expectedtext))
    		  System.out.println("Pass:: More link text is correct");
      else
    	  System.out.println("Fail:: More link text is not correct");
      
      System.out.println("Pass:: hiiiiiii");
	WebElement purchaseorder = driver.findElement(By.linkText("Purchase Order"));
	purchaseorder.click();
	System.out.println("hello");
String actualpurchaseordertext = purchaseorder.getText();
System.out.println(actualpurchaseordertext);
String expectedpurchaseordertext = "Purchase Order";
if(actualpurchaseordertext.equalsIgnoreCase(actualpurchaseordertext))
	  System.out.println("Pass:: purchaseorder link text is correct");
else
System.out.println("Fail:: purchaseorder link text is not correct");

//	driver.findElement(By.xpath("//a[text()='Create Filter']")).click();
	driver.findElement(By.xpath("//img[@alt='Create Purchase Order...']")).click();
	JavascriptExecutor js=(JavascriptExecutor)driver;       //Downward Symbol
	js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//	driver.findElement(By.xpath("//input[@type='submit']"));
	Thread.sleep(20000);
	driver.close();
	
	

}
}
