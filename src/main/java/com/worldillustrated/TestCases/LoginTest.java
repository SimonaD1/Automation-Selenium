package com.worldillustrated.TestCases;

import java.util.Hashtable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.worldillustrated.BaseClasses.BaseUI;
import com.worldillustrated.utils.ExtentReportManager;
import com.worldillustrated.utils.TestDataProvider;

public class LoginTest extends BaseUI 
{
	//@Test
	public void Login_TC001()
	{
		logger = report.createTest("Login_TC001");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		isElementPresent("title_Login_form_xpath");
		isElementPresent("textBox_Email_xpath");
		isElementPresent("buttion_Sign_In_Form_xpath");
		isElementPresent("link_forgot_password_xpath");
		isElementPresent("link_register_xpath");
		quiteBrowser();
	}
	//@Test
	public void Login_TC002()
	{
		logger = report.createTest("Login_TC002");
		
		invokeBrowser("Mozila");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		quiteBrowser();
	}
	//@Test
	public void Login_TC003()
	{
		logger = report.createTest("Login_TC003");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		isElementPresent("profile_btn_xpath");
		quiteBrowser();
	}
	//@Test
	public void Login_TC007()
	{

		logger = report.createTest("Login_TC007");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","");
		enterText("textBox_Password_xpath","");
		clickElement("buttion_Sign_In_Form_xpath");
		verifyErrorMessage("message_email_is_required_xpath","Email is required.");
		verifyErrorMessage("message_password_is_required_xpath","Password is required.");
		quiteBrowser();
	}
	//@Test
	public void Login_TC008()
	{
        logger = report.createTest("Login_TC008");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","test19@gmail.com");
		enterText("textBox_Password_xpath","test199!");
		clickElement("buttion_Sign_In_Form_xpath");
		verifyErrorMessage("message_no_such_user_xpath","No such user");
		quiteBrowser();
	}
	//@Test
	public void Login_TC009()
	{
        
		logger = report.createTest("Login_TC009");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("link_forgot_password_xpath");
		verifyMessage("message_recovery_email_xpath","We will send you a recovery email");
		quiteBrowser();
	}
	//@Test
	public void Login_TC010()
	{
        
		logger = report.createTest("Login_TC010");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("link_register_xpath");
		verifyMessage("message_register_as_xpath","Register as a:");
		isElementPresent("proMember_xpath");
		isElementPresent("contributor_xpath");
		quiteBrowser();
		
	}
	//@Test
	public void Login_TC011()
	{

		logger = report.createTest("Login_TC011");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("link_forgot_password_xpath");
		isElementPresent("email_textBox_forgot_password_xpath");
		quiteBrowser();
	}
	//@Test
	public void Login_TC012()
	{
        
		logger = report.createTest("Login_TC012");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("link_forgot_password_xpath");
		enterText("email_textBox_forgot_password_xpath","sdimitrovska@astea.net");
		clickElement("send_button_xpath");
		quiteBrowser();
		
	}
	//@Test
	public void Login_TC013()
	{

		logger = report.createTest("Login_TC013");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","test19@gmail.com");
		clickElement("buttion_Sign_In_Form_xpath");
		verifyErrorMessage("message_password_is_required_xpath","Password is required.");
		quiteBrowser();

	}
	//@Test
	public void Login_TC014()
	{

		logger = report.createTest("Login_TC014");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Password_xpath","test199!");
		clickElement("buttion_Sign_In_Form_xpath");
		verifyErrorMessage("message_email_is_required_xpath","Email is required.");
		quiteBrowser();

	}
	//@Test
	public void Login_TC015()
	{
        
		logger = report.createTest("Login_TC015");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("facebook_button_xpath");
		isElementPresent("fb_textBox_email_id");
		isElementPresent("fb_textbox_password_id");
		quiteBrowser();
		
	}
	//@Test
	public void Login_TC016()
	{
        
		logger = report.createTest("Login_TC016");
		
		invokeBrowser("Mozila");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("google_button_xpath");
		isElementPresent("google_textBox_id");
		isElementPresent("google_btn_xpath");
		quiteBrowser();
		
	}
	//@Test
	public void Login_TC017()
	{
        
		logger = report.createTest("Login_TC017");
		
		invokeBrowser("Mozila");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("twitter_button_xpath");
		isElementPresent("twitter_userName_id");
		isElementPresent("twitter_password_id");
		quiteBrowser();
		
	}
	//@Test
	public void Login_TC018()
	{
        
		logger = report.createTest("Login_TC018");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		clickElement("instagram_button_xpath");
		isElementPresent("insta_userName_xpath");
		isElementPresent("insta_password_xpath");
		quiteBrowser();
		
	}
	@DataProvider
	public Object [][] getTestData()
	{
		return TestDataProvider.getTestData("Login_TestData_Worldillustrated.xlsx", "Sheet1", "LoginTest");
	}
	
	@AfterTest
	public void endReport()
	{
		report.flush();
	}

}
