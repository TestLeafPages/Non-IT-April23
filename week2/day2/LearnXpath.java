package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				//Load the url http://leaftaps.com/opentaps/control/login
				driver.get("http://leaftaps.com/opentaps/control/login");
				//Maximize the browser
				driver.manage().window().maximize();
				//Find the element username  Enter the username
				driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("demosalesmanager");
	            driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	            driver.findElement(By.xpath("//input[@value='Login']")).click();
	            driver.findElement(By.xpath("//a[contains(text(),'CRM')] ")).click();
	            driver.findElement(By.xpath("//a[text()='Leads']")).click();
	            //From ruto you can copy paste the code directly
	           // String uSERNAME = driver.findElement(By.xpath("//input[@class='inputLogin']")).getAttribute("attribute_value");
	}

}
