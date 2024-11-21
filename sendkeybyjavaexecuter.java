package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sendkeybyjavaexecuter {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://tutorialsninja.com/demo/");
		w.manage().window().maximize();
		WebElement sear =w.findElement(By.name("search"));
		JavascriptExecutor jse =(JavascriptExecutor) w;
		jse.executeScript("arguments[0].value ='Imac'", sear);
		Thread.sleep(2000);
		w.close();
		
		

	}

	
}
