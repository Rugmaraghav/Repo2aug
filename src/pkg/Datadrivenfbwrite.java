package pkg;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadrivenfbwrite {
	WebDriver driver;

	@BeforeTest
	public void beforeTest() {
		driver = new EdgeDriver();

	}
	@Test
	public void test() throws Exception
	{
		
		FileInputStream f=new FileInputStream("E:\\TestData\\Book1.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);//excel workbook
		  XSSFSheet sh=wb.getSheet("Sheet1");//sheet details
		  int rowcount= sh.getLastRowNum();//row count
		  for(int i=1;i<=rowcount;i++)
		  {
			 String username= sh.getRow(i).getCell(0).getStringCellValue();
			  String password=sh.getRow(i).getCell(1).getStringCellValue();
			  System.out.println("username="+username);
			  System.out.println("password="+password);
			  driver.get("https://www.facebook.com");
			  driver.findElement(By.name("email")).sendKeys(username);
			 driver.findElement(By.name("pass")).sendKeys(password);
			 driver.findElement(By.name("login")).click();
			    XSSFCell cell = sh.getRow(i).createCell(2);
			 String exptitle="Facebook";
			 String actualtitle=driver.getTitle();
			 if(exptitle.equals(actualtitle))
			 {
				 cell.setCellValue("pass");
			 }
			 else
			 {
				 cell.setCellValue("fail");
			 }
		
			 FileOutputStream outputStream = new FileOutputStream("E:\\TestData\\Book1.xlsx");
		        wb.write(outputStream);		
			
		  }
		  wb.close();
	}

}
