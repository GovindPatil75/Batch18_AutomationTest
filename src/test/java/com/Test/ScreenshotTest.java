package com.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class ScreenshotTest {

	public static void main(String[] args) throws Exception {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		
		//screenshot capture - full page 
		TakesScreenshot ts=driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		
		String RM=RandomString.make(4);
		File destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\"+RM+".png");
		FileUtils.copyFile(src, destn);
		
		// Screenshot - Element
		
		WebElement logo=driver.findElement(By.xpath("//img[@alt='Google']"));
		File src1=logo.getScreenshotAs(OutputType.FILE);
		File destn1=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\Screenshot\\logo.png");
		
		FileUtils.copyFile(src1, destn1);
		

	}

}
