package quanLyHoSoSucKhoe;

import org.openqa.selenium.WebDriver;

import general.DeclareObjectQLHoSoSucKhoe;
import general.ExcelUntil;
import general.Method;

public class LichSuKhamBenh {
	LapHoSoSucKhoe laphoso = new LapHoSoSucKhoe();
	
	public boolean lichSuKCBenh(WebDriver driver) throws InterruptedException {
		laphoso.timKiemMaYTCN(driver);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnLichSuKham());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnThemLS());
		Thread.sleep(2000);

		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnNgayKhamThemLS());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathNgayKhamThemLS());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnNgayBatDauThemLS());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathNgayBatDauThemLS());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnNgayKetThucThemLS());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathNgayKetThucThemLS());
		Thread.sleep(3000);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.dropNoiKhamThemLS());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathNoiKhamThemLS());
		Method.senKey(driver, DeclareObjectQLHoSoSucKhoe.txtBSKhamThemLS(), ExcelUntil.getData(5, 9));
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnLuuThemLS());
		return true;
	}
	
	public boolean soSanhlichSuKCBenh(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		String dotKCB = ExcelUntil.getData(5, 11) + " - " + ExcelUntil.getData(5, 12);
		System.out.println(dotKCB);
		Method.implicitlyWait(driver, 3);
		String getDotKCB = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathDotKCBSSThemLS());
		
		String noKCB = ExcelUntil.getData(5, 8);
		Method.implicitlyWait(driver, 3);
		String getNoiKCB = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathNoiKCBSSThemLS());
		System.out.println(noKCB);
		
		String bacSiKCB = ExcelUntil.getData(5, 9);
		Method.implicitlyWait(driver, 3);
		String getBacSiKCB = Method.getText(driver, DeclareObjectQLHoSoSucKhoe.xpathBacSiSSThemLS());
		System.out.println(bacSiKCB);
		
		if(dotKCB.equalsIgnoreCase(getDotKCB) && noKCB.endsWith(getNoiKCB) && bacSiKCB.equalsIgnoreCase(bacSiKCB)){
			System.out.println("Pass lich su KCB");
		}
		return true;
	}
}
