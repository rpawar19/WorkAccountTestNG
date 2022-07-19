package com.workaccounts.stepsDefination;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webpages.AccountDetails;

public class AccountDetailsSteps extends WorkAccountsBase{
	AccountDetails ad = new AccountDetails();

	public void updateName(String name1, String name2) {
		ad.clickOnEditNameButton();
		ad.enterName(name1, name2);
		ad.clickOnNameSaveButton();
	}
	public void addDepartment(String departmentName) {
		ad.clickOnAddDepartmentlinkbutton();
		ad.enterDepartmentName(departmentName);
		ad.clickOnDepartmentSaveButton();			
	}
	public void updateDepartment(String departmentName) {
		ad.clickEditDepartmentButton();
		ad.deleteDepartmentName();
		ad.updateDepartmentName(departmentName);
		ad.clickOnDepartmentSaveButton2();			
	}
	public void deleteDepartment() {
		ad.clickEditDepartmentButton();
		ad.deleteDepartmentName();
		ad.clickOnDepartmentSaveButton2();
	}
	public void addPosition(String position) {
		ad.clickOnaddPositionOrTitlebutton();
		ad.enterPositiondetails(position);
		ad.clickOnPositionSavebutton();
	}
	public void updatePosition(String position) {
		ad.clickOnEditPositionButton();
		ad.deletePosition();
		ad.updatePosition(position);
		ad.clickOnPositionSavebutton2();
	}
	public void deletePosition() {
		ad.clickOnEditPositionButton();
		ad.deletePosition();
		ad.clickOnPositionSavebutton2();
	}
	public void addLocation(String location) {
		ad.clickOnAddLocationbutton();
		ad.enterLocation(location);
		ad.clickOnLocationSavebutton();
		
	}
	
//	public void validateUpdateProfile() {
//		//ad.addUpdateProfilePicture();
//		ad.updateLocation();
//		ad.deleteLocation();
//		ad.addPhoneNumber();
//		ad.updatePhoneNumber();
//		ad.deletePhoneNumber();
//	}

}
