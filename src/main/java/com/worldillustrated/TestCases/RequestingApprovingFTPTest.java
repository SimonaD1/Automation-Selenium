package com.worldillustrated.TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;
import com.worldillustrated.utils.TestDataProvider;

public class RequestingApprovingFTPTest extends BaseUI 
{  
    
	@Test
	public void RequestingApprovingFTP_TC001()
	{
		 logger = report.createTest("RequestingApprovingFTP_TC001");
			
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("register_btn_xpath");
		 clickElement("become_contributor_xpath");
		 enterText("userNameTextBox_xpath","simona123");
		 enterText("emailTextBox_xpath","simd_10@yahoo.com");
		 enterText("passwordTextBox_xpath","testUser!123");
		 enterText("confirmPasswordTextBox_xpath","testUser!123");
		 enterText("agencyName_xpath","studio23");
		 clickElement("checkBox_createSFTP_xpath");
		 clickElement("termAndConditions_xpath");
		 clickElement("registeration_btn_xpath");
		 verifyMessage("message_email_xpath","This email is already in use");
		 quiteBrowser();
	}
	 @Test
	 public void RequestingApprovingFTP_TC002()
	 {
		 logger = report.createTest("RequestingApprovingFTP_TC002");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("register_btn_xpath");
		 clickElement("become_contributor_xpath");
		 enterText("userNameTextBox_xpath","user12338");
		 enterText("emailTextBox_xpath","testuser5@email.com");
		 enterText("passwordTextBox_xpath","testUser!12338");
		 enterText("confirmPasswordTextBox_xpath","testUser!12338");
		 enterText("agencyName_xpath","studio12338");
		 clickElement("checkBox_createSFTP_xpath");	
		 clickElement("termAndConditions_xpath");
		 clickElement("registeration_btn_xpath");
		 clickElement("profile_btn_xpath");
		 clickElement("uploadedBtn_xpath");
		 clickElement("addmoreBtn_xpath");
		 clickElement("uploadVia_FTP_xpath");
		 clickElement("generateSFTP_user_xpath");
		 quiteBrowser();
	}
	 @Test
	 public void RequestingApprovingFTP_TC003()
	 {
		 logger = report.createTest("RequestingApprovingFTP_TC003");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("sign_in_xpath");
		 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		 enterText("textBox_Password_xpath","simonaD10!");
		 clickElement("sign_in_btn_xpath");
		 clickElement("profile_btn_xpath");
		 clickElement("uploadedBtn_xpath");
		 clickElement("addmoreBtn_xpath");
		 clickElement("uploadVia_FTP_xpath");
		 clickElement("next_step_btn_xpath");
		 clickElement("still_uploading_btn_xpath");
		 quiteBrowser();
	 }
	  @Test
	  public void RequestingApprovingFTP_TC004()
      {
		 logger = report.createTest("RequestingApprovingFTP_TC004");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURLAdmin");
		 enterText("email_admin_xpath","sdimitrovska@astea.net");
		 enterText("password_admin_xpath","Test123!");
		 clickElement("sign_in_btn_admin_xpath");
		 clickElement("users_btn_xpath");
         clickElement("sftp_requests_btn_xpath");
		 clickElement("generate_sftp_user_btn_xpath");
		 try {
			Thread.sleep(6000);
		 } catch (InterruptedException e) 
		 {
			// TODO Auto-generated catch block
			e.printStackTrace();
		 }	
		 verifyMessage("message_generated_sftp_user_xpath","Successfully generated SFTP user");
		 quiteBrowser();
	    }
	@Test
    public void RequestingApprovingFTP_TC005()
    {
		 logger = report.createTest("RequestingApprovingFTP_TC005");
			
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURLAdmin");
		 enterText("email_admin_xpath","sdimitrovska@astea.net");
		 enterText("password_admin_xpath","Test123!");
		 clickElement("sign_in_btn_admin_xpath");
		 clickElement("users_btn_xpath");
		 clickElement("sftp_requests_btn_xpath");
		 isElementPresent("generate_sftp_user_btn_xpath");
		 quiteBrowser();
    }
    @Test
    public void RequestingApprovingFTP_TC006()
    {
		 logger = report.createTest("RequestingApprovingFTP_TC006");
			
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURLAdmin");
		 enterText("email_admin_xpath","sdimitrovska@astea.net");
		 enterText("password_admin_xpath","Test123!");
		 clickElement("sign_in_btn_admin_xpath");
		 clickElement("users_btn_xpath");
		 clickElement("sftp_requests_btn_xpath");
		 clickElement("generate_sftp_user_btn_xpath");
		 quiteBrowser();
    }
	 @Test
	 public void RequestingApprovingFTP_TC007()
	 {
		 logger = report.createTest("RequestingApprovingFTP_TC007");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("sign_in_xpath");
		 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		 enterText("textBox_Password_xpath","simonaD10!");
		 clickElement("sign_in_btn_xpath");
		 clickElement("profile_btn_xpath");
		 clickElement("uploadedBtn_xpath");
		 clickElement("addmoreBtn_xpath");
		 clickElement("uploadVia_FTP_xpath");
		 WebElement TxtBoxContent = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/p[2]"));
		 System.out.println("Printing " + TxtBoxContent.getText());
		 verifyMessage("FTPaccount_xpath","FTP account for this user: dimitrovskas_sftp");
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
