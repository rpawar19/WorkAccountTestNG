package com.workaccounts.setups;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.web.LoginTest;

public class WebSuiteSetUP extends WorkAccountsBase {

	LoginTest logintest = new LoginTest();

	@BeforeSuite(alwaysRun = true)
	public void setUp() {

		initWebDriver();
		//logintest.loginWithAdminUser();

	}

	@AfterSuite(alwaysRun = true)
	public void tearDown() {
		//quitBrowser();
	}

}
