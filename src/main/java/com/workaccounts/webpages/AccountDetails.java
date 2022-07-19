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

	public void clickOnEditNameButton() {
		waitForElement(editNamebutton, 30);
		getWebElement(editNamebutton).click();
	}

	public void enterName(String name1, String name2) {
		waitForElement(nameInputbox, 30);
		String oldName = getWebElement(nameInputbox).getAttribute("value");
		getWebElement(nameInputbox).click();
		getWebElement(deleteNamebutton).click();
		if (oldName.equals(name2)) {
			getWebElement(nameInputbox).sendKeys(name1);
		} else {
			getWebElement(nameInputbox).sendKeys(name2);

		}
	}

	public void clickOnNameSaveButton() {
		clickOnSavebutton(nameSavebtn);
	}

	public void clickOnAddDepartmentlinkbutton() {
		waitForElement(addDepartmentlinkbutton, 30);
		getWebElement(addDepartmentlinkbutton).click();
	}

	public void enterDepartmentName(String departmentName) {
		waitForElement(departmentInputbox, 30);
		getWebElement(departmentInputbox).sendKeys(departmentName);
	}

	public void clickOnDepartmentSaveButton() {
		clickOnSavebutton(departmentSavebtn);

	}

	public void clickEditDepartmentButton() {
		waitForElement(editDepartmentbutton, 30);
		getWebElement(editDepartmentbutton).click();
	}

	public void deleteDepartmentName() {
		waitForElement(editDepartmentInputbox, 30);
		getWebElement(editDepartmentInputbox).click();
		waitForElement(deleteDepartmentbutton, 30);
		getWebElement(deleteDepartmentbutton).click();

	}

	public void updateDepartmentName(String departmentName) {
		getWebElement(editDepartmentInputbox).sendKeys(departmentName);
	}

	public void clickOnDepartmentSaveButton2() {
		clickOnSavebutton(departmentSavebtn2);

	}

	public void clickOnaddPositionOrTitlebutton() {
		waitForElement(addPositionOrTitlebutton, 30);
		getWebElement(addPositionOrTitlebutton).click();
	}

	public void enterPositiondetails(String position) {
		waitForElement(addPositionOrTitleInputbox, 30);
		getWebElement(addPositionOrTitleInputbox).sendKeys(position);
	}

	public void clickOnPositionSavebutton() {
		clickOnSavebutton(positionSavebutton);
	}

	public void clickOnEditPositionButton() {
		waitForElement(editPositionButton, 30);
		getWebElement(editPositionButton).click();
	}

	public void deletePosition() {
		waitForElement(editPositionOrTitleInputbox, 30);
		getWebElement(editPositionOrTitleInputbox).click();
		waitForElement(deletePositionbutton, 10);
		getWebElement(deletePositionbutton).click();
	}

	public void updatePosition(String position) {

		waitForElement(editPositionOrTitleInputbox, 30);
		getWebElement(editPositionOrTitleInputbox).sendKeys(position);

	}

	public void clickOnPositionSavebutton2() {
		clickOnSavebutton(positionSavebutton2);
	}

	public void deletePosition1() {
		waitForElement(editPositionButton, 30);
		getWebElement(editPositionButton).click();
		waitForElement(editPositionOrTitleInputbox, 30);
		getWebElement(editPositionOrTitleInputbox).click();
		getWebElement(deletePositionbutton).click();
		clickOnSavebutton(positionSavebutton2);

	}
	
	public void clickOnAddLocationbutton() {
		waitForElement(addLocationbutton, 30);
		getWebElement(addLocationbutton).click();
	}

	public void enterLocation(String location) {
		waitForElement(addLocationInputbox, 30);
		getWebElement(addLocationInputbox).sendKeys(location);
	}
	public void clickOnLocationSavebutton() {
		clickOnSavebutton(locationSavebutton);
	}

	public void updateLocation() {

		waitForElement(editLocationbutton, 30);
		getWebElement(editLocationbutton).click();
		waitForElement(editLocationInputbox, 30);
		getWebElement(editLocationInputbox).click();
		getWebElement(deleteLocationbutton).click();
		getWebElement(editLocationInputbox).sendKeys(getConfigValue("updateLocation"));
		clickOnSavebutton(locationSavebutton2);

	}

	public void deleteLocation() {
		waitForElement(editLocationbutton, 30);
		getWebElement(editLocationbutton).click();
		waitForElement(editLocationInputbox, 30);
		getWebElement(editLocationInputbox).click();
		waitForElement(deleteLocationbutton, 30);
		getWebElement(deleteLocationbutton).click();
		clickOnSavebutton(locationSavebutton2);

	}

	public void addPhoneNumber() {
		waitForElement(addPhoneNumber, 30);
		getWebElement(addPhoneNumber).click();
		waitForElement(countryCode, 30);
		getWebElement(countryCode).click();
		List<WebElement> allOptions = webdriver.findElements(By.xpath("//div[@role='option']"));
		allOptions.get(94).click();
		getWebElement(numberInput).sendKeys(getConfigValue("newPhoneNumber"));
		waitForElement(numberSavebtn, 30);
		clickOnSavebutton(numberSavebtn);

	}

	public void updatePhoneNumber() {
		waitForElement(numberEditbutton, 30);
		scrollPage();
		getWebElement(numberEditbutton).click();
		waitForElement(numberInput, 30);
		getWebElement(numberInput).click();
//		List<WebElement> allOptions = webdriver.findElements(By.xpath("//div[@role='option']"));
//		allOptions.get(94).click();
		getWebElement(numberInput).click();
		waitForElement(deletenumberbutton, 30);
		getWebElement(deletenumberbutton).click();
		getWebElement(numberInput).sendKeys(getConfigValue("updatePhoneNumber"));

		clickOnSavebutton(numberSavebtn);

	}

	public void deletePhoneNumber() {
		waitForElement(numberEditbutton, 30);
		scrollPage();
		getWebElement(numberEditbutton).click();
		waitForElement(numberDelete, 30);
		getWebElement(numberDelete).click();
		waitForElement(numberSavebtn2, 30);
		clickOnSavebutton(numberSavebtn2);
	}

	public void clickOnSavebutton(By elementName) {
		waitForElement(elementName, 30);
		WebElement button = getWebElement(elementName);
		JavascriptExecutor jse = (JavascriptExecutor) webdriver;
		jse.executeScript("arguments[0].click()", button);

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
