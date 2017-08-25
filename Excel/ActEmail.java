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

import general.DeclareObjectQLNhanKhau;
import general.Method;

public class ActEmail {
	public static XSSFWorkbook FWBook;
	public static XSSFSheet FSheet;
	public static XSSFRow FRow;
	public static XSSFCell FCell;

	public static boolean opendExcel(String Path, String Sheet, WebDriver driver) throws IOException, InterruptedException {
		FileInputStream fileInput = new FileInputStream(Path);
		FWBook = new XSSFWorkbook(fileInput);
		FSheet = FWBook.getSheet(Sheet);
		for (int i = 25; i < 28; i++) {
			String Email = getData(i, 2);
			Thread.sleep(3000);
			if(Method.elementEnable(driver, DeclareObjectQLNhanKhau.txtEmail())){
				Method.senKey(driver, DeclareObjectQLNhanKhau.txtEmail(), Email); 
			}
			Method.click(driver, DeclareObjectQLNhanKhau.btnTimKiem());
			Thread.sleep(3000);  

			String Text = Method.getText(driver, DeclareObjectQLNhanKhau.xpathMaYTCN001091002419X());
			Thread.sleep(3000);  

			System.out.println("Text: " + Text);
			String ExpertedResult = "001091002419X";
			Boolean result = Text.equalsIgnoreCase(ExpertedResult);

			if(result == true){
				System.out.println("Pass Nam Sinh");
				setData(i, 3, "Pass", Path);	
			}
			else{
				System.out.println("False Nam Sinh");
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
}
