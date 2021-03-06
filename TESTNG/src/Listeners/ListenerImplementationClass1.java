package Listeners;

import java.io.File;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementationClass1 implements ITestListener {
	@Override		
    public void onStart(ITestContext arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		 

    @Override		
    public void onTestFailure(ITestResult arg0) {	
    	LocalDateTime ldt= LocalDateTime.now();
    	String date=ldt.toString().replace(":","");
    	
        Reporter.log("The test case got failed and capture screen shot successfully",true);
		TakesScreenshot ts=(TakesScreenshot)TC_Listener_001.driver;
		File tempScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/"+arg0.getMethod().getMethodName()+date+".png");
		tempScreenshot.renameTo(destFile);
		
        
        		
    }		

    @Override		
    public void onTestSkipped(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestStart(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    @Override		
    public void onTestSuccess(ITestResult arg0) {					
        // TODO Auto-generated method stub				
        		
    }		

    
    

}
