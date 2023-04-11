package Groups_Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	WebDriver driver;
	
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void setup(String BrowserName) {
		
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
			ChromeOptions option=new ChromeOptions();
		    option.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver(option);
		}
		
		else if(BrowserName.equalsIgnoreCase("Edge")) {
			EdgeOptions options1=new EdgeOptions();
			options1.addArguments("--remote-allow-origins=*");
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver(options1);
		}
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
	}
	
   @AfterMethod
   public void tearDown() {
	driver.close();
   }
}
