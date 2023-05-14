package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class ClassRoomErail {

	public static void main(String[] args) {
		 
		ChromeOptions option=new ChromeOptions();
		
		//To disable the notification
		option.addArguments("--disable-notifications");
		// Launch the browser
		ChromeDriver driver=new ChromeDriver(option);
		// Step1: Launch the URL - https://erail.in/
		driver.get("https://erail.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        // Uncheck the check box - sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		// clear and type in the source station
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("Mas",Keys.ENTER);
		// clear and type in the destination station
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("Mdu",Keys.ENTER);
         List<WebElement> rowCount = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr"));
         System.out.println(rowCount.size());
         //print the train Names
         List<WebElement> trainNames = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
         System.out.println("List size"+trainNames.size()); 
         for (int i =0; i < trainNames.size(); i++) {
        	  String names = trainNames.get(i).getText();
        	  //print the train names only
        	  //System.out.println(names);
			//method used to check any specific train name present
				 if(names.contains("EXPRESS")) 
				 { 
					 System.out.println(names); 
				 }
				 
         }
        //convert List into set to check duplicate present or not
        Set<WebElement>dup=new LinkedHashSet<WebElement>(trainNames);
        System.out.println("set size"+dup.size());
         
        if(trainNames.size()==dup.size()) {
        	System.out.println("Same size");//28 28
        }
        else {
        	System.out.println("Different Size");
        }
       

	}

}

