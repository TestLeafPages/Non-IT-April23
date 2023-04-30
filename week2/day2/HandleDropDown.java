package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) throws InterruptedException {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				//Load the url http://leaftaps.com/opentaps/control/login
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Maximize the browser
				driver.manage().window().maximize();
				//Find the element username  Enter the username
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//Find the element password Enter the password
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				Thread.sleep(1000);
				//Click Login button
				driver.findElement(By.className("decorativeSubmit")).click();
				//Click on CRM/SFA
				//driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.partialLinkText("CRM")).click();
				//To verify the page Loaded
				//To Print the title of  the page
				String title = driver.getTitle();  //Ctrl+2
				System.out.println(title);
				System.out.println(driver.getCurrentUrl());
				//Click Leads
				driver.findElement(By.linkText("Leads")).click();
				//Click create Lead
				driver.findElement(By.partialLinkText("Create")).click();
				
				//Enter Company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
				//Enter First name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Princila");
				//Enter Last name
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Edward");

	 //Handle the source DropDown
				
				//Find the element present in drop down
				WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
				
				//Create object for Select class
				
				Select source =new Select(drop1);
				
				//Select methods
				
				//source .selectByIndex(4);
				//source.selectByVisibleText("Website");
				source.selectByValue("LEAD_TRADESHOW");
			//Steps to handle the drop down
				//Find Element
				//WebElement
				//Create object select class
				//use method inside the select class
				
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
