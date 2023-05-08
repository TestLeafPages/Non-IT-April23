package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class PrintAllDropDownValue {

	public static void main(String[] args) {
		
		  		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				//Load the url
				driver.get("https://www.leafground.com/select.xhtml");
				//Max the window
				driver.manage().window().maximize();
				//wait
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
              //Find the element 
				WebElement dropDown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
				
				//Locate the Select drop down
				Select tool=new Select(dropDown);
				
				List<WebElement> options = tool.getOptions();
				
				System.out.println(options.size());
				
				for (int i = 0; i <options.size() ; i++) {
					System.out.println(options.get(i).getText());
				}
					
				
	}

}
