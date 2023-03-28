package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestActions_1 {

	public static void main(String[] args) {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");

// Browser Open
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(option);
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		// Actions --- we need to create Object of Actions class
		Actions act=new Actions(driver);
		
		// Hover Element + click
		WebElement element=driver.findElement(By.xpath("//a[text()='Live Project']"));
//		act.moveToElement(element).click().build().perform();
		
		Hover_Click(driver,element);
		
		// dragandDrop
		
		WebElement srcElement=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		
		WebElement destnElement=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		
		handleDragAndDrop(driver,srcElement,destnElement);
		
		//act.dragAndDrop(srcElement, destnElement).build().perform();
		

	}
	
	public static void handleDragAndDrop(WebDriver driver,WebElement src,WebElement destn) {
		
		Actions act=new Actions(driver);
		act.dragAndDrop(src, destn).build().perform();
	}
	
	public static void Hover_Click(WebDriver driver,WebElement element) {
		Actions act=new Actions(driver);
		act.moveToElement(element).click().build().perform();
	}

}
