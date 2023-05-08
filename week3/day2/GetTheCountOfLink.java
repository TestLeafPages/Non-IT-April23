package week3.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTheCountOfLink {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver=new ChromeDriver();
		//Load the url
		driver.get("https://www.leafground.com/link.xhtml");
		//Max the window
		driver.manage().window().maximize();
		//wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Locate the element by tag
		List<WebElement> link = driver.findElements(By.tagName("a"));
		//size of the link
		System.out.println(link.size());
	}

}
