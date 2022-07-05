package com.workaccounts.webpages;

import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.listener.driverListener;

public class Practice extends WorkAccountsBase{
	
	
	public void openSite()	{
		eventRecorder.get(getConfigValue("url"));
	//	eventRecorder.waitFor2Sec();
		eventRecorder.quit();
		
//		webdriver.get(getConfigValue("url"));
//		wait.waitFor2Sec();
//		webdriver.quit();
	}
}
