package Pratice;

//import java.io.FileInputStream;
//import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
//import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.ss.usermodel.Row;
//import org.apache.poi.ss.usermodel.Sheet;
//import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericUtility.ExcelUtility;
import GenericUtility.PropertiesUtility;

public class WritingDataToExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
//		FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
//		Workbook wb = WorkbookFactory.create(fis);
//		Sheet sh = wb.getSheet("Cars");
//		Row r = sh.getRow(0);
//		Cell c=r.getCell(1);
//		c.setCellValue("Tata");
//		FileOutputStream fos = new FileOutputStream("C:\\\\Users\\\\Admin\\\\Desktop\\\\TestData.xlsx");
//		wb.write(fos);
//		
		ExcelUtility eutil=new ExcelUtility();
		eutil.writeDataToExcel("Birds", 2, 0, "Adeeba");
		eutil.getMultipleCellDataFromExcel(null, 0, 0);
		
		
		
	}

}