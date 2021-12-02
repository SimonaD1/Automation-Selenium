package com.worldillustrated.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class UsersActions extends BaseUI 
{
	public static ExtentTest logger;

	public void login()
	{
		invokeBrowser("Chrome");
	   	openApplicationURL("websiteURLAdmin");
		enterText("email_admin_xpath","sdimitrovska1@astea.net");
		enterText("password_admin_xpath","Test123!");
		clickElement("sign_in_btn_admin_xpath");
		clickElement("users_button_xpath");
	}
	public void closeApp()
	{
		quiteBrowser();	
	}
	public void addNewContributerUser()
	{
		clickElement("add_button_xpath");
		enterText("username_text_field_xpath","simonadimitrovsska");
		enterText("email_text_field_xpath","simonadimitrovska1@yahoo.com");
		enterText("password_text_field_xpath","Test123!");
		enterText("agency_text_field_xpath","simAgency");
		clickElement("add_user_button_xpath");
	}
	public void verifyErrorMsg(String xpathKey, String expectedMessage)
	{
		verifyErrorMessage(xpathKey,expectedMessage);
	}
	public void verifymsg(String xpathKey, String expectedMessage)
	{
		verifyMessage(xpathKey,expectedMessage);
	}
	public void updateUser()
	{
		clickElement("edit_button_xpath");
		WebElement emailTextField = driver.findElement(By.xpath("/html/body/div[3]/div[3]/div/div/div/form/div[1]/div/input"));
	    emailTextField.clear();
		enterText("username_text_field_xpath","test99@gmail.com");
		clickElement("update_button_xpath");
	}
	public void deleteUser()
	{
		clickElement("checkbox_xpath");
		clickElement("delete_button_xpath");
	}
	public void deleteAdmin()
	{
		clickElement("checkbox_xpath");
		clickElement("delete_admin_xpath");
	}
	public void clickOnTypeUser(String xpathKey)
	{
		try {
			
		     WebElement elementToClick = getElement(xpathKey); 
		     elementToClick.click();     
			} catch(Exception e)
			{
				reportFail(e.getMessage());
			}
	}
	public void addPromemberUser()
	{
		clickElement("add_button_xpath");
		enterText("username_text_field_xpath","test12345");
		enterText("email_text_field_xpath","test@gmail.net");
		enterText("password_text_field_xpath","Test123!");
		clickElement("organization_radio_btn_xpath");
		enterText("organization_name_field_xpath","test5Org");
		clickElement("add_user_button_xpath");
	}
	public void addNewAdmin()
	{
		clickElement("add_new_admin_xpath");
		enterText("username_new_admin_xpath","testADMIN");
		enterText("email_new_admin_xpath","admintest@gmail.com");
		enterText("password_new_admin_xpath","Test123!");
		enterText("first_name_new_admin_xpath","Simona");
		enterText("last_name_new_admin_xpath","Dimitrovska");
		Select role = new Select(driver.findElement(By.xpath("//*[@id=\"age-native-simple\"]")));
		role.selectByVisibleText("Super Admin");
		clickElement("add_button_xpath");
	}
	public void searchContributer(String text)
	{
		clickElement("search_contributor_xpath");
		enterText("search_field_xpath",text);
	}
	public void searchPromember(String text)
	{
		clickElement("search_promember_xpath");
		enterText("search_promember_field_xpath",text);
	}
	public void searchAdmin(String text)
	{
		clickElement("search_admin_xpath");
		enterText("search_admin_field_xpath",text);
	}
	public void viewColumnsContributor()
	{
		clickElement("view_columns_xpath");
		clickElement("name_checkbox_xpath");
		clickElement("role_checkbox_xpath");
		clickElement("email_checkbox_xpath");
	}
	public void viewColumnsPromember()
	{
		clickElement("view_col_promember_xpath");
		clickElement("name_promember_checkbox_xpath");
		clickElement("email_promember_checkbox_xpath");
		clickElement("role_promember_checkbox_xpath");
	}
	public void viewColumnsAdmin()
	{
		clickElement("view_col_admin_xpath");
		clickElement("name_admin_checkbox_xpath");
		clickElement("role_admin_checkbox_xpath");
		clickElement("email_admin_checkbox_xpath");
	}
	public void filterColumnsByUsername()
	{
		clickElement("filter_table_button_xpath");
		clickElement("username_dropdown_xpath");
		clickElement("username_data_xpath");
	}
	public void filterColumnsByRole()
	{
		clickElement("filter_table_button_xpath");
		clickElement("role_dropdown_xpath");
		clickElement("role_data_xpath");
	}
	public void filterColumnsByName()
	{
		clickElement("filter_table_button_xpath");
		clickElement("name_dropdown_xpath");
		clickElement("name_data_xpath");
	}
	public void filterColumnsByEmail()
	{
		clickElement("filter_table_button_xpath");
		clickElement("email_dropdown_xpath");
		clickElement("email_data_xpath");
	}
	public void filterColumnsByID()
	{
		clickElement("filter_table_button_xpath");
		clickElement("id_dropdown_xpath");
		clickElement("id_data_xpath");
	}
	public void filterColumnsByAuth()
	{
		clickElement("filter_table_button_xpath");
		clickElement("auth_dropdown_xpath");
		clickElement("auth_data_xpath");
	}
}
