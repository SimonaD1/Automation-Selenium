package com.worldillustrated.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver.WindowType;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class OnboardingPromemberActions extends BaseUI  
{
	public static ExtentTest logger;
	
	public void openApp()
	{
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("cookies_btn_xpath");
		clickElement("signIn_xpath");
  		enterText("textBox_Email_xpath","test78@mail.com");
  		enterText("textBox_Password_xpath","testuser78!");
  		clickElement("sign_in_btn_xpath");
  		clickElement("redirected_LinkText");
  		driver.navigate().refresh();
	}
	public void verifyElementPresent()
	{
		isElementPresent("organization_name_field_xpath");
		isElementPresent("VAT_number_field_xpath");
		isElementPresent("company_type_xpath");
		isElementPresent("content_type_xpath");
		isElementPresent("email_newsletters_xpath");
		isElementPresent("email_accounting_xpath");
	}
	public void fillDataInGeneralInformation(String vatNumber, String newsletters, String accounting)
	{
		enterText("VAT_number_field_xpath",vatNumber);
		clickElement("company_type_xpath");
		clickElement("li_graphic_design_xpath");
		clickElement("content_type_xpath");
		clickElement("li_design_xpath");
		enterText("email_newsletters_xpath",newsletters);
		enterText("email_accounting_xpath",accounting);
	}
	public void saveGeneralInfomation()
	{
		clickElement("save_general_inf_xpath");
	}
	public void openFormPersonResponsibleForAccount()
	{
		clickElement("form_button_person_xpath");
	}
	public void openFormMailingAddress()
	{
	    clickElement("mailing_button_xpath");	
	}
	public void openFormBillingAddress()
	{
	    clickElement("billing_button_xpath");	
	}
	public void openFormEditors()
	{
	    clickElement("editors_button_xpath");	
	}
	public void openFormAboutYou()
	{
	    clickElement("about_you_button_xpath");	
	}
	public void fillDataForPersonResponsibleForAccount(String firstName, String lastName, String email, String phone)
	{
		//openFormPersonResponsibleForAccount();
		enterText("first_name_xpath",firstName);
		enterText("last_name_xpath",lastName);
		clickElement("job_title_xpath");
		clickElement("li_graphic_designer_xpath");
		enterText("email_address_xpath",email);
		enterText("phone_number_xpath",phone);
	}
	public void savePersonResponsibleForAccount()
	{
		clickElement("save_button_person_account_xpath");
	}
	public void fillDataInMailingAddress(String zipCode, String addressLine1, String addressLine2)
	{
		 //openFormMailingAddress();
		 clickElement("mailing_country_xpath");
		 clickElement("li_canada_xpath");
		 clickElement("mailing_province_xpath");
		 clickElement("li_province_manitoba_xpath");
		 clickElement("mailing_city_xpath");
		 clickElement("li_city_albert_xpath");
		 enterText("zip_code_field_xpath",zipCode);
		 enterText("address_line1_field_xpath",addressLine1);
		 enterText("address_line2_field_xpath",addressLine2);
	}
	public void saveMailingAddress()
	{
		clickElement("save_button_mailing_xpath");
	}
	public void fillDataInBillingAddress(String zipCode, String addressLine1, String adressLine2)
	{
		//openFormBillingAddress();
		clickElement("billing_country_xpath");
		clickElement("list_germany_xpath");
		clickElement("billing_province_xpath");
		clickElement("li_bavaria_xpath");
		clickElement("billing_city_xpath");
		clickElement("li_adelhofen_xpath");
        enterText("zip_code_xpath",zipCode);
        enterText("address_line1_xpath",addressLine1);
        enterText("address_line2_xpath",adressLine2);
	}
	public void saveBillingAddress()
	{
		clickElement("save_button_billing_xpath");
	}
	public void fillDataForEditorResearcher(String firstName, String lastName, String phone, String email)
	{
		//openFormEditors();
		clickElement("editor_btn_xpath");
		enterText("first_name_field_xpath",firstName);
		enterText("last_name_field_xpath",lastName);
		clickElement("job_title_editor_researcher_xpath");
		clickElement("li_photoresearcher_xpath");
		enterText("phone_number_field_xpath",phone);
		enterText("email_address_field_xpath",email);
	} 
	public void saveEditorResearcher()
	{
		clickElement("save_editor_researcher_xpath");
	}
	public void useМailingАddressАsBillingAddress()
	{
		clickElement("checkbox_xpath");
	}
	public void goToStep2()
	{
		clickElement("next_step_button_xpath");
	}
	public String checkEmptyField(String xpath)
	{
		WebElement ele = driver.findElement(By.xpath(xpath)); 

		if (ele.getAttribute("value").isEmpty()) 
		{
		    System.out.println("Text field is empty");
		}
	    String store=ele.getAttribute("value");
	    return store;
	}
	 public void clearWebField(String xpathElement )
	 {
		 WebElement element = driver.findElement(By.xpath(xpathElement));
		 while(!element.getAttribute("value").equals(""))
		  {
		        element.sendKeys(Keys.BACK_SPACE);
		  }
		}
	public void addBiography(String text)
	{
		enterText("text_biography_xpath",text);
	}
	public void addProfilePicture()
	{
		WebElement clickOrDragHere = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[7]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[1]/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user\\Desktop\\Reborn\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\Europe West ZB5486_346144_9355 - Copy.jpg");
	}
	public void addAnotherEditorResearcher()
	{
		clickElement("add_another_editor_button_xpath");
	}
	public void deleteEditor()
	{
		clickElement("delete_btn_xpath");
	}
	public void skipPlans()
	{
		clickElement("skip_btn_xpath");
	}
	public void closeApp()
	{
		quiteBrowser();
	}

}
