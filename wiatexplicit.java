package Selenium_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wiatexplicit {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://sellglobal.ebay.in/seller-center/");
		w.manage().window().maximize();
		WebDriverWait wait =new WebDriverWait(w,5);
		WebElement e=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("START SELLING")));
		e.click();
		w.close();
		
		

	}

}
