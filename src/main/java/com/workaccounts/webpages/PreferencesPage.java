package com.workaccounts.webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.workaccounts.base.WorkAccountsBase;
import com.workaccounts.webobjects.PreferenceWO;

public class PreferencesPage extends WorkAccountsBase implements PreferenceWO {
	
	
	public void getDropdownValue() {
		wait.waitFor2Sec();

		getWebElement(preferenceTab).click();
		wait.waitFor2Sec();
		getWebElement(editLanguageButton).click();
		wait.waitFor2Sec();
		List<WebElement> options = webdriver.findElements(By.xpath("//li[@role='option']"));
		String language1 = "Hindi";
		int i;
		for (i=0; i<options.size(); i++)
		{
			
			 String x = options.get(i).getText();
			 if(x.equalsIgnoreCase(language1)) {
				 break;
				 
			 }
			 else {
					System.out.println("Else Before");

				 options.get(i).click();
				 System.out.println(x);
					System.out.println("Else After");
					wait.waitFor10Sec();

			 }
		}
		
		

		
	}

}
