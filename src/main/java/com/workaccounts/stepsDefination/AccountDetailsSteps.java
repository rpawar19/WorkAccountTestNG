package com.workaccounts.stepsDefination;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webpages.AccountDetails;

public class AccountDetailsSteps extends WorkAccountsBase{
	AccountDetails ad = new AccountDetails();

	public void validateUpdateProfile() {
		//ad.addUpdateProfilePicture();
		ad.updateName();
		ad.addDepartment();
		ad.updateDepartment();
		ad.deleteDepartment();
		ad.addPosition();
		ad.updatePosition();
		ad.deletePosition();
		ad.addLocation();
		ad.updateLocation();
		ad.deleteLocation();
		ad.addPhoneNumber();
		ad.updatePhoneNumber();
		ad.deletePhoneNumber();
	}

}
