package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationTest_NameLocator {

	public static void main(String[] args) {

   // Browser Open 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// identify -WebElement --> locators -- Name 
		
		WebElement txt_FirstName=driver.findElement(By.name("firstName"));
		txt_FirstName.sendKeys("Govind");
	}

}
