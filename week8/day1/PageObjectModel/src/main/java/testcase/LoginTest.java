package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginTest extends ProjectSpecificMethod{
	@BeforeTest
	public void setup() {
		sheets="Login";
	}
	
	@Test(dataProvider = "getData")
	public void loginTest(String uname,String psw) throws InterruptedException {
		System.out.println(driver);
		//Create obj for loginPage
		LoginPage lp=new LoginPage(driver);
		lp.enterUserName(uname)
		.enterPassword(psw)
		.clickLogin();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
