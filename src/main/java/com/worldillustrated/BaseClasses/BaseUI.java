package com.worldillustrated.BaseClasses;

import java.io.File;


import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.worldillustrated.utils.DateUtils;
import com.worldillustrated.utils.ExtentReportManager;



public class BaseUI
{
	public static WebDriver driver;
    public Properties prop;
    public ExtentReports report = ExtentReportManager.getReportInstance();
    public static ExtentTest logger;
    
    SoftAssert softAssert = new SoftAssert();
    
   
	/************ Invoke Browser ***************/
	public void invokeBrowser(String browserName)
	{
		try 
		{
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if(browserName.equalsIgnoreCase("Mozila"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} 
		}catch(Exception e)
		{
			reportFail(e.getMessage());
			e.printStackTrace();
		}
		
		driver.manage().timeouts().implicitlyWait(180, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(180, TimeUnit.SECONDS);
		
		if(prop == null)
		{
			prop = new Properties();
			try {
				FileInputStream file = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\ObjectRepository\\projectConfig.properties");
				prop.load(file);
			} catch (Exception e) 
			{
				reportFail(e.getMessage());
				e.printStackTrace();
			}
			
		}
	
		}
		/************ Open the Website URL *****************/
		public void openApplicationURL(String websiteURLKey)
		{
			try {
			driver.get(prop.getProperty(websiteURLKey));
			reportPass(websiteURLKey + ": Identify successfully");
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
		}
		/*************** To close the Browser instance ********/
		public void tearDown()
		{
			driver.close();
		}
		/********** To Quit browser instance ******************/
		public void quiteBrowser()
		{
			driver.quit();
		}
		
		public static void waitForElement(By expectedElement, int timeout) 
		{
		    try {
		    	
		        WebDriverWait wait = new WebDriverWait(driver, timeout);
		        wait.until(ExpectedConditions.visibilityOfElementLocated(expectedElement));

		    } catch (Exception e) {
		        e.printStackTrace();
		    }
		}
		/********************* Verify error message ******************/
		public void verifyErrorMessage(String xpathKey, String expectedMessage)
		{
			try {
			 
			  String actual_msg = getElement(xpathKey).getText();    
			  String expect = expectedMessage;
			  logger.log(Status.INFO, "Actual message is: " + actual_msg);
		      logger.log(Status.INFO, "Expected message is: " + expect);
			  Assert.assertEquals(actual_msg, expect);
			  reportPass("The actual message is equal to the expected message");
			} catch(Exception e)
			{
			   reportFail(e.getMessage());
		
			}
		}
		/****************** Verify message *************************/
		public void verifyMessage(String xpathKey, String expectedMessage)
		{
			try {
			 
			  String actual_msg= getElement(xpathKey).getText();    
			  String expect = expectedMessage;
			  logger.log(Status.INFO, "Actual message is: " + actual_msg);
		      logger.log(Status.INFO, "Expected message is: " + expect);
			  Assert.assertEquals(actual_msg, expect);
			  reportPass("The actual message is equal to the expected message");
			} catch(Exception e)
			{
			   reportFail(e.getMessage());
		
			}
		}
		/**************** Clear Text Box ********************/
		public void clearTextBox(String xpathKey)
		{
			getElement(xpathKey).clear();
			
		}
		/********** Enter text in text fields ***************/
		public void enterText(String xpathKey, String data)
		{
			try {
			 /*Actions act = new Actions(driver);
             act.sendKeys(Keys.TAB).build().perform();
		     act.sendKeys(Keys.RETURN).build().perform();
		     isElementEnabled(xpathKey); */
		     getElement(xpathKey).sendKeys(data);
		     reportPass(data + " Entered data in locator element: " + xpathKey);
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
		}
		/********* To click the element **************/
		public void clickElement(String xpathKey)
		{
			try {
			
		     WebElement elementToClick = getElement(xpathKey); 
		     elementToClick.click();
		     reportPass(xpathKey + " Element clicked successfully");
		     
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
		}
		
		/************* To identify the Page WebElement ***************/
		public WebElement getElement(String locatorKey)
		{
			 WebElement element = null;
			
			try {
				
			if(locatorKey.endsWith("_id"))
			{
				element = driver.findElement(By.id(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);
				
			} else if(locatorKey.endsWith("_xpath"))
			{
				element = driver.findElement(By.xpath(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);
				
			} else if(locatorKey.endsWith("_css"))
			{
				element = driver.findElement(By.cssSelector(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);

			} else if(locatorKey.endsWith("_ClassName"))
			{
				element = driver.findElement(By.className(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);
			}
			  else if(locatorKey.endsWith("_LinkText"))
			{
				element = driver.findElement(By.linkText(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);
				
			} else if(locatorKey.endsWith("_PartialLinkText"))
			{
				element = driver.findElement(By.partialLinkText(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);

			} else if(locatorKey.endsWith("_name"))
			{
				element = driver.findElement(By.name(prop.getProperty(locatorKey)));
				logger.log(Status.INFO, "Locator identified: " + locatorKey);
			} else
			{
				reportFail("Failing the test case: Invalid Locator" + locatorKey);
				Assert.fail("Failing the test case: Invalid Locator" + locatorKey);
			}
			} catch (Exception e)
			{
				reportFail(e.getMessage());
				e.printStackTrace();
				
				Assert.fail("Failing the Test Case: " + e.getMessage());
			}
				
			return element;
		}
		/****************** Verify element ****************************/
		public boolean isElementPresent(String locatorKey)
		{
			try {
				if(getElement(locatorKey).isDisplayed())
				{
				reportPass(locatorKey + ": Element is displayed");
				return true;
				} 
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
			return false;
		}
		public boolean isElementSelected(String locatorKey)
		{
			try {
				
				if(getElement(locatorKey).isSelected())
				{
				reportPass(locatorKey + ": Element is selected");
				return true;
				} 
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
			return false;
		}
		public boolean isElementEnabled(String locatorKey)
		{
			try {
				
				if(getElement(locatorKey).isEnabled())
				{
				reportPass(locatorKey + ": Element is enabled");
				return true;
				} 
				
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
			return false;
		}
		public void verifyPageTitle(String pageTitle)
		{
		    try {
		    	
		    	String actualTitle = driver.getTitle();
		    	logger.log(Status.INFO, "Actual title is: " + actualTitle);
		    	logger.log(Status.INFO, "Expected title is: " + pageTitle);
		    	Assert.assertEquals(actualTitle, pageTitle);
		    	
		    }catch(Exception e)
		    {
				reportFail(e.getMessage());
		    }
		}
		
		
		/**************** Assertion functions *******************/
		public void assertTrue(boolean flag)
		{
				softAssert.assertTrue(flag);
		}
		
		public void assertFalse(boolean flag)
		{
				softAssert.assertFalse(flag);
		}
		
		public void assertequals(String actual, String expected)
		{
			softAssert.assertEquals(actual, expected);
		}
	   /***************** Reporting functions *****************************/
		public void reportFail(String reportString)
		{
			logger.log(Status.FAIL,reportString);
			takeScreenShotOnFailure();
			//Assert.fail(reportString);
		}
		
		public void reportPass(String reportString)
		{
			logger.log(Status.PASS, reportString);
		}
		
		@AfterMethod
		public void afterTest()
		{
			softAssert.assertAll();
		}
		/*******************Capture Screen Shot****************************/
		public void takeScreenShotOnFailure()
		{
			TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
			File sourceFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File(System.getProperty("user.dir") + "\\ScreenShots\\" + DateUtils.getTimeStamp() + ".png");
			try {
				FileUtils.copyFile(sourceFile, destFile);
				logger.addScreenCaptureFromPath(System.getProperty("user.dir") + "\\ScreenShots\\" + DateUtils.getTimeStamp() + ".png");
			} catch (IOException e) {
				reportFail(e.getMessage());
				e.printStackTrace();
			}
			
		} 
		
	
	
	
	}




