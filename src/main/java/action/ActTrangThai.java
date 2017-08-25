package action;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import general.DeclareObjectQLNhanKhau;
import general.ExcelUntil;
import general.Method;

public class ActTrangThai {
	public boolean trangThai01(WebDriver driver) throws IOException {
		ExcelUntil.getData(33, 2);
		Method.click(driver, DeclareObjectQLNhanKhau.dropTrangThai());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathTatCa());
		Boolean ketqua = Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgayKhamLapHoSo());
		if(ketqua == false){
			System.out.println("Pass");
			ExcelUntil.setData("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Pass", 33, 3);
		}else{
			System.out.println("False");
			ExcelUntil.setData("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "False", 33, 3);

		}
		System.out.println(ketqua);
//		System.out.println(Method.elementEnable(driver, DeclareObject.xpathNgayKhamLapHoSo()));
		return true;
	}
	
	public boolean trangThai02(WebDriver driver) throws IOException, InterruptedException {
		Thread.sleep(3000);
		ExcelUntil.getData(34, 2);
		Method.click(driver, DeclareObjectQLNhanKhau.dropTrangThai());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathDaKhamLapHoSo());
		Thread.sleep(2000);         
		Boolean ketqua = Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgayKhamLapHoSo());
		Thread.sleep(2000);

		if(ketqua){
			System.out.println("Pass");
			ExcelUntil.setData("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Pass", 34, 3);
		}else{
			System.out.println("False");
			ExcelUntil.setData("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "False", 34, 3);
		}
		
		System.out.println(ketqua);

		return true;
	}

}
