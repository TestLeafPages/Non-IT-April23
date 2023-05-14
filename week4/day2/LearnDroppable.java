package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnDroppable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Find element
        WebElement source = driver.findElement(By.xpath("//p[text()='Drag to target']"));
        WebElement desc = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Actions builder=new Actions(driver);
        builder.dragAndDrop(source, desc).perform();
        //verification
        String text = desc.getText();
        System.out.println(text);
	
	
	
	
	
	
	
	
	
	
	
	}

}
