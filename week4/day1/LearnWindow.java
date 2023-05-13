package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.leafground.com/window.xhtml");
		
		//current window address
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		System.out.println(driver.getTitle());
		
		//click on open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		System.out.println(driver.getTitle());
		//step 1:windowHandles
		Set<String> windowHandles = driver.getWindowHandles();//ctrl+2
		//step2 convert set into list
		List<String> lstWindow=new ArrayList<String>(windowHandles);
		//step 3 switch into particular window
		driver.switchTo().window(lstWindow.get(1));
		System.out.println(driver.getTitle());
		//close the current window
		driver.close();
		//Switch back
		driver.switchTo().window(lstWindow.get(0));
		
		System.out.println(driver.getTitle());
		//need close all open window
		driver.quit();
		
		
		

	}

}
