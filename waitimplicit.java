package Selenium_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class waitimplicit
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://sellglobal.ebay.in/seller-center/");
		w.manage().window().maximize();
	    w.findElement(By.linkText("START SELLING")).click();
	    Thread.sleep(5000);
	    w.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	    w.close();

	}

}
