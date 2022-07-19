package com.workaccounts.base;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.domdebugger.model.EventListener;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.workaccounts.listener.driverListener;
import com.workaccounts.utilities.ExcelUtils;
import com.workaccounts.utilities.Waits;
import com.workaccounts.webpages.AccountDetails;
import com.workaccounts.webpages.ChangePassword;
import com.workaccounts.webpages.LoginPage;
import com.workaccounts.webpages.PreferencesPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base extends driverListener {
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
	public static driverListener eCapture = new driverListener();
	public static EventFiringWebDriver eventRecorder;

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

		eventRecorder = new EventFiringWebDriver(webdriver);
		eventRecorder.register(eCapture);

	}

	public void initObjects() {
		loginPage = new LoginPage();
		wait = new Waits();
		excelUtils = new ExcelUtils();
		changepwd = new ChangePassword();
		preferences = new PreferencesPage();

	}

	public void quitBrowser() {
		eventRecorder.quit();
	}

	public WebElement getWebElement(By by) {
		return eventRecorder.findElement(by);

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

	public static void waitForElement(By by, int timeOut) {
		WebDriverWait wait = new WebDriverWait(webdriver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}

}
