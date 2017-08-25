package general;

import org.openqa.selenium.By;

public class DeclareObjectQLHoKhau {
	
	//----------------------------tim kiem------------------------------------------
	public static By dropTinh() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[1]/div/div[1]/span");
		
	}
	
	public static By xpathTinh() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[1]/div/ul/li/div[4]");
	}
	
	public static By dropQuan() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[2]/div/div[1]/span");
	}
	
	public static By xpathQuan() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[2]/div/ul/li/div[3]");
	}
	
	

	public static By dropPhuong() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[3]/div/div[1]/span");
	}
	
	
	public static By xpathPhuong() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[1]/div/div/address-picker-role/form/div/div[3]/div/ul/li/div[4]");
	}
	
	public static By txtChuHo() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[1]/div[2]/div[1]/div/input");
	}
	
	public static By btnTimKiem() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/button");
	}
	
	public static By btnThaoTac() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[3]/div/div/table/tbody/tr[1]/td[7]/div/a[3]/i");
	}
	
	//
	public static By btnXoa() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}
	//----------------------------them ho khau----------------------------------------
	public static By btnThemMoiHK() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[2]/div[2]/div[2]/button[1]");
	}
	
	public static  By dropChuHo() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[1]/div[2]/div/span/button");
	}
	
	public static By txtMaYTCNSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}                    
	
	public static By btnTimKiemSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[1]/div/div/div/div/div[2]/div/button");
	}
	
	public static By btnThaoTacSearch() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div[2]/table/tbody/tr/td[8]/a/i");
	}
	
	public static By btnLuu() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[3]/button[2]");
	}
	
	public static By linkChuHo() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr/td[1]/a");
	}
	
	
	public static By xpathMaYTCNChuHo() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[1]/div[1]/p");
	}
//	public static By xpathMaHoGDChuHo() {
//		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[2]/div[1]/p");
//	}
	public static By xpathQHVoiChuHo() {
		return By.xpath(".//*[@id='ttCaNhan']/div/div/div[2]/form/div[2]/div[2]/p");
	}
	
	public static By btnDong() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[3]/button");
	}
	
	public static By btnThemNhanKhau() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[1]/div/div/a/span[2]");
	}
	
	public static By btnChonDSNhanKhau() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[2]/div/div[1]/div/span/button");
	}
	public static By dropQHVoiChuHo() {
		return By.xpath(".//*[@id='field_loaiQh']");
	}
	
	public static By dropQHVoChuHo() {
		return By.xpath(".//*[@id='field_loaiQh']/option[6]");
	}

	public static By btnLuuThemNK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/form/div[3]/a[2]");
	}
	
	public static By linkNK() {
		return By.xpath(".//*[@id='hokhau_dialog']/div[10]/div[1]/div/div[2]/table/tbody/tr[2]/td[1]/a");
	}
}
