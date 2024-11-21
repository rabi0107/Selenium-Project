package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmm {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		w.navigate().refresh();
		w.navigate().to("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement ww=w.findElement(By.name("fromPort"));
		Select ss =new Select(ww);
		ss.selectByVisibleText("London");
		Thread.sleep(2000);
		Select s1 =new Select(w.findElement(By.name("fromMonth")));
		s1.selectByIndex(2);
		Thread.sleep(2000);
		Select s2 =new Select(w.findElement(By.name("fromDay")));
		s2.selectByValue("4");
		Thread.sleep(1000);
		
		w.close();
		

	}

}
