package com.workaccounts.stepsDefination;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webpages.AccountDetails;

public class AccountDetailsSteps extends WorkAccountsBase{
	AccountDetails ad = new AccountDetails();

	public void validateUpdateProfile() {
//		ad.addUpdateProfilePicture();
		ad.updateName();
		ad.updateDepartment();
		ad.deleteDepartment();
		ad.addDepartment();
		ad.updatePosition();
		ad.deletePosition();
		ad.addPosition();
		ad.updateLocation();
		ad.deleteLocation();
		ad.addLocation();
		ad.updatePhoneNumber();
		ad.deletePhoneNumber();
		ad.addPhoneNumber();
		
	}

}
