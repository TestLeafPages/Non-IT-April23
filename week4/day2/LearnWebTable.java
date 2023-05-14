package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//identify the table
		WebElement table = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table"));
		//row count
		List<WebElement> rowCount = table.findElements(By.tagName("tr"));
		System.out.println("Row count :"+ rowCount.size());
		
		//column count
		List<WebElement> columnCount = table.findElements(By.tagName("td"));
		
		System.out.println("Column Count:"+columnCount.size());
		//print one row
		
		System.out.println(rowCount.get(1).getText());
		 String text = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table//tr[4]/td[1]")).getText();
		 System.out.println(text);
		
		
		for (int i = 1; i <rowCount.size()-1 ; i++) {
			//System.out.println(rowCount.get(i).getText());
	 String text3 = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table//tr["+i+"]//td[3]")).getText();
		System.out.println(text3);
		}
	 for (int j = 1; j < columnCount.size()-1; j++) {
			//System.out.println(columnCount.get(j).getText());
		
		String text2 = driver.findElement(By.xpath("//div[contains(@class,'ui-panel-content')]/table//tr[2]/td["+j+"]")).getText();	
		System.out.println(text2);
		}
		
		
		
		
		
		
		
		
		
	}

}
