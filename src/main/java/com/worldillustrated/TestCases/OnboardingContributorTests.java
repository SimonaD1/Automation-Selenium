package com.worldillustrated.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class OnboardingContributorTests extends BaseUI 
{
	OnboardingContributorActions action = new OnboardingContributorActions();
	
	@Test
	public void OnboardingContributor_TC001()
	{   
		logger = report.createTest("OnboardingContributor_TC001");
		action.openApp();
		action.goToStep2();
	    action.verifyMessage("msg_xpath", "Invalid user data in 'General information'.\r\n"
	    		+ "Invalid user data in 'Person responsible for this account'.\r\n"
	    		+ "Invalid address format filled. Please fill all the required fields.\r\n"
	    		+ "Invalid address format filled. Please fill all the required fields.\r\n"
	    		+ "Invalid user data in 'Licensing'.\r\n"
	    		+ "No channels selected for your content.");
	    action.closeApp();
	}
	@Test
	public void OnboardingContributor_TC002()
	{   
		logger = report.createTest("OnboardingContributor_TC002");
		action.openApp();
		action.verifyElementPresent("org_name_xpath", "vat_number_xpath");
	    action.closeApp();
	}
	@Test
	public void OnboardingContributor_TC003()
	{   
		logger = report.createTest("OnboardingContributor_TC003");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "test@mail.com", "09857654654654");
        action.savePersonResponsibleForAccount();
        action.fillDataInMailingAddress("34533", "test", "test");
        action.saveMailingAddress();
		action.fillDataInBillingAddress("34543", "test", "test");
		action.saveBillingAddress();
		action.chooseLicenseAndCurrency();
		action.saveLicenseAndCurrency();
		action.chooseChannels();
		action.saveChannels();
		action.addProfilePicture();
		action.addBiography("test");
		action.goToStep2();
		action.closeApp();
	}
	@Test
    public void OnboardingContributor_TC004()
	{   
		logger = report.createTest("OnboardingContributor_TC004");
		action.openApp();
		action.isFieldEmpty();
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC005()
	{   
		logger = report.createTest("OnboardingContributor_TC005");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "", "");
		action.verifyErrorMessage("msg_email_xpath", "Email address is required");
		action.verifyErrorMessage("msg_phone_xpath", "Phone number is required");
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC007()
	{   
		logger = report.createTest("OnboardingContributor_TC007");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("....////Simona/", "Dimitrovska", "test@mail.com", "0987656733");
        action.verifyErrorMessage("msg_name_xpath", "Name must not include special symbols (/,.* .etc)");
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC008()
	{   
		logger = report.createTest("OnboardingContributor_TC008");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("Simona", ".......//////Dimitrovska/", "test@mail.com", "0987656733");
        action.verifyErrorMessage("msg_lastname_xpath", "Name must not include special symbols (/,.* .etc)");
	    action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC009()
	{   
		logger = report.createTest("OnboardingContributor_TC009");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "test@mail.com", "049,...30534054.....5");
        action.verifyErrorMessage("msg_invalid_phone_xpath", "Phone number is not valid");
	    action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC010()
	{   
		logger = report.createTest("OnboardingContributor_TC010");
		action.openApp();
		action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "test@mail.com", "");
        action.savePersonResponsibleForAccount();
		action.verifyErrorMessage("msg_phone_number_required_xpath", "Phone number is required");
	    action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC011()
	{   
		logger = report.createTest("OnboardingContributor_TC011");
		action.openApp();
		action.saveGeneralInfomartion();
		action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "test@mail.com", "09857654654654");
        action.savePersonResponsibleForAccount();
		action.fillDataInBillingAddress("34543", "test", "test");
		action.saveBillingAddress();
		action.chooseLicenseAndCurrency();
		action.saveLicenseAndCurrency();
		action.chooseChannels();
		action.saveChannels();
		action.goToStep2();
		action.verifyErrorMessage("msg_mailing_xpath", "Invalid address format filled. Please fill all the required fields.");
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC012()
	{   
		logger = report.createTest("OnboardingContributor_TC012");
		action.openApp();
		action.fillDataInMailingAddress("57425", "test", "");
		action.saveMailingAddress();
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC013()
	{   
		logger = report.createTest("OnboardingContributor_TC013");
		action.openApp();
		action.fillDataInMailingAddress("4564", "test", "test");
		action.saveMailingAddress();
		action.useMailingAddressAsBilling();
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC014()
	{   
		logger = report.createTest("OnboardingContributor_TC014");
		action.openApp();
		action.fillDataInBillingAddress("", "test", "test");
		action.saveBillingAddress();
		action.verifyErrorMessage("msg_zipcode_billing_xpath", "Zip code is required");
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC015()
	{   
		logger = report.createTest("OnboardingContributor_TC015");
		action.openApp();
		action.fillDataInBillingAddress("****", "test", "test");
		action.saveBillingAddress();
		action.verifyErrorMessage("msg_notvalid_zipcode_xpath", "Your zip code is not valid");
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC016()
	{   
		logger = report.createTest("OnboardingContributor_TC016");
		action.openApp();
		action.addProfilePicture();
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC017()
	{   
		logger = report.createTest("OnboardingContributor_TC017");
		action.openApp();
		action.addBiography("test");
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC018()
	{   
		logger = report.createTest("OnboardingContributor_TC018");
		action.openApp();
		action.chooseChannels();
		action.closeApp();
	}
    @Test
    public void OnboardingContributor_TC019()
	{   
		logger = report.createTest("OnboardingContributor_TC019");
		action.openApp();
		action.fillDataGeneralInfomation();
		action.fillDataForPersonResponsibleForAccount("Simona", "Dimitrovska", "test@mail.com", "09857654654654");
        action.savePersonResponsibleForAccount();
        action.fillDataInMailingAddress("34533", "test", "test");
        action.saveMailingAddress();
		action.fillDataInBillingAddress("34543", "test", "test");
		action.saveBillingAddress();
		action.chooseLicenseAndCurrency();
		action.saveLicenseAndCurrency();
		action.chooseChannels();
		action.saveChannels();
		action.addProfilePicture();
		action.addBiography("test");
		action.goToStep2();
		action.verifyElementPresent("msg_complete_xpath", "Registration complete");
		action.closeApp();
	}
}
