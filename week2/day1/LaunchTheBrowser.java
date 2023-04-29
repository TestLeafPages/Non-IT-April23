package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		//set up  the path
		//WebDriverManager.chromedriver.setup();
		
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
		//Click Create Lead button
		driver.findElement(By.name("submitButton")).click();
		//Verify the lead is created
		//Find the element
		String leadId = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(leadId);
		if(leadId .contains("Test")) {
			System.out.println("Lead is created successfully");
		}
		else {
			System.out.println("Lead is Not created successfully");
		}
		//Close the browser
		//driver.close();
		
		
		

	}

}
