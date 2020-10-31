package FlipkartProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseFlipkart {

	public void DriverInitialize() throws IOException {
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Amrutham\\eclipse-workspaceNew\\FlipkartProject\\src\\main\\java\\FlipkartProject\\data.properties");
	prop.load(fis);
	String browserName= prop.getProperty("browser");
	
	if(browserName.equals("chrome"))
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Amrutham\\\\Documents\\\\Driver\\\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if (browserName.equals("firefox"))
	{
		 driver= new FirefoxDriver();
	}
	else if (browserName.equals("IE"))
	{
	}
	}
}
