package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class iframep {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.gecko.driver","D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		WebDriver w =new FirefoxDriver();
		w.get("https://ui.vision/demo/webtest/frames/");
		w.manage().window().maximize();
		WebElement  frame1 =w.findElement(By.xpath("//frame[@src='frame_1.html']")); //inspecting to webelement
		w.switchTo().frame(frame1); //switch to frame1
		w.findElement(By.name("mytext1")).sendKeys("Jaima");
		w.switchTo().defaultContent();  // move to main frame or switch back to main page
		WebElement iframe2 =w.findElement(By.xpath("//frame[@src='frame_2.html']")); //inspecting  frame2
		w.switchTo().frame(iframe2); //switch frame2
		w.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("jai Matadi");
		w.switchTo().defaultContent();
		WebElement iframe3 =w.findElement(By.xpath("//frame[@src='frame_3.html']"));
		w.switchTo().frame(iframe3);
		w.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("jai Matadi");
		w.close();
		

	}

}
