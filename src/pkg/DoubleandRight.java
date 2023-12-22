package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class DoubleandRight {

	
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();

	}
	@org.testng.annotations.Test
	public void doubleandrightclick()  {
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       WebElement right=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
       Actions act=new Actions(driver);
       act.contextClick(right);
       act.perform();
       driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
       
       driver.switchTo().alert().accept();
       
       WebElement doubleclick=driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
       
       act.doubleClick(doubleclick);
       act.perform();
       driver.switchTo().alert().accept();
       
    		   
		
		
		
		
	}
	
}
