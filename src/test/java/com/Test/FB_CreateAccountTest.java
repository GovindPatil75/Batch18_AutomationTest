package com.Test;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FB_CreateAccountTest {

	public static void main(String[] args) throws Exception {
		// Browser open
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page"); //https://demo.guru99.com/test/drag_drop.html
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement firstname=driver.findElement(By.xpath("//input[@name='firstname']"));
		firstname.sendKeys("Test");
		
		WebElement lastname=driver.findElement(By.xpath("//input[@name='lastname']"));
		lastname.sendKeys("Test");
		
		WebElement MobileNo=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		MobileNo.sendKeys("123456789");
		
		WebElement newpassword=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		newpassword.sendKeys("123456789");
		Thread.sleep(1000);
		
		// Handle Drop Down 
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		handleDropDown(day,"10");
		Thread.sleep(1000);
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		handleDropDown(month,"Jul");
		Thread.sleep(1000);
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		handleDropDown(year,"2000");
		Thread.sleep(1000);
		
		// Select radio button 
		WebElement gender_male=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		gender_male.click();
		
		WebElement submit=driver.findElement(By.xpath("//button[@name='websubmit']"));
		submit.click();
		
		// ScreenShot code
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File("C:\\Users\\Dell\\Desktop\\Visionfolder\\Batch_18_AutomationTest\\SignTest.png");
		FileUtils.copyFile(src, destn);
		
		driver.close();
		
	}

	public static void handleDropDown(WebElement element,String text) {
		Select sel =new Select(element);
		sel.selectByVisibleText(text);
	}
}
