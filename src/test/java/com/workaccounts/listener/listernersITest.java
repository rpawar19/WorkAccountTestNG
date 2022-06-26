package com.workaccounts.listener;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.workaccounts.base.WorkAccountsBase;

public class listernersITest extends WorkAccountsBase implements ITestListener, ISuiteListener {

	public void onStart(ISuite suite) {
		initWebDriver();

	}

	public void onStart(ITestResult context) {
		logger.info("Test Execution Started");
	}

	public void onTestStart(ITestResult result) {
		logger.info("Method " + result.getName() + "is started");
	}
	

	public void onTestSuccess(ITestResult result) {
		logger.info("Method " + result.getName() + "is Passed");
	}

	public void onTestFailure(ITestResult result) {
		logger.info("Method " + result.getName() + "is Failed");
	}

	public void onTestSkipped(ITestResult result) {
		logger.info("Method " + result.getName() + "is Skipped");
	}

	public void onFinish(ITestResult result) {
		logger.info("Test Execution Completed");
	}

	public void onFinish(ISuite suite) {
		quitBrowser();
	}

}
