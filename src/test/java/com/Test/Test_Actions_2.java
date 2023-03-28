package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Actions_2 {

	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		//create Object of Actions class
		Actions act1=new Actions(driver);
		WebElement RightclickElement=driver.findElement(By.xpath("//span[text()='right click me']"));
		
	    WebElement quit=driver.findElement(By.xpath("//span[text()='Quit']"));
	    
	   // rightclick_OptionsClick(driver,RightclickElement,quit);
	    // right click + quit click
		//act1.contextClick(RightclickElement).click(quit).build().perform();
		
		
		WebElement doubleClickElement=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act1.doubleClick(doubleClickElement).build().perform();
	
	
	}
	
	public static void rightclick_OptionsClick(WebDriver driver,WebElement rightClickElement,WebElement optionsElement) {
		//create Object of Actions class
		Actions act1=new Actions(driver);
		act1.contextClick(rightClickElement).click(optionsElement).build().perform();
				
	}

}
