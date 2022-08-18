package org.run;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.junit.Assert;
public class Runner extends BaseClass {

	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() throws InterruptedException {

//		Thread.sleep(7000);
//		closebrowser();

	}

	@BeforeMethod

	public void startsTime() throws InterruptedException {

		passUrl("http://192.168.1.111:8085/JMSRS/jmslogin.php");

	}

	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(7000);

	}
	  
	
//	 @Test
//	  public void doubleClick() {
//	        driver.get("https://www.selenium.dev/selenium/web/mouse_interaction.html");
//
//	        WebElement clickable = driver.findElement(By.id("clickable"));
//	        new Actions(driver)
//	                .doubleClick(clickable)
//	                .perform();
//	    
	// }
	        
	

	@Test
	private void tc1() throws InterruptedException, IOException {

		LoginPojo login = new LoginPojo();
		
		
		String username="mp001";
		String password="pass@123";

		for (int i = 1; i < 7; i++) {
//
//			System.out.println(excelRead(i, 3));
//			System.out.println(excelRead(i, 4));

			toInput(login.getUserid(), excelRead(i, 3));
			toInput(login.getPassword(), excelRead(i, 4));
			
			String username1 =  excelRead(i, 3);
			System.out.println(username1);
			
			String password1 =  excelRead(i, 4);
			System.out.println(password1);
			
		
			System.out.println(i);
			
			Thread.sleep(1000);
			//btnClick(login.getLoginbtn());
			driver.findElement(By.xpath("//a[text()='Log In']")).click();
			Thread.sleep(1000);
			
           
			
				
			if (driver.findElement(By.xpath("//button[text()='OK']")).isEnabled()) {

			
				
			if((username.equals(username1)) && (password.equals(password1)))
				
			{
					excelWrite(i,9, "valid");
					System.out.println("valid");
					
		         	Thread.sleep(1000);
			     	driver.findElement(By.xpath("(//td[@id='td-id-1'])[1]")).click();
			    	Thread.sleep(1000);
				
			    	
					
					//td[@id='td-id-1']
					
					//boolean value=driver.findElement(By.xpath("//i[@id='btnContinue']")).isEnabled();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//i[@id='btnContinue']")).click();
					Thread.sleep(1000);
					//System.out.println("a");
					
					//client services click
					Thread.sleep(2000);
					driver.findElement(By.xpath("//h6[text()='   Client Services']")).click();
					Thread.sleep(1000);
				//	System.out.println("b");
					
					
                  //media plans click
					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Media Plans']")).click();
					Thread.sleep(1000);
					//System.out.println("c");
					
					//click + options
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@id='txtsearchresultP']")).click();
					Thread.sleep(1000);
					//System.out.println("d");
					
					//save and close btn click
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@id='btnSave']")).click();
					Thread.sleep(1000);
					
				//	System.out.println("save and continue");
					
					//masntary box click ok
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@class='confirm']")).click();
					Thread.sleep(1000);
//					System.out.println("e");
//                    System.out.println("CANCEL");
                    
                    //cancel click
                    Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-danger btn-md ng-binding']")).click();
					Thread.sleep(1000);
					
					//dialog box click confirm
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@tabindex='1']")).click();
					Thread.sleep(1000);
					
//					 System.out.println("CANCEL");
					
