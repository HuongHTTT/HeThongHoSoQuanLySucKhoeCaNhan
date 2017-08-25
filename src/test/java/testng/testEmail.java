package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActEmail;
import action.ActLogin;
import action.ExcelForLoop;

public class testEmail {
	WebDriver driver; 
	ActLogin login = new ActLogin();

	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		Thread.sleep(10000);
		login.LoginValid(driver);
	}
  @Test
  public void testEmail() throws IOException, InterruptedException {
		Assert.assertTrue(ActEmail.opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1", driver), "Test case false");
  }
}
