package Selenium_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class uploading_file {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "D:\\Automation Program Important Drivers\\Drivers\\Geckodrivers\\geckodriver.exe");
		FirefoxDriver w =new FirefoxDriver();
		w.manage().window().maximize();
		w.get("https://omayo.blogspot.com/");
		w.findElement(By.id("uploadfile")).sendKeys("C:\\Users\\91913\\OneDrive\\Desktop\\scshotf.jpg");
		Thread.sleep(1000);
		String ty =w.findElement(By.xpath("//button[@id ='but2']")).getText();
		System.out.println(ty);
		// If get text not working then we use  get attribute method
		String tu =w.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).getAttribute("value");
		System.out.println(tu);
		
		w.close();
		
		
		

	}

}
