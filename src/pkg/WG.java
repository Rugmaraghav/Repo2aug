package pkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class WG {
	WebDriver d;

	@BeforeTest
	public void beforeTest() {
		//WebDriverManager.chromedriver().setup();
		d = new ChromeDriver();

	}
	@org.testng.annotations.Test
	public void f()  {

	d.get("https://www.wappalyzer.com");
 d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 d.manage().window().maximize();
	d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[1]/header/div/div/div/div[2]/button[2]")).click();
	d.findElement(By.xpath("//*[@id=\"list-item-50\"]/div")).click();
	d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/a/div/div/div[2]")).click();
	d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div[1]/div[2]/div[3]/div/div/a")).click();
	d.findElement(By.xpath("//*[@id=\"app\"]/div/main/div/div[2]/div/div[2]/form/div[1]/div[1]/div[1]/div/div[1]/button")).click();
	d.findElement(By.xpath("//*[@placeholder='Find a technology']")).click();
	d.findElement(By.xpath("//*[@placeholder='E.g. ecommerce or Shopify']")).sendKeys("A/B Testing",Keys.ENTER);
	}
}
