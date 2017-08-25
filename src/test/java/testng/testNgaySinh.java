package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import action.ActLogin;
import action.ActNgSinh;
import general.ExcelUntil;
import general.Method;

public class testNgaySinh {
	WebDriver driver; 
	ActLogin login = new ActLogin();
	ActNgSinh ngSinh = new ActNgSinh();
	
	@BeforeClass
	public void setup() throws IOException, InterruptedException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		ExcelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1");
		Method.implicitlyWait(driver, 3);
		login.LoginValid(driver);
	}
	
	@Test(priority = 0)
	public void testNgaySinh01() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh01(driver), "Test case false");
	}
	
	@Test(priority = 1)
	public void testNgaySinh02() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh02(driver), "Test case false");
	}
	
	@Test(priority = 2)
	public void testNgaySinh03() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh03(driver), "Test case false");
	}
	
	@Test(priority = 3)
	public void testNgaySinh04() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh04(driver), "Test case false");
	}
	
	@Test(priority = 4)
	public void testNgaySinh05() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh05(driver), "Test case false");
	}
	
	@Test(priority = 5)
	public void testNgaySinh06() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh06(driver), "Test case false");
	}
	
	
	@Test(priority = 6)
	public void testNgaySinh07() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh07(driver), "Test case false");
	}
	
	@Test(priority = 7)
	public void testNgaySinh08() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh08(driver), "Test case false");
	}
	
	@Test(priority = 8)
	public void testNgaySinh09() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh09(driver), "Test case false");
	}
	
	@Test(priority = 9)
	public void testNgaySinh10() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.ngaySinh10(driver), "Test case false");
	}
	
//	@Test(priority = 10)
//	public void testNgaySinh11() throws InterruptedException, IOException{
//		Assert.assertTrue(ngSinh.ngaySinh11(driver), "Test case false");
//	}
		
//	@Test(priority = 11)
//	public void testExcelForLoopNamSinh() throws InterruptedException, IOException{
//		Assert.assertTrue(ExcelForLoopNamSinh.opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1", driver), "Test case false");
//	}
	
	@Test(priority = 12)
	public void testNamSinh01() throws InterruptedException, IOException{
		Assert.assertTrue(ngSinh.namSinh04(driver), "Test case false");
	}
}
