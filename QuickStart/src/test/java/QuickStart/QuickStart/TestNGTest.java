package QuickStart.QuickStart;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTest {
	 
	
	
	
	public void main(String[] avgs)
	{
		
	   
		AppTest("my add test");
		
		
	}
	

	public void AppTest( String testName )
    {
		
		Assert.assertEquals(testName, "my add test");
        System.out.println("Test Name " + testName);
    }
	
	
	
	@Test
	public void add() {
		System.out.println("run add test in testng ...");
		int a,b;
		a=2;
		b=3;
		Assert.assertEquals(a+b, 5);
	}

}
