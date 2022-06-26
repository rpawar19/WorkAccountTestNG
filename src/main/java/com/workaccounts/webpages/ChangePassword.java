package com.workaccounts.webpages;

import java.io.IOException;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webobjects.ChangePasswordWO;

public class ChangePassword extends WorkAccountsBase implements ChangePasswordWO {

	public void navigateToPasswordPage() {

		getWebElement(passwordTab).click();
		wait.waitFor2Sec();

	}

	public boolean validateErrorForIncorrectCurrentPassword() {
		getWebElement(current_password).sendKeys(getConfigValue("invalidCurrentPassword"));
		getWebElement(new_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(confirm_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(savePassword).click();
		wait.waitFor3Sec();
		String errorMessage = getWebElement(errorForOldPassword).getText();
		System.out.println("Actual Error1 : " + errorMessage);
		String exptedError = "Your old password was incorrectly typed.";
		getWebElement(closeButton).click();
		if (exptedError.equalsIgnoreCase(errorMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean validateErrorWhenBothPasswordAreSame() {
		webdriver.navigate().refresh();
		wait.waitFor2Sec();
		getWebElement(current_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(new_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(confirm_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(savePassword).click();
		wait.waitFor3Sec();
		String errorMessage = getWebElement(errorForSamePassword).getText();
		String exptedError = "Password must differ from old password.";
		getWebElement(closeButton).click();
		if (exptedError.equalsIgnoreCase(errorMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean validateErrorWhenNewPasswordNotMatchRule() {
		webdriver.navigate().refresh();
		wait.waitFor2Sec();
		getWebElement(current_password).sendKeys(getConfigValue("currentPassword"));
		getWebElement(new_password).sendKeys(getConfigValue("newPassword_invalid"));
		getWebElement(confirm_password).sendKeys(getConfigValue("newPassword_invalid"));
		getWebElement(savePassword).click();
		wait.waitFor3Sec();
		String errorMessage = getWebElement(errorForStrongPassword).getText();
		String exptedError = "Mix at least 8 uppercase and lowercase letters, and numbers.";
		getWebElement(closeButton).click();
		if (exptedError.equalsIgnoreCase(errorMessage)) {
			return true;
		} else {
			return false;
		}

	}

	public boolean updatePassword() throws IOException {
		webdriver.navigate().refresh();
		wait.waitFor2Sec();
		getWebElement(current_password).sendKeys(getConfigValue("currentPassword"));
		getWebElement(new_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(confirm_password).sendKeys(getConfigValue("newPassword"));
		getWebElement(savePassword).click();
		wait.waitFor10Sec();
		getWebElement(stayLoggedInButton).click();
		wait.waitFor2Sec();
		String message = getWebElement(updateMessage).getText();
		String expectedMessage = "Your password has been changed";
		if (message.equalsIgnoreCase(expectedMessage)) {
			return true;
		} else {
			return false;
		}

	}

}
