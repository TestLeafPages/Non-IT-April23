package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassRoom2 {

	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver=new ChromeDriver();
				//Load the url http://leaftaps.com/opentaps/control/login
				driver.get("https://www.leafground.com/input.xhtml");
				//Maximize the browser
				driver.manage().window().maximize();
				//Find the Element
				driver.findElement(By.id("j_idt88:name")).sendKeys("Princial");

	}

}
