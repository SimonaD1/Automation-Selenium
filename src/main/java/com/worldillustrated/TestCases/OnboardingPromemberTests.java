package com.worldillustrated.TestCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class OnboardingPromemberTests extends BaseUI 
{
	OnboardingPromemberActions action = new OnboardingPromemberActions();
	
	@Test
	public void OnboardingPromember_TC001()
	{   
		logger = report.createTest("OnboardingPromember_TC001");
		action.openApp();
        action.verifyElementPresent();
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC002()
	{
		logger = report.createTest("OnboardingPromember_TC002");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("Simona","Dimitrovska","simdim7@mail.com","0985446677");
		action.savePersonResponsibleForAccount();
		action.fillDataInMailingAddress("0956","testaddressline","testaddresline2");
		action.saveMailingAddress();
		action.fillDataInBillingAddress("9834","testaddressline1","adressline2test");
		action.useМailingАddressАsBillingAddress();
		action.saveBillingAddress();
		action.fillDataForEditorResearcher("Simona","Dimitrovska","09788565445","simdim@mail.com");
		action.saveEditorResearcher();
		action.goToStep2();
		action.verifyErrorMessage("msg_general_inf_xpath", "Invalid user data in 'General information'.");
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC003()
	{
		logger = report.createTest("OnboardingPromember_TC003");
		action.openApp();
		action.fillDataInGeneralInformation("AU3455657","", "testacc@mail.com");
		action.saveGeneralInfomation();
		action.verifyErrorMessage("msg_newsletter_required_xpath", "Newsletter email is required");
		action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC004()
	{
	    logger = report.createTest("OnboardingPromember_TC004");
		action.openApp();
		action.fillDataInGeneralInformation("","testnewsletter", "testacc@mail.com");
		action.saveGeneralInfomation();
		action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC005()
	{
	   logger = report.createTest("OnboardingPromember_TC005");
	   action.openApp();
	   Assert.assertEquals(action.checkEmptyField("//input[@id='organizationName']"),"Org77");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC006()
	{
	   logger = report.createTest("OnboardingPromember_TC006");
	   action.openApp();
	   action.fillDataInGeneralInformation("AU3455657","testnewsletter", "testacc@mail.com");
	   action.clearWebField("//input[@id='newsletterEmail']");
	   action.enterText("email_newsletters_xpath", "newslettertest");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC007()
	{
	   logger = report.createTest("OnboardingPromember_TC007");
	   action.openApp();
	   action.fillDataForPersonResponsibleForAccount("Simona","","simdim7@mail.com","0985446677");
	   action.savePersonResponsibleForAccount();
	   action.verifyErrorMessage("msg_last_name_required_xpath", "Last name is required");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC008()
	{
	   logger = report.createTest("OnboardingPromember_TC008");
	   action.openApp();
	   action.fillDataInGeneralInformation("AU8374654","testnewsletter", "testacc@mail.com");
	   action.saveGeneralInfomation();
	   action.fillDataInMailingAddress("0987","testaddressline","testaddressline2");
	   action.saveMailingAddress();
	   action.fillDataInBillingAddress("3456","addressline1test","adressline2test");
	   action.saveBillingAddress();
	   action.fillDataForEditorResearcher("Simona","Dimitrovska","0986754645","dimitrovska3@mail.com");
	   action.saveEditorResearcher();
	   action.goToStep2();	
	   action.verifyErrorMessage("msg_person_responsible_for_this_account_xpath", "Invalid user data in 'Person responsible for this account'.");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC009()
	{
	   logger = report.createTest("OnboardingPromember_TC009");
	   action.openApp();
	   action.fillDataForPersonResponsibleForAccount("../fsgrrg", "Dimitrovska", "disim@mail.com", "0976435778");
	   action.savePersonResponsibleForAccount();
	   action.closeApp(); 	
	}
	@Test
	public void OnboardingPromember_TC010()
	{
	   logger = report.createTest("OnboardingPromember_TC010");
	   action.openApp();
	   action.fillDataForPersonResponsibleForAccount("Simona", "...///Dimitrovska", "disim@mail.com", "0976435778");
	   action.savePersonResponsibleForAccount();
	   action.closeApp(); 		
	}
	@Test
	public void OnboardingPromember_TC011()
	{
	   logger = report.createTest("OnboardingPromember_TC011");
	   action.openApp();
	   action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "disim@mail.com", "09876543234343243543453");
	   action.savePersonResponsibleForAccount();
	   action.verifyErrorMessage("msg_a_phone_number_should_be_between_5_and_13_characters_xpath", "A phone number should be between 5 and 13 characters");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC012()
	{
	   logger = report.createTest("OnboardingPromember_TC012");
	   action.openApp();
	   action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "disim@mail.com", "");
	   action.savePersonResponsibleForAccount();
	   action.verifyErrorMessage("msg_phone_number_is_required_xpath", "Phone number is required");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC013()
	{
	   logger = report.createTest("OnboardingPromember_TC013");
	   action.openApp();
	   action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "disim@mail.com", "090676ghff58877");
	   action.savePersonResponsibleForAccount();
	   action.verifyErrorMessage("msg_phone_number_is_not_valid_xpath", "Phone number is not valid");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC014()
	{
	   logger = report.createTest("OnboardingPromember_TC014");
	   action.openApp();
	   action.fillDataInMailingAddress("","","");
	   action.saveMailingAddress();
	   action.verifyErrorMessage("msg_zip_code_is_required_xpath", "Zip code is required");
	   action.verifyErrorMessage("msg_address_is_required_xpath", "Address is required");
	   action.closeApp(); 
	}
	@Test
	public void OnboardingPromember_TC015()
	{
	   logger = report.createTest("OnboardingPromember_TC015");
	   action.openApp();
	   action.fillDataInMailingAddress("0978", "addresslinetest", "");
	   action.saveMailingAddress();
	   action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC016()
	{
     	logger = report.createTest("OnboardingPromember_TC016");
	    action.openApp();
	    action.fillDataInMailingAddress("0987", "testaddressline1", "testaddressline2");
	    action.saveMailingAddress();
	    action.openFormBillingAddress();
	    action.useМailingАddressАsBillingAddress();
	    action.saveBillingAddress();
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC017()
	{
     	logger = report.createTest("OnboardingPromember_TC017");
	    action.openApp();
	    action.fillDataInBillingAddress("", "", "");
	    action.saveBillingAddress();
	    action.verifyErrorMessage("msg_billing_zipcode_is_required_xpath","Zip code is required");
	    action.verifyErrorMessage("msg_billing_addressline_is_required_xpath","Address is required");
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC018()
	{
	    logger = report.createTest("OnboardingPromember_TC018");
	    action.openApp();
	    action.fillDataInBillingAddress("//@#$@", "testaddressline1", "testaddressline2");
	    action.saveBillingAddress();
		action.verifyErrorMessage("msg_billing_your_zip_code_is_not_valid_xpath","Your zip code is not valid");
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC019()
	{
		logger = report.createTest("OnboardingPromember_TC019");
	    action.openApp();
	    action.openFormAboutYou();
	    action.addProfilePicture();
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC020()
	{
	    logger = report.createTest("OnboardingPromember_TC020");
	    action.openApp();
	    action.openFormAboutYou();
	    action.addBiography("test biography");
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC021()
	{
	    logger = report.createTest("OnboardingPromember_TC021");
	    action.openApp();
	    action.fillDataForEditorResearcher("Simona", "Dimitrovska", "0978767465", "test@mail.com");
	    action.addAnotherEditorResearcher();
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC022()
	{
	    logger = report.createTest("OnboardingPromember_TC022");
	    action.openApp();
	    action.fillDataForEditorResearcher("Simona", "Dimitrovska", "0924858475", "ssdim@mail.com");
	    action.addAnotherEditorResearcher();
	    action.deleteEditor();
	    action.closeApp();
	}
	@Test
	public void OnboardingPromember_TC023()
	{
	    logger = report.createTest("OnboardingPromember_TC023");
	    action.openApp();
	    action.fillDataInGeneralInformation("AU87654345", "Test", "Test");
	    action.saveGeneralInfomation();
	    action.openFormPersonResponsibleForAccount();
	    action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "test@mail.com", "09876545673");
	    action.savePersonResponsibleForAccount();
	    action.openFormMailingAddress();
	    action.fillDataInMailingAddress("34534", "Test", "Test");
	    action.saveMailingAddress();
	    action.openFormBillingAddress();
	    action.fillDataInBillingAddress("6765", "Test", "Test");
	    action.saveBillingAddress();
	    action.openFormEditors();
	    action.fillDataForEditorResearcher("Simona", "Dimitrovska", "0948375340", "test@mail.com");
	    action.saveEditorResearcher();
	    action.openFormAboutYou();
	    action.addBiography("text");
	    action.addProfilePicture();
	    action.goToStep2();
	    action.skipPlans();
	    action.isElementPresent("registration_complete_xpath");
	    action.closeApp();
	}
}