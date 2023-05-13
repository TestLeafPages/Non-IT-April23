package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/alert.xhtml");
		//click  to populate the alert
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		//Handle the  alert
		Alert alert = driver.switchTo().alert();//ctrl+2
		//print the message from the dialog box
		String text = alert.getText();//ctrl+2
		System.out.println(text);
		//Action going to perform
		alert.accept();
		//verify the alert is clicked
		String msg = driver.findElement(By.id("simple_result")).getText();
		System.out.println(msg);
		//click the prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		//Handle the Alert
		Alert alert2 = driver.switchTo().alert();
		//to get the text from dialog
		String text2 = alert2.getText();
		System.out.println(text2);
		//pass the input
		alert2.sendKeys("Testleaf");
		//cancel
		alert2.accept();
		//verification
		String text3 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
