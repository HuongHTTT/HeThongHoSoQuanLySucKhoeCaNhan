package action;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import general.DeclareObjectQLNhanKhau;
import general.Method;

public class ExcelForLoop {
	public static XSSFWorkbook FWBook;
	public static XSSFSheet FSheet;
	public static XSSFRow FRow;
	public static XSSFCell FCell;

	public static boolean opendExcel(String Path, String Sheet, WebDriver driver) throws IOException, InterruptedException {
		FileInputStream fileInput = new FileInputStream(Path);
		FWBook = new XSSFWorkbook(fileInput);
		FSheet = FWBook.getSheet(Sheet);
		for (int i = 7; i <= 11; i++) {
			String NgSinh = getData(i, 2);
			Thread.sleep(3000);
			if(Method.elementEnable(driver, DeclareObjectQLNhanKhau.xpathNgSinh())){
				Method.senKey(driver, DeclareObjectQLNhanKhau.xpathNgSinh(), NgSinh);
			}
			Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
			Thread.sleep(3000);  

			String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathNgSinh21111992());
			Thread.sleep(3000);  

			System.out.println("Text: " + Text);
			String ExpertedResult = "22/10/1995";
			Boolean result = Text.equalsIgnoreCase(ExpertedResult);

			if(result == true){
				System.out.println("Pass ngay sinh");
				setData(i, 3, "Pass", Path);	
			}
			else{
				System.out.println("False ngay sinh");
				setData(i, 3, "False", Path);				
			}
		}
		return true;
	}

	public static String getData(int rowNum, int colNum) {
		FCell = FSheet.getRow(rowNum).getCell(colNum);
		DataFormatter format = new DataFormatter();
		String CellValue = format.formatCellValue(FCell);
		return CellValue;
	}

	public static  void setData(int rowNum, int colNum, String result, String path) throws IOException {
		FRow = FSheet.getRow(rowNum);
		FCell = FRow.getCell(colNum, FRow.RETURN_BLANK_AS_NULL);
		if(FCell == null){
			FCell = FRow.createCell(colNum);
			FCell.setCellValue(result);
		}else {
			FCell.setCellValue(result);
		}
		FileOutputStream fileOut = new FileOutputStream(path);
		FWBook.write(fileOut);
		fileOut.flush();
		fileOut.close();
	}

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		Thread.sleep(5000);
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtUsername(), "admin");
		Method.senKey(driver, DeclareObjectQLNhanKhau.txtPassword(), "admin");
		Method.click(driver, DeclareObjectQLNhanKhau.btnLogin());
		opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1", driver);
	}


}
