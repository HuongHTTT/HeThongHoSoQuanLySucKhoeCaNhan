package quanLyHoGiaDinh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import general.DeclareObjectQLHoKhau;
import general.DeclareObjectQLNhanKhau;
import general.ExcelUntil;
import general.Method;

public class ThemNKVaoHK {
	
	public void timNhanKhau(WebDriver driver) {
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtMaYTCN(), ExcelUntil.getData(7, 4));
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
	}
	
	public boolean themNKvaoHK(WebDriver driver) throws InterruptedException {
		timNhanKhau(driver);
		Method.click(driver, DeclareObjectQLNhanKhau.btnSua());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnRefreshChonHK());
		Method.click(driver, DeclareObjectQLNhanKhau.btnChonHK());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhTPChonHK());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.xpathTPHaNoiChonHK());
		Method.click(driver, DeclareObjectQLNhanKhau.dropQuanChonHK());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathQuanChonHK());
		Method.click(driver, DeclareObjectQLNhanKhau.dropPhuongChonHK());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathPhuongChonHK());
		Method.senKeyNotClear(driver, DeclareObjectQLNhanKhau.txtChuHoChonHK(), ExcelUntil.getData(5, 1));
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiemChonHK());
		Method.click(driver, DeclareObjectQLNhanKhau.btnThaoTacChonHK());
		Thread.sleep(2000);
//		Method.click(driver, DeclareObjectQLNhanKhau.dropQHVoiChuHoChonHK());
//		Method.click(driver, DeclareObjectQLNhanKhau.xpathQHVoiChuHoChonHK());
		Method.senKeyNotClear(driver, DeclareObjectQLNhanKhau.dropQHVoiChuHoChonHK(), "CCC");
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnLuuChonHK());
		soSanh(driver);
		return true;
	}
	
	public boolean soSanh(WebDriver driver) throws InterruptedException{
		Thread.sleep(7000);
		timNhanKhau(driver);
		Method.click(driver, DeclareObjectQLNhanKhau.linkMaHoGDChonHK());
		String MaYTCNChuHo = ExcelUntil.getData(5, 4);
		String getMaYTCNChuHo = Method.getText(driver, DeclareObjectQLNhanKhau.xpathMaYTCNChuHoChonHK());
		System.out.println("Ma YTCN ChuHo: " + MaYTCNChuHo);
		System.out.println("Ma YTCN ChuHo: " + getMaYTCNChuHo);
		
		String QHConChuHo = ExcelUntil.getData(7, 6);
		String getQHConChuHo = Method.getText(driver, DeclareObjectQLNhanKhau.xpathQHConChuHoChonHK());
		System.out.println("QHConChuHo: " + QHConChuHo);
		System.out.println("QHConChuHo: " + getQHConChuHo);
		if(MaYTCNChuHo.equalsIgnoreCase(getMaYTCNChuHo) && QHConChuHo.equalsIgnoreCase(getQHConChuHo)){
			System.out.println("Pass them nhan khau vao ho khau");
		}else{
			System.out.println("False them nhan khau vao ho khau");
		}
		Thread.sleep(4000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnDongChonHK());
		return true;
	}
}
