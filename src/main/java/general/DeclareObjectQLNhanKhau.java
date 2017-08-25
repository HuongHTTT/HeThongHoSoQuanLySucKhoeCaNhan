package general;

import org.openqa.selenium.By;

public class DeclareObjectQLNhanKhau {
	public static final String PathFileExcel = "D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx";

	public static By txtUsername() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[3]/div/input");
	}

	
	public static By txtPassword() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[4]/div/input");
	}

	public static By btnLogin() {
		return By.xpath(".//*[@id='body']/div[1]/div/div[1]/form/div[5]/button");
	}

	public static By txtMaYTCN() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[1]/input");
	}

	public static By btnTimKiem() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[2]/div/button");
	}

	public static By xpathMaYTCN1KTu() {
		return By.xpath(".//*[@id='toast-container']/div/div/div/div");
	}

	public static By xpathMaYTCN14KTu() {
		return By.xpath(".//*[@id='toast-container']/div[1]/div/div/div");
	}

	public static By xpathMaYTCNBoTrong() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[10]/td[2]");
	}

	public static By xpathMaYTCNDatabase() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]");
	}

	public static By xpathNgSinh() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/input[1]");
	}

	public static By xpathNgSinh21111992() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[4]");
	}

	public static By messageNgSinhMuonHonHienTai() {
		return By.xpath(".//*[@id='toast-container']/div/div/div/div");
	}

	public static By btnCalender() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/span/button");
	}

	public static By Calender() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/div/ul");
	}

	public static By btnCalender2406() {
		return By.xpath(".//*[@id='datepicker-1351-6345-26']/button");
	}

	public static By btnHienTai() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/div/ul/li[2]/span/button[1]");

	}

	public static By btnXoa() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/div/ul/li[2]/span/button[2]");
	}

	public static By maYTCN0010900024175() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[2]");
	}

	public static By btnDongCalender() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/div/ul/li[2]/button");
	}

	public static By btnVeThangTruoc() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/div/ul/li[1]/div/table/thead/tr[1]/th[1]/button");
	}

	public static By Thang5() {
		return By.xpath(".//*[@id='datepicker-1470-1310-title']");
	}

	public static By xpathNamSinh() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[2]/div[1]/div/input[2]");
	}

	public static By messageNamSinhInvalid() {
		return By.xpath(".//*[@id='toast-container']/div/div/div/div");
	}

	public static By xpathNamSinh20111990() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[4]");
	}

	public static By xpathMaYTCN0381950000017() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[4]");
	}

	public static By txtEmail() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[3]/div[1]/input");
	}

	public static By xpathMaYTCN001091002419X() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[2]");
	}

	public static By txtHoTenBo() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[4]/div[1]/input");
	}

	public static By dropTrangThai() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[5]/div[1]/select");
	}

	public static By xpathTatCa() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[5]/div[1]/select/option[1]");
	}

	public static By xpathDaKhamLapHoSo() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[5]/div[1]/select/option[2]");
	}

	public static By xpathChuaKhamLapHoSo() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[5]/div[1]/select/option[3]");
	}

	public static By xpathNgayKhamLapHoSo() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[5]/div[2]/div/input");
	}

	public static By btnThemMoi() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[2]/div[2]/button[1]");
	}

	public static By txtHoTen() {
		return By.xpath(".//*[@id='field_hoTen']");
	}

	public static By radioButtonGioiTinhNu() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[1]/div[2]/div/label[2]/span");
	}

	public static By txtNgaySinh() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[1]/div[3]/div/input");
	}

	public static By dropTinhKhaiSinh() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[2]/div[1]/div/div[1]/span/span[1]");

	}

	public static By xpathCanTho() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[2]/div[1]/div/ul/li/div[3]");
	}

	public static By dropTinhThanhPho() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[4]/div/address-picker-code/div/div[1]/div/div[1]/span/span[1]");
	}

	public static By xpathHaNoi() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[4]/div/address-picker-code/div/div[1]/div/ul/li/div[4]");
	}

	public static By drophHuyen() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[4]/div/address-picker-code/div/div[2]/div/div[1]/span");
	}

	public static By xpatBaVi() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[4]/div/address-picker-code/div/div[2]/div/ul/li/div[3]");
	}

	public static By dropPhuongXa() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[4]/div/address-picker-code/div/div[3]/div/div[1]/span");
	}

	public static By xpatBaTrai() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[4]/div/address-picker-code/div/div[3]/div/ul/li/div[4]");
	}

	public static By btnTiepTuc() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[1]/form/div[7]/button[1]");
	}

	public static By txtDiaChiHienTai() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[2]/form/div[7]/div/input");
	}

	public static By checkBoxDiaChi() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[2]/form/div[9]/div/div/label/span");
	}

	public static By btnLuuHoSo() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div[2]/section[2]/form/div[18]/button[2]");
	}

	public static By xpathSSHoTen() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[3]");
	}

	public static By xpathSSNgaySinh() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[4]");
	}

	public static By xpathSSGioiTinh() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[5]");
	}

	public static By xpathSSDiaChi() {
		return By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[6]");
	}

	// ---------------------------------tim
	// kiem---------------------------------------------

	public static By txtHoTenSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[2]/input");
	}

	public static By dropGioiTinhSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[3]/select");
	}

	// public static By dropGioiTinhNamSearch() {
	// return
	// By.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[1]/div[3]/select/option[2]");
	// }
	//
	public static By dropTinhSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[6]/div[1]/address-picker-role/div/div[1]/div/div[1]/span");
	}

	public static By tinhHaNoiSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[6]/div[1]/address-picker-role/div/div[1]/div/ul/li/div[4]");
	}

	public static By dropQuanSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[6]/div[1]/address-picker-role/div/div[2]/div/div[1]/span");
	}

	public static By quanBaViSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[6]/div[1]/address-picker-role/div/div[2]/div/ul/li/div[3]");
	}

	public static By dropHuyenSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[6]/div[1]/address-picker-role/div/div[3]/div/div[1]/span");
	}

	public static By huyenBaTraiSearch() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[1]/div/div/div/div/div/div[1]/form/div[6]/div[1]/address-picker-role/div/div[3]/div/ul/li/div[4]");
	}

	// ----------------------------------sua thong tin, them nhan khau vao ho
	// khau--------------------------------------

	public static By btnSua() {
		return By.xpath(
				".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr/td[8]/a[2]/i");
	}

	public static By btnRefreshChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div/section/form/div[1]/div[2]/div[1]/div/span/button[2]");
	}

	public static By btnChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div/section/form/div[1]/div[2]/div[1]/div/span/button[1]");
	}

	public static By dropTinhTPChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/address-picker-role/div/div[1]/div/div[1]/span/span[1]");
	}

	public static By xpathTPHaNoiChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/address-picker-role/div/div[1]/div/ul/li/div[4]");
	}

	public static By dropQuanChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/address-picker-role/div/div[2]/div/div[1]/span");
	}

	public static By xpathQuanChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/address-picker-role/div/div[2]/div/ul/li/div[3]");
	}

	public static By dropPhuongChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/address-picker-role/div/div[3]/div/div[1]/span");
	}

	public static By xpathPhuongChonHK() {
		return By.xpath(
				".//*[@id='body']/div[1]/div/div/form/div[2]/div[1]/div/address-picker-role/div/div[3]/div/ul/li/div[4]");
	}

	public static By txtChuHoChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[2]/div[1]/input");
	}

	public static By btnTimKiemChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[3]/button");
	}

	public static By btnThaoTacChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/form/div[2]/div[4]/div/div/table/tbody/tr/td[6]/div/a/i");
	}

	public static By dropQHVoiChuHoChonHK() {
		return By.xpath(".//*[@id='qhChuHo']");
	}

	public static By xpathQHVoiChuHoChonHK() {
		return By.xpath(".//*[@id='qhChuHo']/option[10]");
	}

	public static By btnLuuChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div/div[2]/div/div/div/div/section/form/div[18]/button[1]");
	}

	public static By linkMaHoGDChonHK() {
		return By
				.xpath(".//*[@id='body']/div[1]/div[4]/div[2]/div/div/div[3]/div[3]/div/div/table/tbody/tr[1]/td[7]/a");
	}

	public static By xpathMaYTCNChuHoChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div[2]/div[1]/form/div[2]/div[1]/p");
	}

	public static By xpathQHConChuHoChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div[2]/div[2]/table/tbody/tr/td/div/table/tbody/tr[2]/td[2]");
	}

	public static By btnDongChonHK() {
		return By.xpath(".//*[@id='body']/div[1]/div/div/div[2]/div[4]/button");
	}
}