//					 Thread.sleep(1000);
//						driver.findElement(By.xpath("//a[@class='btn btn-danger btn-md ng-binding']")).click();
//						Thread.sleep(1000);
						
					 
					 
					//a[@class='btn btn-danger btn-md ng-binding']
				
					 //click master
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//h6[@class='main-btntext ng-binding'])[3]")).click();
				 Thread.sleep(1000);
				
				 //click markets
			     Thread.sleep(1000);
				 driver.findElement(By.xpath("//span[text()='Markets']")).click();				
				 Thread.sleep(1000);
				//click market + symbol 		
				 Thread.sleep(1000);
				 driver.findElement(By.xpath("(//a[@id='txtsearchresultP'])[1]")).click();				
				 Thread.sleep(1000);	
					   
				 for (int j =1 ; j < 6 ; j++) 
					 
					 
				 {
					 
						System.out.println("Before"+"  "+j);	
					 
					// Thread.sleep(1000);
//						driver.findElement(By.xpath("//span[contains(text(),'Save & Close')]")).click();
//						Thread.sleep(1000);
						//driver.findElement(By.xpath("//button[text()='OK']")).click();
				
//					 System.out.println(excelReadGeneral(j, 0));
//					 System.out.println(excelReadGeneral(j, 1));
//					 System.out.println(excelReadGeneral(j, 2));
//					 System.out.println(excelReadGeneral(j, 3));
//					 System.out.println(excelReadGeneral(j, 4));
//					 System.out.println(excelReadGeneral(j, 5));
//					 System.out.println(excelReadGeneral(j, 6));
					 
                     
				//	 System.out.println("For loop vengatesh");
//					 String code="tc001";
//                        code=toInput(login.getCode(), excelReadGeneral(i, 1);
						toInput(login.getCode(), excelReadGeneral(j, 0));
						
						toInput(login.getDesc1(), excelReadGeneral(j, 1));
					
						toInput(login.getDesc2(), excelReadGeneral(j, 2));
						toInput(login.getRemarks1(), excelReadGeneral(j, 3));
						toInput(login.getRemarks2(), excelReadGeneral(j, 4));
						//toInput(login.getStatus(), excelReadGeneral(i, 5));
						
						
						Select s=new Select(driver.findElement(By.xpath("//select[@id='cboDateFormat']")));
						
						//s.selectByVisibleText("Active");
						
						s.selectByValue("A");
						
						toInput(login.getSortorder(), excelReadGeneral(j, 6));
						
						 Thread.sleep(1000);
							driver.findElement(By.xpath("//span[contains(text(),'Save & Close')]")).click();
							Thread.sleep(2000);
							driver.findElement(By.xpath("//button[text()='OK']")).click();
						//	Thread.sleep(1000);
//							WebElement element = null ;
//							
//							element.clear();
					
//						
//							toInput(login.getCode(), excelReadGeneral(i, 1));
//							toInput(login.getDesc1(), excelReadGeneral(i, 2));
//							toInput(login.getRemarks1(), excelReadGeneral(i, 3));
//							toInput(login.getStatus(), excelReadGeneral(i, 4));
//							toInput(login.getSortorder(), excelReadGeneral(i, 5));
//						
//						 Thread.sleep(1000);
//						driver.findElement(By.xpath("//span[contains(text(),'Save & Close')]")).click();
//						Thread.sleep(1000);
//						driver.findElement(By.xpath("//button[text()='OK']")).click();
//						
						
						
						 Thread.sleep(1000);
//						 System.out.println("mcode" + code);
				        
//				        WebElement code1=driver.findElement(By.id("mcode"));
//						 code1.sendKeys(code);
//						 
//				     	WebElement txtuser = driver.findElement(By.id("mcode"));
//
//				 		txtuser.sendKeys();
						 
//						 Thread.sleep(1000);
					
				 						
					
				}}
			else {
					
					System.out.println("Invalid");
					excelWrite(i,9, "Invalid");
				}
				//excelWrite(i,9, "Invalid");
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				
				Thread.sleep(1000);
				
				
               
				

			}
//		
			
//else if (driver.findElement(By.xpath("//a[@title='Sign out']")).isEnabled()) {
//
//				System.out.println("Valid");
//				
//				excelWrite(i,9, "valid");
//				
//				Thread.sleep(2000);
//				driver.findElement(By.xpath("///a[@title='Sign out']")).click();
//				
//			
//				Thread.sleep(2000);
//				
//				
//
//			} 
			
			
//			else {
//
//				System.out.println("Load error page");
//			}
		}
//		Thread.sleep(1000);
	
//		WebElement F = driver.findElement(By.xpath("//a[@ng-click='fnProfileMenu()']"));
//      F.click();
		
//		WebElement clickable = driver.findElement(By.id("click"));
//        new Actions(driver)
//                .click(clickable)
//                .perform();

	}


}