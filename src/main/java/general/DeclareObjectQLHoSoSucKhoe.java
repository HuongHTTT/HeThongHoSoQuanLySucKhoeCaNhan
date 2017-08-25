package general;

import org.openqa.selenium.By;

public class DeclareObjectQLHoSoSucKhoe {
	public static By txtMaYTCNSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}
	
	public static By btnTimKiemSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/button");
	}
	
	public static By btnLapHoSo() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[9]/a[1]/i");
	}
	
	public static By btnCalender() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/div/div/span/button");
	}
	
	public static By xpathCalender() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/div/div/div/ul/li[1]/div/table/tbody/tr[4]/td[5]");
	}
	
	public static By txtBenhSu() {
		return By.xpath(".//*[@id='field_benhSu']");
	}
	
	public static By dropCSKham() {
		return By.xpath(".//*[@id='field_maCskcb']/div[1]/span");
	}
	
	public static By xpathCSKham() {
		return By.xpath(".//*[@id='field_maCskcb']/ul/li/div[3]");
	}
	
	public static By txtBSKham() {
		return By.xpath(".//*[@id='field_bacSiKham']");
	}
	
	
	public static By btnLuu() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}
	
	public static By btnLichSuKham() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[9]/a[3]/i");
	}
	
	public static By xpathSSNgayKham() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[4]/div/div/div/div/div/div/form/div[1]/div/p");
	}

	public static By xpathSSBenhSu() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[3]");
	}
	
	public static By xpathSSNoiKham() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[5]");
	}
	
	public static By xpathSSBacSiKham() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr/td[6]");
	}
	
	
	public static By btnThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div/button");
	}
	
	public static By btnNgayKhamThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[1]/div/span/button");
	}
	
	public static By xpathNgayKhamThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[1]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[5]");
	}
	
	public static By btnNgayBatDauThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[2]/div/span/button");
	}
	
	public static By xpathNgayBatDauThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[2]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[5]");
	}
	
	public static By btnNgayKetThucThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[3]/div/span/button");
	}
	
	public static By xpathNgayKetThucThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[3]/div/div/ul/li[1]/div/table/tbody/tr[4]/td[6]");
	}
	
	public static By dropNoiKhamThemLS() {
		return By.xpath(".//*[@id='field_maCskcb']/div[1]/span");
	}
	
	public static By xpathNoiKhamThemLS() {
		return By.xpath(".//*[@id='field_maCskcb']/ul/li/div[3]");
	}
	
	public static By txtBSKhamThemLS() {
		return By.xpath(".//*[@id='field_bacSiKham']");
	}
	
	public static By btnLuuThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/button[2]");
	}
	
	
	public static By xpathDotKCBSSThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[2]");
	}
	public static By xpathNoiKCBSSThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[5]");
	}
	
	public static By xpathBacSiSSThemLS() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[2]/td[6]");
	}
	
	//----------------------------------xem ho so, tiem chung-----------------------------------------------
	
	public static By btnXemHS() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[9]/a[2]/i");
	}
	
	public static By btnMenu() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/nav/a/span");
	}

	public static By btnTiemChung() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/nav/ul/li[5]/a/span");
	}
	
	public static By btnThemMoiTiemChungTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div/div/div[2]/ng-include/div/div[1]/form/div[1]/div/button");
	}
	
	public static By dropLoaiVacXinTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[1]/div/div/div[1]/span");
	}
	
	public static By xpathLoaiVacXinTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[1]/div/div/ul/li/div[3]");
	}
	
	public static By btnCalenderNgayTiemTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[2]/div/div/span/button");
	}
	
	public static By xpathCalenderTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div[2]/div/div/div/ul/li[1]/div/table/tbody/tr[4]/td[7]");
	}                    
	
	public static By txtPhanUngTrongCT() {
		return By.xpath(".//*[@id='field_phanUngSauTiem']");
	}
	
	public static By btnCalenderNgayHenTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[3]/div[1]/div/div/span/button");
	}
	
	public static By xpathCalenderNgayHenTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[3]/div[1]/div/div/div/ul/li[1]/div/table/tbody/tr[4]/td[8]");
	}
	
	public static By dropChonMuiTiemTrongCT() {
		return By.xpath(".//*[@id='field_lanTiem']");
	}
	
	public static By dropChonCoSoTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[4]/div/div/div/div/div[1]/span");
	}
	
	public static By xpathChonCoSoTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[4]/div/div/div/div/ul/li/div[4]");
	}
	
	public static By btnLuuTrongCT() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}
	
	public static By btnThemNgoaiCT() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div/div/div[2]/ng-include/div/div[2]/form/div[1]/div/button");
	}
}
