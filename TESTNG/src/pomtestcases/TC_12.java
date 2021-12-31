package pomtestcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class TC_12 extends BaseClass1 {
	@Test
	public void purchase1() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='More']")).click();
		driver.findElement(By.xpath("//a[@name='Purchase Order']")).click();
		driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
		
		driver.findElement(By.xpath("//input[@name='subject']")).sendKeys("product");
		driver.findElement(By.xpath("(//img[@src='themes/softed/images/select.gif'])[1]")).click();
		
		//child popup will be displayed
		String parentWindow = driver.getWindowHandle();//parent window 
		Set <String> allwin=driver.getWindowHandles();// all window(parent window & child window) 
		for(String win:allwin) {
			driver.switchTo().window(win);//switch to parent to child window
			String title=driver.getCurrentUrl();
				if(title.equals("http://localhost:8888/index.php?module=Vendors&action=Popup&html=Popup_picker&popuptype=specific_vendor_address&form=EditView&fromlink=")) {
					driver.findElement(By.xpath("//a[@id='1']")).click(); // perform child window actions
					 driver.switchTo().window(parentWindow); // switch to child to parent window
					break;
				}
			}
		
		List<WebElement> menu=driver.findElements(By.xpath("//select[@name='postatus']"));//set of dropdown menu list
		Actions a=new Actions(driver);
		for(int i=0; i<menu.size();i++) {
			WebElement sub=menu.get(i);//it give single webelement(created, approved, canelled etc)
			if(sub.equals("Approved")) {
				sub.click();
				break;
			}
			a.moveToElement(sub).perform();//if condition will be false then move on second element
		}
		
		driver.findElement(By.xpath("(//textarea[@rows='2'])[1]")).sendKeys("test yantra bng");
		driver.findElement(By.xpath("(//textarea[@rows='2'])[2]")).sendKeys("bng");
		
		//to perform action child browser(item details)
		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
		driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("001");//with enter QTY
//		driver.findElement(By.xpath("//input[@id='listPrice1']")).sendKeys("10000");//without Enter Listprice
	//	Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		
		//handle javascript popup
		Alert b=driver.switchTo().alert();
	    //Thread.sleep(1000);		
		String text=b.getText();
		System.out.println(text);
		//Thread.sleep(100);
		driver.quit();
	}

}

