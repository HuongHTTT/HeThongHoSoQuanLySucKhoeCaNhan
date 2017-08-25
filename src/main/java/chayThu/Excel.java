package chayThu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import general.DeclareObjectQLNhanKhau;

public class Excel {
	public static XSSFWorkbook FWBook;
	public static XSSFSheet FSheet;
	public static XSSFRow FRow;
	public static XSSFCell FCell;
	
	public static void opendExcel(String Path, String Sheet) throws IOException{
		FileInputStream fileInput = new FileInputStream(Path);
		FWBook = new XSSFWorkbook(fileInput);
		FSheet = FWBook.getSheet(Sheet);
	}
	
	public static String getData(int RowNum, int ColumNum) {
		FRow = FSheet.getRow(RowNum);
		FCell = FRow.getCell(ColumNum);
		DataFormatter format = new DataFormatter();
		String CellValue = format.formatCellValue(FCell);
		return CellValue;
	}
	
	public static void senkey(WebDriver driver) throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(DeclareObjectQLNhanKhau.txtUsername()).sendKeys("admin");
		driver.findElement(DeclareObjectQLNhanKhau.txtPassword()).sendKeys("admin");
		driver.findElement(DeclareObjectQLNhanKhau.btnLogin()).click();
		Thread.sleep(10000);

		String MaYTCN = getData(2, 2);
		Thread.sleep(10000);
		WebElement ele = driver.findElement(DeclareObjectQLNhanKhau.txtMaYTCN());
		if(ele.isEnabled()){
			ele.sendKeys(MaYTCN);
		}
		Thread.sleep(10000);

		driver.findElement(DeclareObjectQLNhanKhau.btnTimKiem());
	}
	
	public static void main( String[] args ) throws InterruptedException, IOException{
		System.setProperty("webdriver.gecko.driver", "D:\\Java_Huong\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://10.60.110.21:8080/#/tt-ca-nhan");
		Excel exc = new Excel();
		exc.opendExcel("D:\\Dev\\DemoJava\\ProjectHospital\\Excel\\TestDataHospital.xlsx", "Sheet1");
		exc.senkey(driver);
	}
}
