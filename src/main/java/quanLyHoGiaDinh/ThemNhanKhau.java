package quanLyHoGiaDinh;

import org.openqa.selenium.WebDriver;

import general.DeclareObjectQLNhanKhau;
import general.ExcelUntil;
import general.Method;

public class ThemNhanKhau {
	public boolean them1(WebDriver driver) throws InterruptedException {
		Method.click(driver, DeclareObjectQLNhanKhau.btnThemMoi());
		Method.implicitlyWait(driver, 2);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtHoTen(), ExcelUntil.getData(5, 1));
		Thread.sleep(2000);
		// Actions acts = new Actions(driver);
		// acts.sendKeys(DeclareObject.txtNgaySinh(), ExcelUntil.getData(5,
		// 1)).build().perform();
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtNgaySinh(), ExcelUntil.getData(5, 2));
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhKhaiSinh());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathCanTho());
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhThanhPho());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathHaNoi());
		Method.click(driver, DeclareObjectQLNhanKhau.drophHuyen());
		Method.click(driver, DeclareObjectQLNhanKhau.xpatBaVi());
		Method.click(driver, DeclareObjectQLNhanKhau.dropPhuongXa());
		Method.click(driver, DeclareObjectQLNhanKhau.xpatBaTrai());
		Method.click(driver, DeclareObjectQLNhanKhau.btnTiepTuc());
		Thread.sleep(5000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtDiaChiHienTai(), ExcelUntil.getData(5, 3));
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLNhanKhau.checkBoxDiaChi());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnLuuHoSo());
		return true;
	}

	public boolean them2(WebDriver driver) throws InterruptedException {
		Method.click(driver, DeclareObjectQLNhanKhau.btnThemMoi());
		Method.implicitlyWait(driver, 2);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtHoTen(), ExcelUntil.getData(6, 1));
		Method.click(driver, DeclareObjectQLNhanKhau.radioButtonGioiTinhNu());
		Thread.sleep(2000);
		// Actions acts = new Actions(driver);
		// acts.sendKeys(DeclareObject.txtNgaySinh(), ExcelUntil.getData(5,
		// 1)).build().perform();
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtNgaySinh(), ExcelUntil.getData(6, 2));
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhKhaiSinh());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathCanTho());
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhThanhPho());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathHaNoi());
		Method.click(driver, DeclareObjectQLNhanKhau.drophHuyen());
		Method.click(driver, DeclareObjectQLNhanKhau.xpatBaVi());
		Method.click(driver, DeclareObjectQLNhanKhau.dropPhuongXa());
		Method.click(driver, DeclareObjectQLNhanKhau.xpatBaTrai());
		Thread.sleep(2000);

		Method.click(driver, DeclareObjectQLNhanKhau.btnTiepTuc());
		Thread.sleep(5000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtDiaChiHienTai(), ExcelUntil.getData(6, 3));
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLNhanKhau.checkBoxDiaChi());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnLuuHoSo());
		return true;
	}

	public boolean them3(WebDriver driver) throws InterruptedException {
		Method.click(driver, DeclareObjectQLNhanKhau.btnThemMoi());
		Method.implicitlyWait(driver, 2);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtHoTen(), ExcelUntil.getData(7, 1));
		Thread.sleep(2000);
		// Actions acts = new Actions(driver);
		// acts.sendKeys(DeclareObject.txtNgaySinh(), ExcelUntil.getData(5,
		// 1)).build().perform();
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtNgaySinh(), ExcelUntil.getData(7, 2));
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhKhaiSinh());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathCanTho());
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhThanhPho());
		Method.click(driver, DeclareObjectQLNhanKhau.xpathHaNoi());
		Method.click(driver, DeclareObjectQLNhanKhau.drophHuyen());
		Method.click(driver, DeclareObjectQLNhanKhau.xpatBaVi());
		Method.click(driver, DeclareObjectQLNhanKhau.dropPhuongXa());
		Method.click(driver, DeclareObjectQLNhanKhau.xpatBaTrai());
		Method.click(driver, DeclareObjectQLNhanKhau.btnTiepTuc());
		Thread.sleep(5000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtDiaChiHienTai(), ExcelUntil.getData(7, 3));
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLNhanKhau.checkBoxDiaChi());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnLuuHoSo());
		return true;
	}

	public boolean soSanh(WebDriver driver) throws InterruptedException {
		Thread.sleep(7000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtHoTenSearch(), ExcelUntil.getData(5, 1));
		Method.senKeyNotClear(driver, DeclareObjectQLNhanKhau.dropGioiTinhSearch(), "N");
		Thread.sleep(2000);
		// neu chon gioi tinh nu tì thêm dòng dưới
		// Method.senKeyNotClear(driver, DeclareObject.dropGioiTinhSearch(),
		// "N");

		Thread.sleep(2000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), ExcelUntil.getData(5, 2));
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.tinhHaNoiSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.dropQuanSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.quanBaViSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.dropHuyenSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.huyenBaTraiSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(5000);
		// String getHoTen = Method.getText(driver,
		// DeclareObjectQLNhanKhau.xpathSSHoTen());
		// String hoTen = ExcelUntil.getData(5, 1);
		// System.out.println("Ho Ten excel:" + hoTen);
		// System.out.println("Ho Ten:" + getHoTen);
		String getHoTen = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSHoTen());
		String hoTen = ExcelUntil.getData(5, 1);
		System.out.println("Họ Tên:" + getHoTen);

		String getNgaySinh = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSNgaySinh());
		String ngaySinh = ExcelUntil.getData(5, 2);
		System.out.println("Ngay Sinh:" + getNgaySinh);
		System.out.println("Ngay Sinh:" + ngaySinh);

		String getGioiTinh = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSGioiTinh());
		String gioiTinh = "Nam";
		System.out.println("Gioi tinh:" + getGioiTinh);
		System.out.println("Ngay Sinh:" + gioiTinh);

		String getDiaChi = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSDiaChi());
		String diaChi = "không có số nhà - Xã Ba Trại - Huyện Ba Vì - Thành phố Hà Nội";
		System.out.println("Dia chi:" + getDiaChi);
		System.out.println("Ngay Sinh:" + diaChi);

		if (hoTen.equalsIgnoreCase(getHoTen) && gioiTinh.equalsIgnoreCase(getGioiTinh)
				&& ngaySinh.equalsIgnoreCase(getNgaySinh) && diaChi.equalsIgnoreCase(getDiaChi)) {
			// if(hoTen.equalsIgnoreCase(getHoTen) &&
			// ngaySinh.equalsIgnoreCase(getNgaySinh) &&
			// gioiTinh.equalsIgnoreCase(getGioiTinh) &&
			// diaChi.equalsIgnoreCase(getDiaChi)){
			// if(ngaySinh.equalsIgnoreCase(getNgaySinh)){
			Thread.sleep(2000);
			System.out.println("Pass thong tin");
		} else {
			Thread.sleep(2000);
			System.out.println("False thong tin");
		}
		return true;
	}

	public boolean soSanh2(WebDriver driver) throws InterruptedException {
		Thread.sleep(7000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtHoTenSearch(), ExcelUntil.getData(6, 1));
		Method.senKeyNotClear(driver, DeclareObjectQLNhanKhau.dropGioiTinhSearch(), "N");
		Thread.sleep(2000);
		// neu chon gioi tinh nu tì thêm dòng dưới
		Method.senKeyNotClear(driver, DeclareObjectQLNhanKhau.dropGioiTinhSearch(), "N");

		Thread.sleep(2000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), ExcelUntil.getData(6, 2));
		Method.click(driver, DeclareObjectQLNhanKhau.dropTinhSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.tinhHaNoiSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.dropQuanSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.quanBaViSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.dropHuyenSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.huyenBaTraiSearch());
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(5000);
		String getHoTen = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSHoTen());
		String hoTen = ExcelUntil.getData(6, 1);
		System.out.println("Họ Tên:" + getHoTen);

		String getNgaySinh = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSNgaySinh());
		String ngaySinh = ExcelUntil.getData(6, 2);
		System.out.println("Ngay Sinh:" + getNgaySinh);

		String getGioiTinh = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSGioiTinh());
		String gioiTinh = "Nữ";
		System.out.println("Gioi tinh:" + getGioiTinh);

		String getDiaChi = Method.getText(driver, DeclareObjectQLNhanKhau.xpathSSDiaChi());
		String diaChi = "không có số nhà - Xã Ba Trại - Huyện Ba Vì - Thành phố Hà Nội";
		System.out.println("Dia chi:" + getDiaChi);
		if (hoTen.equalsIgnoreCase(getHoTen) && ngaySinh.equalsIgnoreCase(getNgaySinh)
				&& gioiTinh.equalsIgnoreCase(getGioiTinh) && diaChi.equalsIgnoreCase(getDiaChi)) {
			System.out.println("Pass thong tin 2");
		} else {
			System.out.println("False thong tin 2");
		}
		return true;
	}
}
