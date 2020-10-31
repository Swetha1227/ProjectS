package Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverClass {

	public static WebDriver driver;
	public Properties prop;
public WebDriver initializeDriver() throws IOException
{
	
 prop= new Properties();
FileInputStream fis=new FileInputStream("C:\\Users\\Amrutham\\eclipse-workspaceNew\\MavenSel\\src\\main\\java\\Resources\\data.properties");

prop.load(fis);
String browserName=prop.getProperty("browser");
System.out.println(browserName);

	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amrutham\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver= new ChromeDriver();
			
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
return driver;
		}
public void getScreenshot(String result) throws IOException
{
	File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(src, new File("\\C:\\Users\\Amrutham\\eclipse-workspaceNew\\MavenSel\\FlipkartScreenshots\""+result+"screenshot.png"));
	
		}

					}

