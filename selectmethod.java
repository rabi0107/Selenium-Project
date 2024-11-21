package Selenium_Practice;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class selectmethod {

	public static void main(String[] args) throws InterruptedException
	{

		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://demo.guru99.com/test/newtours/reservation.php");
		w.navigate().refresh();
		w.get("https://demo.guru99.com/test/newtours/reservation.php");
		WebElement drpcountryele =w.findElement(By.name("fromPort"));
		Select drp =new Select(drpcountryele);
		drp.selectByVisibleText("London");
		Thread.sleep(2000);
		Select ss =new Select(w.findElement(By.name("fromDay")));
		ss.selectByVisibleText("15");
		ss.selectByValue("17");
		Thread.sleep(2000);
		WebElement vv =w.findElement(By.name("fromMonth"));
		Select  v1 =new Select(vv);
		v1.selectByIndex(3);
		
		
		Thread.sleep(2000);
		w.close();

	}

}
