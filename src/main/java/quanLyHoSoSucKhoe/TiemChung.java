package quanLyHoSoSucKhoe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import general.DeclareObjectQLHoSoSucKhoe;
import general.Method;

public class TiemChung {
	LapHoSoSucKhoe laphoso = new LapHoSoSucKhoe();
	
	public boolean tiemChungTrongCT(WebDriver driver) throws InterruptedException {
		laphoso.timKiemMaYTCN(driver);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnXemHS());
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnMenu());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnTiemChung());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnThemMoiTiemChungTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.dropLoaiVacXinTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathLoaiVacXinTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnCalenderNgayTiemTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathCalenderTrongCT());
		Method.senKey(driver, DeclareObjectQLHoSoSucKhoe.txtPhanUngTrongCT(), "khong co phan ung");
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnCalenderNgayHenTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathCalenderNgayHenTrongCT());
		WebElement ele = driver.findElement(DeclareObjectQLHoSoSucKhoe.dropChonMuiTiemTrongCT());
		Select element = new Select(ele);
		element.selectByValue("number:2");
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.dropChonCoSoTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.xpathChonCoSoTrongCT());
		Method.click(driver, DeclareObjectQLHoSoSucKhoe.btnLuuTrongCT());
		return true;
		
	}

}
