package Carmax.util;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import Carmax.testcase.CommonClass;

public class ScreenshotUtility implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		captureScreenShot(result, "pass");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		captureScreenShot(result, "fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		captureScreenShot(result, "skip");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

	// Function to capture screenshot.
	public void captureScreenShot(ITestResult result, String status) {
		
		String destDir = "";
		String failSkipMethod = result.getMethod().getRealClass().getSimpleName() + "."
				+ result.getMethod().getMethodName();
		
		// To capture screenshot.
		File scrFile = ((TakesScreenshot) CommonClass.driver).getScreenshotAs(OutputType.FILE);
		DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		
		
		if (status.equalsIgnoreCase("pass")) {
			destDir = "Screenshots/Pass";
		}
		// If status = fail then set folder name "screenshots/Failures"
		else if (status.equalsIgnoreCase("fail")) {
			destDir = "Screenshots/Failures";
		}
		
		// If status = skip then set folder name "screenshots/Skipped"
		else if (status.equalsIgnoreCase("skip")) {
			destDir = "Screenshots/Skipped";
		}

		// To create folder to store screenshots
		new File(destDir).mkdirs();
		
		// Set file name with combination of test class name + date time.
		String destFile = failSkipMethod + " - " + dateFormat.format(new Date()) + ".png";

		try {
			// Store file at destination folder location
			FileUtils.copyFile(scrFile, new File(destDir + "/" + destFile));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
