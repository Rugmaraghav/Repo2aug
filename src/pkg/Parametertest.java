package pkg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parametertest {
	
	
	@Parameters("tool")
	@Test
	public void t1(String v)
	{
		System.out.println(v);
	}
	
	
	

}
