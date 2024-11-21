package Selenium_Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Difffind {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://demo.nopcommerce.com/");
		/*WebElement sear =w.findElement(By.xpath("//input[@id='small-searchterms']"));
		
		sear.sendKeys("samsung");
		WebElement cc=w.findElement(By.xpath("//button[contains(text(),'Search')]"));
		cc.click();
		
		
		Thread.sleep(1000);
		
		/*WebElement ele= w.findElement(By.xpath("//div[@class='footer-upper']"));
		ele.getText();
		System.out.println(ele.getText());*/
		
	
		/*WebElement element= w.findElement(By.xpath("//div[@class='footer-upper']//a"));
		element.getText();
		System.out.println(ele.getText());*/
		List<WebElement>links = w.findElements(By.xpath("//div[@class='footer-upper']//a"));
		links.size();
		System.out.println("number of element capture"+links.size());
		
		
		
		
		
		
		
	

	}

}
