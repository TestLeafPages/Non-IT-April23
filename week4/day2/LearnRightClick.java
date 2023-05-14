package week4.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {
	
		public static void main(String[] args) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");
			//To disable the notification
			option.addArguments("--disable-notifications");
			ChromeDriver driver=new ChromeDriver(option);
			driver.get("https://www.leafground.com/menu.xhtml");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			//find element
			WebElement rc = driver.findElement(By.xpath("//h5[text()='Context Menu']"));
	        //Instantiating the actions class 
			Actions  builder=new Actions(driver);
			//builder.contextClick(rc).perform();
			builder.contextClick().perform();
		
			
		}
}
