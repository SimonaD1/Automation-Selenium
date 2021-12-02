package com.worldillustrated.TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class PrivateRoutesTest extends BaseUI 
{
	PrivateRoutesActions action = new PrivateRoutesActions();
	@Test
	public void PrivateRoutes_TC002()
	{
		logger = report.createTest("PrivateRoutes_TC002");
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		action.openNewTab("https://dev1public.worldillustrated.com/contributors");
		action.verify401Error();
		action.openNewTab("https://dev1public.worldillustrated.com/content-upload");
		action.verify401Error();
		quiteBrowser();
			
	}
	@Test
	public void PrivateRoutes_TC003()
	{
		logger = report.createTest("PrivateRoutes_TC003");
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		action.openNewTab("https://dev1public.worldillustrated.com/contributors");
		action.verify401Error();
		quiteBrowser();
			
	}
	@Test
	public void PrivateRoutes_TC004()
	{
		logger = report.createTest("PrivateRoutes_TC003");
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		action.openNewTab("https://dev1public.worldillustrated.com/content-upload");
		action.verify401Error();
		quiteBrowser();
		
	}
	@Test
	public void PrivateRoutes_TC005()
	{
		logger = report.createTest("PrivateRoutes_TC005");
		action.loginPromember();
		action.openNewTab("https://dev1public.worldillustrated.com/contributors");
		action.verify403Error();
		quiteBrowser();
	}
	@Test
	public void PrivateRoutes_TC006()
	{
		logger = report.createTest("PrivateRoutes_TC006");
		action.loginPromember();
		action.openNewTab("https://dev1public.worldillustrated.com/content-upload");
		action.verify403Error();
		quiteBrowser();
	}
	@Test
	public void PrivateRoutes_TC007()
	{
		logger = report.createTest("PrivateRoutes_TC007");
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		action.openNewTab("https://dev1public.worldillustrated.com/content-upload4567");
		action.verify404Error();
		quiteBrowser();
	}
	@Test
	public void PrivateRoutes_TC008()
	{
		logger = report.createTest("PrivateRoutes_TC008");
		action.loginPromember();
		action.openNewTab("https://dev1public.worldillustrated.com/content-upload4567");
		action.verify404Error();
		quiteBrowser();
	}
	@Test
	public void PrivateRoutes_TC009()
	{
		logger = report.createTest("PrivateRoutes_TC009");
		action.loginContributor();
		action.openNewTab("https://dev1public.worldillustrated.com/content-upload4567");
		action.verify404Error();
		quiteBrowser();
	}
	@AfterTest
	public void endReport()
	{
		report.flush();
	}

}
