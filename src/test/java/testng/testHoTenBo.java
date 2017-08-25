package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActEmail;
import action.ActHoTenBo;
import action.ActLogin;

public class testHoTenBo {
	WebDriver driver; 
	ActLogin login = new ActLogin();

	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		Thread.sleep(5000);
		login.LoginValid(driver);
	}
  @Test
  public void hoTenBo() throws IOException, InterruptedException {
		Assert.assertTrue(ActHoTenBo.opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet3", driver), "Test case false");

  }
}
