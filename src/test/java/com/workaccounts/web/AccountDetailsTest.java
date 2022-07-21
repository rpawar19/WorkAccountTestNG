package com.workaccounts.web;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.stepsDefination.AccountDetailsSteps;

public class AccountDetailsTest extends WorkAccountsBase {

	AccountDetailsSteps accountSteps = new AccountDetailsSteps();
	
	
	@Test
	@Parameters ({"name1", "name2", "departmentName1", "departmentName1", "position1", "position2", "location1", "location2"})
	public void updateProfile(String name1, String name2, String departmentName1,String departmentName2,
			String position1, String position2, String location1, String location2, String phonenumber1,
			int code1, String phonenumber2,int code2
			) {
		accountSteps.updateName(name1, name2);
		accountSteps.addDepartment(departmentName1);
		accountSteps.updateDepartment(departmentName2);
		accountSteps.addPosition(position1);
		accountSteps.updatePosition(position2);
		accountSteps.deletePosition();
		accountSteps.addLocation(location1);
		accountSteps.updateLocation(location2);
		accountSteps.deleteLocation();
		accountSteps.addPhoneNumber(phonenumber1, code1);
		accountSteps.updatePhoneNumber(phonenumber2, code2);
		accountSteps.deletePhoneNumber();
	}




}
