package Selenium_Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alertpractice {
    
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://demoqa.com/alerts");
		/*w.findElement(By.id("alertButton")).click();  // Simple alert
		Thread.sleep(2000);
		Alert tt =w.switchTo().alert();
		Thread.sleep(2000);
		tt.accept();*/
		
		w.findElement(By.id("promtButton")).click(); //Promt Alert
		
		Alert t1 =w.switchTo().alert();
		Thread.sleep(2000);
		String ss =t1.getText();
		System.out.println("Alert text is"+ss);
		t1.sendKeys("Ma");
		Thread.sleep(2000);
		
		w.findElement(By.id("confirmButton")).click(); //confirmation alert
		Alert t2 =w.switchTo().alert();
		String sd =t2.getText();
		System.out.println("Alert text is :"+sd);
		t2.accept();
		
		
		
		
		
		

	}

}
