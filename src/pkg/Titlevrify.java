package pkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Titlevrify {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();

	}
	
	@Test
	public void upload()
	{
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		String exp="google";
		
		Assert.assertEquals(title, exp);
		
		
//		if(title.equals("google"))
//		{
//			System.out.println("pass");
//		}
//		else
//		{
//			System.out.println("faill");
//		}
		
		System.out.println("title verification completed");
		
	}

}
