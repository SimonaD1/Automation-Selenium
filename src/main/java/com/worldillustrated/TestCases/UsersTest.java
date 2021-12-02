package com.worldillustrated.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class UsersTest extends BaseUI 
{
	UsersActions action = new UsersActions();
	
	@Test
	public void Users_TC001()
	{
		logger = report.createTest("Users_TC001");
		action.login();
		action.addNewContributerUser();
		quiteBrowser();
	}
	@Test
	public void Users_TC002()
	{
		logger = report.createTest("Users_TC002");
		action.login();
		action.addNewContributerUser();
		action.verifyErrorMsg("msg_xpath", "Argument Validation Error");
		quiteBrowser();
	}
	@Test
	public void Users_TC003()
	{
		logger = report.createTest("Users_TC003");
		action.login();
		action.updateUser();
		quiteBrowser();
	}
	@Test
	public void Users_TC004()
	{
		logger = report.createTest("Users_TC004");
		action.login();
		action.deleteUser();
		quiteBrowser();
	}
	@Test
	public void Users_TC005()
	{
		logger = report.createTest("Users_TC005");
		action.login();
		action.clickOnTypeUser("promembers_button_xpath");
		action.addPromemberUser();
		quiteBrowser();
	}
	@Test 
	public void Users_TC006()
	{
		logger = report.createTest("Users_TC006");
		action.login();
		action.clickOnTypeUser("promembers_button_xpath");
		action.updateUser();
		quiteBrowser();

	}
	@Test
	public void Users_TC007()
	{
		logger = report.createTest("Users_TC007");
		action.login();
		action.clickOnTypeUser("promembers_button_xpath");
		action.deleteUser();
		quiteBrowser();
	}
	@Test
	public void Users_TC008()
	{
		logger = report.createTest("Users_TC008");
		action.login();
		action.clickOnTypeUser("admins_button_xpath");
		action.addNewAdmin();
		quiteBrowser();
	}
	@Test
	public void Users_TC009()
	{
		logger = report.createTest("Users_TC008");
		action.login();
		action.clickOnTypeUser("admins_button_xpath");
		action.addNewAdmin();
		action.verifyErrorMsg("msg_admin_xpath", "Argument Validation Error");
        action.closeApp();
	}
	@Test 
	public void Users_TC010()
	{
		logger = report.createTest("Users_TC010");
	    action.login();
	    action.clickOnTypeUser("admins_button_xpath");
		action.updateUser();
		quiteBrowser();
	}
	@Test
	public void Users_TC011()
	{
		logger = report.createTest("Users_TC011");
	    action.login();
	    action.clickOnTypeUser("admins_button_xpath");
		action.deleteAdmin();
		quiteBrowser();
	}
	@Test
	public void Users_TC012() 
	{
		logger = report.createTest("Users_TC012");
	    action.login();
	    action.searchContributer("simona");
	    quiteBrowser();
	}
	@Test
	public void Users_TC013()
	{
		logger = report.createTest("Users_TC013");
		action.login();
		action.clickOnTypeUser("promembers_button_xpath");
		action.searchPromember("simona");
	    quiteBrowser();
	}
	@Test
	public void Users_TC014()
	{
		logger = report.createTest("Users_TC014");
		action.login();
	    action.clickOnTypeUser("admins_button_xpath");
		action.searchAdmin("testADMIN");
	    quiteBrowser();
	}
	@Test
	public void Users_TC015()
	{
		logger = report.createTest("Users_TC015");
		action.login();
		action.viewColumnsContributor();
		quiteBrowser();
	}
	@Test
	public void Users_TC016()
	{
		logger = report.createTest("Users_TC016");
		action.login();
		action.clickOnTypeUser("promembers_button_xpath");
		action.viewColumnsPromember();
		quiteBrowser();
	}
	@Test
	public void Users_TC017()
	{
		logger = report.createTest("Users_TC017");
		action.login();
		action.clickOnTypeUser("admins_button_xpath");
		action.viewColumnsAdmin();
		quiteBrowser();
	}
	@Test
	public void Users_TC018()
	{
		logger = report.createTest("Users_TC018");
		action.login();
		action.filterColumnsByRole();
		quiteBrowser();
	}
	@Test
	public void Users_TC019()
	{
		logger = report.createTest("Users_TC019");
		action.login();
		action.filterColumnsByName();
		quiteBrowser();
	}
	@Test
	public void Users_TC020()
	{
		logger = report.createTest("Users_TC020");
		action.login();
		action.filterColumnsByUsername();
		quiteBrowser();
	}
	@Test
	public void Users_TC021()
	{
		logger = report.createTest("Users_TC021");
		action.login();
		action.filterColumnsByEmail();
		quiteBrowser();
	}
	@Test
	public void Users_TC022()
	{
		logger = report.createTest("Users_TC022");
		action.login();
		action.filterColumnsByID();
		quiteBrowser();
	}
	@Test
	public void Users_TC023()
	{
		logger = report.createTest("Users_TC023");
		action.login();
		action.filterColumnsByAuth();
		quiteBrowser();
	}
	
	
	
	

}
