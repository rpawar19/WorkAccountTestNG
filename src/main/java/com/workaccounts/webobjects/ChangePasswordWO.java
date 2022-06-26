package com.workaccounts.webobjects;

import org.openqa.selenium.By;

public interface ChangePasswordWO {
	
	By passwordTab = By.xpath("//span[contains(text(),'Password')]");
	By current_password = By.xpath("//label[contains(text(),'Current password')]/following-sibling::input");
	By new_password = By.xpath("//label[contains(text(),'New password')]/following-sibling::input");
	By confirm_password = By.xpath("//label[contains(text(),'Confirm new password')]/following-sibling::input");
	By savePassword = By.xpath("//span[contains(text(),'Save')]");
	By forgotPasswordLink = By.xpath("//div[contains(text(),'Forgot password?')]");
	By errorForOldPassword = By.xpath("//div[@aria-label='Wrong Old Password']/child::div/child::span/child::div");
	By errorForSamePassword = By.xpath("//div[@aria-label='Invalid Password']/child::div/child::span/child::div");
	By errorForStrongPassword = By.xpath("//div[@aria-label='Make a strong password']/child::div/child::span/child::div");
	By stayLoggedInButton = By.xpath("//div[@aria-label=\"Log out of your devices?\"]/child::div/child::div/child::div/child::div[@aria-label='Stay logged in']");
	By closeButton = By.xpath("//i/parent::div[@aria-label='Close']");
	
	By updateMessage = By.xpath("//ul/child::li/child::div/child::div");

	

}
