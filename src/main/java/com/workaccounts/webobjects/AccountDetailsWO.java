package com.workaccounts.webobjects;

import org.openqa.selenium.By;

public interface AccountDetailsWO {
	
	
	By updateMessage = By.xpath("//ul/child::li/child::div/child::div");

	By accountDetailsTab = By.xpath("//span[starts-with(text(),'Account')]/ancestor::a");
	By passwordTab = By.xpath("//span[starts-with(text(),'Password')]/ancestor::a");
	By securityAndLoginTab = By.xpath("//span[starts-with(text(),'Security')]/ancestor::a");
	By dataAndPrivacyTab = By.xpath("//span[starts-with(text(),'Data')]/ancestor::a");
	By goToWorkAccountManagertab = By.xpath("//span[starts-with(text(),'Go')]/ancestor::a");
	
	By updateProfilePicute = By.xpath("//div[@aria-label='Update profile picture']");
	By saveButton  = By.xpath("//span[contains(text(),'Save')]");
	
	By editNamebutton = By.xpath("//div[@class='j83agx80']/child::div/child::span/child::div[@aria-label='Edit']");
	By nameInputbox = By.xpath("//label[text()='Name']/following-sibling::input");
	By deleteNamebutton = By.xpath("//label[text()='Name']/following-sibling::div");
	By nameSavebtn = By.xpath("//label[text()='Name']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	
	By addDepartmentlinkbutton = By.xpath("//span[contains(text(),'Add department')]");
	By editDepartmentbutton = By.xpath("//div[@class='j83agx80']/child::div/child::span/child::div[@aria-label='Edit department']");
	By departmentInputbox = By.xpath("//input[@aria-label='Add department']");
	By editDepartmentInputbox = By.xpath("//input[@aria-label='Department']");
	By deleteDepartmentbutton = By.xpath("//label[text()='Department']/following-sibling::div");
	By departmentSavebtn2 = By.xpath("//input[@aria-label='Department']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	By departmentSavebtn = By.xpath("//input[@aria-label='Add department']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	
	By addPositionOrTitlebutton = By.xpath("//span[contains(text(),'Add position or title')]");
	By editPositionButton = By.xpath("//div[@class='j83agx80']/child::div/child::span/child::div[@aria-label='Edit position']");
	By addPositionOrTitleInputbox = By.xpath("//input[@aria-label='Add position or title']");
	By editPositionOrTitleInputbox = By.xpath("//input[@aria-label='Position']");
	By deletePositionbutton = By.xpath("//label[text()='Position']/following-sibling::div");
	By positionSavebutton = By.xpath("//input[@aria-label='Add position or title']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	By positionSavebutton2 = By.xpath("//input[@aria-label='Position']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");

	By addLocationbutton = By.xpath("//span[contains(text(),'Add location')]");
	By editLocationbutton = By.xpath("//div[@class='j83agx80']/child::div/child::span/child::div[@aria-label='Edit location']");
	By addLocationInputbox = By.xpath("//input[@aria-label='Add location']");
	By editLocationInputbox = By.xpath("//input[@aria-label='Location']");
	By deleteLocationbutton =  By.xpath("//label[text()='Location']/following-sibling::div");
	By locationSavebutton =  By.xpath("//input[@aria-label='Add location']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	By locationSavebutton2 =  By.xpath("//input[@aria-label='Location']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");

	By addPhoneNumber = By.xpath("//span[contains(text(),'Add phone number')]");
	By countryCode = By.xpath("//label[@aria-label='Country code']");
	By numberInput = By.xpath("//label[contains(text(),'Number')]/following-sibling::input");
	By deletenumberbutton = By.xpath("//label[contains(text(),'Number')]/following-sibling::div");
	By numberSavebtn = By.xpath("//label[@aria-label='Country code']/ancestor::div/child::div/child::div/child::div[@aria-label='Save']");
	By numberEditbutton = By.xpath("//div[@class='j83agx80']/child::div/child::span/child::div[@aria-label='Edit phone number']");
	By numberDelete = By.xpath("//span[contains(text(),'Delete')]");
	By numberSavebtn2 = By.xpath("//span[contains(text(),'Save')]"); 
	
//	By adminPortalString = By.xpath("//span[contains(text(),'Welcome to Work Accounts Manager')]");
//	By nonAdminPortalString = By.xpath("//header[@role='banner']/child::div/child::div/child::div/child::div/child::h1/child::span");


}
