 package com.worldillustrated.TestCases;

import java.util.Hashtable;

import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;
import com.worldillustrated.utils.TestDataProvider;

public class RegistrationProMemberTest extends BaseUI 
{
	    @Test
		public void Registration_TC001()
		{
	        logger = report.createTest("Registration_TC001");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			isElementPresent("userNameTextBox_xpath");
			isElementPresent("emailTextBox_xpath");
			isElementPresent("passwordTextBox_xpath");
			isElementPresent("confirmPasswordTextBox_xpath");
			isElementPresent("freelancer_radio_btn_id");
			isElementPresent("organization_radio_btn_id");
			isElementPresent("checkBox_xpath");
			isElementPresent("registerBtn_xpath");
			quiteBrowser();
			
		}
		@Test
		public void Registration_TC002()
		{
	        logger = report.createTest("Registration_TC002");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			enterText("userNameTextBox_xpath","simona10");
			enterText("emailTextBox_xpath","simona33@gmail.com");
			enterText("passwordTextBox_xpath","simonaD10!");
			enterText("confirmPasswordTextBox_xpath","simonaD10!");
			clickElement("freelancer_radio_btn_id");
			enterText("firstname_freelancer_name","Simona");
			enterText("lastname_freelancer_name","Dimitrovska");
			clickElement("checkBox_id");
			clickElement("registerBtn_xpath");
			verifyPageTitle("WIL Public");
			quiteBrowser();
		}
		
		@Test
		public void Registration_TC003()
		{
			    logger = report.createTest("Registration_TC003");
				
				invokeBrowser("Mozila");
				openApplicationURL("websiteURL");
				clickElement("becomeProMember_Button_xpath");
				enterText("userNameTextBox_xpath","useruser");
				enterText("emailTextBox_xpath","useruser1@gmail..com");
				enterText("passwordTextBox_xpath","userUser123!");
				enterText("confirmPasswordTextBox_xpath","userUser123!");
				clickElement("freelancer_radio_btn_id");
				enterText("firstname_freelancer_name","Simona");
				enterText("lastname_freelancer_name","Dimitrovska");
				clickElement("checkBox_id");
				clickElement("registerBtn_xpath");
				verifyErrorMessage("errorMessageEmail_xpath","email must be a valid email");
				quiteBrowser();
			
		}
		
