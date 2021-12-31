package DependencyCreation;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc_Loan001 {
	@Test(groups= {"smoke"})
	public void deleteAcc() {
		Reporter.log("from delete Account",true);
	}
	
}
