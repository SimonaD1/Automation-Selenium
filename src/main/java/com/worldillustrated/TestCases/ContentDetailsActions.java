package com.worldillustrated.TestCases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.worldillustrated.BaseClasses.BaseUI;

public class ContentDetailsActions extends BaseUI 
{
	public static ExtentTest logger;

	public void openApp()
	{
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("x_btn_xpath");
	}
    public void loginPromember()
    {
    	invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("x_btn_xpath");
		clickElement("sign_btn_xpath");
  		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
  		enterText("textBox_Password_xpath","simonaD10!");
  		clickElement("sign_in_btn_xpath");
  		clickElement("home_btn_xpath");
    }
    public void selectChannel()
    {
    	
		//clickElement("style_xpath");
    	clickElement("junior_xpath");
    	//clickElement("ourplanet_channel_xpath");
    	try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }

    public void clickOnImage()
    { 
  
    	try {     	
    	List <WebElement> ListOfimages =driver.findElements(By.cssSelector(".item-image > img"));
    	 for(int i=0; i< ListOfimages.size(); i++)
		  {
		  
			String text= ListOfimages.get(i).getAttribute("src");
		    
			if(text.equalsIgnoreCase("https://dxqrr4lu7co6c.cloudfront.net/5/image/Compressed/Skatepark_B1130_351392_001.jpg"))
		    {
		        
				ListOfimages.get(i).click();
		        break;
		    } 
		   } 
    	}catch(Exception e)
		{
			reportFail(e.getMessage());
			Assert.fail();
		}
    	    
    }
    public void verifyImage()
    {
    	 try {
    	 WebElement rxBtn = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div[1]/div"));
    	 Assert.assertEquals(true, rxBtn.isDisplayed());
    	 }catch(Exception e)
 		{
 			reportFail(e.getMessage());
 			Assert.fail();
 		}
    }
    public void verifyText(String xpathKey, String expectedMessage)
    {
    	      try {
			  String actual_msg = getElement(xpathKey).getText();    
			  String expect = expectedMessage;
			  Assert.assertEquals(actual_msg, expect);
			  reportPass("The actual message is equal to the expected message");
    	      } catch(Exception e)
    	      {
    	    	  reportFail(e.getMessage());
    	      }
    }
   
	public void writeComment(String text)
	{
		try {
         WebElement writetComment = driver.findElement(By.xpath("//*[@id=\"standard-basic\"]"));
	     writetComment.sendKeys(text);
	     clickElement("send_btn_xpath");
   	    }catch(Exception e)
	      {
	    	  reportFail(e.getMessage());
	      }
	}
	public void priceIsDisplayed()
	{
		try {
	         WebElement price = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div[2]/div/div[2]/div[3]/div[3]"));
		     price.isDisplayed();
	   	    }catch(Exception e)
		    {
		    	  reportFail(e.getMessage());
	         }
		
	} 
	public void click(String button_xpath)
	{
		try {
			 WebElement btn = getElement(button_xpath);
			 btn.click();
	   	    }catch(Exception e)
		    {
		    	  reportFail(e.getMessage());
	         }
	}
	public void isDisplayedButtonInNewTab(String button_xpath)
	{
		 for (String handle : driver.getWindowHandles()) 
		 { 
		        driver.switchTo().window(handle);

		        ArrayList<String> windowTab = new ArrayList<String>(driver.getWindowHandles());

		        driver.switchTo().window(windowTab.get(1));
		        
		        WebElement btn = getElement(button_xpath);
				btn.isDisplayed();
		    }
		
		
	}
	public void verifyPageTitleNewTab(String pageTitle)
	{
		 for (String handle : driver.getWindowHandles()) 
		 { 
		        driver.switchTo().window(handle);

		        ArrayList<String> windowTab = new ArrayList<String>(driver.getWindowHandles());

		        driver.switchTo().window(windowTab.get(1));
		        
		        String actualTitle = driver.getTitle();
		        System.out.println(actualTitle);
		        Assert.assertEquals(actualTitle, pageTitle);
		    }
		
	}
	
  
}
