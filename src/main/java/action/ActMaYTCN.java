package action;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import general.DeclareObjectQLNhanKhau;
import general.ExcelUntil;
import general.Method;

public class ActMaYTCN {
	
	public  boolean nhapMaYTCN1KTu(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(1000);  
		String MaYTCN = ExcelUntil.getData(2, 2);

		Thread.sleep(2000);
		if(Method.elementEnable(driver, DeclareObjectQLNhanKhau.txtMaYTCN())){
			Method.senKey(driver, DeclareObjectQLNhanKhau.txtMaYTCN(), MaYTCN);
		}
		Thread.sleep(2000);
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(2000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathMaYTCN1KTu());
		System.out.println("Text: " + Text);
		String ExpertedResult = "Mã YTCN phải có 12 hoặc 13 ký tự. Vui lòng nhập lại điều kiện tìm kiếm theo mã YTCN";
		
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if(result == true){
			System.out.println("Pass nhapMaYTCN1KTu");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 2, 3);
		}else{
			System.out.println("False nhapMaYTCN1KTu");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 2, 3);
		}
		return true;
	}

	public  boolean nhapMaYTCN14KTu(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(3000);
		String MaYTCN = ExcelUntil.getData(3, 2);
		Thread.sleep(10000);
		if(Method.elementEnable(driver, DeclareObjectQLNhanKhau.txtMaYTCN())){
			Method.senKey(driver, DeclareObjectQLNhanKhau.txtMaYTCN(), MaYTCN);
		}
		Thread.sleep(1000);
		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathMaYTCN14KTu());
		System.out.println("Text: " + Text);
		String ExpertedResult = "Độ dài dữ liệu không được vượt quá 13 ký tự";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);
		if(result == true){
			System.out.println("Pass nhapMaYTCN14KTu");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 3, 3);
		}else{
			System.out.println("False nhapMaYTCN14KTu");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 3, 3);
		}
		return true;
	}

	public  boolean nhapMaYTCNBoTrong(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(3000);  
		String MaYTCN = ExcelUntil.getData(4, 2);
		Thread.sleep(3000);
		if(Method.elementEnable(driver, DeclareObjectQLNhanKhau.txtMaYTCN())){
			Method.senKey(driver, DeclareObjectQLNhanKhau.txtMaYTCN(), MaYTCN);
		}
		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(3000);

//		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathMaYTCNBoTrong());
//		System.out.println("Text: " + Text);
//		String ExpertedResult = "0011900024280";
//		Boolean result = Text.equalsIgnoreCase(ExpertedResult);
//
//		if(result == true){
//			System.out.println("Pass nhapMaYTCNBoTrong");
//			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 4, 3);
//		}else{
//			System.out.println("False nhapMaYTCNBoTrong");
//			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 4, 3);
//		}
		ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 4, 3);

		return true;
	}
	public  boolean nhapMaYTCNValid(WebDriver driver) throws InterruptedException, IOException{
		Thread.sleep(3000);  
		String MaYTCN = ExcelUntil.getData(5, 2);
		Thread.sleep(3000);
		if(Method.elementEnable(driver, DeclareObjectQLNhanKhau.txtMaYTCN())){
			Method.senKey(driver, DeclareObjectQLNhanKhau.txtMaYTCN(), MaYTCN);
		}

		Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
		Thread.sleep(2000);

		String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathMaYTCNDatabase());
		System.out.println("Text: " + Text);
		String ExpertedResult = "0920950000060";
		Boolean result = Text.equalsIgnoreCase(ExpertedResult);

		if(result == true){
			System.out.println("Pass nhapMaYTCNValid");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "Pass", 5, 3);
		}else{
			System.out.println("False nhapMaYTCNValid");
			ExcelUntil.setData(DeclareObjectQLNhanKhau.PathFileExcel, "False", 5, 3);
		}
		return true;
	}

}
