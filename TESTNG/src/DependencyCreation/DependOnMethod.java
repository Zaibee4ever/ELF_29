package DependencyCreation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependOnMethod {
	
	@Test
	public void createAcc() {
		Reporter.log("creating account");
	}
	@Test(dependsOnMethods="deleteAcc")
	public void createLoan() {
		Reporter.log("creating loan account",true);
	}
	@Test
	public void deleteAcc() {
		Reporter.log("deleting account");
	}

}
