package week7.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenWithDelay {
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.leafground.com/window.xhtml");

		// click the element
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));

		// verification
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("Size of the window"+windowHandles.size());
		List<String> lstWindow = new ArrayList<String>(windowHandles);
		//First window title
		driver.switchTo().window(lstWindow.get(1));
		System.out.println(driver.getTitle());
		//Second window title
		driver.switchTo().window(lstWindow.get(2));
		System.out.println(driver.getTitle());
	}

}
