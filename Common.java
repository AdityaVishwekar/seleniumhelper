package stepdefinition;
/*
 * This file includes all the common functions
 */
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import java.net.URL;

public class Common {
	
	public static WebDriver driver = null;
    public static final Logger logger = LogManager.getLogger();

	public static WebElement getElement(String locator) {
		boolean flag = false;
		if(locator.contains("/"))
			flag = true;
		if(driver.findElements(By.id(locator)).size() ==  1) {
			return driver.findElement(By.id(locator));
		} else if(driver.findElements(By.xpath(locator)).size() == 1) {
			return driver.findElement(By.xpath(locator)); 
		}  else if(driver.findElements(By.cssSelector(locator)).size() == 1) {
			return driver.findElement(By.cssSelector(locator));
		} else if(driver.findElements(By.className(locator)).size() == 1) {
			return driver.findElement(By.className(locator));
		} else if(driver.findElements(By.name(locator)).size() == 1) {
			return driver.findElement(By.name(locator));
		} 
		else
			throw new NoSuchElementException("No Such Element"+locator);
	}


		@AfterSuite(alwaysRun=true)
		public void tearDown() {
			try {
				driver.close();
				driver.quit();
				if(driver != null)
					driver = null;
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
}