package com.workaccounts.web;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webpages.AccountDetails;

public class AccountDetailsTest extends WorkAccountsBase {
	AccountDetails ad = new AccountDetails();

	
	public void updateProfilePicture() {
		Assert.assertEquals(ad.addUpdateProfilePicture(), true);
		System.out.println("Test Passed1");

	}
	@Test  (groups = { "NonAdmin" },priority=1)
	public void updateName()	{
		ad.updateName();
		Assert.assertEquals(ad.validateMessage(), true);
	}
	@Test (groups = { "NonAdmin" },priority=2)
	public void updateDepartment(){
		ad.updateDepartment();
		Assert.assertEquals(ad.validateMessage(), true);

	}
	@Test (groups = { "NonAdmin" },priority=3)
	public void deleteDepartment(){
		ad.deleteDepartment();
		Assert.assertEquals(ad.validateMessage(), true);

	}
	
	@Test (groups = { "NonAdmin" }, priority=4)
	public void addDepartment(){
		ad.addDepartment();
		Assert.assertEquals(ad.validateMessage(), true);

	}	
	@Test (groups = { "NonAdmin" },priority=5)
	public void updatePosition() {
		ad.updatePosition();
		Assert.assertEquals(ad.validateMessage(), true);

	}
	@Test (groups = { "NonAdmin" },priority=6)
	public void deletePosition() {
		ad.deletePosition();
		Assert.assertEquals(ad.validateMessage(), true);

	}
	@Test (groups = { "NonAdmin" },priority=7)
	public void addPosition() {
		ad.addPosition();
		Assert.assertEquals(ad.validateMessage(), true);

	}	
	@Test(groups = { "NonAdmin" },priority=8)
	public void updateLocation() {
		ad.updateLocation();
		Assert.assertEquals(ad.validateMessage(), true);

	}
	
	@Test(groups = { "NonAdmin" },priority=9)
	public void deleteLocation() {
		ad.deleteLocation();
		Assert.assertEquals(ad.validateMessage(), true);

	}
	@Test(groups = { "NonAdmin" },priority=10)
	public void addLocation() {
		ad.addLocation();
		Assert.assertEquals(ad.validateMessage(), true);
		
	}
	@Test(groups = { "NonAdmin" },priority=11)
	public void updatePhoneNumber() {
		ad.updatePhoneNumber();
		Assert.assertEquals(ad.validateMessage(), true);
		
	}
	@Test(groups = { "NonAdmin" },priority=12)
	public void deletePhoneNumber() {
		ad.deletePhoneNumber();
		Assert.assertEquals(ad.validateMessage(), true);
		
	}
	@Test(groups = { "NonAdmin" },priority=13)
	public void addPhoneNumber() {
		ad.addPhoneNumber();
		Assert.assertEquals(ad.validateMessage(), true);
		
	}

}
