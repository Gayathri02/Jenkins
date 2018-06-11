package utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Baseutils
{
	public static WebDriver driver;
	@Test
	public static WebDriver OpenBroswer(String broswer,String URL) 
	{
		try 
		{
			if (broswer.trim().equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			}
			else if (broswer.trim().equalsIgnoreCase("Firefox")) 
			{
				driver = new FirefoxDriver();
			}
			else 
			{
				System.setProperty("webdriver.ie.driver","Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();
			}
				driver.get(URL);
		}
		
		catch (Exception e)
		{
			System.out.println("Invalid broswer====> "+e.getMessage());
		}
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		return driver;
	}
}
