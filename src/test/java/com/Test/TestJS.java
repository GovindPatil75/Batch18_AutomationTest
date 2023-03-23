package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestJS {

	public static void main(String[] args) throws Exception {

		// Browser open
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver(option);
				driver.get("https://www.google.com/");
				driver.manage().window().maximize();
				Thread.sleep(2000);
				
				// identify Element
			WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
				
				// send value to element --without using sendkeys method
			JavascriptExecutor js=(JavascriptExecutor) driver;
			js.executeScript("arguments[0].value='maven'", search);
			
			// click on element -using JS
			js.executeScript("arguments[0].click()", search);
			

	}
}
