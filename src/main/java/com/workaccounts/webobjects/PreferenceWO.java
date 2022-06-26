package com.workaccounts.webobjects;

import org.openqa.selenium.By;

public interface PreferenceWO {
	
	//Tabs
	By securityAndLoginTab = By.xpath("//span[contains(text(),'Security and login')]/ancestor::a");
	By dataAndPrivacyTab = By.xpath("//span[contains(text(),'Data and privacy')]");
	By preferenceTab = By.xpath("//span[contains(text(),'Preferences')]");
	
	//Security And Login Page
	By turnOn_button= By.xpath("//span[contains(text(),'Turn on')]");
	By turnOff_button= By.xpath("//span[contains(text(),'Turn off')]");
	By confirmButton = By.xpath("//div[@aria-label='Confirm']");
	
	//Data Privacy
	By viewButton = By.xpath("//a[@aria-label='View']/child::div/child::div/child::div/child::span/child::span");
	String expectdPolicyURL = "https://work.facebook.com/beta/legal/privacy_policy/";
	
	//Preferences
	By toggleSwitch = By.xpath("//input[@aria-label='Change theme']");
	String lightMode = "fb-light-mode";
	String darkMode = "fb-dark-mode";
	By editLanguageButton = By.xpath("//span[contains(text(),'Buttons, titles and other text')]/ancestor::div/following-sibling::div/child::div[@aria-label='Edit']");
	By searchLanguageInput = By.xpath("//input[@aria-label='Search languages']");	
	
	
	By editRegionButton = By.xpath("//span[contains(text(),'Format for dates, times and numbers')]/ancestor::div/following-sibling::div/child::div[@aria-label='Edit']");
	
}
