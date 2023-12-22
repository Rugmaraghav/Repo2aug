package pkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DD {
	WebDriver driver;
	String Baseurl="https://www.facebook.com";

	@BeforeTest
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Kunni Parambath\\Desktop\\selenium\\chromedriver91\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get(Baseurl);
	}
  @Test
  public void main() throws IOException
  {
	  
	  File f=new File("E:\\TestData\\Book1.xlsx");
		InputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi); //excel workbook
		XSSFSheet sh=wb.getSheet("Sheet1");//sheet 1 details
		System.out.println(sh.getLastRowNum());//row details or row count
		
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+ username);	
			String pswd=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println(pswd);
			driver.get(Baseurl);
			driver.findElement(By.xpath("")).clear();
			driver.findElement(By.xpath("")).sendKeys(username);
			driver.findElement(By.xpath("")).clear();
			driver.findElement(By.xpath("")).sendKeys(pswd);
			driver.findElement(By.xpath("")).click();		
	
	
	
	

}
