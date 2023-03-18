package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Text {

	public static void main(String[] args) throws Exception {

// Browser Open
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		// identify -webelement --locator -- xpath ---> text()
		// formula - //tagname[text()='text value']
		
		//WebElement lix_signUp=driver.findElement(By.xpath("//a[text()='Sign up for Facebook']"));
		
		WebElement btnlogin=driver.findElement(By.xpath("//button[contains(@id,'u_0_5')]"));
		btnlogin.click();
		
		//WebElement lix_forgottenaccount=driver.findElement(By.xpath("//a[contains(text(),'Forgotten ')]"));
		//lix_forgottenaccount.click();
		
	}

}
