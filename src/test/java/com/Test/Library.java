package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Library {
	
	public static String getExcelData(String Sheetname,int row,int cell) throws Exception {
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\TestData\\Data.xlsx";
		  FileInputStream fis=new FileInputStream(path);
		  XSSFWorkbook wb=new XSSFWorkbook(fis);  
		String data=wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		  
	}

}
