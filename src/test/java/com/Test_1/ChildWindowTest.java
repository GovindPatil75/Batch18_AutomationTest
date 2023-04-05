package com.Test_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildWindowTest {

	public static void main(String[] args) throws Exception {

		// Browser Open
		ChromeOptions option=new ChromeOptions();
	    option.addArguments("--remote-allow-origins=*");
	     
	     WebDriverManager.chromedriver().setup();
	     WebDriver driver=new ChromeDriver(option);
	     driver.get("https://demo.guru99.com/popup.php");
	     driver.manage().window().maximize();

	     // Window Handle 
	     
	     
	     String ParentWindowID=driver.getWindowHandle();
	     
	     System.out.println(ParentWindowID);
	     
	     driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	     
	     Set<String> AllID=driver.getWindowHandles();
	     
	     // using Iterartor 
//	     Iterator<String> IT=AllID.iterator();
//	     
//	     while(IT.hasNext()) {
//	    	 
//	    	 String id=IT.next();
//	    	 
//	    	 if(!ParentWindowID.equals(id)) {
//	    	 
//	    		 driver.switchTo().window(id);
//	    		 
//	    		 WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
//	    	     email.sendKeys("Test@gmail.com");
//	     }
//	     }
	     
	     // using List 
	     
	     System.out.println(AllID);
	     
	     
	     List<String> list=new ArrayList(AllID);
	     
	     System.out.println(list.get(0)); // parent window id 
	     System.out.println(list.get(1)); // child window id 
	     
	     driver.switchTo().window(list.get(1)); // switch child window 
	     
	     WebElement email=driver.findElement(By.xpath("//input[@name='emailid']"));
	     email.sendKeys("Test@gmail.com");
	     
	     Thread.sleep(3000);
	    // driver.close(); // current window close
	     
	    // driver.quit(); // current + all open window close 
	     
	     driver.switchTo().window(ParentWindowID); // switch parent window 
	     
	     
	     
	     
	     
	     
	     
	     
	 }         
}

