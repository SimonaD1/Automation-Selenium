package com.worldillustrated.TestCases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.worldillustrated.BaseClasses.BaseUI;
import com.worldillustrated.utils.TestDataProvider;

public class ContentSetTest extends BaseUI 
{
	
	//@Test
	public void ContentSet_TC001()
	{
		logger = report.createTest("ContentSet_TC001");
		
		invokeBrowser("Mozila");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_button_xpath");
		clickElement("radio_btn_Content_set_xpath");
		isElementPresent("clickOrDragHere_ContentSet_xpath");
		quiteBrowser();
	}
	//@Test
	public void ContentSet_TC002()
	{
		logger = report.createTest("ContentSet_TC002");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");
		clickElement("clickOrDragHere_ContentSet_xpath");
		quiteBrowser();
		
	}
	//@Test
	public void ContentSet_TC003()
	{
        
		logger = report.createTest("ContentSet_TC003");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");
		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/div")));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
		clickElement("clickOrDragHere_ContentSet_xpath");
		quiteBrowser();
		
	}
    //@Test
    public void ContentSet_TC004()
    {

    	logger = report.createTest("ContentSet_TC004");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");
		
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC005()
    {
        
    	logger = report.createTest("ContentSet_TC005");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");
		
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		isElementPresent("img1_xpath");
		isElementPresent("img2_xpath");
		isElementPresent("img3_xpath");
		
		quiteBrowser();
    	
    }
    //@Test
    public void ContentSet_TC006()
    {
        logger = report.createTest("ContentSet_TC006");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");
		
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		quiteBrowser();
    	
    }
    //@Test
    public void ContentSet_TC007()
    {
	    logger = report.createTest("ContentSet_TC007");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");
		
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		clickElement("cancel_btn_content_set_xpath");
		quiteBrowser();

    }
    //@Test
    public void ContentSet_TC008()
    {
    	logger = report.createTest("ContentSet_TC008");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");
 		
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    	clickElement("next_step_content_set_xpath");
    	verifyMessage("manage_contentSet_message_xpath","Uploaded files need to be arranged in content sets before proceeding to next step");
    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC009()
    {
        logger = report.createTest("ContentSet_TC009");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");
 		
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\different extensions\\cEdDG.png";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\different extensions\\images.bmp";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\different extensions\\website.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		clickElement("next_step_content_set_xpath");
 		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC010()
    {
    	logger = report.createTest("ContentSet_TC010");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");
 		
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		clickElement("next_step_content_set_xpath");
 		verifyMessage("manage_contentSet_message_xpath","Uploaded files need to be arranged in content sets before proceeding to next step");
 		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div[1]/button[2]")));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
 		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC11() 
    {
        logger = report.createTest("ContentSet_TC011");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
    	clickElement("next_step_content_set_xpath");
    	verifyMessage("cover_photo_message_xpath","All content sets must have a cover photo selected.");
 		quiteBrowser();

    }
    //@Test
    public void ContentSet_TC012()
    {

        logger = report.createTest("ContentSet_TC012");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		verifyMessage("msg_cover_photo_set_successfully_xpath","Cover photo set successfully");
 		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC013()
    {
    	 logger = report.createTest("ContentSet_TC013");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[1]/div[2]/div[1]/button[2]")));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
  		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC014()
    {
        logger = report.createTest("ContentSet_TC014");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 	
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		verifyMessage("msg_cover_photo_set_successfully_xpath","Cover photo set successfully");
      
 		clickElement("img1_cover1_xpath");
    	clickElement("select_as_cover_xpath");
    	verifyMessage("msg_cover_photo_set_successfully_xpath","Cover photo set successfully");

    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC015()
    {
    	logger = report.createTest("ContentSet_TC015");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("img1_cover1_xpath");
  		clickElement("select_as_cover_xpath");
  		try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/div/div/div/div[2]/div/span[1]")));
		       System.out.println("Element is clickable");
		     }
		catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		    }
		quiteBrowser();    	
    }
    //@Test
    public void ContentSet_TC016()
    {
        logger = report.createTest("ContentSet_TC016");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("remove_contentSet_btn_xpath");
  	
		quiteBrowser();    	

    }
    //@Test
    public void ContentSet_TC019()
    {
        logger = report.createTest("ContentSet_TC019");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (1).jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\images (2).jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
    	clickElement("next_step_content_set_xpath");
    	verifyMessage("msg_all_contentSet_must_have_a_cover_photo_xpath","All content sets must have a cover photo selected.");
  		quiteBrowser();    	

    }
    //@Test
    public void ContentSet_TC021()
    {

    	logger = report.createTest("ContentSet_TC021");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		verifyMessage("msg_cover_photo_set_successfully_xpath","Cover photo set successfully");
        quiteBrowser();    	

    }
    //@Test
    public void ContentSet_TC022()
    {
        logger = report.createTest("ContentSet_TC022");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		verifyMessage("msg_new_content_set_created_xpath","New content set created successfully");
  		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC023()
    {

    	logger = report.createTest("ContentSet_TC023");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("remove_contentSet_btn_xpath");
  		quiteBrowser();
    	
    }
    //@Test
    public void ContentSet_TC024()
    {
        logger = report.createTest("ContentSet_TC024");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		WebElement inputTextElement = driver.findElement(By.xpath("//*[@id=\"contained-button-file\"]"));
  		String uploadTextFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\WildlifeText.txt";
  		inputTextElement.sendKeys(uploadTextFilePath);
  		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC025()
    {
        logger = report.createTest("ContentSet_TC025");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		WebElement inputAudioElement = driver.findElement(By.xpath("//*[@id=\"contained-button-audio-file\"]"));
  		String uploadAudioFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\WildlifeText.mp3";
  		inputAudioElement.sendKeys(uploadAudioFilePath);
  		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC026()
    {
        logger = report.createTest("ContentSet_TC026");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try {
			Thread.sleep(5000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		WebElement inputTextElement = driver.findElement(By.xpath("//*[@id=\"contained-button-file\"]"));
  		String uploadTextFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\WildlifeText.txt";
  		inputTextElement.sendKeys(uploadTextFilePath);
  		verifyMessage("msg_article_uploaded_xpath","Article uploaded successfully");
  		quiteBrowser();

    }
    //@Test
    public void ContentSet_TC027()
    {
    	logger = report.createTest("ContentSet_TC027");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try {
 			Thread.sleep(5000);
 		} catch (InterruptedException e1) {
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		WebElement inputAudioElement = driver.findElement(By.xpath("//*[@id=\"contained-button-audio-file\"]"));
   		String uploadAudioFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\WildlifeText.mp3";
   		inputAudioElement.sendKeys(uploadAudioFilePath);
   		verifyMessage("msg_audio_uploaded_xpath","Audio file uploaded successfully");
   		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC028()
    {
    	    logger = report.createTest("ContentSet_TC028");
    		
    		invokeBrowser("Chrome");
    		openApplicationURL("websiteURL");
    		clickElement("sign_in_Button_xpath");
    		enterText("textBox_Email_xpath","userTest88@gmail.com");
    		enterText("textBox_Password_xpath","userTest!88");
    		clickElement("buttion_Sign_In_Form_xpath");
    		clickElement("myprofile_button_xpath");
    		clickElement("contentUpload_xpath");
    		clickElement("addMore_btn_xpath");
    		clickElement("radio_btn_Content_set_xpath");	
    		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
    		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
    		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
    		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
    		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
    		try 
    		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
    		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
    		clickElement("next_step_content_set_xpath");
    		clickElement("img1_manageContent_xpath");
    		clickElement("img2_manageContent_xpath");
    		clickElement("img3_manageContent_xpath");
    		clickElement("add_to_set_btn_xpath");
    		clickElement("img_cover_xpath");
    		clickElement("select_as_cover_xpath");
    		clickElement("next_step_content_set_xpath");
    		WebElement inputAudioElement = driver.findElement(By.xpath("//*[@id=\"contained-button-audio-file\"]"));
    		String uploadAudioFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\WildlifeText.mp3";
    		inputAudioElement.sendKeys(uploadAudioFilePath);
    		clickElement("cancel_btn_audio_file_xpath");
    		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC029()
    {
    	logger = report.createTest("ContentSet_TC028");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");	
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try 
		{
			Thread.sleep(5000);
		    } catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		clickElement("next_step_content_set_xpath");
		clickElement("img1_manageContent_xpath");
		clickElement("img2_manageContent_xpath");
		clickElement("img3_manageContent_xpath");
		clickElement("add_to_set_btn_xpath");
		clickElement("img_cover_xpath");
		clickElement("select_as_cover_xpath");
		clickElement("next_step_content_set_xpath");
		WebElement inputAudioElement = driver.findElement(By.xpath("//*[@id=\"contained-button-audio-file\"]"));
		String uploadAudioFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\WildlifeText.mp3";
		inputAudioElement.sendKeys(uploadAudioFilePath);
		/*try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		clickElement("cancel_btn_audio_file_xpath");
		verifyMessage("msg_audio_removed_xpath","Audio file removed successfully");
		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC030()
    {
        logger = report.createTest("ContentSet_TC030");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");	
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try 
		{
			Thread.sleep(5000);
		    } catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		    }
		clickElement("next_step_content_set_xpath");
		clickElement("img1_manageContent_xpath");
		clickElement("img2_manageContent_xpath");
		clickElement("img3_manageContent_xpath");
		clickElement("add_to_set_btn_xpath");
		clickElement("img_cover_xpath");
		clickElement("select_as_cover_xpath");
		clickElement("next_step_content_set_xpath");
    	clickElement("back_btn_xpath");
    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC031()
    {
        logger = report.createTest("ContentSet_TC031");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		    } catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		    }
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
 		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC032()
    {
        logger = report.createTest("ContentSet_TC032");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		    } catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		    }
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
    	clickElement("bold_btn_xpath");
    	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC033()
    {
    	logger = report.createTest("ContentSet_TC033");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
     	clickElement("italic_btn_xpath");
     	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
     	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC034() 
    {
        logger = report.createTest("ContentSet_TC034");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
     	clickElement("underline_btn_xpath");
     	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
     	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC035()
    {
        logger = report.createTest("ContentSet_TC035");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
     	clickElement("list_xpath");
     	clickElement("undo_btn_xpath");
     	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
     	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC036()
    {
        logger = report.createTest("ContentSet_TC036");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
     	clickElement("list_xpath");
     	clickElement("undo_btn_xpath");
    	clickElement("redo_btn_xpath");
    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC037()
    {
    	logger = report.createTest("ContentSet_TC037");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try 
   		{
   			Thread.sleep(5000);
   		    } catch (InterruptedException e1) 
   		{
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		    }
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
      	clickElement("subscript_btn_xpath");
      	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
      	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC038()
    {
        logger = report.createTest("ContentSet_TC038");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try 
   		{
   			Thread.sleep(5000);
   		    } catch (InterruptedException e1) 
   		{
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		    }
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
      	clickElement("superscript_btn_xpath");
      	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
      	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC039()
    {
    	    logger = report.createTest("ContentSet_TC039");
    		
    		invokeBrowser("Chrome");
    		openApplicationURL("websiteURL");
    		clickElement("sign_in_Button_xpath");
    		enterText("textBox_Email_xpath","userTest88@gmail.com");
    		enterText("textBox_Password_xpath","userTest!88");
    		clickElement("buttion_Sign_In_Form_xpath");
    		clickElement("myprofile_button_xpath");
    		clickElement("contentUpload_xpath");
    		clickElement("addMore_btn_xpath");
    		clickElement("radio_btn_Content_set_xpath");	
    		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
    		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
    		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
    		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
    		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
    		try 
    		{
    			Thread.sleep(5000);
    		    } catch (InterruptedException e1) 
    		{
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		    }
    		clickElement("next_step_content_set_xpath");
    		clickElement("img1_manageContent_xpath");
    		clickElement("img2_manageContent_xpath");
    		clickElement("img3_manageContent_xpath");
    		clickElement("add_to_set_btn_xpath");
    		clickElement("img_cover_xpath");
    		clickElement("select_as_cover_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("list1_xpath");
    		clickElement("link_btn_xpath");
    		enterText("textBox_URL_Link_xpath","https://en.wikipedia.org/wiki/Wildlife");
    		clickElement("checkBox_open_in_new_windox_xpath");
    		clickElement("submit_btn_xpath");
    		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC040()
    {
        logger = report.createTest("ContentSet_TC040");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		    } catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		    }
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
    	clickElement("list2_xpath");
    	clickElement("preview_btn_xpath");
    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC041()
    {
        logger = report.createTest("ContentSet_TC041");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species");
     	clickElement("list_xpath");
     	clickElement("strike_btn_xpath");
     	enterText("text_field_xpath"," but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
     	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC042()
    {
        logger = report.createTest("ContentSet_TC042");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
     	clickElement("list1_xpath");
     	clickElement("table_btn_xpath");
     	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC043()
    {
    	 
    	logger = report.createTest("ContentSet_TC043");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("list2_xpath");
  		clickElement("fullscreen_btn_xpath");
  		enterText("text_field_xpath","Wildlife traditionally refers to undomesticated animal species but has come to include all organisms that grow or live wild in an area without being introduced by humans.");
  		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC044()
    {
        logger = report.createTest("ContentSet_TC044");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC045()
    {
        logger = report.createTest("ContentSet_TC045");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
  		WebElement inputBox = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[3]/div[2]/div/div/div/div[1]/div/div[1]/div/div/input"));
  		String textInsideInputBox = inputBox.getAttribute("value");

  		// Check whether input field is blank
  		if(textInsideInputBox.isEmpty())
  		{
  		   Assert.fail("The object name field is empty");
  		} else 
  		{
  			Assert.assertTrue(true, "The object name field is not empty");
  		}
  		quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC046()
    {
        logger = report.createTest("ContentSet_TC046");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
    	clickElement("edit_keywords_btn_xpath");
    	enterText("textBox_keyword_xpath","giraffa");
    	clickElement("save_changes_btn_xpath");
    	clickElement("add_keyword_xpath");
    	quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC047()
    {
        logger = report.createTest("ContentSet_TC047");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
    	clickElement("edit_keywords_btn_xpath");
    	enterText("textBox_keyword_xpath","giraff");
    	clickElement("save_changes_btn_xpath");
    	clickElement("edit_keywords_btn_xpath");
    	enterText("textBox_keyword_xpath","a");
    	clickElement("save_changes_btn_xpath");
    	clickElement("add_keyword_xpath");
    	quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC048()
    {
        logger = report.createTest("ContentSet_TC048");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
    	clickElement("edit_keywords_btn_xpath");
    	enterText("textBox_keyword_xpath","a");
    	try {
		       new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[1]/div[2]/div/div/div/div[2]/button[2]")));
		       System.out.println("Element is clickable");
		     }
		     catch(TimeoutException e) {
		       System.out.println("Element isn't clickable");
		     }
    	quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC049()
    {
        logger = report.createTest("ContentSet_TC049");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		    } catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		    }
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
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
	   verifyMessage("changes_saved_succesfully_msg_xpath","Changes saved successfully");			

	   quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC050()
    {
    	logger = report.createTest("ContentSet_TC050");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try 
   		{
   			Thread.sleep(5000);
   		    } catch (InterruptedException e1) 
   		{
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		    }
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("img_step4_xpath");
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
 	   verifyMessage("msg_changes_saved_succesfully_xpath","Changes saved successfully");			
       quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC051()
    {
        logger = report.createTest("ContentSet_TC051");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try 
   		{
   			Thread.sleep(5000);
   		    } catch (InterruptedException e1) 
   		{
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		    }
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("img_step4_xpath");
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
	   clickElement("complete_btn_xpath");
	   verifyMessage("msg_at_least_one_channel_navigation_must_be_selected_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
	   quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC052()
    {
        logger = report.createTest("ContentSet_TC052");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try 
   		{
   			Thread.sleep(5000);
   		    } catch (InterruptedException e1) 
   		{
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		    }
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("img_step4_xpath");
   	    clickElement("complete_btn_xpath");
	    verifyMessage("msg_at_least_one_channel_navigation_must_be_selected_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
	    quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC053()
    {
    	    logger = report.createTest("ContentSet_TC053");
    		
    		invokeBrowser("Chrome");
    		openApplicationURL("websiteURL");
    		clickElement("sign_in_Button_xpath");
    		enterText("textBox_Email_xpath","userTest88@gmail.com");
    		enterText("textBox_Password_xpath","userTest!88");
    		clickElement("buttion_Sign_In_Form_xpath");
    		clickElement("myprofile_button_xpath");
    		clickElement("contentUpload_xpath");
    		clickElement("addMore_btn_xpath");
    		clickElement("radio_btn_Content_set_xpath");	
    		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
    		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
    		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
    		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
    		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
    		try 
    		{
    			Thread.sleep(5000);
    		    } catch (InterruptedException e1) 
    		{
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		    }
    		clickElement("next_step_content_set_xpath");
    		clickElement("img1_manageContent_xpath");
    		clickElement("img2_manageContent_xpath");
    		clickElement("img3_manageContent_xpath");
    		clickElement("add_to_set_btn_xpath");
    		clickElement("img_cover_xpath");
    		clickElement("select_as_cover_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("img_step4_xpath");
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
    		clickElement("complete_button_xpath");
    		verifyMessage("msg_at_least_one_channel_navigation_must_be_selected_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
    		quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC054() 
    {
    	logger = report.createTest("ContentSet_TC054");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");	
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickElement("next_step_content_set_xpath");
		clickElement("img1_manageContent_xpath");
		clickElement("img2_manageContent_xpath");
		clickElement("img3_manageContent_xpath");
		clickElement("add_to_set_btn_xpath");
		clickElement("img_cover_xpath");
		clickElement("select_as_cover_xpath");
		clickElement("next_step_content_set_xpath");
		clickElement("next_step_content_set_xpath");
		clickElement("img_step4_xpath");
		clickElement("edit_btn_category_xpath");
		
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
	   clickElement("thread_drop_down_contentSet_xpath");
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
	   verifyMessage("msg_changes_saved_succesfully_xpath","Changes saved successfully");
	   quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC055()
    {
        logger = report.createTest("ContentSet_TC055");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");	
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickElement("next_step_content_set_xpath");
		clickElement("img1_manageContent_xpath");
		clickElement("img2_manageContent_xpath");
		clickElement("img3_manageContent_xpath");
		clickElement("add_to_set_btn_xpath");
		clickElement("img_cover_xpath");
		clickElement("select_as_cover_xpath");
		clickElement("next_step_content_set_xpath");
		clickElement("next_step_content_set_xpath");
		clickElement("img_step4_xpath");
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
		    
			if(text.equalsIgnoreCase("Travel"))
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
		    
			if(text.equalsIgnoreCase("Discovery"))
		    {
		        
				allelements5.get(i).click();
		        break;
		    } 
		 }
		 clickElement("addToAnother_xpath");
		 verifyMessage("msg_same_thread_is_selected_multiple_times_xpath","Same thread is selected multiple times");
		 quiteBrowser();	 
    }
    //@Test
    public void ContentSet_TC056()
    {
        logger = report.createTest("ContentSet_TC056");
		
		invokeBrowser("Chrome");
		openApplicationURL("websiteURL");
		clickElement("sign_in_Button_xpath");
		enterText("textBox_Email_xpath","userTest88@gmail.com");
		enterText("textBox_Password_xpath","userTest!88");
		clickElement("buttion_Sign_In_Form_xpath");
		clickElement("myprofile_button_xpath");
		clickElement("contentUpload_xpath");
		clickElement("addMore_btn_xpath");
		clickElement("radio_btn_Content_set_xpath");	
		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
		try 
		{
			Thread.sleep(5000);
		} catch (InterruptedException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		clickElement("next_step_content_set_xpath");
		clickElement("img1_manageContent_xpath");
		clickElement("img2_manageContent_xpath");
		clickElement("img3_manageContent_xpath");
		clickElement("add_to_set_btn_xpath");
		clickElement("img_cover_xpath");
		clickElement("select_as_cover_xpath");
		clickElement("next_step_content_set_xpath");
		clickElement("next_step_content_set_xpath");
		clickElement("img_step4_xpath");
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
	    verifyMessage("msg_changes_saved_succesfully_xpath","Changes saved successfully");	  
	    quiteBrowser();	 
    }
    //@Test
    public void ContentSet_TC057()
    {
    	logger = report.createTest("ContentSet_TC057");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		} catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("img_step4_xpath");
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
		clickElement("saveChanges_category_xpath");
	    verifyMessage("msg_changes_saved_succesfully_xpath","Changes saved successfully");	  
	    quiteBrowser();	 
    }
    //@Test
    public void ContentSet_TC058()
    {
        logger = report.createTest("ContentSet_TC058");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		} catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("img_step4_xpath");
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
	   clickElement("complete_btn_xpath");
	   quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC059()
    {
        logger = report.createTest("ContentSet_TC059");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		} catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("img_step4_xpath");
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
   	    clickElement("complete_btn_xpath");
	    quiteBrowser();	
		  
    }
    //@Test
    public void ContentSet_TC060()
    {
    	logger = report.createTest("ContentSet_TC060");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		} catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
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
			    
				if(text.equalsIgnoreCase("safaris"))
			    {
			        
					allelements8.get(i).click();
			        break;
			    } 
			 }
	         clickElement("addToAnother_xpath");  
			 clickElement("saveChanges_category_xpath");
		   	 clickElement("complete_btn_xpath");
			 quiteBrowser();	
    } 
    //@Test
    public void ContentSet_TC061()
    {
    	logger = report.createTest("ContentSet_TC061");
   		
   		invokeBrowser("Chrome");
   		openApplicationURL("websiteURL");
   		clickElement("sign_in_Button_xpath");
   		enterText("textBox_Email_xpath","userTest88@gmail.com");
   		enterText("textBox_Password_xpath","userTest!88");
   		clickElement("buttion_Sign_In_Form_xpath");
   		clickElement("myprofile_button_xpath");
   		clickElement("contentUpload_xpath");
   		clickElement("addMore_btn_xpath");
   		clickElement("radio_btn_Content_set_xpath");	
   		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
   		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
   		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
   		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
   		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
   		try 
   		{
   			Thread.sleep(5000);
   		} catch (InterruptedException e1) 
   		{
   			// TODO Auto-generated catch block
   			e1.printStackTrace();
   		}
   		clickElement("next_step_content_set_xpath");
   		clickElement("img1_manageContent_xpath");
   		clickElement("img2_manageContent_xpath");
   		clickElement("img3_manageContent_xpath");
   		clickElement("add_to_set_btn_xpath");
   		clickElement("img_cover_xpath");
   		clickElement("select_as_cover_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("next_step_content_set_xpath");
   		clickElement("img_step4_xpath");
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
	   clickElement("delete_btn_navigation_xpath");
	   quiteBrowser();
    }
    //@Test
    public void ContentSet_TC062()
    {
    	    logger = report.createTest("ContentSet_TC062");
    		
    		invokeBrowser("Chrome");
    		openApplicationURL("websiteURL");
    		clickElement("sign_in_Button_xpath");
    		enterText("textBox_Email_xpath","userTest88@gmail.com");
    		enterText("textBox_Password_xpath","userTest!88");
    		clickElement("buttion_Sign_In_Form_xpath");
    		clickElement("myprofile_button_xpath");
    		clickElement("contentUpload_xpath");
    		clickElement("addMore_btn_xpath");
    		clickElement("radio_btn_Content_set_xpath");	
    		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
    		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
    		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
    		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
    		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
    		try 
    		{
    			Thread.sleep(5000);
    		} catch (InterruptedException e1) 
    		{
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
    		clickElement("next_step_content_set_xpath");
    		clickElement("img1_manageContent_xpath");
    		clickElement("img2_manageContent_xpath");
    		clickElement("img3_manageContent_xpath");
    		clickElement("add_to_set_btn_xpath");
    		clickElement("img_cover_xpath");
    		clickElement("select_as_cover_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("img_step4_xpath");
    		try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		JavascriptExecutor js = (JavascriptExecutor) driver;       		
            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[4]/div[2]/div/div/div/div[2]/button"));	
            js.executeScript("arguments[0].scrollIntoView();", Element);
    		clickElement("apply_to_set_btn_xpath");
    		verifyMessage("msg_changes_applied_to_whole_content_set_successfully_xpath","Changes applied to whole content set successfully");	 
    		try {
				Thread.sleep(7000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC063()
    {
    	logger = report.createTest("ContentSet_TC063");
 		
 		invokeBrowser("Chrome");
 		openApplicationURL("websiteURL");
 		clickElement("sign_in_Button_xpath");
 		enterText("textBox_Email_xpath","userTest88@gmail.com");
 		enterText("textBox_Password_xpath","userTest!88");
 		clickElement("buttion_Sign_In_Form_xpath");
 		clickElement("myprofile_button_xpath");
 		clickElement("contentUpload_xpath");
 		clickElement("addMore_btn_xpath");
 		clickElement("radio_btn_Content_set_xpath");	
 		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
 		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
 		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
 		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
 		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
 		try 
 		{
 			Thread.sleep(5000);
 		} catch (InterruptedException e1) 
 		{
 			// TODO Auto-generated catch block
 			e1.printStackTrace();
 		}
 		clickElement("next_step_content_set_xpath");
 		clickElement("img1_manageContent_xpath");
 		clickElement("img2_manageContent_xpath");
 		clickElement("img3_manageContent_xpath");
 		clickElement("add_to_set_btn_xpath");
 		clickElement("img_cover_xpath");
 		clickElement("select_as_cover_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("next_step_content_set_xpath");
 		clickElement("img_step4_xpath");
		clickElement("edit_main_info_xpath");
		enterText("textBox_object_name_xpath","  Image1");
		clickElement("save_changes_main_info_xpath"); 
		verifyMessage("msg_changes_saved_succesfully_xpath","Changes saved successfully");
		quiteBrowser();
    }
    //@Test
    public void ContentSet_TC064()
    {
    	    logger = report.createTest("ContentSet_TC064");
    		
    		invokeBrowser("Chrome");
    		openApplicationURL("websiteURL");
    		clickElement("sign_in_Button_xpath");
    		enterText("textBox_Email_xpath","userTest88@gmail.com");
    		enterText("textBox_Password_xpath","userTest!88");
    		clickElement("buttion_Sign_In_Form_xpath");
    		clickElement("myprofile_button_xpath");
    		clickElement("contentUpload_xpath");
    		clickElement("addMore_btn_xpath");
    		clickElement("radio_btn_Content_set_xpath");	
    		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
    		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
    		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
    		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
    		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
    		try 
    		{
    			Thread.sleep(5000);
    		} catch (InterruptedException e1) 
    		{
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
    		clickElement("next_step_content_set_xpath");
    		clickElement("img1_manageContent_xpath");
    		clickElement("img2_manageContent_xpath");
    		clickElement("img3_manageContent_xpath");
    		clickElement("add_to_set_btn_xpath");
    		clickElement("img_cover_xpath");
    		clickElement("select_as_cover_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("img_step4_xpath");
    		clickElement("edit_btn_category_xpath");
      	    clickElement("channel_drop_down_xpath");
      	    quiteBrowser();
    }
    //@Test
    public void ContentSet_TC065()
    {
    	logger = report.createTest("ContentSet_TC065");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		} catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
  		clickElement("edit_btn_category_xpath");
    	isElementPresent("title_drop_down_contentSet_xpath");
    	quiteBrowser();
    }
    //@Test
    public void ContentSet_TC066()
    {
        logger = report.createTest("ContentSet_TC066");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		} catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
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
    public void ContentSet_TC067()
    {
    	    logger = report.createTest("ContentSet_TC067");
    		
    		invokeBrowser("Chrome");
    		openApplicationURL("websiteURL");
    		clickElement("sign_in_Button_xpath");
    		enterText("textBox_Email_xpath","userTest88@gmail.com");
    		enterText("textBox_Password_xpath","userTest!88");
    		clickElement("buttion_Sign_In_Form_xpath");
    		clickElement("myprofile_button_xpath");
    		clickElement("contentUpload_xpath");
    		clickElement("addMore_btn_xpath");
    		clickElement("radio_btn_Content_set_xpath");	
    		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
    		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
    		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
    		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
    		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
    		try 
    		{
    			Thread.sleep(5000);
    		} catch (InterruptedException e1) 
    		{
    			// TODO Auto-generated catch block
    			e1.printStackTrace();
    		}
    		clickElement("next_step_content_set_xpath");
    		clickElement("img1_manageContent_xpath");
    		clickElement("img2_manageContent_xpath");
    		clickElement("img3_manageContent_xpath");
    		clickElement("add_to_set_btn_xpath");
    		clickElement("img_cover_xpath");
    		clickElement("select_as_cover_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("next_step_content_set_xpath");
    		clickElement("img_step4_xpath");
    	    clickElement("edit_location_xpath");
		    clickElement("save_changes_location_xpath");
		    quiteBrowser();	
    }
    //@Test
    public void ContentSet_TC068()
    {
    	 logger = report.createTest("ContentSet_TC068");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","userTest88@gmail.com");
  		enterText("textBox_Password_xpath","userTest!88");
  		clickElement("buttion_Sign_In_Form_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		clickElement("addMore_btn_xpath");
  		clickElement("radio_btn_Content_set_xpath");	
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\Medium_WW2108818.jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\David-Attenboroughs-A-Life-On-Our-Planet-scaled.jpg";
  		String uploadFilePath3 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\wildlife\\merlin_153106794_64344be1-aacf-42d3-8d2e-4e5bd65e06d6-superJumbo.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2 + "\n " + uploadFilePath3);
  		try 
  		{
  			Thread.sleep(5000);
  		} catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		}
  		clickElement("next_step_content_set_xpath");
  		clickElement("img1_manageContent_xpath");
  		clickElement("img2_manageContent_xpath");
  		clickElement("img3_manageContent_xpath");
  		clickElement("add_to_set_btn_xpath");
  		clickElement("img_cover_xpath");
  		clickElement("select_as_cover_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("next_step_content_set_xpath");
  		clickElement("img_step4_xpath");
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
 	   clickElement("complete_btn_xpath");
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
