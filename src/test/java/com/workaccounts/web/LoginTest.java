package com.workaccounts.web;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;

public class LoginTest extends WorkAccountsBase {
	

	@Parameters({"admin_email", "password"})
	@Test (groups = { "Admin" })
	public void loginWithAdminUser(String email, String pwd) {
		webdriver.get(getConfigValue("url"));
		webdriver.manage().window().maximize();
		Assert.assertEquals(loginPage.loginIntoWorkAccoutns(email, pwd), true);
	}	
	
	@Parameters({"nonadmin_email", "password"})
	@Test  (groups = { "NonAdmin" })
	public void loginWithNonAdminUser(String email, String pwd) {
		webdriver.get(getConfigValue("url"));
		webdriver.manage().window().maximize();
		Assert.assertEquals(loginPage.loginIntoWorkAccoutns(email, pwd), true);
	
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		

	}
	
}
