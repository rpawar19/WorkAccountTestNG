package com.workaccounts.webpages;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webobjects.LoginPageWO;

public class LoginPage extends WorkAccountsBase implements LoginPageWO {
	
	
	public boolean loginIntoWorkAccoutns(String email, String pwd)
	{
		getWebElement(work_emaill_address).sendKeys(email);
		getWebElement(continue_btn).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getWebElement(password).sendKeys(pwd);
		getWebElement(continue_btn).click();
		
		return true;
		
	}
	
	public void verifyAdminPortalLoad() {
		
	}
	public void verifynonAdminPortalLoad() {
		
	}

}
