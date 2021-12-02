package com.worldillustrated.TestCases;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;
import com.worldillustrated.utils.TestDataProvider;

public class ContentUploadIndividualTest extends BaseUI
{
    //@Test
	public void ContentUploadIndividual_TC001()
	{
        logger = report.createTest("ContentUploadIndividual_TC001");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
		isElementPresent("clickOrDragHere_xpath");
		quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC002()
	{
		logger = report.createTest("ContentUploadIndividual_TC002");
			
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
		clickElement("clickOrDragHere_xpath");
		quiteBrowser();
		
	}
	//@Test
	public void ContentUploadIndividual_TC003()
	{
		logger = report.createTest("ContentUploadIndividual_TC003");
			
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
		clickElement("clickOrDragHere_xpath");
		quiteBrowser();
		
	}
	//@Test
	public void ContentUploadIndividual_TC004()
	{
		logger = report.createTest("ContentUploadIndividual_TC004");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath"); 
    	WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		//clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\main\\java\\testData\\diy-paper-flowers-1582662788.jpg");
	    //isElementPresent("tick_sign_xpath");
		clickElement("nextStep_btn_xpath");
		//String text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[4]/div/div")).getText();
		//System.out.println(text);	
		quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC005()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC005");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
		clickElement("nextStep_btn_xpath");
		quiteBrowser();
		
		
	}
    //@Test
	public void ContentUploadIndividual_TC006()
	{
		logger = report.createTest("ContentUploadIndividual_TC006");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
		WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		WebElement cancelButton = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root-168 MuiIconButton-root-160']"));
		cancelButton.click();
		quiteBrowser();
	
	}
	//@Test
	public void ContentUploadIndividual_TC007()
	{
	    
		logger = report.createTest("ContentUploadIndividual_TC007");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
		WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("edit_btn_xpath");
		enterText("textBox_keywords_xpath","vulca");
		clickElement("save_changes_keyword_btn_xpath");
		clickElement("edit_btn_xpath");
		enterText("textBox_keywords_xpath","n");
		clickElement("save_changes_keyword_btn_xpath");
		quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC008()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC008");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_xpath");
		enterText("textBox_keywords_xpath","lfskfksl");
		clickElement("save_changes_keyword_btn_xpath");
		clickElement("add_keyword_btn_xpath");
		isElementPresent("keyword_xpath");
		quiteBrowser();
		
	}
    //@Test
    public void ContentUploadIndividual_TC009()
    {
        
    	logger = report.createTest("ContentUploadIndividual_TC009");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_xpath");
		enterText("textBox_keywords_xpath","v");
		clickElement("save_changes_keyword_btn_xpath");
		clickElement("add_keyword_btn_xpath");
		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\\\"root\\\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div[2]/div/div/div/div[2]/button[2]")));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
	
		quiteBrowser();
    }
	//@Test
	public void ContentUploadIndividual_TC010()
	{
		
        logger = report.createTest("ContentUploadIndividual_TC010");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

   	    clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Natural history"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Museums"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   quiteBrowser();		
		
	}
	//@Test
	public void ContentUploadIndividual_TC011()
	{
	    
		logger = report.createTest("ContentUploadIndividual_TC011");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\Europe West ZB5486_346144_9355.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("individual_img_xpath");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement editBtn = driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div[2]/div/div/div/div[2]/button[1]"));
		editBtn.click();
		enterText("textBox_keywords_xpath","23444897987");
		clickElement("add_keyword_btn_xpath");
		clickElement("save_changes_keyword_btn_xpath");			
		quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC012()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC012");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\BOTTURA_B2420_282705_0012(Cover) - Copy (2).JPG");
		clickElement("nextStep_btn_xpath");
		
		quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC013()
	{
        logger = report.createTest("ContentUploadIndividual_TC013");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\BIGFISH_B434_275804_0230 - Copy (2).jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("individual_img_xpath");
		WebElement editBtnCategory = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root-221 MuiIconButton-root-230']"));
		editBtnCategory.click();
		//clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("World"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
    
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   clickElement("complete_button_xpath");
	   verifyMessage("msg_at_least_one_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
	   quiteBrowser();	
	
		
	}
	//@Test
	public void ContentUploadIndividual_TC014()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC014");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\B5725_310507_2749 - Copy (2).jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("complete_button_xpath");
		String text= driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[3]/div/div/div[2]")).getText();
		System.out.println(text);
		verifyMessage("msg_at_least_one_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
		quiteBrowser();
		
	}
	//@Test
	public void ContentUploadIndividual_TC015()
	{
        logger = report.createTest("ContentUploadIndividual_TC015");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\Europe West ZB5486_346144_9355 - Copy.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("individual_img_xpath");
		WebElement editBtnCategory = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root-221 MuiIconButton-root-230']"));
		editBtnCategory.click();
		//clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }
		clickElement("saveChanges_category_xpath");
		clickElement("complete_button_xpath");
		verifyMessage("msg_at_least_one_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
		quiteBrowser();
	}
	@Test
	public void ContentUploadIndividual_TC016()
	{

		logger = report.createTest("ContentUploadIndividual_TC016");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		enterText("textBox_Password_xpath","simonaD10!");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\BIGFISH_B434_275804_0230 - Copy (2).jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("individual_img_xpath");
		WebElement editBtnCategory = driver.findElement(By.xpath("//*[@class='MuiButtonBase-root-221 MuiIconButton-root-230']"));
		editBtnCategory.click();
		//clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("World"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Belgium"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   verifyMessage("changes_saved_succesfully_msg_xpath","Changes saved successfully");			
	   quiteBrowser();
		
	}
	//@Test
	public void ContentUploadIndividual_TC017()
	{

		logger = report.createTest("ContentUploadIndividual_TC017");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }
		clickElement("saveChanges_category_xpath");
		String text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[8]/div/div")).getText();
		System.out.println(text);
		verifyMessage("select_thread_from_drop_down_msg_xpath","Select thread from dropdown menu");
		quiteBrowser();

	}
	//@Test
	public void ContentUploadIndividual_TC018()
	{

		logger = report.createTest("ContentUploadIndividual_TC018");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");	
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
    
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   String text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[8]/div/div")).getText();
	   System.out.println(text);
	   verifyMessage("select_thread_from_drop_down_msg_xpath","Select thread from dropdown menu");
	   quiteBrowser();		
	}
	//@Test
	public void ContentUploadIndividual_TC019()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC019");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
        WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Discovery"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   clickElement("complete_button_xpath");	
	   verifyMessage("uploded_content_title_xpath","Uploaded content");
	   quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC020()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC020");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Discovery"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   
	   clickElement("channel_drop_down_xpath");
	   List <WebElement> allelements3 = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements3.size(); i++)
		  {
		  
			String text=allelements3.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements3.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements4 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements4.size(); i++)
		  {
		  
			String text=allelements4.get(i).getText();
		    
			if(text.equalsIgnoreCase("Environment"))
		    {
		        
				allelements4.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements5 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements5.size(); i++)
		  {
		  
			String text=allelements5.get(i).getText();
		    
			if(text.equalsIgnoreCase("Pollution"))
		    {
		        
				allelements5.get(i).click();
		        break;
		    } 
		 }
		  
		clickElement("addToAnother_xpath");
		clickElement("saveChanges_category_xpath");
		clickElement("complete_button_xpath");
	    verifyMessage("uploded_content_title_xpath","Uploaded content");
		quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC021()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC021");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Discovery"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   
	   clickElement("channel_drop_down_xpath");
	   List <WebElement> allelements3 = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements3.size(); i++)
		  {
		  
			String text=allelements3.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements3.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements4 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements4.size(); i++)
		  {
		  
			String text=allelements4.get(i).getText();
		    
			if(text.equalsIgnoreCase("Environment"))
		    {
		        
				allelements4.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements5 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements5.size(); i++)
		  {
		  
			String text=allelements5.get(i).getText();
		    
			if(text.equalsIgnoreCase("Pollution"))
		    {
		        
				allelements5.get(i).click();
		        break;
		    } 
		 }
		  
		clickElement("addToAnother_xpath");
		clickElement("channel_drop_down_xpath");
		   List <WebElement> allelements6 = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

			  for(int i=0; i< allelements6.size(); i++)
			  {
			  
				String text=allelements6.get(i).getText();
			    
				if(text.equalsIgnoreCase("Hobbies"))
			    {
			        
					allelements6.get(i).click();
			        break;
			    } 
			 }     

		   clickElement("subchannel_drop_down_xpath");
			List <WebElement> allelements7 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

			  for(int i=0; i< allelements7.size(); i++)
			  {
			  
				String text=allelements7.get(i).getText();
			    
				if(text.equalsIgnoreCase("Camping"))
			    {
			        
					allelements7.get(i).click();
			        break;
			    } 
			 }     
		    clickElement("thread_drop_down_xpath");
		    List <WebElement> allelements8 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

			  for(int i=0; i< allelements8.size(); i++)
			  {
			  
				String text=allelements8.get(i).getText();
			    
				if(text.equalsIgnoreCase("traditional"))
			    {
			        
					allelements8.get(i).click();
			        break;
			    } 
			 }
	    	clickElement("addToAnother_xpath");
		   	clickElement("saveChanges_category_xpath");
		    clickElement("complete_button_xpath");
		    verifyMessage("uploded_content_title_xpath","Uploaded content");
			quiteBrowser();
			  
	}
	//@Test
	public void ContentUploadIndividual_TC022()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC022");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Discovery"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   clickElement("edit_btn_category_xpath");
	   clickElement("delete_btn_xpath");
	   quiteBrowser();
	}
	//@Test
	public void ContentUploadIndividual_TC024()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC024");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("thread_drop_down_xpath");
	   List <WebElement> allelements2 = driver.findElements(By.xpath("//*[@id=\"menu-thread\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements2.size(); i++)
		  {
		  
			String text=allelements2.get(i).getText();
		    
			if(text.equalsIgnoreCase("Discovery"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("addToAnother_xpath");
	   clickElement("saveChanges_category_xpath");
	   clickElement("complete_button_xpath");
	   isElementPresent("pending_approval_xpath");
	   quiteBrowser();		
	}
	//@Test
	public void ContentUploadIndividual_TC025()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC025");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_main_inf_xpath");
		enterText("headline_text_box_xpath","Greenwich avenue street sign");
		clickElement("save_changes_main_inf_xpath");
		quiteBrowser();		
	}
	//@Test
	public void ContentUploadIndividual_TC026()
	{

		logger = report.createTest("ContentUploadIndividual_TC026");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_main_inf_xpath");
		enterText("headline_text_box_xpath","Greenwich avenue street sign");
		clickElement("save_changes_main_inf_xpath");
		//String text= driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[5]/div/div")).getText();
		//System.out.println(text);
		verifyMessage("changes_saved_succesfully_msg_xpath","Changes saved successfully");
		quiteBrowser();	
	}
	//@Test
	public void ContentUploadIndividual_TC027()
	{

		logger = report.createTest("ContentUploadIndividual_TC027");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		quiteBrowser();	
		
	}
	//@Test
	public void ContentUploadIndividual_TC028()
	{
        
		logger = report.createTest("ContentUploadIndividual_TC028");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		isElementPresent("title_drop_down_xpath");
		quiteBrowser();	
	}
	//@Test
	public void ContentUploadIndividual_TC029()
	{
        logger = report.createTest("ContentUploadIndividual_TC029");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }  
		String text= driver.findElement(By.xpath("//*[@id=\"mui-component-select-channel\"]")).getText();
		Assert.assertEquals(text, "Our Planet");
		System.out.println(text);	
		quiteBrowser();	

	}
	//@Test
	public void ContentUploadIndividual_TC030()
	{

		logger = report.createTest("ContentUploadIndividual_TC030");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_btn_category_xpath");
		clickElement("channel_drop_down_xpath");
		
		List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements.size(); i++)
		  {
		  
			String text=allelements.get(i).getText();
		    
			if(text.equalsIgnoreCase("Our Planet"))
		    {
		        
				allelements.get(i).click();
		        break;
		    } 
		 }     

	   clickElement("subchannel_drop_down_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel"))
		    {
		        
				allelements1.get(i).click();
		        break;
		    } 
		 }  
	    quiteBrowser();	

	}
	//@Test
	public void ContentUploadIndividual_TC031()
	{
        logger = report.createTest("ContentUploadIndividual_TC031");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_location_xpath");
		clickElement("save_changes_location_xpath");
	    quiteBrowser();	

	}
    //@Test
    public void ContentUploadIndividual_TC032()
    {
        
    	logger = report.createTest("ContentUploadIndividual_TC032");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("individualItems_xpath");
	    WebElement clickOrDragHere = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		clickOrDragHere.sendKeys("C:\\Users\\user75\\Desktop\\pics\\diy-paper-flowers-1582662788.jpg");
		clickElement("nextStep_btn_xpath");
		clickElement("edit_location_xpath");
		enterText("country_code_text_box_xpath","44");
		clickElement("save_changes_location_xpath");
	    quiteBrowser();	
    	
    }
	@DataProvider
	public Object [][] getTestData()
	{
		return TestDataProvider.getTestData("Login_TestData_Worldillustrated.xlsx", "Sheet1", "LoginTest");
	}
	
	@AfterTest
	public void endReport()
	{
		report.flush();
	}

}
