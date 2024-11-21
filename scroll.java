package Selenium_Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scroll {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://testpages.eviltester.com/styled/index.html");
		JavascriptExecutor jse =(JavascriptExecutor)w;
		jse.executeScript("window.scrollBy(0,900)"); // Scroll Down
		Thread.sleep(1000);
		
		jse.executeScript("window.scrollBy(0,-400)"); // Scroll Up
		Thread.sleep(1000);
		w.close();

	}

}
