package com.Test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPath_Index {

	public static void main(String[] args) {

		// IO Exception status code 403 --Solution the argument which breaks -- chrome version default set 111
        ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		
		driver.manage().window().maximize();
		
		//identify -WebElement -- XPath by index
		// formula - (xpath expression)[index]
		
		// .isenabled()
		WebElement txt_phoneNo=driver.findElement(By.xpath("(//input[@size='15'])[1]"));
		
		System.out.println(txt_phoneNo.isEnabled()); //false
		if(txt_phoneNo.isEnabled()==true) {
			
			txt_phoneNo.sendKeys("123456789");
		}else {
			System.out.println("Phone no field is disabled");
		}
		
		
		WebElement txt_postalcode=driver.findElement(By.xpath("(//input[@size='15'])[3]"));
		txt_postalcode.sendKeys("123456");
		
		// use findElements -- return List<WebElement> -->
		List<WebElement> list=driver.findElements(By.xpath("//input[@size='15']"));
		
		System.out.println(list.size()); // 3
		
		for(int i=0;i<list.size();i++) {
			
			list.get(i).sendKeys("12345"); //
		}
		
		
//		list.get(0).sendKeys("1234567");
//		
//		list.get(1).sendKeys("1234");
//		list.get(2).sendKeys("123");
		
		
		List<String> list1=new ArrayList<String>();
		
		
		list1.add("Test1"); //
		list1.add("Test2");
		list1.add("Test1");
		list1.add("Test3");
		
		System.out.println(list1);
		
     List<String> list2=new ArrayList<String>();
		
		
		list2.add("Test1"); //
		list2.add("Test2");
		
		System.out.println(list1.get(2)); //Test1
		
		list1.addAll(list2);
		
		System.out.println(list1);
	}

}
