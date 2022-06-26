package com.workaccounts.web;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.workaccounts.base.WorkAccountsBase;

public class ChangePasswordTest extends WorkAccountsBase {
	
	@Test(groups = { "NonAdmin" },priority=1)
	public void openPasswordTab() {
		System.out.println("Method X started");
		changepwd.navigateToPasswordPage();

	}
	
	@Test(groups = { "NonAdmin" },priority=2)
	public void errorForIncorrectCurrentPassword() {
		
		Assert.assertEquals(changepwd.validateErrorForIncorrectCurrentPassword(), true);
		
	}
	
	@Test(groups = { "NonAdmin" },priority=3)
	public void errorWhenCurrentAndNewPWDSame() { 
		Assert.assertEquals(changepwd.validateErrorWhenBothPasswordAreSame(), true);

	}
	
	@Test(groups = { "NonAdmin" },priority=4)
	public void errorWhenNewPasswordNotMatchRule() { 
		Assert.assertEquals(changepwd.validateErrorWhenNewPasswordNotMatchRule(), true);

	}
	
	@Test(groups = { "NonAdmin" },priority=5)
	public void updatePassowrdwithValidData() {
		try {
			Assert.assertEquals(changepwd.updatePassword(), true);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	


}
