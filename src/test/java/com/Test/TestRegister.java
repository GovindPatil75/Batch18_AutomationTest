package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRegister {

	public static void main(String[] args) throws Exception {

		 ChromeOptions option=new ChromeOptions();
	     option.addArguments("--remote-allow-origins=*");
		    WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(option);
			driver.get("https://demo.guru99.com/test/newtours/register.php");
			driver.manage().window().maximize();
			
			WebElement firstname=driver.findElement(By.xpath("//input[@name='firstName']"));
			firstname.sendKeys(Library.getExcelData("Sheet1", 0, 0));
			
			WebElement LastName=driver.findElement(By.xpath("//input[@name='lastName']"));
			LastName.sendKeys(Library.getExcelData("Sheet1", 0, 1));
	}

}
