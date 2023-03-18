package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_DropDown {

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
		
		Select sel=new Select(drp_country);
		
		String deafultoption=sel.getFirstSelectedOption().getText();
		
		System.out.println(deafultoption);


	}

}
