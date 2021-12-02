package com.worldillustrated.TestCases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.worldillustrated.BaseClasses.BaseUI;

public class ContentUploadFTPFlowTest extends BaseUI 
{
	 @Test
	 public void ContentUploadFTPFlow_TC001()
	 {
		 logger = report.createTest("ContentUploadFTPFlow_TC001");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("sign_in_xpath");
		 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		 enterText("textBox_Password_xpath","simonaD10!");
		 clickElement("sign_in_btn_xpath");
		 clickElement("profile_btn_xpath");
		 clickElement("uploadedBtn_xpath");
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 clickElement("addmoreBtn_xpath");
		 clickElement("uploadVia_FTP_xpath");
		 clickElement("next_step_btn_xpath");
		 clickElement("proceed_next_step_xpath");
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 clickElement("next_step_btn_xpath");
		 verifyMessage("message_cover_photo_xpath","All content sets must have a title and cover photo specified.");
		 quiteBrowser();
	
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC002()
	 {
		 logger = report.createTest("ContentUploadFTPFlow_TC002");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("sign_in_xpath");
		 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		 enterText("textBox_Password_xpath","simonaD10!");
		 clickElement("sign_in_btn_xpath");
		 clickElement("profile_btn_xpath");
		 clickElement("uploadedBtn_xpath");
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 clickElement("addmoreBtn_xpath");
		 clickElement("uploadVia_FTP_xpath");
		 clickElement("next_step_btn_xpath");
		 clickElement("proceed_next_step_xpath");
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("expand_xpath");
		clickElement("img_xpath");
		clickElement("select_as_cover_xpath");
		quiteBrowser();
		
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC003()
	 {
		 logger = report.createTest("ContentUploadFTPFlow_TC003");
				
		 invokeBrowser("Chrome");
		 openApplicationURL("websiteURL");
		 clickElement("closeBtn_xpath");
		 clickElement("sign_in_xpath");
		 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
		 enterText("textBox_Password_xpath","simonaD10!");
		 clickElement("sign_in_btn_xpath");
		 clickElement("profile_btn_xpath");
		 clickElement("uploadedBtn_xpath");
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 clickElement("addmoreBtn_xpath");
		 clickElement("uploadVia_FTP_xpath");
		 clickElement("next_step_btn_xpath");
		 clickElement("proceed_next_step_xpath");
		 try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickElement("expand_xpath");
		clickElement("img_xpath");
		clickElement("select_as_cover_xpath");
		clickElement("img1_xpath");
		clickElement("select_as_cover_xpath");
		verifyMessage("message_set_cover_successfully_xpath","Cover photo set successfully");
		quiteBrowser();
	 }
	  @Test
	  public void ContentUploadFTPFlow_TC004()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC004");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
		    clickElement("select_as_cover_xpath");
		    verifyMessage("message_set_cover_successfully_xpath","Cover photo set successfully");
			quiteBrowser();
		 }
	  @Test
	  public void ContentUploadFTPFlow_TC005()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC005");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
		    clickElement("select_as_cover_xpath");
		    clickElement("next_step_btn_xpath");
		    WebElement inputTextElement = driver.findElement(By.xpath("//*[@id=\"contained-button-file\"]"));
	  		String uploadTextFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\famous.txt";
	  		inputTextElement.sendKeys(uploadTextFilePath);
	  		verifyMessage("message_article_uploaded_xpath","Article uploaded successfully");
	  		quiteBrowser();
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC006()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC006");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
		    clickElement("select_as_cover_xpath");
		    clickElement("next_step_btn_xpath");
		    WebElement inputAudioElement = driver.findElement(By.xpath("//*[@id=\"contained-button-audio-file\"]"));
	  		String uploadAudioFilePath = "C:\\Users\\user75\\eclipse-workspace\\worldillustrated\\src\\test\\TestData\\famous.mp3";
	  		inputAudioElement.sendKeys(uploadAudioFilePath);
	  		verifyMessage("message_audio_file_uploaded_xpath","Audio file uploaded successfully");
	  		quiteBrowser();
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC007()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC007");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
		    clickElement("select_as_cover_xpath");
		    clickElement("next_step_btn_xpath");
		    enterText("text_field_xpath","John Christopher Depp II (born June 9, 1963) is an American actor, producer, and musician. He has been nominated for ten Golden Globe Awards, winning one for Best Actor for his performance of the title role in Sweeney Todd: The Demon Barber of Fleet Street (2007), and has been nominated for three Academy Awards for Best Actor, among other accolades.");
	  		quiteBrowser();
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC008()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC008");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
		    clickElement("select_as_cover_xpath");
		    clickElement("next_step_btn_xpath");
		    clickElement("next_step_btn_xpath");
		    clickElement("image_step4_xpath");
		    JavascriptExecutor js = (JavascriptExecutor) driver;       		
            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[3]/div[4]/div[2]/div/div/div/div[2]/button"));	
            js.executeScript("arguments[0].scrollIntoView();", Element);
		    clickElement("apply_to_set_xpath");
		    verifyMessage("message_apply_to_set_xpath","Changes applied to whole content set successfully");
		    quiteBrowser();
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC009()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC009");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(20000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    clickElement("select_as_cover_xpath");
		    clickElement("next_step_btn_xpath");
		    clickElement("next_step_btn_xpath");
		    clickElement("image_step4_xpath");
		    JavascriptExecutor js = (JavascriptExecutor) driver;       		
            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
            js.executeScript("arguments[0].scrollIntoView();", Element);
		    clickElement("edit_category_for_content_set_xpath");
		    clickElement("channel_drop_down_xpath");
			
			List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

			  for(int i=0; i< allelements.size(); i++)
			  {
			  
				String text=allelements.get(i).getText();
			    
				if(text.equalsIgnoreCase("Style"))
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
			    
				if(text.equalsIgnoreCase("Fashion"))
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
			    
				if(text.equalsIgnoreCase("Celebrity style"))
			    {
			        
					allelements2.get(i).click();
			        break;
			    } 
			 }     
		   clickElement("addToAnother_xpath");
		   clickElement("saveChanges_category_xpath");		
		   quiteBrowser();	
	 }
	 @Test
	 public void ContentUploadFTPFlow_TC010()
	 {
			 logger = report.createTest("ContentUploadFTPFlow_TC010");
					
			 invokeBrowser("Chrome");
			 openApplicationURL("websiteURL");
			 clickElement("closeBtn_xpath");
			 clickElement("sign_in_xpath");
			 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
			 enterText("textBox_Password_xpath","simonaD10!");
			 clickElement("sign_in_btn_xpath");
			 clickElement("profile_btn_xpath");
			 clickElement("uploadedBtn_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			 clickElement("addmoreBtn_xpath");
			 clickElement("uploadVia_FTP_xpath");
			 clickElement("next_step_btn_xpath");
			 clickElement("proceed_next_step_xpath");
			 try {
				Thread.sleep(25000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			clickElement("expand_xpath");
			clickElement("img_xpath");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    clickElement("select_as_cover_xpath");
		    clickElement("next_step_btn_xpath");
		    clickElement("next_step_btn_xpath");
		    clickElement("image_step4_xpath");
		    JavascriptExecutor js = (JavascriptExecutor) driver;       		
            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
            js.executeScript("arguments[0].scrollIntoView();", Element);
		    clickElement("edit_category_for_content_set_xpath");
		    clickElement("channel_drop_down_xpath");
			
			List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

			  for(int i=0; i< allelements.size(); i++)
			  {
			  
				String text=allelements.get(i).getText();
			    
				if(text.equalsIgnoreCase("Style"))
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
			    
				if(text.equalsIgnoreCase("Fashion"))
			    {
			        
					allelements1.get(i).click();
			        break;
			    } 
			 }     
			clickElement("addToAnother_xpath");
		    clickElement("saveChanges_category_xpath");		
		    clickElement("complete_btn_xpath");
		    verifyMessage("message_At_least_one_channel_navigation_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
	   	    quiteBrowser();	
	 }
	   @Test
	   public void ContentUploadFTPFlow_TC011()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC011");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    JavascriptExecutor js = (JavascriptExecutor) driver;       		
	            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
	            js.executeScript("arguments[0].scrollIntoView();", Element);
			    clickElement("edit_category_for_content_set_xpath");
			    clickElement("channel_drop_down_xpath");
				
				List <WebElement> allelements = driver.findElements(By.xpath("//*[@id=\"menu-channel\"]/div[3]/ul/li"));

				  for(int i=0; i< allelements.size(); i++)
				  {
				  
					String text=allelements.get(i).getText();
				    
					if(text.equalsIgnoreCase("Style"))
				    {
				        
						allelements.get(i).click();
				        break;
				    } 
				 }     
				clickElement("addToAnother_xpath");
			    clickElement("saveChanges_category_xpath");		
			    clickElement("complete_btn_xpath");
			    verifyMessage("message_At_least_one_channel_navigation_xpath","At least one channel navigation must be selected per image or content set before completing the upload");
		   	    quiteBrowser();	
		 }
	   @Test
	   public void ContentUploadFTPFlow_TC012()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC012");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    JavascriptExecutor js = (JavascriptExecutor) driver;       		
	            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
	            js.executeScript("arguments[0].scrollIntoView();", Element);
			    clickElement("edit_category_for_content_set_xpath");
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
				    
					if(text.equalsIgnoreCase("Italy"))
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
				    
					if(text.equalsIgnoreCase("World"))
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
				    
					if(text.equalsIgnoreCase("Italy"))
				    {
				        
						allelements5.get(i).click();
				        break;
				    } 
				 }
				 clickElement("addToAnother_xpath");
				 verifyMessage("msg_same_thread_is_selected_multiple_times_xpath","Same thread is selected multiple times");
				 quiteBrowser();	 
	   }
	   @Test
	   public void ContentUploadFTPFlow_TC013()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC013");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    JavascriptExecutor js = (JavascriptExecutor) driver;       		
	            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
	            js.executeScript("arguments[0].scrollIntoView();", Element);
			    clickElement("edit_category_for_content_set_xpath");
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
				    
					if(text.equalsIgnoreCase("Italy"))
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
	   @Test
	   public void ContentUploadFTPFlow_TC014()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC014");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    JavascriptExecutor js = (JavascriptExecutor) driver;       		
	            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
	            js.executeScript("arguments[0].scrollIntoView();", Element);
			    clickElement("edit_category_for_content_set_xpath");
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
				    
					if(text.equalsIgnoreCase("Italy"))
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
				    
					if(text.equalsIgnoreCase("World"))
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
				    
					if(text.equalsIgnoreCase("Austria"))
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
	   @Test
	   public void ContentUploadFTPFlow_TC015()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC015");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    JavascriptExecutor js = (JavascriptExecutor) driver;       		
	            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
	            js.executeScript("arguments[0].scrollIntoView();", Element);
			    clickElement("edit_category_for_content_set_xpath");
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
				    
					if(text.equalsIgnoreCase("Italy"))
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
				    
					if(text.equalsIgnoreCase("Our planet"))
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
					    
						if(text.equalsIgnoreCase("World"))
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
				    
					if(text.equalsIgnoreCase("Austria"))
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
					    
						if(text.equalsIgnoreCase("Style"))
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
					    
						if(text.equalsIgnoreCase("Fashion"))
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
					    
						if(text.equalsIgnoreCase("Hair"))
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
	   @Test
	   public void ContentUploadFTPFlow_TC016()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC016");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    clickElement("edit_main_info_xpath");
				enterText("textBox_object_name_xpath","  Image1");
				clickElement("save_changes_main_info_xpath"); 
				verifyMessage("msg_changes_saved_succesfully_xpath","Changes saved successfully");
				quiteBrowser();
	   }
	   @Test
	   public void ContentUploadFTPFlow_TC017()
	   {
        		 logger = report.createTest("ContentUploadFTPFlow_TC017");
						
				 invokeBrowser("Chrome");
				 openApplicationURL("websiteURL");
				 clickElement("closeBtn_xpath");
				 clickElement("sign_in_xpath");
				 enterText("textBox_Email_xpath","sdimitrovska@astea.net");
				 enterText("textBox_Password_xpath","simonaD10!");
				 clickElement("sign_in_btn_xpath");
				 clickElement("profile_btn_xpath");
				 clickElement("uploadedBtn_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				 clickElement("addmoreBtn_xpath");
				 clickElement("uploadVia_FTP_xpath");
				 clickElement("next_step_btn_xpath");
				 clickElement("proceed_next_step_xpath");
				 try {
					Thread.sleep(25000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				clickElement("expand_xpath");
				clickElement("img_xpath");
				try {
		 			Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			    clickElement("select_as_cover_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("next_step_btn_xpath");
			    clickElement("image_step4_xpath");
			    JavascriptExecutor js = (JavascriptExecutor) driver;       		
	            WebElement Element = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div/div/div/div[2]/button"));	
	            js.executeScript("arguments[0].scrollIntoView();", Element);
			    clickElement("edit_category_for_content_set_xpath");
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
				    
					if(text.equalsIgnoreCase("Italy"))
				    {
				        
						allelements2.get(i).click();
				        break;
				    } 
				 }     
		   clickElement("addToAnother_xpath");  
		   clickElement("saveChanges_category_xpath");
		   clickElement("complete_btn_xpath");
		   try {
			Thread.sleep(6000);
		   } catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		   }
		   clickElement("okey_btn_xpath");
		   try {
			Thread.sleep(25000);
		   } catch (InterruptedException e) 
		   {
			// TODO Auto-generated catch block
			e.printStackTrace();
		   }
	 	   isElementPresent("pending_approval_xpath");	
	   	   String status = driver.findElement(By.xpath("//*[@id=\"MUIDataTableBodyRow-0\"]/td[5]/div/span")).getText();
		    assertEquals(status, "Pending approval");
			quiteBrowser();
	   }
	@AfterTest
	public void endReport()
	{
		report.flush();
	}
}
