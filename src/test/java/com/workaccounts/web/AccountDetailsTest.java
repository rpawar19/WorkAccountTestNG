package com.workaccounts.web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webpages.AccountDetails;

public class AccountDetailsTest extends WorkAccountsBase {
	AccountDetails ad = new AccountDetails();

	@Test
	public void updateProfilePicture() {
		Assert.assertEquals(ad.addUpdateProfilePicture(), true);

	}

}
