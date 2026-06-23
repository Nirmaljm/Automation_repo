package utilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import constant.Constants;

public class ExcelUtility {

	static FileInputStream f; // to enter into an external file
	static XSSFWorkbook wb;// to read details/data from workbook
	static XSSFSheet sh;// to read details from sheet in excel

	//getStringData  - 
	public static String getStringData(int a, int b,String sheet) throws IOException {
		f = new FileInputStream(Constants.TestDatafile); // to give excel path
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet(sheet);// method to get details from sheet:getSheet()
		XSSFRow r = sh.getRow(a); // method to read details from row:getRow()
		XSSFCell c = r.getCell(b);// method to read details from cell:getCell()
		return c.getStringCellValue();// method to get string value from cell:getStringCellValue()
	}

	public static String getIntegerData(int a, int b,String sheet) throws IOException {
		f = new FileInputStream(Constants.TestDatafile);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		int var = (int) c.getNumericCellValue(); // to convert value in c(double value) to int :typecasting
		return String.valueOf(var);// any datatype to string conversion:valueOf()

	}

	public static String getFloatData(int a, int b,String sheet) throws IOException {
		f = new FileInputStream(Constants.TestDatafile);
		wb = new XSSFWorkbook(f);
		sh = wb.getSheet("sheet");
		XSSFRow r = sh.getRow(a);
		XSSFCell c = r.getCell(b);
		float var = (float) c.getNumericCellValue(); // to convert value in c(double value) to int :typecasting
		return String.valueOf(var);// any datatype to string conversion:valueOf()

	}
}
