package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnSelectClass {

	public static void main(String[] args) {
		//How to handle the drop down
		//Launch the browser
		EdgeDriver driver=new EdgeDriver();
		//Load the url
		driver.get("https://www.leafground.com/select.xhtml");
		//Max the window
		driver.manage().window().maximize();
		//Find Element
      WebElement tool = driver.findElement(By.className("ui-selectonemenu"));
      
      //Select class
      Select options =new Select(tool);
      //Method
      options.selectByIndex(3);
     
      //if the element is not present under select tag
     
      //click the element 
      driver.findElement(By.id("j_idt87:country_label")).click();
      //drop down pick any one option
      driver.findElement(By.id("j_idt87:country_2")).click();
      
      
      
      
      
      
	}

}
