package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateTest {

	public static void main(String[] args) throws Exception {

// Browser Open
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		
		String TitleFBlogin=driver.getTitle();
		
		System.out.println(TitleFBlogin);
		
		//verify 
		if(TitleFBlogin.equals("Log in to FB")) {
			System.out.println("Test Case Pass");
		}else {
			System.out.println("Test Case Fail");
		}
		
		//
		Thread.sleep(3000); // 3 sec
		
		driver.navigate().to("https://www.amazon.in/");
		
		Thread.sleep(3000); // 3 sec
		driver.navigate().back();

		Thread.sleep(3000); // 3 sec
		driver.navigate().forward();
		
		Thread.sleep(3000); // 3 sec
		driver.navigate().refresh();
		
		
		String TitleAmazon=driver.getTitle();
		System.out.println(TitleAmazon);
		
		driver.close();
		
	}

}