		@Test
		public void Registration_TC004()
		{
			
			logger = report.createTest("Registration_TC004");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			enterText("userNameTextBox_xpath","userTest5");
			enterText("emailTextBox_xpath","userTest5@yahoo.com");
			enterText("passwordTextBox_xpath","");
			enterText("confirmPasswordTextBox_xpath","pass123#");
			clickElement("freelancer_radio_btn_id");
			enterText("firstname_freelancer_name","Simona");
			enterText("lastname_freelancer_name","Dimitrovska");
			clickElement("checkBox_id");
			clickElement("registerBtn_xpath");
			verifyErrorMessage("errorMessagePassword_xpath","Password is required.");
			quiteBrowser();	
			
		}
		@Test
		public void Registration_TC005()
		{
			    logger = report.createTest("Registration_TC005");
				
				invokeBrowser("Mozila");
				openApplicationURL("websiteURL");
				clickElement("becomeProMember_Button_xpath");
				enterText("userNameTextBox_xpath","user1008");
				enterText("emailTextBox_xpath","user8008@gmail.com");
				enterText("passwordTextBox_xpath","useruser0005@");
				enterText("confirmPasswordTextBox_xpath","useruser0005@");
				clickElement("freelancer_radio_btn_id");
				enterText("firstname_freelancer_name","Simona");
				enterText("lastname_freelancer_name","Dimitrovska");
				clickElement("checkBox_id");
				clickElement("registerBtn_xpath");
				isElementPresent("profile_btn_xpath");
				quiteBrowser();	
			
			
		}
		@Test
		public void Registration_TC006()
		{
			   logger = report.createTest("Registration_TC006");
				
				invokeBrowser("Mozila");
				openApplicationURL("websiteURL");
				clickElement("becomeProMember_Button_xpath");
				enterText("userNameTextBox_xpath","user00006");
				enterText("emailTextBox_xpath","user0006@gmail.com");
				enterText("passwordTextBox_xpath","useruser6@");
				enterText("confirmPasswordTextBox_xpath","useruser00066@");
				clickElement("freelancer_radio_btn_id");
				enterText("firstname_freelancer_name","Simona");
				enterText("lastname_freelancer_name","Dimitrovska");
				clickElement("checkBox_xpath");
				clickElement("registerBtn_xpath");
				verifyErrorMessage("errorMsgnConfirmPassword_xpath","Both passwords need to be the same");
				quiteBrowser();
			
		}
		@Test
		public void Registration_TC007()
		{
	        logger = report.createTest("Registration_TC007");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			enterText("userNameTextBox_xpath","userTest7");
			enterText("emailTextBox_xpath","userTest7@gmail.com");
			enterText("passwordTextBox_xpath","passUser123#");
			enterText("confirmPasswordTextBox_xpath","passUser123#");
			clickElement("freelancer_radio_btn_id");
			enterText("firstname_freelancer_name","Simona");
			enterText("lastname_freelancer_name","Dimitrovska");
			verifyErrorMessage("errorMsgTermsAndConditions_xpath","Must accept Terms and Conditions");
			clickElement("registerBtn_xpath");
			quiteBrowser();	
			
		}
		@Test
		public void Registration_TC008()
		{
			logger = report.createTest("Registration_TC008");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			enterText("userNameTextBox_xpath","user123456");
			enterText("emailTextBox_xpath","user05@gmail.com");
			enterText("passwordTextBox_xpath","usertest123&");
			enterText("confirmPasswordTextBox_xpath","usertest123&");
			clickElement("freelancer_radio_btn_id");
			enterText("firstname_freelancer_name","Simona");
			enterText("lastname_freelancer_name","Dimitrovska");
			clickElement("checkBox_xpath");
			clickElement("registerBtn_xpath");
			verifyErrorMessage("msgEmailAlreadyInUse_xpath","This email is already in use");
			quiteBrowser();	
			
		}
		@Test
		public void Registration_TC009()
		{
			    logger = report.createTest("Registration_TC009");
				
				invokeBrowser("Mozila");
				openApplicationURL("websiteURL");
				clickElement("becomeProMember_Button_xpath");
				clickElement("registerBtn_xpath");
				verifyMessage("errorMessageUserName_xpath","Username is required.");
				verifyMessage("errorMessageEmail_xpath","Email is required.");
				verifyMessage("errorMessagePassword_xpath","Password is required.");
				verifyMessage("errorMsgTermsAndConditions_xpath","Must accept Terms and Conditions");
				
				quiteBrowser();	
			
		}
		@Test
		public void Registration_TC010()
		{
	        logger = report.createTest("Registration_TC010");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			enterText("userNameTextBox_xpath","userTest155");
			enterText("emailTextBox_xpath","userTest155@gmail.com");
			enterText("passwordTextBox_xpath","passU!");
			enterText("confirmPasswordTextBox_xpath","passU!");
			clickElement("freelancer_radio_btn_id");
			enterText("firstname_freelancer_name","Simona");
			enterText("lastname_freelancer_name","Dimitrovska");
			clickElement("checkBox_xpath");
			clickElement("registerBtn_xpath");
			verifyErrorMessage("errorMessagePassword_xpath","Field requires at least 8 Characters, one Uppercase letter, one Number and one special case Character");
			quiteBrowser();	
			
		}
		@Test
		public void Registration_TC011()
		{
			   logger = report.createTest("Registration_TC011");
				
				invokeBrowser("Mozila");
				openApplicationURL("websiteURL");
				clickElement("becomeProMember_Button_xpath");
				enterText("userNameTextBox_xpath","usertest11");
				enterText("emailTextBox_xpath","usertest11gmail.com");
				enterText("passwordTextBox_xpath","!user11Test");
				enterText("confirmPasswordTextBox_xpath","!user11Test");
				clickElement("freelancer_radio_btn_id");
				enterText("firstname_freelancer_name","Simona");
				enterText("lastname_freelancer_name","Dimitrovska");
				clickElement("checkBox_xpath");
				clickElement("registerBtn_xpath");
				verifyErrorMessage("errorMessageEmail_xpath","email must be a valid email");
				quiteBrowser();	
			
		}
		//@Test
		public void Registration_TC012()
		{
			logger = report.createTest("Registration_TC012");
			
			invokeBrowser("Mozila");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			clickElement("FacebookBtn_xpath");
			isElementPresent("fb_textBox_email_id");
			isElementPresent("fb_textbox_password_id");
			isElementPresent("fb_btn_id");
			quiteBrowser();	

		}
		//@Test
		public void Registration_TC013()
		{
		    logger = report.createTest("Registration_TC013");
			
			invokeBrowser("Chrome");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			clickElement("GoogleBtn_xpath");
			isElementPresent("google_textBox_id");
			isElementPresent("google_btn_xpath");
			quiteBrowser();	
			
		}
		//@Test
		public void Registration_TC014()
		{
			    logger = report.createTest("Registration_TC014");
				
				invokeBrowser("Chrome");
				openApplicationURL("websiteURL");
				clickElement("becomeProMember_Button_xpath");
				clickElement("TwitterBtn_xpath");
				isElementPresent("twitter_userName_id");
				isElementPresent("twitter_password_id");
				quiteBrowser();	
			
		}
		//@Test
		public void Registration_TC015()
		{
			logger = report.createTest("Registration_TC015");
			
			invokeBrowser("Chrome");
			openApplicationURL("websiteURL");
			clickElement("becomeProMember_Button_xpath");
			clickElement("InstagramBtn_xpath");
			isElementPresent("insta_userName_xpath");
			isElementPresent("insta_password_xpath");
			quiteBrowser();	
			
		}
		@DataProvider
		public Object [][] getTestData()
		{
			return TestDataProvider.getTestData("TestDataWorldillustrated.xlsx", "Sheet1", "RegistrationTest");
		}
		
		@AfterTest
		public void endReport()
		{
			report.flush();
		}
		

}
