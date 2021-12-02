package com.worldillustrated.TestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;
import com.worldillustrated.utils.TestDataProvider;

public class ContentUploadFlowWaitingListTest extends BaseUI 
{

    @Test
	public void contentUpload()
	{
        logger = report.createTest("contentUpload");
  		
  		invokeBrowser("Chrome");
  		openApplicationURL("websiteURL");
  		clickElement("sign_in_Button_xpath");
  		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
  		enterText("textBox_Password_xpath","simonaD10!");
  		clickElement("sign_in_btn_xpath");
  		clickElement("myprofile_button_xpath");
  		clickElement("contentUpload_xpath");
  		 try {
				Thread.sleep(30000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
  	    
  		clickElement("addmore_btn_xpath");
  		try 
  		{
  			Thread.sleep(5000);
  		} catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		}
  		WebElement inputElement = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[1]/div/label/input"));
  		String uploadFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\B576_254714_0058 - Copy (2).jpg";
  		String uploadFilePath2 = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\Food _ Drink\\BIGFISH_B434_275804_0230 - Copy.jpg";
  		inputElement.sendKeys(uploadFilePath + "\n " + uploadFilePath2); 
  		
  		try 
  		{
  			Thread.sleep(5000);
  		} catch (InterruptedException e1) 
  		{
  			// TODO Auto-generated catch block
  			e1.printStackTrace();
  		} 
  		clickElement("btn_next_step_xpath");
  		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
  		clickElement("img1_xpath");
  		clickElement("img2_xpath");
  		
  		WebElement element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div[2]/div/div[2]/span[2]/span[1]"));
  		Actions actions = new Actions(driver);
  		actions.moveToElement(element).click().build().perform();
  	
  		clickElement("cover_img_xpath"); 
  		clickElement("select_as_cover_btn_xpath");
  		WebElement element1 = driver.findElement(By.xpath("//*[@id=\"category-image-set\"]/div[1]/label/div/div/div"));
  		Actions actions1 = new Actions(driver);
  		actions1.moveToElement(element1);
  		actions1.click();
  		actions1.sendKeys("Drink and Food");
  		actions1.build().perform();
  		clickElement("btn_next_step_xpath");
  		clickElement("btn_next_step_xpath");
  		
  		clickElement("img_step_xpath");
  	
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

	    clickElement("drop_down_subchannel_xpath");
		List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

		  for(int i=0; i< allelements1.size(); i++)
		  {
		  
			String text=allelements1.get(i).getText();
		    
			if(text.equalsIgnoreCase("Travel styles"))
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
		    
			if(text.equalsIgnoreCase("City travel"))
		    {
		        
				allelements2.get(i).click();
		        break;
		    } 
		 }     
	   clickElement("add_to_another_xpath");
	   clickElement("save_changes_xpath");
       clickElement("apply_to_set_xpath");
		   	 try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		clickElement("cmp_btn_xpath");
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
         quiteBrowser();	
	}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC001()
	{
    	 logger = report.createTest("WaitingList_TC001");
	  		
	  	invokeBrowser("Chrome");
	   	openApplicationURL("websiteURLAdmin");
		enterText("email_admin_xpath","sdimitrovska1@astea.net");
		enterText("password_admin_xpath","Test123!");
		clickElement("sign_in_btn_admin_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("stock_content_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("upload_date_sort_xpath");
		quiteBrowser();
	}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC002()
	{
    	 logger = report.createTest("WaitingList_TC002");
	  		
	  	invokeBrowser("Chrome");
	   	openApplicationURL("websiteURLAdmin");
		enterText("email_admin_xpath","sdimitrovska1@astea.net");
		enterText("password_admin_xpath","Test123!");
		clickElement("sign_in_btn_admin_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("stock_content_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("contributor_type_xpath");
		quiteBrowser();
	}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC003()
	{
    	 logger = report.createTest("WaitingList_TC003");
	  		
	  	invokeBrowser("Chrome");
	   	openApplicationURL("websiteURLAdmin");
		enterText("email_admin_xpath","sdimitrovska1@astea.net");
		enterText("password_admin_xpath","Test123!");
		clickElement("sign_in_btn_admin_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("stock_content_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("contributor_username_xpath");
		quiteBrowser();
	}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC004()
	{
    	 logger = report.createTest("WaitingList_TC004");
	  		
	  	invokeBrowser("Chrome");
	   	openApplicationURL("websiteURLAdmin");
		enterText("email_admin_xpath","sdimitrovska1@astea.net");
		enterText("password_admin_xpath","Test123!");
		clickElement("sign_in_btn_admin_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("stock_content_xpath");
		try {
			Thread.sleep(50000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("headline_title_xpath");
		quiteBrowser();
	}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC005()
	{
	        logger = report.createTest("WaitingList_TC005");
		  		
		  	invokeBrowser("Chrome");
		   	openApplicationURL("websiteURLAdmin");
			enterText("email_admin_xpath","sdimitrovska1@astea.net");
			enterText("password_admin_xpath","Test123!");
			clickElement("sign_in_btn_admin_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("stock_content_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("navigation_xpath");
			quiteBrowser();
		}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC006()
	{
	        logger = report.createTest("WaitingList_TC006");
		  		
		  	invokeBrowser("Chrome");
		   	openApplicationURL("websiteURLAdmin");
			enterText("email_admin_xpath","sdimitrovska1@astea.net");
			enterText("password_admin_xpath","Test123!");
			clickElement("sign_in_btn_admin_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("stock_content_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("contributor_name_xpath");
			quiteBrowser();
		}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC007()
	{
	        logger = report.createTest("WaitingList_TC007");
		  		
		  	invokeBrowser("Chrome");
		   	openApplicationURL("websiteURLAdmin");
			enterText("email_admin_xpath","sdimitrovska1@astea.net");
			enterText("password_admin_xpath","Test123!");
			clickElement("sign_in_btn_admin_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("stock_content_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("code_sort_xpath");
			quiteBrowser();
		}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC008()
	{
	        logger = report.createTest("WaitingList_TC008");
		  		
		  	invokeBrowser("Chrome");
		   	openApplicationURL("websiteURLAdmin");
			enterText("email_admin_xpath","sdimitrovska1@astea.net");
			enterText("password_admin_xpath","Test123!");
			clickElement("sign_in_btn_admin_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("stock_content_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("type_sort_xpath");
			quiteBrowser();
		}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC009()
	{
	        logger = report.createTest("WaitingList_TC009");
		  		
		  	invokeBrowser("Chrome");
		   	openApplicationURL("websiteURLAdmin");
			enterText("email_admin_xpath","sdimitrovska1@astea.net");
			enterText("password_admin_xpath","Test123!");
			clickElement("sign_in_btn_admin_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("stock_content_xpath");
			try {
				Thread.sleep(50000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("search_btn_xpath");
			enterText("search_text_box_xpath","music");
			WebElement element= driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-2\"]/td[4]/div"));
			Assert.assertEquals(element.getText(),"music");
			quiteBrowser();
		}
    @Test(dependsOnMethods = { "contentUpload" })
	public void WaitingList_TC010()
	{
	        logger = report.createTest("WaitingList_TC010");
		  		
		  	invokeBrowser("Chrome");
		   	openApplicationURL("websiteURLAdmin");
			enterText("email_admin_xpath","sdimitrovska1@astea.net");
			enterText("password_admin_xpath","Test123!");
			clickElement("sign_in_btn_admin_xpath");
			clickElement("fast_moving_search_btn_xpath");
			enterText("fast_moving_text_box_xpath","WI_5_1744_image");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			WebElement element= driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-1\"]/td[3]/div"));
			Assert.assertEquals(element.getText(),"WI_5_1744_image");
			quiteBrowser();
		}
        @Test(dependsOnMethods = { "contentUpload" })
		public void WaitingList_TC011()
		{
		        logger = report.createTest("WaitingList_TC011");
			  		
			  	invokeBrowser("Chrome");
			   	openApplicationURL("websiteURLAdmin");
				enterText("email_admin_xpath","sdimitrovska1@astea.net");
				enterText("password_admin_xpath","Test123!");
				clickElement("sign_in_btn_admin_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("stock_content_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("edit_btn_stock_content_xpath");
				clickElement("edit_category_xpath");
				clickElement("channel_drop_down_xpath");
				
				List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

				  for(int i=0; i < allelements.size(); i++)
				  {
				  
					String text=allelements.get(i).getText();
				    
					if(text.equalsIgnoreCase("Community"))
				    {
				        
						allelements.get(i).click();
				        break;
				    } 
				 }     

			    clickElement("drop_down_subchannel_xpath");
				List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

				  for(int i=0; i < allelements1.size(); i++)
				  {
				  
					String text=allelements1.get(i).getText();
				    
					if(text.equalsIgnoreCase("Firefighters"))
				    {
				        
						allelements1.get(i).click();
				        break;
				    } 
				 }     
				 clickElement("save_changes_category_xpath");
				 verifyMessage("changes_saved_successfully_xpath","Changes saved successfully");
				 quiteBrowser();
			}
        @Test(dependsOnMethods = { "contentUpload" })
		public void WaitingList_TC012()
		{
		        logger = report.createTest("WaitingList_TC012");
			  		
			  	invokeBrowser("Chrome");
			   	openApplicationURL("websiteURLAdmin");
				enterText("email_admin_xpath","sdimitrovska1@astea.net");
				enterText("password_admin_xpath","Test123!");
				clickElement("sign_in_btn_admin_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("stock_content_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("edit_btn_stock_content_xpath");
				clickElement("edit_category_xpath");
				clickElement("channel_drop_down_xpath");
				
				List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

				  for(int i=0; i < allelements.size(); i++)
				  {
				  
					String text=allelements.get(i).getText();
				    
					if(text.equalsIgnoreCase("Community"))
				    {
				        
						allelements.get(i).click();
				        break;
				    } 
				 }     

			    clickElement("drop_down_subchannel_xpath");
				List <WebElement> allelements1 = driver.findElements(By.xpath("//*[@id=\"menu-subchannel\"]/div[3]/ul/li"));

				  for(int i=0; i < allelements1.size(); i++)
				  {
				  
					String text=allelements1.get(i).getText();
				    
					if(text.equalsIgnoreCase("Firefighters"))
				    {
				        
						allelements1.get(i).click();
				        break;
				    } 
				 }     
				 clickElement("save_changes_category_xpath");
				 verifyMessage("changes_saved_successfully_xpath","Changes saved successfully");
				 clickElement("confirm_and_publish_xpath");
				 quiteBrowser();
		}
        @Test(dependsOnMethods = { "contentUpload" })
		public void WaitingList_TC013()
		{
		        logger = report.createTest("WaitingList_TC013");
			  		
			  	invokeBrowser("Chrome");
			   	openApplicationURL("websiteURLAdmin");
				enterText("email_admin_xpath","sdimitrovska1@astea.net");
				enterText("password_admin_xpath","Test123!");
				clickElement("sign_in_btn_admin_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("stock_content_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("view_columns_btn_xpath"); 
				clickElement("checkbox_navigation_xpath"); 
				quiteBrowser();
		}
        @Test(dependsOnMethods = { "contentUpload" })
		public void WaitingList_TC014()
		{
		        logger = report.createTest("WaitingList_TC014");
			  		
			  	invokeBrowser("Chrome");
			   	openApplicationURL("websiteURLAdmin");
				enterText("email_admin_xpath","sdimitrovska1@astea.net");
				enterText("password_admin_xpath","Test123!");
				clickElement("sign_in_btn_admin_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("stock_content_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("filter_table_xpath");
				clickElement("contributor_type_filter_table_xpath");
				clickElement("agency_xpath");
				clickElement("headline_filter_table_xpath");
				clickElement("junior_xpath");
				clickElement("cancel_btn_xpath");
				quiteBrowser();
		}
		@Test
		public void WaitingList_TC015()
		{
		        logger = report.createTest("WaitingList_TC015");
			  		
			  	invokeBrowser("Chrome");
			   	openApplicationURL("websiteURLAdmin");
				enterText("email_admin_xpath","sdimitrovska1@astea.net");
				enterText("password_admin_xpath","Test123!");
				clickElement("sign_in_btn_admin_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("stock_content_xpath");
				try {
					Thread.sleep(50000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("approve_btn_xpath");
				try {
					Thread.sleep(6000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				quiteBrowser();
		}
        @Test(dependsOnMethods = { "contentUpload" })
		public void WaitingList_TC016()
		{
				        logger = report.createTest("WaitingList_TC016");
					  		
					  	invokeBrowser("Chrome");
					   	openApplicationURL("websiteURLAdmin");
						enterText("email_admin_xpath","sdimitrovska1@astea.net");
						enterText("password_admin_xpath","Test123!");
						clickElement("sign_in_btn_admin_xpath");
						try {
							Thread.sleep(50000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						clickElement("stock_content_xpath");
						try {
							Thread.sleep(50000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						clickElement("reject_btn_xpath");
						try {
							Thread.sleep(6000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						quiteBrowser();
				}
        @Test(dependsOnMethods = { "WaitingList_TC015" })
		public void verifyStatus()
		{
        	 logger = report.createTest("verifyStatus");
       		
       		invokeBrowser("Chrome");
       		openApplicationURL("websiteURL");
       		clickElement("sign_in_Button_xpath");
       		enterText("textBox_Email_xpath","sdimitrovska@astea.net");
       		enterText("textBox_Password_xpath","simonaD10!");
       		clickElement("sign_in_btn_xpath");
       		clickElement("myprofile_button_xpath");
       		clickElement("contentUpload_xpath");
       		 try {
     				Thread.sleep(30000);
     			} catch (InterruptedException e1) {
     				// TODO Auto-generated catch block
     				e1.printStackTrace();
     			}
       		WebElement element= driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-9\"]/td[5]/div/span"));
			Assert.assertEquals(element.getText(),"Published");
		
		}
	@AfterTest
	public void endReport()
	{
		report.flush();
	}
}

