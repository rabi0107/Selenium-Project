package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class clearcommand {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://admin-demo.nopcommerce.com/login");
		WebElement cl =w.findElement(By.xpath("//input[@id='Email']"));
		
		//for clear and send another value to input
		 /*cl.clear();
		cl.sendKeys("adm123@gmail.com");
		Thread.sleep(2000);
		
		w.close();*/
		
		//capturing text from input
		
		System.out.println("result from attribute :"+cl.getAttribute("value") );
		System.out.println("get text for particular element :"+cl.getText());
		
		WebElement tt =w.findElement(By.xpath("//button[contains(text(),'Log in')]"));
		System.out.println("get text of element :"+tt.getText());
		Thread.sleep(2000);
		w.close();
		
		

	}

}
