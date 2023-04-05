package com.Test_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_testng_2 {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver(option);
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}

	@Test
	public void test_1() {
		
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
	
	@Test
	public void test_2() {
		
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
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
