package base;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import util.ReadExcel;

public class ProjectSpecificMethod {
	public  ChromeDriver driver;
	public String sheets;
	@BeforeMethod
	public void launchBrowser() {
		driver=new ChromeDriver();
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	@DataProvider
	public String[][] getData() throws IOException {
		String[][] readData = ReadExcel.readData(sheets);
		return readData;
	}

}
