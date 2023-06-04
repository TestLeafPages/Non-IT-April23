package week7.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExampleForWait {
		public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub

			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			ChromeDriver driver = new ChromeDriver(options);
			driver.manage().window().maximize();
			driver.get("https://www.snapdeal.com/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			WebElement mFashion = driver.findElement(By.xpath("//span[contains(text(),'Fashion')]"));
			Actions builder = new Actions(driver);
			builder.moveToElement(mFashion).perform();
			driver.findElement(By.xpath("//span[text()='Sports Shoes']")).click();

			String count = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
			System.out.println("No. of items available: " + count);
			driver.findElement(By.xpath("//div[text()='Training Shoes']")).click();
			List<WebElement> price = driver.findElements(By.xpath("//span[@class='lfloat product-price']"));
			System.out.println("List size: " + price.size());
			for (int i = 0; i < price.size(); i++) {
				System.out.println(price.get(i).getText());
			}
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			WebElement sort = driver.findElement(By.xpath("//i[@class='sd-icon sd-icon-expand-arrow sort-arrow']"));
			wait.until(ExpectedConditions.elementToBeClickable(sort));
			sort.click();
			driver.findElement(By.xpath("//ul/li[@class='search-li']")).click();
			WebElement color = driver.findElement(By.xpath("//a[contains(text(),'Multi Color')]"));
			driver.executeScript("arguments[0].click();", color);
			WebElement shoe = driver.findElement(By.xpath("//a[@class='dp-widget-link hashAdded']"));
			builder.moveToElement(shoe).perform();
			WebElement quickView = driver.findElement(By.xpath("//div[contains(text(),'Quick View')]"));
			wait.until(ExpectedConditions.elementToBeClickable(quickView));
			quickView.click();
			String shoePrice = driver.findElement(By.xpath("//div[@class='product-price pdp-e-i-PAY-l clearfix']"))
					.getText();
			System.out.println("Price & Discount: " + shoePrice);
			File source = driver.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshot/snap.png");
			FileUtils.copyFile(source, dest);

		}

	}

