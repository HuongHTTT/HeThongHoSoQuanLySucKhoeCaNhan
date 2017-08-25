package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import action.ActLogin;
import action.ExcelForLoop;

public class testNgSinhFor {

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
	public void NgaySinhFor() throws IOException, InterruptedException {
		//		excelForLoop.opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1", driver);
		Assert.assertTrue(ExcelForLoop.opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet3", driver), "Test case false");
	}
}
