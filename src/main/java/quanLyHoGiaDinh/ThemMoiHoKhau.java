package quanLyHoGiaDinh;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import general.DeclareObjectQLHoKhau;
import general.ExcelUntil;
import general.Method;

public class ThemMoiHoKhau {
	
	public boolean timKiem(WebDriver driver) {
		try {
			
		Method.click(driver, DeclareObjectQLHoKhau.dropTinh());
		Method.click(driver, DeclareObjectQLHoKhau.xpathTinh());
		Method.click(driver, DeclareObjectQLHoKhau.dropQuan());
		Method.click(driver, DeclareObjectQLHoKhau.xpathQuan());
		Method.click(driver, DeclareObjectQLHoKhau.dropPhuong());
		Method.click(driver, DeclareObjectQLHoKhau.xpathPhuong());
		Method.senKey(driver, DeclareObjectQLHoKhau.txtChuHo(), ExcelUntil.getData(5, 1));
		Method.click(driver, DeclareObjectQLHoKhau.btnTimKiem());
		Method.click(driver, DeclareObjectQLHoKhau.btnThaoTac());
//		Alert alert = driver.switchTo().alert();
//		alert.accept();
		Method.click(driver, DeclareObjectQLHoKhau.btnXoa());

		} catch (Exception e) {
			System.out.println("Khong tim thay chu ho nay");
		}
		return true;

	}
	
	
	public boolean themMoiHoKhau(WebDriver driver) throws InterruptedException {
		timKiem(driver);
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLHoKhau.btnThemMoiHK());
		Method.click(driver, DeclareObjectQLHoKhau.dropChuHo());
		Method.senKey(driver, DeclareObjectQLHoKhau.txtMaYTCNSearch(), ExcelUntil.getData(5, 4));
		Method.click(driver, DeclareObjectQLHoKhau.btnTimKiemSearch());
		Method.click(driver, DeclareObjectQLHoKhau.btnThaoTacSearch());
		Method.click(driver, DeclareObjectQLHoKhau.btnLuu());
		soSanhChuHo(driver);
		return true;
	}

	public boolean soSanhChuHo(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLHoKhau.linkChuHo());
		Thread.sleep(3000);
		String getmaYTCN = Method.getText(driver, DeclareObjectQLHoKhau.xpathMaYTCNChuHo());
		String maYTCN = ExcelUntil.getData(5, 4);
		System.out.println("Ma YTCN chủ hộ:" + getmaYTCN);

		String getQHChuHo = Method.getText(driver, DeclareObjectQLHoKhau.xpathQHVoiChuHo());
		String qHChuHo = ExcelUntil.getData(5, 6);
		System.out.println("Quan he voi chu ho:" + getQHChuHo);

		if(maYTCN.equalsIgnoreCase(getmaYTCN) && qHChuHo.equalsIgnoreCase(getQHChuHo)){
			System.out.println("Pass");
		}else{
			System.out.println("False");
		}
		Thread.sleep(5000);

		Method.click(driver, DeclareObjectQLHoKhau.btnDong());

		return true;
	}

	//--------------------------------them nhan khau moi vao ho khau sau khi tao ho khau------------------------------------
	
	public boolean themNKVaoHK(WebDriver driver) throws InterruptedException {
		Thread.sleep(3000);
		Method.click(driver, DeclareObjectQLHoKhau.btnThemNhanKhau());
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLHoKhau.btnChonDSNhanKhau());
		Method.senKey(driver, DeclareObjectQLHoKhau.txtMaYTCNSearch(), ExcelUntil.getData(6, 4));
		Method.click(driver, DeclareObjectQLHoKhau.btnTimKiemSearch());
		Thread.sleep(3000);

		Method.click(driver, DeclareObjectQLHoKhau.btnThaoTacSearch());
		Thread.sleep(3000);

		WebElement ele = driver.findElement(By.xpath(".//*[@id='field_loaiQh']"));
		Select quanHe = new Select(ele);
		quanHe.selectByVisibleText("Vợ");

		Thread.sleep(3000);
		Method.click(driver, DeclareObjectQLHoKhau.btnLuuThemNK());
		soSanhThemNK(driver);
		return true;
	}
	
	public boolean soSanhThemNK(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLHoKhau.linkNK());
		Thread.sleep(3000);
		String getmaYTCN = Method.getText(driver, DeclareObjectQLHoKhau.xpathMaYTCNChuHo());
		String maYTCN = ExcelUntil.getData(6, 4);
		System.out.println("Ma YTCN nhan khau:" + getmaYTCN);
		
//		String getHoTen = driver.findElement(By.xpath(".//*[@id='ttCaNhan']/div/div/div[1]/div/div/div/div[2]/div/h3")).getText();
//		String hoTen = ExcelUntil.getData(6, 1);
//		System.out.println("Ho Ten:" + getHoTen);

		String getQHChuHo = Method.getText(driver, DeclareObjectQLHoKhau.xpathQHVoiChuHo());
		String qHChuHo = ExcelUntil.getData(6, 6);
		System.out.println("Quan he voi chủ hộ:" + getQHChuHo);

		if(maYTCN.equalsIgnoreCase(getmaYTCN) && qHChuHo.equalsIgnoreCase(getQHChuHo)){
			System.out.println("Pass");
		}else{
			System.out.println("False");
		}
		Thread.sleep(5000);
		Method.click(driver, DeclareObjectQLHoKhau.btnDong());
		return true;
	}


}
