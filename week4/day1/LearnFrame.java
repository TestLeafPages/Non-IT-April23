package week4.day1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/frame.xhtml");
		//handle the frame
		driver.switchTo().frame(0);
		//click me
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	    //Verification
		String text = driver.findElement(By.xpath("//button[contains(text(),'Hurray')]")).getText();
		System.out.println(text);
		//Switch back the control from one fraame to main window
		driver.switchTo().defaultContent();
		//switch into the frame
		driver.switchTo().frame(2);
		//nested frame
		driver.switchTo().frame("frame2");
		//Second click
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		//immediate parent 
		driver.switchTo().parentFrame();
        //Take a snapshot
        File source = driver.getScreenshotAs(OutputType.FILE);		
		//Create folder to save the img file
		File desc=new File("snaps/frame.png");
		//Merge source and destination
		FileUtils.copyFile(source, desc);
		
		
		
		
		//driver.close();
		
	}

}
