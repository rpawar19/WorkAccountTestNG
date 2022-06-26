package com.workaccounts.web;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;

public class LoginTest extends WorkAccountsBase {
	
	
	
	@DataProvider(name = "Authentication")
//	public Object[][] credential() throws Exception{
//			
//		Object[][] testObjArray = excelUtils.getTableArray(projectPath + getConfigValue("filepath"), "Sheet1");
//		return(testObjArray);
//	}
	

		@Test (groups = { "Admin" })
	public void loginWithAdminUser() {
		webdriver.get(getConfigValue("url"));
		webdriver.manage().window().maximize();
		Assert.assertEquals(loginPage.loginIntoWorkAccoutns(getConfigValue("admin_username"), getConfigValue("admin_password")), true);
	}	
	
	
	
//	@Test  (dataProvider="Authentication",groups = "NonAdmin")
//	public void loginWithNonAdminUser(String email, String pwd) {
//		webdriver.get(getConfigValue("url"));
//		webdriver.manage().window().maximize();
//		Assert.assertEquals(loginPage.loginIntoWorkAccoutns(email, pwd), true);
//	
//		try {
//			Thread.sleep(3000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}		
//
//	}
	
	
	@Test  (groups = { "NonAdmin" })
	public void loginWithNonAdminUser() {
		webdriver.get(getConfigValue("url"));
		webdriver.manage().window().maximize();
		Assert.assertEquals(loginPage.loginIntoWorkAccoutns(getConfigValue("nonAdmin_username"), getConfigValue("nonAdmin_password")), true);	
	//	preferences.getDropdownValue();

	}
	
}
