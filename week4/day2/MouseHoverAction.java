package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MouseHoverAction {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.nykaa.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		//Find element
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
        //step2
		Actions builder = new Actions (driver);
		builder.moveToElement(brand).perform();
	}

}
