package com.Test;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstAutomationTest {

	public static void main(String[] args) {

    // Browser execution --Script --> Executable setup
		
		
		WebDriverManager.chromedriver().setup();	
		//Object
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		// current window -- close 
		driver.close();
		
		
		// Edge --> Amazon login url open 
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1=new EdgeDriver();
		
		driver1.get("https://www.amazon.in/");
		driver1.manage().window().maximize();
		
		driver1.close();
		
	}

}
