package com.worldillustrated.TestCases;

import static org.testng.Assert.assertNotNull;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.worldillustrated.BaseClasses.BaseUI;

public class PaymentsActions extends BaseUI  
{
public static ExtentTest logger;
	
	public void openApp()
	{
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("cookies_btn_xpath");
		clickElement("signIn_xpath");
  		enterText("textBox_Email_xpath","test3user@mail.com");
  		enterText("textBox_Password_xpath","test3user!");
  		clickElement("sign_in_btn_xpath");
	}
	public void addTocart()
	{
		clickElement("junior_channel_xpath");
		clickElement("img1_xpath");
		clickElement("addToCart_xpath");
	}
	public void addToCartAudio()
	{
		clickElement("junior_channel_xpath");
		clickElement("img1_xpath");
		clickElement("add_to_cart_audio_xpath");
		goToCart();
		clickElement("next_step_cart_xpath");
	}
	public void addToCartPurchasedItem()
	{
		clickElement("junior_channel_xpath");
		clickElement("img1_xpath");
	}
	public void removeItem()
	{
		addTocart();
		clickElement("cart_button_xpath");
		clickElement("x_button_cart_xpath");
	}
	public void emptyCart()
	{
		addTocart();
     	clickElement("cart_button_xpath");
		clickElement("empty_cart_xpath");
		verifyMessage("cart_is_empty_msg_xpath","Your cart is empty");
	}
	public void goToCart()
	{
		clickElement("cart_button_xpath");
	}
	public void goToStepPaymentPreferences()
	{
		addTocart();
		goToCart();
		clickElement("next_step_cart_xpath");
	}
	public void viewImage()
	{
		clickElement("cart_button_xpath");
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div/table/tbody/tr[1]/td[1]/span/div/img"));
		element.isDisplayed();
	}
	public void complete()
	{
       clickElement("complete_button_xpath");
	}
	public void completeCheckout()
	{
		clickElement("complete_checkout_xpath");
	}
	public void enterCountry(String country)
	{
		  clickElement("country_text_box_xpath");
		  clickElement("country_xpath");
	}
	public void enterProvince(String province)
	{
		clickElement("state_text_box_province_xpath");
		clickElement("province_xpath");
	}
	public void enterCity(String city)
	{
		clickElement("city_text_box_xpath");
		clickElement("city_xpath");
	}
	public void enterZipCode(String zipCode)
	{
		enterText("zip_code_xpath",zipCode);
	}
	public void enterAddressLine1(String addressLine1)
	{
		enterText("address_line1_xpath",addressLine1);
	}
	public void enterAddressLine2(String addressLine2)
	{
	    enterText("address_line2_xpath",addressLine2);
	}
	public void fillingBillingAddress()
	{
		 clickElement("use_another_billing_address_xpath");
	     enterCountry("Croatia");
	     enterProvince("Lower Austria");
	     enterCity("Althofen");
	     enterZipCode("9431");
	     enterAddressLine1("kjfkjsf");
	     enterAddressLine2("mnbvcxb");
	     clickElement("save_xpath");
	}
	public void fillingBillingAddressWitoutZipCode()
	{
		 clickElement("use_another_billing_address_xpath");
	     enterCountry("Croatia");
	     enterProvince("Lower Austria");
	     enterCity("Althofen");
	     enterAddressLine1("kjfkjsf");
	     enterAddressLine2("mnbvcxb");
	     clickElement("save_xpath");
	     verifyMessage("zipcode_msg_xpath","Zip code is required");
	}
	public void fillingBillingAddressWitoutAddressLine1()
	{
		 clickElement("use_another_billing_address_xpath");
	     enterCountry("Croatia");
	     enterProvince("Lower Austria");
	     enterCity("Althofen");
	     enterAddressLine2("mnbvcxb");
	     clickElement("save_xpath");
	     verifyMessage("addressline1_msg_xpath","Address is required");
	}
	public void fillingBillingAddressWitoutAddressLine2()
	{
		 clickElement("use_another_billing_address_xpath");
	     enterCountry("Croatia");
	     enterProvince("Lower Austria");
	     enterCity("Althofen");
	     enterAddressLine1("kjfkjsf");
	     clickElement("save_xpath");
	}
	public void BillingAddressWitoutCountryProvinceCiry()
	{
		 clickElement("use_another_billing_address_xpath");
	     enterZipCode("9431");
	     enterAddressLine1("kjfkjsf");
	     enterAddressLine2("mnbvcxb");
	     verifyMessage("country_msg_xpath","Country is required");
	     verifyMessage("province_msg_xpath","State/Province is required");
	     verifyMessage("city_msg_xpath","City is required");
	     clickElement("save_xpath");
	}
	public void enterFirstName(String firstName)
	{
		enterText("first_name_text_box_xpath",firstName);
	}
	public void enterLastName(String lastName)
	{
		enterText("last_name_text_box_xpath",lastName);
	}
	public void enterCardNumber(String cardNumber)  
	{
		driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/form/div[1]/div[1]/div/div[2]/div/div/div/div/div[3]/div/iframe")));
		driver.findElement(By.xpath("/html/body/div/form/div/div[2]/span[1]/span[2]/div/div[2]/span/input")).sendKeys(cardNumber);
	}
	public void enterMMYY(String MMYY)
	{
		enterText("mm/yy_xpath",MMYY);
	}
	public void enterCVC(String cvc)
	{
		enterText("cvc_xpath",cvc);
		driver.switchTo().defaultContent();

	}
	public void enterCardDetails()
	{
	     enterFirstName("Simona");
	     enterLastName("Dimitrovska");
	     enterCardNumber("4242424242424242");   
	     enterMMYY("0224");
	     enterCVC("234");
	}
	public void backToMangeCart()
	{
		clickElement("back_button_xpath");
		isElementPresent("cart_title_xpath");
	}
	public void downloadOrder()
	{
		clickElement("download_button_xpath");
		clickElement("button_explore_more_xpath");
	}
	public void backToHomePage() 
	{
		clickElement("home_btn_xpath");
	} 
    public void objectIsNull(String verifyObject)
    {
    	assertNotNull(verifyObject);
    }
    public void goToMyLicensePlans()
    {
    	clickElement("img_button_xpath");
    	clickElement("my_license_plan_xpath");
    }
    public void buySubscription()
    {
    	goToMyLicensePlans();
    	clickElement("get_subscription_plans_xpath");
    	clickElement("buy_subscription_plan_button_xpath");
    }
    public void buyCredit() 
    {
    	goToMyLicensePlans();
    	clickElement("get_subscription_plans_xpath");
    	clickElement("get_credit_plan_button_xpath");
    }
    public void removeBillingAddress()
    {
    	clickElement("remove_new_billing_address_xpath");
    }
    public void buyItemWithSubscription()
    {
    	clickElement("junior_channel_xpath");
		clickElement("img_xpath");
		clickElement("add_to_cart_+_button_xpath");
		goToCart();
		clickElement("next_step_cart_xpath");
    }
	public void buyItemWithCredit()
	{
		clickElement("transport_xpath");
		clickElement("image_xpath");
		clickElement("add_to_cart_+_button_xpath");
		goToCart();
		clickElement("next_step_cart_xpath");
		
	}
	public void closeApp()
	{
		quiteBrowser();
	}
	

}
