package BrowserInvoke;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import GenericMethods.genericMethods;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends genericMethods{
			
	/**This method purpose is to browser is opened and url is lunched*/		
			public WebDriver lunchUrl() throws Exception
			{
				Properties obj = new Properties();
				FileInputStream fis = new FileInputStream(".\\src\\main\\resources\\SpreadSheet\\config.properties");
				obj.load(fis);
				String BrowserName = obj.getProperty("browser");
				String URL = obj.getProperty("url");
				
				if(BrowserName.equalsIgnoreCase("chrome"))
				{
					WebDriverManager.chromedriver();
					driver=new ChromeDriver();
					
				}
				else if (BrowserName.equalsIgnoreCase("Edge"))
				{
					WebDriverManager.edgedriver();
					driver=new EdgeDriver();					
				}
				else if (BrowserName.equalsIgnoreCase("Firefox"))
				{
					 WebDriverManager.firefoxdriver();
					 driver=new FirefoxDriver();
				}
				
				
				driver.get(URL);
				driver.manage().window().maximize();
				
				return driver; 
			}




}
