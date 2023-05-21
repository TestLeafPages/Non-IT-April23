package week5.day2;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class CreateLead extends ProjectSpecificMethod{
@Test(dataProvider = "testData")
	public  void runCreateLead(String cname,String fname,String lname,String pnum) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(pnum);
		driver.findElement(By.name("submitButton")).click();
		
}
     @DataProvider
    public String[][] testData() {
    	 String[][] data= new String [2][4];
    	 //1 st  set of data
    	 data[0][0]="TestLeaf";
    	 data[0][1]="Princila";
    	 data[0][2]="Edward";
    	 data[0][3]="8056";
    	 
    	//2nd   set of data
    	 data[1][0]="QEagle";
    	 data[1][1]="Hari";
    	 data[1][2]="R";
    	 data[1][3]="99";
    	 
    	 return data;
    	 
    	
    }



}






