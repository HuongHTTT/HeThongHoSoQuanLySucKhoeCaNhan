package testQuanLyHoGiaDinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActLogin;
import general.ExcelUntil;
import quanLyHoGiaDinh.ThemMoiHoKhau;
import quanLyHoGiaDinh.ThemNhanKhau;

public class TestThemMoiHoKhau {
	WebDriver driver; 
	ActLogin login = new ActLogin();
	ThemMoiHoKhau them = new ThemMoiHoKhau();

	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/ho-khau");
		Thread.sleep(3000);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet2");

	}
	@Test (priority = 0)
	public void themMoiHoKhau() throws InterruptedException{
		Assert.assertTrue(them.themMoiHoKhau(driver));
	}
	//----------------------------------------------------------------------------
//	@Test (priority = 1)
//	public void themMoiHoKhauSS() throws InterruptedException{
//		Assert.assertTrue(them.soSanh(driver));
//	}
	//----------------------------------------------------------------------------
	
	@Test (priority = 2)
	public void themMoiNhanKhau() throws InterruptedException{
		Assert.assertTrue(them.themNKVaoHK(driver));
	}
	
//	@Test (priority = 3)
//	public void timKiem() throws InterruptedException{
//		Assert.assertTrue(them.timKiem(driver));
//	}
}
