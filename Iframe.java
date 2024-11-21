package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframe {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		
		//frame 1
		w.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		w.switchTo().frame("packageListFrame"); //name of the frame
		w.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]")).click();
		w.switchTo().defaultContent(); // go to main frame
		Thread.sleep(200);
		
		//frame 2
		w.switchTo().frame("packageFrame");
		w.findElement(By.xpath("//body[1]/main[1]/ul[1]/li[683]/a[1]/span[1]")).click();
		Thread.sleep(1000);
		w.switchTo().defaultContent(); // go to main frame
		Thread.sleep(200);
		
		//frame 3
		
		w.switchTo().frame("packageFrame");
		w.findElement(By.xpath("//header/nav[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		
		

	}

}
