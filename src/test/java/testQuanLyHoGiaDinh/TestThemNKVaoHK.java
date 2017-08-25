package testQuanLyHoGiaDinh;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActLogin;
import general.ExcelUntil;
import quanLyHoGiaDinh.ThemNKVaoHK;
import quanLyHoGiaDinh.ThemNhanKhau;

public class TestThemNKVaoHK {
	WebDriver driver; 
	ActLogin login = new ActLogin();
	ThemNKVaoHK them = new ThemNKVaoHK();

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
  public void themNK() throws InterruptedException {
	  Assert.assertTrue(them.themNKvaoHK(driver));
  }
  
//  @Test (priority = 1)
//  public void soSanh() throws InterruptedException {
//	  Assert.assertTrue(them.soSanh(driver));
//  }
}
//.//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[7]/td[9]/a[1]/i
//.//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[4]/td[9]/a[1]/i
