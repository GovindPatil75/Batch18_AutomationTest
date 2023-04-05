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

public class ExcelDataTest {

	public static void main(String[] args) throws Exception {

  String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\TestData\\Data.xlsx";
  FileInputStream fis=new FileInputStream(path);
  XSSFWorkbook wb=new XSSFWorkbook(fis);
  
  double data_0_1=wb.getSheet("Sheet1").getRow(0).getCell(1).getNumericCellValue();
  
  String data_01=String.valueOf(data_0_1); //1.2345678E7
  
  // 12345678
  
  String data_01_modify=data_01.replace(".", "").replace("E7", "");
  
  System.out.println(data_01_modify);
  
  System.out.println(data_01);
    ChromeOptions option=new ChromeOptions();
	option.addArguments("--remote-allow-origins=*");
    WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(option);
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
	WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
	
	txt_email.sendKeys(data_01_modify);
  

	}

}
