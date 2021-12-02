package com.worldillustrated.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class OnboardingContributorActions extends BaseUI 
{
	public static ExtentTest logger;
	
	public void openApp()
	{
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("cookies_btn_xpath");
		clickElement("signIn_xpath");
  		enterText("textBox_Email_xpath","test56@mail.com");
  		enterText("textBox_Password_xpath","test56!!");
  		clickElement("sign_in_btn_xpath");
  		clickElement("redirected_LinkText");
  		driver.navigate().refresh();
	}
	public void goToStep2()
	{
		clickElement("next_step_xpath");
	}
	public void verifyElementPresent(String xpath, String xpath1)
	{
		isElementPresent(xpath);
		isElementPresent(xpath1);
	}
	public void fillDataGeneralInfomation()
	{
		clickElement("btn_general_inf_xpath");
	}
	public void saveGeneralInfomartion()
	{
		clickElement("save_button_general_inf_xpath");
	}
	public void fillDataForPersonResponsibleForAccount(String firstName, String lastName, String email, String phone)
	{
		clickElement("btn_person_esponsible_for_account_xpath");
		enterText("firstname_account_xpath",firstName);
		enterText("lastname_account_xpath",lastName);
		enterText("phone_account_xpath",email);
		enterText("email_account_xpath",phone);
	}
	public void savePersonResponsibleForAccount()
	{
		clickElement("save_btn_acccount_xpath");
	}
	public void fillDataInMailingAddress(String zipCode, String addressLine1, String addressLine2)
	{
		 clickElement("btn_mailing_xpath");
		 clickElement("country_mailing_xpath");
		 clickElement("li_conutry_mailing_xpath");
		 clickElement("province_mailing_xpath");
		 clickElement("li_province_xpath");
		 clickElement("city_mailing_xpath");
		 clickElement("li_city_xpath");
		 enterText("zipcode_name",zipCode);
		 enterText("addressline1_mailing_xpath",addressLine1);
		 enterText("address_line2_field_xpath",addressLine2);
	}
	public void saveMailingAddress()
	{
		clickElement("save_mailing_address_xpath");
	}
	public void fillDataInBillingAddress(String zipCode, String addressLine1, String adressLine2)
	{
		//clickElement("btn_billing_xpath");
		clickElement("country_billing_xpath");
		clickElement("li_billing_xpath");
		clickElement("province_billing_xpath");
		clickElement("li_billing_xpath");
		clickElement("city_billing_xpath");
		clickElement("li_billing_xpath");
        enterText("zipcode_billing_xpath",zipCode);
        enterText("addressline1_billing_xpath",addressLine1);
        enterText("addressline2_billing_xpath",adressLine2);
	}
	public void saveBillingAddress()
	{
		clickElement("save_billing_address_xpath");
	}
	public void useMailingAddressAsBilling()
	{
		clickElement("checkbox_use_mailing_address_xpath");
	}
	public void chooseLicenseAndCurrency()
	{
		clickElement("btn_licensing_xpath");
		clickElement("listbox_license_type_xpath");
		clickElement("premium_license_xpath");
		clickElement("listbox_currency_xpath");
		clickElement("eur_xpath");
		clickElement("checkbox_xpath");
	}
	public void saveLicenseAndCurrency()
	{
		clickElement("save_btn_licensing_xpath");
	}
	public void chooseChannels()
	{
		clickElement("btn_channels_xpath");
		clickElement("junior_xpath");
		clickElement("muisc_xpath");
		clickElement("style_xpath");
	}
	public void saveChannels()
	{
		clickElement("save_btn_channels_xpath");
	}
	public void isFieldEmpty()
	{
		WebElement ele = driver.findElement(By.id("organizationName")); 
		if (ele.getAttribute("value").isEmpty()) 
		{
			System.out.println("Text field is empty");
		}
		else 
		{
		    String store = ele.getAttribute("value");
		    System.out.println(store);
		}
	}
	public void addProfilePicture()
	{
		clickElement("btn_aboutyou_xpath");
		WebElement clickOrDragHere = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div[6]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[1]/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user\\Desktop\\Reborn\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\Europe West ZB5486_346144_9355 - Copy.jpg");
	}
	public void addBiography(String text)
	{
		clickElement("btn_aboutyou_xpath");
		enterText("biography_xpath",text);
	}
	public void closeApp()
	{
		quiteBrowser();
	}


}
