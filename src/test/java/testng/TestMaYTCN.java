package testng;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.AssertJUnit;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import action.ActLogin;
import action.ActMaYTCN;
import general.ExcelUntil;

@Test
public class TestMaYTCN {
	WebDriver driver; 
	ActLogin login = new ActLogin();
	ActMaYTCN maYTCN = new ActMaYTCN();
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet3");
		Thread.sleep(5000);
		login.LoginValid(driver);
	}
	
	@Test(priority = 0)
	public void nhapMaYTCN1KTu() throws IOException, InterruptedException {
		Assert.assertTrue(maYTCN.nhapMaYTCN1KTu(driver), "nhapMaYTCN1KTu pass");
	}
	
	
	@Test(priority = 1)
	public void nhapMaYTCN14KTu() throws IOException, InterruptedException{
		Assert.assertTrue(maYTCN.nhapMaYTCN14KTu(driver));
	}
	
	@Test(priority = 2)
	public void nhapMaYTCNBoTrong() throws IOException, InterruptedException{
		Assert.assertTrue(maYTCN.nhapMaYTCNBoTrong(driver));
	}
	
	@Test(priority = 3)
	public void nhapMaYTCNValid() throws IOException, InterruptedException{
		Assert.assertTrue(maYTCN.nhapMaYTCNValid(driver));
	}
	
	
}
