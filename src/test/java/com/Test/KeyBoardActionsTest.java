package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyBoardActionsTest {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// object create Actions class
		Actions act=new Actions(driver);
		
		WebElement txt_email=driver.findElement(By.xpath("//input[@id='email']"));
		
		act.keyDown(txt_email, Keys.SHIFT).sendKeys("bugspotter").keyUp(Keys.SHIFT).build().perform();
		
		// select value ---> ctrl + a
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		// copy value ---> ctrl + c 
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		// element paste --click
		
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		// paste value -- ctrl + v
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		
		
		
	}

}
