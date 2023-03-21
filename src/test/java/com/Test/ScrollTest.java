package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest {

	public static void main(String[] args) throws Exception {

  // Browser Open
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();

		//Scrolling  -- By Pixel
		
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-500)", "");
		
		// Scroll By Element 
		Thread.sleep(3000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
		js.executeScript("arguments[0].scrollIntoView()", submit);
	}

	public static void getScrollToElement(WebDriver driver,WebElement element) {
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
	}
}
