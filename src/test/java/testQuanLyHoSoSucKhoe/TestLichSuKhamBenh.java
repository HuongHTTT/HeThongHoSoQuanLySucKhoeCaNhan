package testQuanLyHoSoSucKhoe;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActLogin;
import general.ExcelUntil;
import quanLyHoSoSucKhoe.LichSuKhamBenh;

public class TestLichSuKhamBenh {
	WebDriver driver; 
	ActLogin login = new ActLogin();
	LichSuKhamBenh lichSu = new LichSuKhamBenh();

	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/hs-ksk-lap-hs");
		Thread.sleep(5000);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet2");
	}
	
	@Test(priority = 0)
	public void lichSuKham() throws InterruptedException{
		Assert.assertTrue(lichSu.lichSuKCBenh(driver));
	}
	
	@Test(priority = 1)
	public void soSanhLichSuKham() throws InterruptedException{
		Assert.assertTrue(lichSu.soSanhlichSuKCBenh(driver));
	}
}
