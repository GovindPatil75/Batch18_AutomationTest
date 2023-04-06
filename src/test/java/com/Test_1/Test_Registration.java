package com.Test_1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Registration {

	
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		 ChromeOptions option=new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
	     
	     WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver(option);
	     driver.get("https://demo.guru99.com/test/newtours/register.php");
	     driver.manage().window().maximize();
	     
	}
	@Test
	public void verify_registrationPageTest() throws Exception {
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(getExcelData("Sheet2",0,0));
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(getExcelData("Sheet2",1,0));
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(getExcelData("Sheet2",2,0));
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(getExcelData("Sheet2",3,0));
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(getExcelData("Sheet2",4,0));
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys(getExcelData("Sheet2",5,0));
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys(getExcelData("Sheet2",6,0));
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(getExcelData("Sheet2",7,0));
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select drp=new Select(country);
		drp.selectByVisibleText(getExcelData("Sheet2",8,0));
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(getExcelData("Sheet2",9,0));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(getExcelData("Sheet2",10,0));
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(getExcelData("Sheet2",11,0));
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(1000);
		captureScreenshot();
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	public static String getExcelData(String sheetname,int row,int cell) throws Exception {
		String path="C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\TestData\\Data.xlsx";
		FileInputStream fis=new FileInputStream(path);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	
	public static void captureScreenshot() throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File Destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\Registration.png");
		FileUtils.copyFile(src, Destn);
	}
}
