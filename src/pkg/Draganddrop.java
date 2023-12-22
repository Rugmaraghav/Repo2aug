package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Draganddrop {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		//WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	@org.testng.annotations.Test
	public void draganddrop()  {
		driver.get("https://demoqa.com/droppable/");
		WebElement source=driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement Dest=driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions ob=new Actions(driver);
		ob.dragAndDrop(source, Dest);
		ob.perform();
		String text=Dest.getText();
		if(text.contentEquals("Dropped!"))
		{
			System.out.println("text changed");
		}
		else
		{
			System.out.println("no change in text");
		}
		
		
		
		
	}

}
