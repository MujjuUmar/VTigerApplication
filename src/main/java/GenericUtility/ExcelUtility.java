
package GenericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.xmlbeans.impl.xb.xsdschema.Public;

public class ExcelUtility {
	/**
	 * This is the Generic Method to fetch the data from Multiple Cell Data From Excel File
	 * @param sheetName
	 * @param startRowIndex
	 * @param startCellInder
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public List<String> getMultipleCellDataFromExcel(String sheetName, int startRowIndex, int startCellInder) throws EncryptedDocumentException, IOException{
		FileInputStream fis=new FileInputStream(IPathUtility.excelPath);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet(sheetName);
		DataFormatter df=new DataFormatter();
		List<String> al= new ArrayList<String>();
		for(int i=startRowIndex; i<sh.getLastRowNum();i++) {
			Row r=sh.getRow(i);
			for(int j=startCellInder;j<r.getLastCellNum();j++) {
				Cell c=r.getCell(j);
				String value = df.formatCellValue(c);
				al.add(value);
			}
		}
		return al;
	}
	/**
	 * This is the Generic Method To Write the data into Excel File
	 * @param sheetName
	 * @param rowIndex
	 * @param cellIndex
	 * @param value
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public void writeDataToExcel(String sheetName, int rowIndex, int cellIndex, String value ) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetName);
		Row r = sh.getRow(rowIndex);
		Cell c=r.getCell(cellIndex);
		c.setCellValue(value);
		FileOutputStream fos = new FileOutputStream(IPathUtility.excelPath);
		wb.write(fos);
	}
	
	/**
	 * This is the Generic Utility  Method to fetch the data from single cell
	 * @param Sheetname
	 * @param rowIndex
	 * @param cellIndex
	 * @return
	 * @throws EncryptedDocumentException
	 * @throws IOException
	 */
	public String getDataFromExcel(String Sheetname, int rowIndex, int cellIndex) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream(IPathUtility.excelPath);
		Workbook wb=WorkbookFactory.create(fis);//create an empty object to load the excel file
		Cell c = wb.getSheet(Sheetname).getRow(rowIndex).getCell(cellIndex);
		DataFormatter df = new DataFormatter();//to convert number to string
		String value = df.formatCellValue(c);
		return value;	
	}
}
