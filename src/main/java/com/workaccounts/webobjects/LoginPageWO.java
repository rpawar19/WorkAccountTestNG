package com.workaccounts.webobjects;

import org.openqa.selenium.By;

public interface LoginPageWO {
	
	//rpawar+admin1@rpawar-wademo.wptst.com
	By work_emaill_address = By.xpath("//label[contains(text(),'Work email address')]/following-sibling::input");
	By continue_btn = By.xpath("//div[@aria-label='Continue']");
	By password = By.xpath("//label[contains(text(),'Password')]/following-sibling::input");
	
	 
	
}
