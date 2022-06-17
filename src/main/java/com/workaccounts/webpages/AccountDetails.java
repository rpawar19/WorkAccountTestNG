package com.workaccounts.webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webobjects.AccountDetailsWO;

public class AccountDetails extends WorkAccountsBase implements AccountDetailsWO {
	
	public void addUpdateProfilePicture() {
		//getWebElement(accountDetailsTab).click();
		getWebElement(updateProfilePicute).click();
		try {
			Robot robot = new Robot();
			String filePath = "D:\\Workspaces\\EclipseWS1\\workaccounts\\src\\main\\resources\\photos\\image1.jpg";
			StringSelection stringSelection = new StringSelection(filePath);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
			robot.setAutoDelay(2000);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			robot.setAutoDelay(2000);
		
		
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		getWebElement(saveButton).click();

	}

}
