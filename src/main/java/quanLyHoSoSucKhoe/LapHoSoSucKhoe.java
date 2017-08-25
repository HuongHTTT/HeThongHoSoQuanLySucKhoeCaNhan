package quanLyHoSoSucKhoe;

import org.openqa.selenium.WebDriver;

import general.DeclareObjectQLHoSoSucKhoe;
import general.ExcelUntil;
import general.Method;

public class LapHoSoSucKhoe {
	public void timKiemMaYTCN(WebDriver driver) {
		Method.senKey(driver, DeclareObjectQLHoSoSucKhoe.txtMaYTCNSearch(), ExcelUntil.getData(5, 4));
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnTimKiemSearch());
	}
	
	public boolean taoHoSo(WebDriver driver) throws InterruptedException{
		timKiemMaYTCN(driver);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnLapHoSo());
		Method.implicitlyWait(driver, 3);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnCalender());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathCalender());
		Method.senKey(driver, DeclareObjectQLHoSoSucKhoe.txtBenhSu(), ExcelUntil.getData(5, 7));
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.dropCSKham());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathCSKham());
		Method.senKey(driver, DeclareObjectQLHoSoSucKhoe.txtBSKham(), ExcelUntil.getData(5, 9));
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnLuu());
		soSanhTaoHS(driver);
		return true;
	}
	
	public boolean soSanhTaoHS(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		timKiemMaYTCN(driver);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnLichSuKham());
		Method.implicitlyWait(driver, 3);
		String ngayKham = ExcelUntil.getData(5, 10);
		String getNgayKham = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathSSNgayKham());
		System.out.println("Ngay kham: " + getNgayKham);
		
		String benhSu = ExcelUntil.getData(5, 7);
		String getBenhSu = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathSSBenhSu());
		System.out.println("Benh su: " + getBenhSu);
		
		Method.implicitlyWait(driver, 3);

		String cSKham = ExcelUntil.getData(5, 8);
		String getCSKham = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathSSNoiKham());
		System.out.println("Co so kham: " + getCSKham);
		
		String bSKham = ExcelUntil.getData(5, 9);
		String getBSKham = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathSSBacSiKham());
		System.out.println("Bac si kham: " + getBSKham);
		
		if(ngayKham.equalsIgnoreCase(getNgayKham) && benhSu.equalsIgnoreCase(getBenhSu) && cSKham.equalsIgnoreCase(getCSKham) && bSKham.equalsIgnoreCase(getBSKham)){
			System.out.println("Pass lap ho so");
		}else{
			System.out.println("False lap ho so");
		}
		
		return true;

	}

}
