package com.workaccounts.web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.stepsDefination.AccountDetailsSteps;
import com.workaccounts.webpages.AccountDetails;

public class AccountDetailsTest extends WorkAccountsBase {

	AccountDetailsSteps accountSteps = new AccountDetailsSteps();
	

	
	@Test
	public void updateProfile() {
		accountSteps.validateUpdateProfile();
		
	}


}
