package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutoSuggestionHandle {

	public static void main(String[] args) throws Exception {

// Browser open
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(option);
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
	//Step 2
		
		WebElement SearchField=driver.findElement(By.xpath("//input[@name='q']"));
		SearchField.sendKeys("Maven");
		
		//Step 3
		Thread.sleep(3000); // wait 3 sec -- static 
		
		List<WebElement> list=driver.findElements(By.xpath("(//ul[@jsname='bw4e9b'])[1]/li"));
		System.out.println(list.size()); // 10
		
		for(int i=0;i<list.size();i++) {
			
			String text=list.get(i).getText();
			System.out.println(text);
			
			if(text.equals("maven dependency")) {
				list.get(i).click();
				break;
			}
			
		}
		
		

	}

}
