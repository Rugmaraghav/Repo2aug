package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();

	}
	
	@Test
	public void upload()
	{
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("")).sendKeys("E://book1.xlsx");
		
		
	}

}
