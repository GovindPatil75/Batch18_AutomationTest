package com.Test_1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertHandleTest {

	public static void main(String[] args) throws Exception {
		
     ChromeOptions option=new ChromeOptions();
     option.addArguments("--remote-allow-origins=*");
     
     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver(option);
     driver.get("https://demo.guru99.com/test/delete_customer.php");
     driver.manage().window().maximize();
     
     WebElement txt_Cid=driver.findElement(By.xpath("//input[@name='cusid']"));
     txt_Cid.sendKeys("12345678");
     
     WebElement btn_submit=driver.findElement(By.xpath("//input[@name='submit']"));
     btn_submit.click();
     
     handleAlert(driver).getText();
     handleAlert(driver).accept(); 
     handleAlert(driver).dismiss();
     
     
//      Alert Handle 
     Alert alt=driver.switchTo().alert();
     
//      text get
     String textonAlert=alt.getText();
     System.out.println(textonAlert);
       
//      click ok button
     alt.accept();
//     
     Thread.sleep(2000);
//     
      String textonAlert2=alt.getText();
     System.out.println(textonAlert2);
    
//     alt.accept();
     
      //click cancel button
        alt.dismiss();
     
     
     
	}

	public static Alert handleAlert(WebDriver driver) {
		
		return driver.switchTo().alert();
	}
}
