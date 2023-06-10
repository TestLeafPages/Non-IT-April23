package testcase;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTest extends ProjectSpecificMethod{

	@BeforeTest
	public void setup() {
		sheets="CreateLead";
	}
	@Test(dataProvider = "getData")
	public void createLeadTest(String uname,String psw,String cname,String fname,String lname, String pnum) throws InterruptedException {
		
		LoginPage lp=new LoginPage(driver);
			lp.enterUserName(uname)
			.enterPassword(psw)
			.clickLogin()
			.ClickCrmSfa()
			.clickLead()
			.clickCreateLead()
			.enterCmp(cname)
			.enterFname(fname)
			.enterLname(lname)
			.phnum(pnum)
			.clickCreateLeadButton()
			.verifyLead();
	
			
			
		
	}
}
