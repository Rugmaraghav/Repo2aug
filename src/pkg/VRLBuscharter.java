package pkg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class VRLBuscharter {
	
	
	
WebDriver driver;
	
	@BeforeTest
	public void setup() throws InterruptedException
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver(options);
		driver.get("https://www.vrlbus.in/#/");
		driver.manage().window().maximize();
		driver.navigate().refresh();
		Thread.sleep(3000);
		
	}
	@Test
	public void test() throws Exception
	{
		
		driver.findElement(By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[2]/nav/ul/li[4]/a")).click();
		Thread.sleep(3000);
		System.out.println("bus charterclick");
	
		driver.findElement(contactname).sendKeys(contactno1);
		driver.findElement(Mobileno).sendKeys(Mobileno1);
		driver.findElement(email).sendKeys(email1);
		
	
	}


}
