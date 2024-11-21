package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.WebClient;

public class mouseaction1 {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		/*w.navigate().to("https://www.browserstack.com");
		Actions act =new Actions(w);
		/*WebElement ww =w.findElement(By.xpath("//div[contains(text(),'Get a demo')]"));//right click
		act.contextClick(ww).perform();
		w.close();*/
		
		/*WebElement w1 =w.findElement(By.xpath("//span[contains(text(),'Sign in')]"));//double click
		Thread.sleep(2000);
		act.doubleClick(w1).perform();
		Thread.sleep(2000);
		w.close();*/
		
		/*w.navigate().to("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html"); //drag and drop
		Actions aa =new Actions(w);
		WebElement s1=w.findElement(By.id("box2"));
		WebElement d1 =w.findElement(By.id("box106"));
		Thread.sleep(1000);
		aa.dragAndDrop(s1, d1).perform();
		Thread.sleep(1500);
		w.close();*/
		
		w.navigate().to("https://www.opencart.com/index.php?route=cms/feature");
		WebElement s11 =w.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/ul[1]/li[6]/a[1]"));
		WebElement d11 =w.findElement(By.partialLinkText("Contact Us"));
		Actions aaa =new Actions(w);
		Thread.sleep(10000);
		aaa.moveToElement(s11).moveToElement(d11);
		Thread.sleep(10000);
		
		w.close();
		
		
		

	}

}
