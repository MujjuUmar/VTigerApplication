package Pratice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
//import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import GenericUtility.ExcelUtility;

public class FetchingDataFromExcleFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\Admin\\Desktop\\TestData.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Birds");
		DataFormatter df=new DataFormatter();
//		Row r=sh.getRow(1);
//		for(int i=0;i<r.getLastCellNum();i++) {
//			Cell c=r.getCell(i);
//			String value=df.formatCellValue(c);
//			System.out.print(value+ " ");
//		}
		//Fetching Data From Multiple Row
//		for(int i=1;i<=sh.getLastRowNum();i++) {
//			Row r=sh.getRow(i);
//			for( int j=0; j<r.getLastCellNum();j++) {
//				Cell c=r.getCell(j);
//				String value = df.formatCellValue(c);
//				System.out.print(value+ " " );
//			}
//			System.out.println();
//		}
		ExcelUtility eutil = new ExcelUtility();
		List<String> all = eutil.getMultipleCellDataFromExcel("Birds", 1, 1);
		System.out.println(all);
	}

}
