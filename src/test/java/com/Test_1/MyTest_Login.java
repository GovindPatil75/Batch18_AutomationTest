package com.Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class MyTest_Login {
	
	
	public static void main(String[] args) {

		  // Browser Open
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com/login/");
				driver.manage().window().maximize();
				
		  // WebElement --> identify -- Locators ---> 8 --> ID
				
				WebElement txt_emailAddress=driver.findElement(By.id("email"));
				txt_emailAddress.sendKeys("Test@gmail.com");
				
				
				WebElement txt_password=driver.findElement(By.id("pass"));
				txt_password.sendKeys("12345678");
				
				WebElement btn_login=driver.findElement(By.id("loginbutton"));
				btn_login.click();
				
				// verify
				
				String TitleHomepage=driver.getTitle();
				
				if(TitleHomepage.equals("Facebook")) {
					
					System.out.println("Test Case Pass");
				}else {
					System.out.println("Test Case Fail");
				}
	}
}
	