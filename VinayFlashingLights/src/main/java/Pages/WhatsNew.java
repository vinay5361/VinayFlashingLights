package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import BrowserInvoke.Browser;

public class WhatsNew extends Browser {
	
	 public By whatnew = By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]");
	 
	 public By sort = By.xpath("(//select[@id='sorter'])[1]");
	 
	 public By descending = By.xpath("(//a[contains(@class,'action sorter-action')])[1]");
	 
	 public By ascending = By.xpath("(//a[@title='Set Ascending Direction'])[1]");
	 
	 public void what() throws Exception

	    {
	         lunchUrl();
	         
	         WebElement whatnewele = driver.findElement(By.xpath("//body[1]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/nav[1]/ul[1]/li[3]/a[1]/span[1]"));         
	         highlight(whatnewele);
	         delay(2);
	         
	         clickElement(whatnew);
	         delay(5);
	        
	         // dropDownSelectIndex(sort,(2));
	         
	         WebElement sortele = driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));         // sortele lo store chesi taruvata highlight method call cheyyali
	         highlight(sortele);
	         
	         dropDownSelectText(sort, "Price");    //here defaultly Arrow in upward direction means-->[Ascending direction]
	         delay(7);
	         
	         WebElement descendingele = driver.findElement(By.xpath("(//a[contains(@class,'action sorter-action')])[1]"));         
	         highlight(descendingele);
	         delay(2);
	         
	         clickElement(descending);              // change Arrow from up direction to down direction
	         delay(10);
	         
	         JavascriptExecutor js = (JavascriptExecutor) driver;
	         js.executeScript("window.scrollBy(0, 1000)");            //scroll down to show wronlgly arranged prices
	         delay(10);
	         
	         screenshot("Wrong descending price");                    // It will take screenshot on the name of "Wrong descending price"
	         
	         js.executeScript("window.scrollBy(0, -1000)");           // scroll up to original position
	         delay(10);
	         
	         WebElement ascendingele = driver.findElement(By.xpath("(//a[@title='Set Ascending Direction'])[1]"));         
	         highlight(ascendingele);
	         delay(2);
	         
	         clickElement(ascending);               // change Arrow from down direction to up direction 
	         delay(10);
	         
	         js.executeScript("window.scrollBy(0, 1000)");     // scroll down to show wronlgly arranged prices
	         delay(10);
	         
	         screenshot("Wrong ascending price");              //  It will take screenshot on the name of "Wrong ascending price"
	         
	         driver.quit();
	       
	    }
	 
}

	 
	 
