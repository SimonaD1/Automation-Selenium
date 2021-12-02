package com.worldillustrated.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class PaymentsTests extends BaseUI  
{
	PaymentsActions action = new PaymentsActions();
	
	@Test
	public void Payments_TC001()
	{   
		logger = report.createTest("Payments_TC001");
		action.openApp();
		action.addTocart();
		action.viewImage();
	    action.closeApp();
	}
	@Test
	public void Payments_TC002()
	{
		logger = report.createTest("Payments_TC002");
		action.openApp();
		action.emptyCart();
		action.closeApp();
	}
	@Test
	public void Payments_TC003()
	{
		logger = report.createTest("Payments_TC003");
		action.openApp();
		action.removeItem();
		action.closeApp();
	}
	@Test
	public void Payments_TC004()
	{
		logger = report.createTest("Payments_TC004");
		action.openApp();
		action.addTocart();
		action.goToCart();
		WebElement element = driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div[2]/div/table/tfoot/tr/th/div"));
	    System.out.println(element.getText());
	    action.closeApp();
	}
	@Test
	public void Payments_TC005()
	{
		logger = report.createTest("Payments_TC005");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitrovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.complete();
		action.verifyErrorMessage("msg_incomplete_xpath", "Your card's security code is incomplete.");
		action.closeApp();
	}
	@Test
	public void Payments_TC006()
	{
		logger = report.createTest("Payments_TC006");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitrovska");
		action.enterCardNumber("4242424242424242");
		action.enterCVC("345");
		action.complete();
		action.verifyErrorMessage("msg_card_expiration_date_xpath", "Your card's expiration date is incomplete.");
		action.closeApp();
	}
	@Test
	public void Payments_TC007()
	{
		logger = report.createTest("Payments_TC007");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("345");
		action.complete();
		action.verifyErrorMessage("msg_last_name_xpath", "Last name is required");
		action.closeApp();
	}
	    @Test
		public void Payments_TC008()
		{
			
		logger = report.createTest("Payments_TC008");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("345");
		action.complete();
		action.verifyErrorMessage("msg_first_name_xpath", "First name is required");
		action.closeApp();
		
		}
		@Test
	    public void Payments_TC009()
		{
		 			
		logger = report.createTest("Payments_TC009");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("345");
		action.backToMangeCart();
		action.closeApp();
				
		}
		@Test
	    public void Payments_TC010()
		{
		 			
		logger = report.createTest("Payments_TC010");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0218");
		action.enterCVC("345");
		action.complete();
		action.verifyErrorMessage("msg_year_in_the_past_xpath", "Your card's expiration year is in the past.");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC011()
		{
		 			
		logger = report.createTest("Payments_TC011");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("35");
		action.complete();
		action.verifyErrorMessage("msg_security_code_incomplete_xpath", "Your card's security code is incomplete.");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC012()
		{
		 			
		logger = report.createTest("Payments_TC012");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("0000 0000 0000 0000");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_incorrect_number_xpath", "Your card number is incorrect.");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC013()
		{
		 			
		logger = report.createTest("Payments_TC013");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName(".../////Simona");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_special_symbols_xpath", "Name must not include special symbols (/,.* .etc)");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC014()
		{
		 			
		logger = report.createTest("Payments_TC014");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterLastName(".../////Dimitrovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_payment_successful_xpath", "Name must not include special symbols (/,.* .etc)");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC015()
		{
		 			
		logger = report.createTest("Payments_TC015");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_successfully_purchased_content_xpath", "You successfully purchased content from world illustrated");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC016()
		{
		 			
		logger = report.createTest("Payments_TC016");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_successfully_purchased_content_xpath", "You successfully purchased content from world illustrated");
        action.downloadOrder();
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC017()
		{
		 			
		logger = report.createTest("Payments_TC017");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_successfully_purchased_content_xpath", "You successfully purchased content from world illustrated");
        action.downloadOrder();
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC018()
		{
		 			
		logger = report.createTest("Payments_TC018");
		action.openApp();
		action.addToCartPurchasedItem();
		action.verifyMessage("msg_you_already_own_this_item_xpath", "You already own this item.");
		action.closeApp();
		
		}
	    @Test
	    public void Payments_TC019()
		{
		 			
		logger = report.createTest("Payments_TC019");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.backToHomePage();
		action.goToCart();
		action.isElementPresent("img_in_cart_xpath");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC020()
		{
		 			
		logger = report.createTest("Payments_TC020");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.objectIsNull("subtotal_xpath");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC021()
		{
		 			
		logger = report.createTest("Payments_TC021");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.objectIsNull("VAT/GST_xpath");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC022()
		{
		 			
		logger = report.createTest("Payments_TC022");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("msg_successs_xpath", "Payment successful. An invoice regarding your order will be sent to ssdim@mail.com.");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC023()
		{
		 			
		logger = report.createTest("Payments_TC023");
		action.openApp();
		action.addToCartAudio();
		action.fillingBillingAddress();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC024()
		{
		 			
		logger = report.createTest("Payments_TC024");
		action.openApp();
		action.addToCartPurchasedItem();
		action.verifyMessage("msg_you_already_own_this_item_xpath", "You already own this item.");
		action.closeApp();
		
		}
	    @Test
	    public void Payments_TC025()
		{
	    	
		logger = report.createTest("Payments_TC025");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.enterFirstName("Simona");
		action.enterLastName("Dimitovska");
		action.enterCardNumber("4242424242424242");
		action.enterMMYY("0224");
		action.enterCVC("356");
		action.complete();
		action.verifyErrorMessage("invalid_billing_address_xpath", "Invalid billing address. Make sure you have submitted a valid country and state.");
		action.closeApp();
				
		}
	    @Test
	    public void Payments_TC026()
		{
	    	
		logger = report.createTest("Payments_TC026");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.isElementPresent("use_another_billing_address_xpath");
		action.closeApp();
		}
	    @Test
	    public void Payments_TC027()
		{
	    	
		logger = report.createTest("Payments_TC027");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.BillingAddressWitoutCountryProvinceCiry();
		action.closeApp();
		}
	    @Test
	    public void Payments_TC028()
		{
	    	
		logger = report.createTest("Payments_TC028");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddressWitoutZipCode();
		action.closeApp();
		}
	    @Test
	    public void Payments_TC029()
		{
	    	
		logger = report.createTest("Payments_TC029");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddressWitoutAddressLine1();
		action.closeApp();
		}
	    @Test
	    public void Payments_TC030()
		{
	    	
		logger = report.createTest("Payments_TC030");
		action.openApp();
		action.goToStepPaymentPreferences();
		action.fillingBillingAddressWitoutAddressLine2();
		action.closeApp();
		}
	    @Test
	    public void Payments_TC031()
	    {
	    
	    logger = report.createTest("Payments_TC031");
		action.openApp();
		action.buySubscription();
		action.enterCardDetails();
		action.complete();
		action.closeApp();
		
	    }
	    @Test
	    public void Payments_TC032()
	    {
	    	
	    logger = report.createTest("Payments_TC032");
		action.openApp();
	    action.buySubscription();
		action.fillingBillingAddress();
		action.complete();
		action.closeApp();
	    
	    }
	    @Test
	    public void Payments_TC033()
	    {
	    	
	    logger = report.createTest("Payments_TC033");
		action.openApp();
	    action.buySubscription();
	    action.removeBillingAddress();
	    action.complete();
	    action.closeApp();
	    }
	    @Test
	    public void Payments_TC034()
	    {
	    
	    logger = report.createTest("Payments_TC034");
		action.openApp();
	    action.buySubscription();
	    action.enterLastName("Dimitrovska");
	    action.enterCardNumber("4242424242424242");
	    action.enterMMYY("0223");
	    action.enterCVC("543");
	    action.complete();
		action.verifyErrorMessage("msg_required_first_name_xpath", "First name is required");
	   	action.closeApp();
	   	
	    }
	    @Test
	    public void Payments_TC035()
	    {
	    
	    logger = report.createTest("Payments_TC035");
		action.openApp();
	    action.buySubscription();
	    action.enterFirstName("Simona");
	    action.enterCardNumber("4242424242424242");
	    action.enterMMYY("0223");
	    action.enterCVC("543");
	    action.complete();
		action.verifyErrorMessage("msg_required_last_name_xpath", "Last name is required");
	   	action.closeApp();
	   	
	    }
	    @Test
	    public void Payments_TC036()
	    {
	    
	    logger = report.createTest("Payments_TC036");
		action.openApp();
	    action.buySubscription();
	    action.enterFirstName("Simona");
	    action.enterLastName("Dimitrovska");
	    action.enterCardNumber("4242424242424242");
	    action.enterCVC("567");
        action.complete();
		action.verifyErrorMessage("msg_incomplete_number_xpath", "Your card number is incomplete.");
	   	action.closeApp();
	   	
	    }
	    @Test
	    public void Payments_TC037()
	    {
	    
	    logger = report.createTest("Payments_TC037");
		action.openApp();
	    action.buySubscription();
	    action.enterFirstName("Simona");
	    action.enterLastName("Dimitrovska");
	    action.enterCardNumber("4242424242424242");
	    action.enterMMYY("0323");
        action.completeCheckout();
		action.verifyErrorMessage("msg_security_code_xpath", "Your card's security code is incomplete.");
	   	action.closeApp();
	   	
	    }
	    @Test
	    public void Payments_TC038()
	    {
	    
	    logger = report.createTest("Payments_TC038");
	 	action.openApp();
		action.buyItemWithSubscription();
		action.completeCheckout();
	    action.closeApp();
	    
	    }
	    @Test
	    public void Payments_TC039()
	    {
	    
	    logger = report.createTest("Payments_TC039");
	 	action.openApp();
		action.buyCredit();
		action.enterCardDetails();
		action.completeCheckout();
	    action.closeApp();
	    
	    }
	    @Test
	    public void Payments_TC040()
	    {
	    
	    logger = report.createTest("Payments_TC040");
	 	action.openApp();
		action.buyCredit();
	    action.enterFirstName("Simona");
	    action.enterLastName("Dimitrovska");
	    action.enterCardNumber("2424 4535 3453 5344");
	    action.enterMMYY("0323");
	    action.enterCVC("676");
		action.completeCheckout();
		action.verifyErrorMessage("payment_error_xpath", "Payment error: Error: Request failed with status code 402");
	    action.closeApp();
	    
	    }
	    @Test
	    public void Payments_TC041()
	    {
	    
	    logger = report.createTest("Payments_TC041");
	 	action.openApp();
		action.buyCredit();
		action.fillingBillingAddress();
	    action.closeApp();
	    
	    }
	    @Test
	    public void Payments_TC042()
	    {
	    
	    logger = report.createTest("Payments_TC042");
	 	action.openApp();
	 	action.buyItemWithCredit();
	 	action.complete();
	    action.closeApp();
	    
	    }
}
