package DependencyCreation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_Account_0001 {
	
	@Test(groups= {"functional"})
	
	public void createAcc() {
		
		Reporter.log("from creating account",true);
	}
	
	@Test(groups= {"integration"},dependsOnGroups="smoke")
	public void modifyAcc() {
		Reporter.log("from modify account",true);
	}
	



}
