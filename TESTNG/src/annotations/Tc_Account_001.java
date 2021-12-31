package annotations;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_Account_001 {
	@Test(priority=2)
	public void create_Account() {
		Reporter.log("Hi");
	}



   @Test(priority=1)
   public static void delete_Account() {
	Reporter.log("Hello");
   }
	   
 
}