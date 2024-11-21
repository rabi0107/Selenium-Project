package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newt1111 
{

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w = new FirefoxDriver();
		w.get("https://demo.nopcommerce.com/");
		WebElement  searchbox =w.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchbox.sendKeys("xyz");
        WebElement ee =w.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(ee.getText());
        List<WebElement> le =w.findElements(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println("Number of element captured :"+le.size());
        for(WebElement wb:le)
        {
        	System.out.println(wb.getText());
        	
        }
        List<WebElement> loge=w.findElements(By.xpath("//img[@alt='nopCommerce demo store']"));
        System.out.println("Sizeo fo logo element :"+loge.size());
      
        w.close();
	
		

	}

}
