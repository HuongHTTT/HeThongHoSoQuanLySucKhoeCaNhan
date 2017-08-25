package testQuanLyHoGiaDinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActLogin;
import general.ExcelUntil;
import quanLyHoGiaDinh.ThemNhanKhau;

public class TestThemMoiNhanKhau {
	WebDriver driver; 
	ActLogin login = new ActLogin();
	ThemNhanKhau them = new ThemNhanKhau();

	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		Thread.sleep(5000);
		login.LoginValid(driver);
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet2");

	}

	@Test(priority = 0)
	public void themMoiNhanKhau() throws InterruptedException {
		Assert.assertTrue(them.them1(driver));
	}

	
	@Test(priority = 1)
	public void soSanh() throws InterruptedException {
		Assert.assertTrue(them.soSanh(driver));
	}
	
	@Test(priority = 2)
	public void themMoiNhanKhau2() throws InterruptedException {
		Assert.assertTrue(them.them2(driver));
	}
	
	@Test(priority = 3)
	public void soSanh2() throws InterruptedException {
		Assert.assertTrue(them.soSanh2(driver));
	}
	
	@Test(priority = 4)
	public void themMoiNhanKhau4() throws InterruptedException {
		Assert.assertTrue(them.them3(driver));
	}
}
