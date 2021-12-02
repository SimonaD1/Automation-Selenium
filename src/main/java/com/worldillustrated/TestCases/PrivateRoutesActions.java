package com.worldillustrated.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class PrivateRoutesActions extends BaseUI 
{
    public static ExtentTest logger;

    public void loginPromember()
    {
    	invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","dimitrovskasimona1@gmail.com");
  		enterText("textBox_Password_xpath","simonaD10!");
  		clickElement("sign_in_btn_xpath");
		try {
			Thread.sleep(70000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void loginContributor()
    {
    	invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
  		enterText("textBox_Password_xpath","simonaD10!");
  		clickElement("sign_in_btn_xpath");
		try {
			Thread.sleep(70000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    public void verify401Error()
    {
    	 JavascriptExecutor js = (JavascriptExecutor) driver;  
         WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/img[3]"));
         Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
         if (!ImagePresent)
         {
              System.out.println("Error 401 not displayed.");
         }
         else
         {
             System.out.println("Error 401 displayed.");
         }
   		WebElement element= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]"));
 		Assert.assertEquals(element.getText(),"Ooops...");
   		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/span"));
 		Assert.assertEquals(element1.getText(),"You have to log in to enter this page!");
    }
    public void verify403Error()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;  
        WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/img[3]"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
         if (!ImagePresent)
         {
              System.out.println("Error 403 not displayed.");
         }
         else
         {
             System.out.println("Error 403 displayed.");
         }
  		WebElement element= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]"));
		Assert.assertEquals(element.getText(),"Ooops...");
  		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/span"));
		Assert.assertEquals(element1.getText(),"You don't have permission to see this page!");
    }
    public void verify404Error()
    {
    	JavascriptExecutor js = (JavascriptExecutor) driver;  
        WebElement ImageFile = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/img[3]"));
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
         if (!ImagePresent)
         {
              System.out.println("Error 404 not displayed.");
         }
         else
         {
             System.out.println("Error 404 displayed.");
         }
  		WebElement element= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]"));
		Assert.assertEquals(element.getText(),"Ooops...");
  		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/span"));
		Assert.assertEquals(element1.getText(),"This is not the page you are looking for!");
    	
    }
    public void openNewTab(String url)
    {
    	try 
    	{
    	  ((JavascriptExecutor)driver).executeScript("window.open()");
	      ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	      driver.switchTo().window(tabs.get(1));
	       driver.get(url);
        } catch(Exception e) {
		reportFail(e.getMessage());
	    }
    }

	
	

}
