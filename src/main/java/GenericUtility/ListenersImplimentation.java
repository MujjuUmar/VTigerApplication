package GenericUtility;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenersImplimentation implements ITestListener {

	JavaUtility jutil = new JavaUtility();
	String datTimeStamp = jutil.getCalendarDetails("dd-MM-YYYY hh-mm-ss");
	SeleniumUtility sutil = new SeleniumUtility();
	ExtentReports reports;
	ExtentTest test;
	
	@Override
	public void onTestStart(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		 System.out.println(MethodName+"-->On Test Start Executed");
		 
		 //Creating Fields for every @Test method in the report
		 test = reports.createTest(MethodName);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		System.out.println(MethodName+"-->On Test Success Executed");
		
		//Logging the status as PASS for Test Method
		test.log(Status.PASS, MethodName+"-->Successfully execured");
//		String screenShotName = MethodName+"--"+datTimeStamp;
//		try {
//			String path = sutil.webPageScreenShot(BaseClass.sDriver, screenShotName);
//			test.addScreenCaptureFromPath(path);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		System.out.println(MethodName+"-->On Test Failure Executed");
		
		//Logging the status as Failure for Test Method
		test.log(Status.FAIL, MethodName+"-->Successfully Failed");
		test.log(Status.INFO, result.getThrowable());
		
		//Capturing the screenShot of the WebPage
		String screenShotName = MethodName+"--"+datTimeStamp;
		
		try {
			String path = sutil.webPageScreenShot(BaseClass.sDriver, screenShotName);
			test.addScreenCaptureFromPath(path);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		String MethodName = result.getMethod().getMethodName();
		System.out.println(MethodName+"-->On Test Skipped Executed");
		
		test.log(Status.SKIP, MethodName+"--> Skipped");
		
//		String screenShotName = MethodName+"--"+datTimeStamp;
//		try {
//			String path = sutil.webPageScreenShot(BaseClass.sDriver, screenShotName);
//			test.addScreenCaptureFromPath(path);
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	}

	@Override
	public void onStart(ITestContext context) {
		//String MethodName = ((ITestResult) context).getMethod().getMethodName();
		System.out.println("-->On Start Executed");
		
		//Configuring the Extent Reports
		ExtentSparkReporter reporter = new ExtentSparkReporter(".\\Extent_Reports\\report--"+datTimeStamp+".html");
		reporter.config().setDocumentTitle("Extent Report");
		reporter.config().setReportName("VTiger Report");
		reporter.config().setTheme(Theme.STANDARD);
		
		//Generate an Empty Report
		reports = new ExtentReports();
		reports.attachReporter(reporter);
		reports.setSystemInfo("Base URL", "http://localhost:8888");
		reports.setSystemInfo("Base Browser", "Chrome");
		reports.setSystemInfo("Base Platform", "Windows");
		reports.setSystemInfo("Test Engineer", "Umar Haseeb");
		
		
	}

	@Override
	public void onFinish(ITestContext context) {
		//String MethodName = ((ITestResult) context).getMethod().getMethodName();
		reports.flush();
		System.out.println("-->On Finish Executed");
	}
}




