	package com.workaccounts.webpages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webobjects.AccountDetailsWO;

public class AccountDetails extends WorkAccountsBase implements AccountDetailsWO {

	public boolean addUpdateProfilePicture() {
		// getWebElement(accountDetailsTab).click();
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
			getWebElement(saveButton).click();

		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;

	}

	public void updateName() {
		getWebElement(editNamebutton).click();
		wait.waitFor2Sec();
		String oldName = getWebElement(nameInputbox).getAttribute("value");
		logger.info("Old Name is : " +oldName);
		
		getWebElement(nameInputbox).click();
		getWebElement(deleteNamebutton).click();
		if(oldName.equals(getConfigValue("Name2"))) {
			getWebElement(nameInputbox).sendKeys(getConfigValue("Name1"));
		} else {
			getWebElement(nameInputbox).sendKeys(getConfigValue("Name2"));

		}
		clickOnSavebutton(nameSavebtn);
		

	}

	public void addDepartment() {
		getWebElement(addDepartmentlinkbutton).click();
		wait.waitFor2Sec();
		getWebElement(departmentInputbox).sendKeys(getConfigValue("newDepartment"));
		wait.waitFor1Sec();	
		clickOnSavebutton(departmentSavebtn);

	}

	public void updateDepartment() {
		getWebElement(editDepartmentbutton).click();
		wait.waitFor1Sec();
		getWebElement(editDepartmentInputbox).click();
		wait.waitFor2Sec();
		getWebElement(deleteDepartmentbutton).click();
		getWebElement(editDepartmentInputbox).sendKeys(getConfigValue("updateDepartment"));
		clickOnSavebutton(departmentSavebtn2);

	}

	public void deleteDepartment() {
		getWebElement(editDepartmentbutton).click();
		wait.waitFor2Sec();
		getWebElement(editDepartmentInputbox).click();
		wait.waitFor1Sec();
		getWebElement(deleteDepartmentbutton).click();
		clickOnSavebutton(departmentSavebtn2);

	}

	public void addPosition() {
		getWebElement(addPositionOrTitlebutton).click();
		wait.waitFor2Sec();
		getWebElement(addPositionOrTitleInputbox).sendKeys(getConfigValue("newPosition"));
		wait.waitFor2Sec();		
		clickOnSavebutton(positionSavebutton);
	}

	public void updatePosition() {
		getWebElement(editPositionButton).click();
		wait.waitFor2Sec();
		getWebElement(editPositionOrTitleInputbox).click();
		getWebElement(deletePositionbutton).click();
		getWebElement(editPositionOrTitleInputbox).sendKeys(getConfigValue("updatePosition"));
		wait.waitFor2Sec();
		clickOnSavebutton(positionSavebutton2);

	}

	public void deletePosition() {
		getWebElement(editPositionButton).click();
		wait.waitFor2Sec();
		getWebElement(editPositionOrTitleInputbox).click();
		getWebElement(deletePositionbutton).click();
		clickOnSavebutton(positionSavebutton2);

	}
	
	public void addLocation() {
		getWebElement(addLocationbutton).click();
		wait.waitFor2Sec();
		getWebElement(addLocationInputbox).sendKeys(getConfigValue("newLocation"));
		wait.waitFor2Sec();	
		clickOnSavebutton(locationSavebutton);
	}
	public void updateLocation() {
		getWebElement(editLocationbutton).click();
		wait.waitFor2Sec();
		getWebElement(editLocationInputbox).click();
		getWebElement(deleteLocationbutton).click();
		getWebElement(editLocationInputbox).sendKeys(getConfigValue("updateLocation"));
		wait.waitFor2Sec();
		clickOnSavebutton(locationSavebutton2);

	}
	public void deleteLocation() {
		getWebElement(editLocationbutton).click();
		wait.waitFor2Sec();
		getWebElement(editLocationInputbox).click();
		getWebElement(deleteLocationbutton).click();
		wait.waitFor2Sec();
		clickOnSavebutton(locationSavebutton2);

	}
	
	public void addPhoneNumber() {
		wait.waitFor2Sec();
		getWebElement(addPhoneNumber).click();
		wait.waitFor2Sec();
		getWebElement(countryCode).click();
		List<WebElement> allOptions = webdriver.findElements(By.xpath("//div[@role='option']"));
		allOptions.get(94).click();
		getWebElement(numberInput).sendKeys(getConfigValue("newPhoneNumber"));
		clickOnSavebutton(numberSavebtn);
	
	}
	public void updatePhoneNumber() {
		wait.waitFor2Sec();
		scrollPage();
		getWebElement(numberEditbutton).click();
		wait.waitFor2Sec();
		getWebElement(countryCode).click();
//		List<WebElement> allOptions = webdriver.findElements(By.xpath("//div[@role='option']"));
//		allOptions.get(94).click();
		getWebElement(numberInput).click();
		wait.waitFor1Sec();
		getWebElement(deletenumberbutton).click();
		getWebElement(numberInput).sendKeys(getConfigValue("updatePhoneNumber"));
		clickOnSavebutton(numberSavebtn);
	
	}
	public void deletePhoneNumber() {
		wait.waitFor2Sec();
		scrollPage();
		getWebElement(numberEditbutton).click();
		wait.waitFor2Sec();
		getWebElement(numberDelete).click();
		wait.waitFor2Sec();
		clickOnSavebutton(numberSavebtn2);
	}
	
	public void clickOnSavebutton(By elementName) {
		WebElement button = getWebElement(elementName);
		JavascriptExecutor jse = (JavascriptExecutor)webdriver;
		jse.executeScript("arguments[0].click()", button);
		wait.waitFor3Sec();	
		
	}
	
	public void scrollPage() {
		JavascriptExecutor js = (JavascriptExecutor) webdriver;
		js.executeScript("window.scrollBy(0,150)", "");
	}
	

	public boolean validateMessage() {

		String expecteMessage = "Your changes have been saved.";
		String actualMessage = getWebElement(updateMessage).getText();

		if (expecteMessage.equalsIgnoreCase(actualMessage)) {
			return true;
		} else {
			return false;
		}

	}

}
