package org.run;

import java.io.IOException;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bsh.ParseException;

public class Runner1 extends  BaseClass{
	
	
	private void launch() {
		launchBrowser();
		maxBrowser();
	}
	
	
	@BeforeMethod
	public void startsTime() throws InterruptedException {

		passUrl("http://192.168.1.111:8085/JMSRS/jmslogin.php");

	}
	@AfterMethod
	public void endsTime() throws InterruptedException {

		Thread.sleep(7000);

	}@Test
	private void tc1() throws InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {

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
					
					
	
					
					//boolean value=driver.findElement(By.xpath("//i[@id='btnContinue']")).isEnabled();
					Thread.sleep(1000);
					driver.findElement(By.xpath("//i[@id='btnContinue']")).click();
					Thread.sleep(1000);
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//h6[@class='main-btntext ng-binding'])[2]")).click();
					Thread.sleep(1000);
					

					Thread.sleep(1000);
					driver.findElement(By.xpath("//span[text()='Media Plans']")).click();
					Thread.sleep(1000);
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@id='txtsearchresultP']")).click();
					Thread.sleep(1000);
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@id='btnSave']")).click();
					Thread.sleep(1000);
					
					System.out.println("save and continue");
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@class='confirm']")).click();
					Thread.sleep(1000);
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//a[@class='btn btn-danger btn-md ng-binding']")).click();
					Thread.sleep(1000);
					
					
					System.out.println("CANCEL");
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("//button[@tabindex='1']")).click();
					Thread.sleep(1000);
					
					//Masters

					
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//h6[@class='main-btntext ng-binding'])[3]")).click();
					Thread.sleep(1000);
					
					
					
					//Markets
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//span[@class='text-left ng-binding'])[5]")).click();
					Thread.sleep(1000);
					
					
					Thread.sleep(1000);
					driver.findElement(By.xpath("(//a[@id='txtsearchresultP'])[1]")).click();
					Thread.sleep(1000);
					
					
					
					
					for (int j = 1; j < 7; j++)
					
					toInput(login.getUserid(), excelRead(i, 3));
					
					toInput(login.getPassword(), excelRead(i, 4));
					
					
					

					String market1 =  excelRead(i, 3);
					System.out.println(market1);
					
					String market2 =  excelRead(i, 4);
					System.out.println(market2);
					

					String remarks1 =  excelRead(i, 3);
					System.out.println(remarks1);
					
					String remarks2 =  excelRead(i, 4);
					System.out.println(remarks2);
					
					

					String Status=  excelRead(i, 3);
					System.out.println( Status);
					
					String  sortorder =  excelRead(i, 4);
					System.out.println( sortorder);
					
					
					
//					
//					
//					
//					Thread.sleep(1000);
//					readWriteJSON();
//					Thread.sleep(1000);
//					
//					
					
					
					
					
					
				}
			else {
					
					System.out.println("Invalid");
					excelWrite(i,9, "Invalid");
				}
				//excelWrite(i,9, "Invalid");
				
				
				Thread.sleep(1000);
				driver.findElement(By.xpath("//button[text()='OK']")).click();
				
				
               
				

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
	
	
//	@SuppressWarnings("unchecked")
//	public void readWriteJSON()
//			throws InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {
//		JSONParser jsonParser = new JSONParser();
//		try {
//			FileReader reader = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Testng5\\src\\test\\Market.json");
//			// Read JSON file
//			Object obj = jsonParser.parse(reader);
//			JSONArray marketLists = (JSONArray) obj;
//			System.out.println("Users List-> " + marketLists); // This prints the entire json file
//			for (int i = 0; i < marketLists.size(); i++) {
//				JSONObject markets = (JSONObject) marketLists.get(i);
//				//System.out.println("Users -> " + users);// This prints every block - one json object
//				JSONObject market = (JSONObject) markets.get("markets");
//				//System.out.println("User -> " + user); // This prints each data in the block
//				String code = (String) market.get("code");
//				System.out.println("code" + code);
//				//toInput(login.getUserid(), excelRead(i, 3));
//				String market1 = (String) market.get("market1");
//				String market2 = (String) market.get("market2");
//				String remarks1 = (String) market.get("remarks1");
//				String remarks2 = (String) market.get("remarks2");
//				String Status = (String) market.get("Status");
//				String sortorder = (String) market.get("sortorder");
//
//				
////				if (i != 5) {
////					driver.navigate().refresh();
////				}
//
//				//user.put("result", result);
//
//				//System.out.println(result);
//
//				// Write JSON file
//				try (FileWriter file = new FileWriter(
//						"C:\\Users\\Admin\\eclipse-workspace\\Testng5\\src\\market1.json")) {
//
//					file.append(market.toJSONString());
//					file.flush();
//
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
//
//				System.out.println(market);
//
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//
//	}
}
	  

	

