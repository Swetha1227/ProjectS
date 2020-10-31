package MavenSelPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class flipkartWebsite {

	public class flipkartTest {
		@Test
		public void Flipkart()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutham\\Documents\\Driver\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
			driver.manage().window().maximize();  
			driver.get("https://flipkart.com");
			System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("Iphone");
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys(Keys.ARROW_DOWN.ENTER);
			/*
			 * int size = driver.findElements(By.tagName("iframe")).size();
			 * System.out.println(size);
			 */
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/a[3]/div[1]/div[1]")).getText());
		
		
		
		}
		
	}

}
