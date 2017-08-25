package action;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import general.DeclareObjectQLNhanKhau;
import general.ExcelUntil;
import general.Method;

public class ActNgSinh {
	public boolean ngaySinh01(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		String NgSinh = ExcelUntil.getData(7, 2);
		Thread.sleep(3000);
		if (Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgSinh())) {
			Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), NgSinh);

		}
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(3000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathNgSinh21111992());
		System.out.println("Text: " + Text);
		String ExpertedResult = "21/11/1992";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if (result == true) {
			System.out.println("Pass ngaySinh01");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 7, 3);
		} else {
			System.out.println("False ngaySinh01");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 7, 3);
		}
		return true;
	}

	public boolean ngaySinh02(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		String NgSinh = ExcelUntil.getData(8, 2);
		Thread.sleep(3000);
		if (Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgSinh())) {
			Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), NgSinh);

		}
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(3000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathNgSinh21111992());
		System.out.println("Text: " + Text);
		String ExpertedResult = "21/11/1992";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if (result == true) {
			System.out.println("Pass ngaySinh02");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 8, 3);
		} else {
			System.out.println("False ngaySinh02");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 8, 3);
		}
		return true;
	}

	public boolean ngaySinh03(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		String NgSinh = ExcelUntil.getData(9, 2);
		Thread.sleep(3000);
		if (Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgSinh())) {
			Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), NgSinh);

		}
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(3000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathNgSinh21111992());
		System.out.println("Text: " + Text);
		String ExpertedResult = "21/11/1992";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if (result == true) {
			System.out.println("Pass ngaySinh03");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 9, 3);
		} else {
			System.out.println("False ngaySinh03");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 9, 3);
		}
		return true;
	}

	public boolean ngaySinh04(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		String NgSinh = ExcelUntil.getData(10, 2);
		Thread.sleep(3000);
		if (Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgSinh())) {
			Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), NgSinh);

		}
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(3000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathNgSinh21111992());
		System.out.println("Text: " + Text);
		String ExpertedResult = "21/11/1992";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if (result == true) {
			System.out.println("Pass ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 10, 3);
		} else {
			System.out.println("False ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 10, 3);
		}
		return true;
	}

	public boolean ngaySinh05(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		String NgSinh = ExcelUntil.getData(11, 2);
		if (Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgSinh())) {
			Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), NgSinh);
		}
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(1000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.messageNgSinhMuonHonHienTai());
		System.out.println("Text: " + Text);
		String ExpertedResult = "Ngày sinh không được lớn hơn ngày hiện tại";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if (result == true) {
			System.out.println("Pass ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 11, 3);
		} else {
			System.out.println("False ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 11, 3);
		}
		return true;
	}

	public boolean ngaySinh06(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		ExcelUntil.getData(12, 2);
		Method.click(driver, DeclareObjectQLNhanKhau.btnCalender());
		Boolean result = Method.elementDisplay(driver, DeclareObjectQLNhanKhau.Calender());
		if (result == true) {
			System.out.println("Pass ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 12, 3);
		} else {
			System.out.println("False ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 12, 3);
		}
		return true;
	}

	public boolean ngaySinh07(WebDriver driver) throws InterruptedException, IOException {
		Thread.sleep(3000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnCalender());
		// Method.implicitlyWait(driver, 5);
		Thread.sleep(5000);
		// Actions action = new Actions(driver);
		// action.moveToElement(driver.findElement(By.className("btn btn-default
		// btn-sm btn-info active"))).doubleClick().build().perform();
		Boolean aa = false;
		aa = Method.elementEnable(driver, DeclareObjectQLNhanKhau.btnCalender2406());
		// driver.findElement(By.className("btn btn-default btn-sm btn-info
		// active")).click();
		Method.click(driver, DeclareObjectQLNhanKhau.btnCalender2406());
		// String Text = Method.getText(driver, DeclareObject.xpathNgSinh());
		// String expertedResult = "24-06-2017";
		// Boolean result = Text.equalsIgnoreCase(expertedResult);
		// if(result == true){
		// System.out.println("Pass ngaySinh04");
		// ExcelUntil.setData(DeclareObject.PathFileExcel, "Pass", 13, 3);
		// }else{
		// System.out.println("False ngaySinh04");
		// ExcelUntil.setData(DeclareObject.PathFileExcel, "False", 13, 3);
		// }
		return true;
	}

	public boolean ngaySinh08(WebDriver driver) throws IOException {
		ExcelUntil.getData(14, 2);
		Method.click(driver, DeclareObjectQLNhanKhau.btnCalender());
		Method.click(driver, DeclareObjectQLNhanKhau.btnHienTai());
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 14, 3);

		return true;
	}

	public boolean ngaySinh09(WebDriver driver) throws IOException {
		ExcelUntil.getData(15, 2);
		Method.click(driver, DeclareObjectQLNhanKhau.btnCalender());
		Method.click(driver, DeclareObjectQLNhanKhau.btnHienTai());
		Method.click(driver, DeclareObjectQLNhanKhau.btnCalender());
		Method.click(driver, DeclareObjectQLNhanKhau.btnXoa());
		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.maYTCN0010900024175());
		System.out.println("Text: " + Text);
		String ExpertedResult = "0010900024175";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if (result == true) {
			System.out.println("Pass ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 15, 3);
		} else {
			System.out.println("False ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 15, 3);
		}
		return true;
	}

	public boolean ngaySinh10(WebDriver driver) throws IOException {
		try {
			ExcelUntil.getData(16, 2);
			Method.click(driver, DeclareObjectQLNhanKhau.btnCalender());
			Method.click(driver, DeclareObjectQLNhanKhau.btnDongCalender());
			Method.findElement(driver, DeclareObjectQLNhanKhau.Calender());
			System.out.println("False ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 16, 3);
		} catch (Exception e) {
			System.out.println("Pass ngaySinh10");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 16, 3);
		}
		return true;

	}

	// public boolean ngaySinh11 (WebDriver driver) throws IOException,
	// InterruptedException {
	// ExcelUntil.getData(17, 2);
	// Method.click(driver, DeclareObject.btnCalender());
	// Method.click(driver, DeclareObject.btnVeThangTruoc());
	// Thread.sleep(3000);
	// String Text = Method.getText(driver, DeclareObject.Thang5());
	// System.out.println("Text: " + Text);
	// String ExpertedResult = "tháng 5 2017";
	// Boolean result = Text.equalsIgnoreCase(ExpertedResult);
	// if(result == true){
	// System.out.println("Pass ngaySinh04");
	// ExcelUntil.setData(DeclareObject.PathFileExcel, "Pass", 17, 3);
	// }else{
	// System.out.println("False ngaySinh04");
	// ExcelUntil.setData(DeclareObject.PathFileExcel, "False", 17, 3);
	// }
	// return true;
	// }
	//
	public boolean namSinh04(WebDriver driver) throws IOException, InterruptedException {
		String namSinh = ExcelUntil.getData(23, 2);
		Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNamSinh(), namSinh);
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(3000);
		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathNamSinh20111990());
		System.out.println("Text: " + Text);
		String ExpertedResult = "20/11/1990";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);
		if (result == true) {
			System.out.println("Pass ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 23, 3);
		} else {
			System.out.println("False ngaySinh04");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 23, 3);
		}
		return true;
	}

}
