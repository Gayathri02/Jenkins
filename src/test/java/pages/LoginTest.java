package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilities.Baseutils;

public class LoginTest extends Baseutils 
{
	/*public void logintest(WebDriver driver){
		this.driver=driver;
	}
	*/
	@Test
	public static void login()
	{
		
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	driver.findElement(By.id("username")).sendKeys("abc@gmail.com");
	driver.findElement(By.name("password")).sendKeys("abc123");
	driver.findElement(By.name("submit")).click();

		System.out.println("loging sucessfull");
	}
		

}
