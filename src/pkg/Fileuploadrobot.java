package pkg;

import java.awt.AWTException;



import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileuploadrobot {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
//		ChromeOptions options=new ChromeOptions();
//		options.addArguments("--remote-allow-origins=*");
		 driver=new ChromeDriver();

	}

	
	@Test
	public void fileuploadpgm() throws Exception
	{  
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();	//button click
		
		
	fileUpload("E:\\Rugma\\CUCUmber.docx");
	}
	
	public void fileUpload (String p) throws AWTException  {
        StringSelection strSelection = new StringSelection(p);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
     
 
        Robot robot = new Robot();
  
     //  robot.delay(3000);

        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_ENTER);
       
        robot.keyRelease(KeyEvent.VK_ENTER);
        //robot.delay(2000);
    
}}


