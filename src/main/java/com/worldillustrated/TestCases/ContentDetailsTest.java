package com.worldillustrated.TestCases;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class ContentDetailsTest extends BaseUI 
{
	ContentDetailsActions action = new ContentDetailsActions();
	
	@Test
	public void ContentDetails_TC001()
	{   
		logger = report.createTest("ContentDetails_TC001");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.verifyImage();
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC002()
	{
		logger = report.createTest("ContentDetails_TC002");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.verifyImage();
	    action.verifyText("headline_xpath", "Gucci - Milano Woman Summer 2020");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC003()
	{
		logger = report.createTest("ContentDetails_TC003");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.verifyImage();
	    action.verifyText("description_xpath", "Gucci - Models On Catwalk during MilanoFashion Week 2020 For Spring Summer Fashion Show.\r\n"
	    		+ "\r\n"
	    		+ "Woman Women, Defile, Fashion Show Runway Collection, Pret A Porter, Modelwear, Modeschau Laufsteg  Italy\r\n"
	    		+ "Model, Fashion, Style, Look, Fashion Show, Runway, Catwalk, ");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC004()
	{
		logger = report.createTest("ContentDetails_TC004");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.verifyImage();
	}
	@Test
	public void ContentDetails_TC005()
	{
		logger = report.createTest("ContentDetails_TC005");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.verifyText("datetime_xpath","05/05/2021");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC006()
	{
		logger = report.createTest("ContentDetails_TC006");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.verifyText("photographer_xpath","www.fashionpps.com");
	    quiteBrowser();
		
	}
	@Test
	public void ContentDetails_TC007()
	{
		logger = report.createTest("ContentDetails_TC007");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.writeComment("drkgkg");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC008()
	{
		logger = report.createTest("ContentDetails_TC008");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.priceIsDisplayed();
	    quiteBrowser();
	} 
	@Test
	public void ContentDetails_TC009()
	{
		logger = report.createTest("ContentDetails_TC009");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.click("shere_btn_xpath");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC010()
	{
		logger = report.createTest("ContentDetails_TC010");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.click("instagram_btn_xpath");
	    action.verifyPageTitleNewTab("Instagram");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC011()
	{
		logger = report.createTest("ContentDetails_TC011");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.click("facebook_btn_xpath");
	    action.verifyPageTitleNewTab("Facebook");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC012()
	{
		logger = report.createTest("ContentDetails_TC012");
		action.loginPromember();
	    action.selectChannel();
	    action.clickOnImage();
	    action.click("twitter_btn_xpath");
	    action.isDisplayedButtonInNewTab("login_twitter_xpath");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC013()
	{
		logger = report.createTest("ContentDetails_TC013");
		action.loginPromember();
		
	    action.selectChannel();
	    action.clickOnImage();
	    action.click("image_of_set_xpath");
	    quiteBrowser();
	}
	@Test
	public void ContentDetails_TC014()
	{
		logger = report.createTest("ContentDetails_TC014");
		action.loginPromember();
		action.selectChannel();
		action.clickOnImage();
		action.verifyText("set_name_xpath","Junior");
		quiteBrowser();
	}
	@Test
	public void ContentDetails_TC015()
	{
		logger = report.createTest("ContentDetails_TC015");
		action.loginPromember();
		action.selectChannel();
		action.clickOnImage();
		action.verifyText("headline_set_xpath","Illustration picture shows riders in a skate park in Antwerp, Tuesday 26 May 2020. Belgium is in its eleventh week of confinement in the ongoing corona virus crisis but it is also the second week of the phase 2 of the deconfinement. The National Security Council has given the Go to the deconfinement in stages as developed by the Group of Experts for the Exit Strategy. DIRK WAEM");
		quiteBrowser();
		
	}
	    @Test
		public void ContentDetails_TC016()
		{
			logger = report.createTest("ContentDetails_TC016");
			action.loginPromember();
			action.selectChannel();
			action.clickOnImage();
			action.verifyText("photographer_set_xpath","DIRK WAEM");
			quiteBrowser();
		}
	    @Test
		public void ContentDetails_TC017()
		{
			logger = report.createTest("ContentDetails_TC017");
			action.loginPromember();
		    action.selectChannel();
		    action.clickOnImage();
		    action.writeComment("Tuesday 26 May 2020");
		    quiteBrowser();
		}
		@Test
		public void ContentDetails_TC018()
		{
		    logger = report.createTest("ContentDetails_TC018");
		    invokeBrowser("Chrome");
			openApplicationURL("websiteURL");
			clickElement("x_btn_xpath");
			clickElement("junior_xpath");
			action.clickOnImage();
			verifyMessage("sign_in_xpath","Sign in");
			quiteBrowser();
		}
		
	  @AfterTest
	  public void endReport()
	  {
		report.flush();
	}

}
