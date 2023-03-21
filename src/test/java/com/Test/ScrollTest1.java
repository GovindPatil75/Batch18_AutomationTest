package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScrollTest1 {

	public static void main(String[] args) {

		// Browser Open
				ChromeOptions option=new ChromeOptions();
				option.addArguments("--remote-allow-origins=*");
				
				WebDriverManager.chromedriver().setup();
				WebDriver driver=new ChromeDriver(option);
				driver.get("https://demo.guru99.com/test/newtours/register.php");
				driver.manage().window().maximize();
				
				WebElement submit=driver.findElement(By.xpath("//input[@name='submit']"));
				ScrollTest.getScrollToElement(driver, submit);

	}

}
