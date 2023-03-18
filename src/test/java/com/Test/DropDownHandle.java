package com.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	public static void main(String[] args) {

		// IO Exception status code 403 --Solution the argument which breaks -- chrome version default set 111
        ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		// select ---> select 
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));

		//we need to create object of select class
		
		Select sel=new Select(drp_country);
		
		// select by index --- index ---> drop down option select 
		sel.selectByIndex(10);
		
		// selectByValue
		sel.selectByValue("BAHRAIN");
		
		//>text< selectByVisibleText
		sel.selectByVisibleText("BRAZIL");
		
		handleDropDown(drp_country,"BRAZIL");
		
		
		
		// Drop ---> count print , Name print 
		
		List<WebElement> list=sel.getOptions();
		
		System.out.println(list.size()); // count of drop down option -264
		
		for(int i=0;i<list.size();i++) {
			
			String text=list.get(i).getText();
			System.out.println(text);
			
			// handle drop down without using select class method 
			
			if(text.equals("ANGOLA")) {
				list.get(i).click();
				break;
			}
		}
		
		
		
	}

	public static void handleDropDown(WebElement element,String text) {
		
		Select sel=new Select(element);
		sel.selectByVisibleText(text);
		
	}
}
