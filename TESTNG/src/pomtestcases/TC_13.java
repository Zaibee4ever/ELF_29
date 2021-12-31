package pomtestcases;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

@Test
public class TC_13 extends BaseClass1 {
	public void purchase2() throws InterruptedException {
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
			WebElement sub=menu.get(i);
			if(sub.equals("Approved")) {
				sub.click();
				break;
			}
			a.moveToElement(sub).perform();
		}
		
	
		driver.findElement(By.xpath("(//textarea[@rows='2'])[1]")).sendKeys("test yantra bng");
		driver.findElement(By.xpath("(//textarea[@rows='2'])[2]")).sendKeys("bng");
		

		driver.findElement(By.xpath("//img[@id='searchIcon1']")).click();
		Set <String> allwin1=driver.getWindowHandles();
		for(String win:allwin1) {
			driver.switchTo().window(win);
			String title=driver.getCurrentUrl();
				if(title.equals("http://localhost:8888/index.php?module=Products&action=Popup&html=Popup_picker&select=enable&form=HelpDeskEditView&popuptype=inventory_prod_po&curr_row=1&return_module=PurchaseOrder&currencyid=1&relmod_id=42&parent_module=Vendor")) {
					driver.findElement(By.xpath("//a[@id='popup_product_55']")).click();
					 driver.switchTo().window(parentWindow); //switch to parent to child window
					break;
				}
			}
		
		driver.findElement(By.xpath("//input[@id='qty1']")).sendKeys("023");// with entering qty & list price(child browser)
		driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
		//Thread.sleep(1000);
		driver.quit();
	}






	}


