package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethod;

public class LoginPage extends ProjectSpecificMethod {
	
	public LoginPage(ChromeDriver driver) {
		this.driver=driver;
	}

	public LoginPage enterUserName(String uname) {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(uname);
		return this;
	}
	
	public LoginPage enterPassword(String psw) {
		driver.findElement(By.id("password")).sendKeys(psw);
		return this;
	}
	
	public HomePage clickLogin() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.className("decorativeSubmit")).click();
		return new HomePage(driver);
	}
	
}
