package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead extends ProjectSpecificMethod{
@Test(dataProvider = "testData")
	public  void runEditLead(String pnum,String cname) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		
}
@DataProvider
public String[][] testData() {
	 String[][] data= new String [2][2];
	 //1 st  set of data
	 data[0][0]="8056";
	 data[0][1]="Qeagle";
	 
	 
	//2nd   set of data
	 data[1][0]="983";
	 data[1][1]="Amazon";
	 
	 return data;
	 
	
}

}






