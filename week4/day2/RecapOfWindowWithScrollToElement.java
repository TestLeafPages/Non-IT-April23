package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RecapOfWindowWithScrollToElement {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
       //Click first resulting phone
		driver.findElement(By.xpath("//h2[contains(@class,'a-size-mini a-spacing-none')]/a")).click();
		//verification
		System.out.println(driver.getTitle());
		
		//handle the window
		Set<String> windowHandles = driver.getWindowHandles();
		//List convert set into list
		List<String> lstWindow=new ArrayList<String>(windowHandles);
		//switch to new window
		driver.switchTo().window(lstWindow.get(1));
		//find Element
		WebElement scroll = driver.findElement(By.xpath("//a[text()='See more product details']"));
		//ACtions
		Actions builder=new Actions(driver);
		builder.scrollToElement(scroll).perform();
		//Take a snapshot
        File source = driver.getScreenshotAs(OutputType.FILE);		
		//Create folder to save the img file
		File desc=new File("snaps/amazon.png");
		//Merge source and destination
		FileUtils.copyFile(source, desc);
		
		
		System.out.println(driver.getTitle());
		driver.close();
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
