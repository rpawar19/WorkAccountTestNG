package com.workaccounts.webobjects;

import org.openqa.selenium.By;

public interface AccountDetailsWO {
	
	
	
	By accountDetailsTab = By.xpath("//span[starts-with(text(),'Account')]/ancestor::a");
	By passwordTab = By.xpath("//span[starts-with(text(),'Password')]/ancestor::a");
	By securityAndLoginTab = By.xpath("//span[starts-with(text(),'Security')]/ancestor::a");
	By dataAndPrivacyTab = By.xpath("//span[starts-with(text(),'Data')]/ancestor::a");
	By goToWorkAccountManagertab = By.xpath("//span[starts-with(text(),'Go')]/ancestor::a");
	
	By updateProfilePicute = By.xpath("//div[@aria-label='Update profile picture']");
	By saveButton  = By.xpath("//span[contains(text(),'Save')]");
	
	By editNamebutton = By.xpath("//div[@class='j83agx80']/child::div/child::span/child::div[@aria-label='Edit']");
	By nameInputbox = By.xpath("//label[text()='Name']/following-sibling::input");
	By nameSavebtn = By.xpath("//label[text()='Name']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	
	By addDepartmentlinkbutton = By.xpath("//span[contains(text(),'Add department')]");
	By departmentInputbox = By.xpath("//input[@aria-label='Add department']");
	By departmentSavebtn = By.xpath("//input[@aria-label='Add department']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	
	
	By addPositionOrTitlebutton = By.xpath("//span[contains(text(),'Add position or title')]");
	By addPositionOrTitleInputbox = By.xpath("//input[@aria-label='Add position or title']");
	By positionSavebutton = By.xpath("//input[@aria-label='Add position or title']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	
	
	
	
	
	
	
	

}
