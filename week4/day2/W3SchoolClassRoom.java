package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3SchoolClassRoom {
	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //Handle the frame
		driver.switchTo().frame("iframeResult");
		//Find the element to click
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		//Handle the Alert
		Alert alert = driver.switchTo().alert();//ctrl+2
		//Accept action
		alert.accept();
		 //Take a snapshot
        File source = driver.getScreenshotAs(OutputType.FILE);		
		//Create folder to save the img file
		File desc=new File("snaps/w3school.png");
		//Merge source and destinationailure
		FileUtils.copyFile(source, desc);
		
		//Get the text in this page
		String text = driver.findElement(By.id("demo")).getText();
		//verify the text present
		if (text.contains("OK")) {
			System.out.println("Success");
		} else {
			System.out.println("F");
		}
	}
}
