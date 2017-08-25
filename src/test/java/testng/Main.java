package testng;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import chayThu.Excel;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
//        excelUntil.readExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1");
//        General.LoginValid(driver);
//        if(General.nhapMaYTCN1KTu(driver) == true){
//        	excelUntil.setData("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Pass", 2, 3);
//        }else{
//        	excelUntil.setData("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "False", 2, 3);
//
//        }
        
	} 
}
