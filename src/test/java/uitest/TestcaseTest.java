package uitest;


import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import pages.LoginTest;
import utilities.Baseutils;

public class TestcaseTest 
{
	static WebDriver driver;
	@Test
	public static void openBroswer()
	{
		driver=Baseutils.OpenBroswer("chrome","http://localhost/colour/");
		LoginTest.login();
	}
	@AfterMethod
	public void close(){

		driver.close();
	}

}
