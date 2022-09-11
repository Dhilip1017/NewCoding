package org.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class BaseXlClass extends BaseClass {

	public static String getData(int rowNumber, int cellNumber) throws IOException {

		// file location
		File f = new File(
				"C:\\Users\\91638\\eclipse-workspace\\DhilipFrameWorkProject\\src\\test\\resources\\TestData\\Dhilip.xlsx");
		// read value for excel
		FileInputStream fin = new FileInputStream(f);
		// work book type
		XSSFWorkbook w = new XSSFWorkbook(fin);
		// get sheet
		Sheet s = w.getSheet("Dhilip");
		
		Row row = s.getRow(rowNumber);
		
		Cell cell = row.getCell(cellNumber);
		
		int cellType = cell.getCellType();
		
		String value="";
		
		if (cellType==1) {
			value = cell.getStringCellValue();
			
		}
		else if (DateUtil.isCellDateFormatted(cell)) {
			Date d = cell.getDateCellValue();
			SimpleDateFormat sim = new SimpleDateFormat("dd,MMMM,yyyy");
		    value = sim.format(d);
			
		}
		else {
			double d = cell.getNumericCellValue();
			long l=(long)d;
		    value = String.valueOf(l);
		    
		}
		return value;
	}

}


