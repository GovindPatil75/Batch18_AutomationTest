package com.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {

	public static void main(String[] args) throws Exception {

  // location file
		String filepath="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\TestData\\Data.xlsx";
		
		// object fileinputStream class
		FileInputStream fis=new FileInputStream(filepath);
		
		// object XSSFWorkbook class
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String data_0_0=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data_0_0);
		
		String data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		 System.out.println(data_0_1);
		 
		 
		 ChromeOptions option=new ChromeOptions();
			option.addArguments("--remote-allow-origins=*");

	// Browser Open
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(option);
			driver.get("https://www.facebook.com/login/");
			driver.manage().window().maximize();
			
			WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
			
			txt_email.sendKeys(data_0_0);
			
			WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		
			txt_password.sendKeys(data_0_1);
	}

}
