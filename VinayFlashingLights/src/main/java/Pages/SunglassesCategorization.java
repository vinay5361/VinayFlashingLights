package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import BrowserInvoke.Browser;

public class SunglassesCategorization extends Browser {
	
	public By shopbycatg = By.xpath("//span[text()='Shop By Category']");
	
	public By sunglass = By.xpath("(//span[text()='Sunglasses'])[1]");
	
	public By costume = By.xpath("(//span[text()='Costume & Holiday Glasses'])[1]");
	
	public By soundreactive = By.xpath("(//span[text()='Sound Reactive Sunglasses'])[1]");
	
	public By Elwire = By.xpath("(//span[text()='EL Wire Glasses'])[1]");
	
	public By Ledslotted = By.xpath("(//span[text()='LED Slotted Shades'])[1]");
	
	public By Ledmasks = By.xpath("(//span[text()='LED Masks'])[1]");
	
	public void Sunglass() throws Exception

	    {
	         lunchUrl();
	         
	         MoveToElement(shopbycatg );
	         delay(5);
	         
	         MoveToElement(sunglass);
	         delay(5);
	      
	         clickElement(costume);
	         delay(5);
	        // driver.navigate().back();
	       //  screenshot("1.costume & holiday wrong path");                         // takes screenshot
	         screenshottimestamp("1.costume & holiday wrong path");
	         
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("window.scrollBy(0, 1000)");                         //scroll down 
	         delay(5);
	         js.executeScript("window.scrollBy(0, 1000)");
	         delay(5);                    
	         
	         js.executeScript("window.scrollBy(0, -1000)");                        // scroll up to original position
	         delay(5);
	         js.executeScript("window.scrollBy(0, -1000)"); 
	         delay(5);
	         
	         MoveToElement(shopbycatg );
	         delay(5);
	         MoveToElement(sunglass);
	         delay(5);
	         
	         clickElement(soundreactive);
	         delay(5);
	         
	         screenshot("2.soundreactive wrong path");                               // takes screenshot
	        
	         js.executeScript("window.scrollBy(0, 1000)");
	         delay(5);
	         js.executeScript("window.scrollBy(0, -1000)"); 
	         delay(5);
	         
	         MoveToElement(shopbycatg );
	         delay(5);
	         MoveToElement(sunglass);
	         delay(5);
	         
	         clickElement(Elwire);
	         delay(5);
	         screenshot("3.Elwire wrong path");                                      // takes screenshot
	         
	         js.executeScript("window.scrollBy(0, 800)");
	         delay(5);
	        
	         screenshot("4.Elwire mask instead of Elwire glasses");                 // takes screenshot
	         
	         js.executeScript("window.scrollBy(0, -800)"); 
	         delay(5);
	         
	         MoveToElement(shopbycatg );
	         delay(5);
	         MoveToElement(sunglass);
	         delay(5);
	         
	         clickElement(Ledslotted);
	         delay(5);
	         screenshot("5.Ledslotted wrong path");                                // takes screenshot
	         
	         js.executeScript("window.scrollBy(0, 200)");
	         delay(5);
	         
	         screenshot("6.sound reactive instead of Ledslotted");                 // takes screenshot
	         
	         js.executeScript("window.scrollBy(0, -200)"); 
	         delay(5);
	         
	         MoveToElement(shopbycatg );
	         delay(5);
	         MoveToElement(sunglass);
	         delay(5);
	         
	         clickElement(Ledmasks);
	         delay(5); 
	         screenshot("7.Ledmasks wrong path");                                  // takes screenshot
	      
	         js.executeScript("window.scrollBy(0, 1000)");
	         delay(5);
	         
	         screenshot("8.Non Led Masks instead of LedMasks");                    // takes screenshot
	         
	         js.executeScript("window.scrollBy(0, -1000)"); 
	         delay(5);
	         
	         driver.quit();
	         
        }
}
