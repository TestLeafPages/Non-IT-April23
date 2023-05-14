package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Locate the webElement
		WebElement drag = driver.findElement(By.xpath("//span[text()='Drag and Drop']"));
		Point location = drag.getLocation();
		int x = location.getX();
		int y = location.getY();
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 100, 50).perform();
		System.out.println(drag.getLocation().getX());
		System.out.println(drag.getLocation().getY());
		
		
		
		
		
		
		
		
		
		
		
	}

}
