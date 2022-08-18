package org.run;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.base.BaseClass;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.pojo.LoginPojo;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import bsh.ParseException;

public class Runner_workout extends BaseClass {

	@BeforeClass
	private void browserLaunch() {

		launchBrowser();
		maxBrowser();
	}

	@AfterClass
	private void browserClose() throws InterruptedException {

	}

	@BeforeMethod

	public void startsTime() throws InterruptedException {

		passUrl("http://192.168.1.111:8085/JMSRS/jmslogin.php");

	}

	@AfterMethod

	public void endsTime() throws InterruptedException {

		Thread.sleep(7000);

	}

	@Test
	public void testAut()
			throws InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {
		readWriteJSON();
	}
	

	@Test                                                                                                                                                                                                                                                                 
	public String login(String username, String password) throws InterruptedException {

		LoginPojo login = new LoginPojo();
		toInput(login.getUserid(), username);
		toInput(login.getPassword(), password);

		if ((username.equals("mp001")) && (password.equals("pass@123"))) {

			btnClick(login.getLoginbtn());
			return "pass";

		} else {
			btnClick(login.getLoginbtn());
			return "fail";

		}

	}

	@SuppressWarnings("unchecked")
	public void readWriteJSON()
			throws InterruptedException, IOException, ParseException, org.json.simple.parser.ParseException {
		JSONParser jsonParser = new JSONParser();
		try {
			FileReader reader = new FileReader("C:\\Users\\Admin\\eclipse-workspace\\Testng5\\src\\Testdata.json");
			// Read JSON file
			Object obj = jsonParser.parse(reader);
			JSONArray usersList = (JSONArray) obj;
			System.out.println("Users List-> " + usersList); // This prints the entire json file
			for (int i = 0; i < usersList.size(); i++) {
				JSONObject users = (JSONObject) usersList.get(i);
				System.out.println("Users -> " + users);// This prints every block - one json object
				JSONObject user = (JSONObject) users.get("users");
				System.out.println("User -> " + user); // This prints each data in the block
				String username = (String) user.get("username");
				String password = (String) user.get("password");

				String result = login(username, password);
				if (i != 5) {
					driver.navigate().refresh();
				}

				user.put("result", result);

				System.out.println(result);

				// Write JSON file
				try (FileWriter file = new FileWriter(
						"C:\\Users\\Admin\\eclipse-workspace\\Testng5\\src\\Test1.json")) {

					file.append(usersList.toJSONString());
					file.flush();

				} catch (IOException e) {
					e.printStackTrace();
				}

				System.out.println(user);

			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
