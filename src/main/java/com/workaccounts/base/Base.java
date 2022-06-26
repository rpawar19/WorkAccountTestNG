package com.workaccounts.base;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.workaccounts.utilities.ExcelUtils;
import com.workaccounts.utilities.Waits;
import com.workaccounts.webpages.AccountDetails;
import com.workaccounts.webpages.ChangePassword;
import com.workaccounts.webpages.LoginPage;
import com.workaccounts.webpages.PreferencesPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public static WebDriver webdriver;
	public static String configPath = "./resources/config.properties";
	public static Logger accountDetailsLoger = LogManager.getLogger(AccountDetails.class);
	public String projectPath = System.getProperty("user.dir");
	public static LoginPage loginPage;
	public static ChangePassword changepwd;
	public static PreferencesPage preferences;

	public static Waits wait;
	public static ExcelUtils excelUtils;
	public Logger logger = LogManager.getLogger(this.getClass());

	public void initWebDriver() {

		initObjects();

		if (getConfigValue("browser").equalsIgnoreCase("Chrome")) {
			WebDriverManager.chromedriver().setup();
			webdriver = new ChromeDriver();
		} else if (getConfigValue("browser").equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			webdriver = new FirefoxDriver();
		} else if (getConfigValue("browser").equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			webdriver = new EdgeDriver();
		}

	}

	private void initObjects() {
		loginPage = new LoginPage();
		wait = new Waits();
		excelUtils = new ExcelUtils();
		changepwd = new ChangePassword();
		preferences = new PreferencesPage();
	}

	public void quitBrowser() {
		webdriver.quit();
	}

	public WebElement getWebElement(By by) {
		return webdriver.findElement(by);

	}
	

	public String getConfigValue(String key) {
		return getValue(configPath, key);
	}

	private String getValue(String filePath, String key) {
		FileReader reader;
		Properties p = null;
		try {
			reader = new FileReader(filePath);
			p = new Properties();
			p.load(reader);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p.getProperty(key);
	}

	

}
