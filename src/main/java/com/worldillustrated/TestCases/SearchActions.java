package com.worldillustrated.TestCases;

import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class SearchActions extends BaseUI 
{
	public static ExtentTest logger;
	
	public void openApp()
	{
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("cookies_btn_xpath");
		clickElement("signIn_xpath");
  		enterText("textBox_Email_xpath","testkr@mail.com");
  		enterText("textBox_Password_xpath","testkr123!");
  		clickElement("sign_in_btn_xpath");
	}
	
	public void closeApp()
	{
		quiteBrowser();
	}

}
