package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_AbsoluteXpath {

	public static void main(String[] args) {

  // Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// Identify WebElement ---Locator -Xpath --> Absolute XPath 
		// Absolute xpath --> navigate from parent to immidiate child 
		// starts with single slash -/
		
//		WebElement txt_email=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[1]/input"));
//		txt_email.sendKeys("Test@gmail.com");
//		
//		WebElement txt_password=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[2]/div/div/input"));
//		txt_password.sendKeys("12345678");
//		
//		WebElement btn_login=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div[2]/div[2]/form/div/div[3]/button"));
//		btn_login.click();
		
		// Relative xpath
		// attribute -- //tagname[@attributename='attribute value']
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		txt_email.sendKeys("Test@gmail.com");
		
		WebElement txt_password=driver.findElement(By.xpath("//input[@id='pass']"));
		txt_password.sendKeys("12345678");
		
		WebElement btn_login=driver.findElement(By.xpath("//button[@name='login']"));
		btn_login.click();
	}

}
