package test;

import org.testng.annotations.Test;

import page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass {
	
	@Test
	public void createpagetest()
	{
		Fbcreatepage ob=new Fbcreatepage(driver);
		ob.pageclick();
		ob.getstartedbutton();
		
	}

}
