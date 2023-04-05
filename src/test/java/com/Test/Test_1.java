package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test_1 {

	public static void main(String[] args) throws Exception {
		
       String filepath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(filepath);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		XSSFSheet sheet=wb.getSheet("Sheet1");
		
		int rows=sheet.getLastRowNum();
		int cols=sheet.getRow(1).getLastCellNum();
		
		
		for(int r=0;r<=rows;r++) {
			
			XSSFRow row=sheet.getRow(r);
			
			for(int c=0;c<cols;c++) {
				
				String data=row.getCell(c).getStringCellValue();
				System.out.println(data);
			}
			System.out.println();
		}
   
	}

}
