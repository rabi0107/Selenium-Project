package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerttt {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		/*w.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]")).click(); //Simple Alert
		Thread.sleep(2000);
		w.switchTo().alert().accept();
		Thread.sleep(2000);
		
		// Prompt Alert
		
		w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[3]")).click();
		w.switchTo().alert().sendKeys("Jai Ma");
		Thread.sleep(2000);
		w.switchTo().alert().accept();
		
		Thread.sleep(2000);
		
		//Confirmation Alert
		
		w.findElement(By.xpath("//body/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[2]")).click();
		w.switchTo().alert().accept();*/
		
		
		w.get("file:///D:/Program%20Setup/Automation%20By%20Tejas%20Sir/selenium%20setup/selenium%20setup/iframes/iFrame2.html");
		w.findElement(By.id("url")).click();
		w.switchTo().alert().sendKeys("google.com");
		Thread.sleep(2000);
		w.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		w.close();
		
		
		

	}

}
