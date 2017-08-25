package testng;

import org.testng.annotations.Test;

import action.ActLogin;
import action.ActTrangThai;
import general.ExcelUntil;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class testTrangThai {
	
	WebDriver driver; 
	ActLogin login = new ActLogin();
	ActTrangThai trangThai = new ActTrangThai();

	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		Thread.sleep(10000);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1");
	}
	
  @Test(priority = 0)
  public void trangThai01() throws IOException {
	  Assert.assertTrue(trangThai.trangThai01(driver));
  }
  
  
  @Test(priority = 1)
  public void trangThai02() throws IOException, InterruptedException {
	  Assert.assertTrue(trangThai.trangThai02(driver));
  }

}
