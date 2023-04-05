package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestData_1 {

	public static void main(String[] args) throws Exception {

		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\TestData\\Data.xlsx";
		  FileInputStream fis=new FileInputStream(path);
		  XSSFWorkbook wb=new XSSFWorkbook(fis); 
		  XSSFSheet sheet=wb.getSheet("Sheet1");
		  
		  int row=sheet.getLastRowNum();
		  int col=sheet.getRow(1).getLastCellNum();
		  
		  
		  for(int r=0;r<row;r++) {
			  XSSFRow row1=sheet.getRow(r);
			  
			  for(int c=0;c<col;c++) {
				  
				  String data=row1.getCell(c).getStringCellValue();
				  System.out.println(data);
			  }
			  System.out.println();
		  }
		  
		 
		  
		  
	}

}
